/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Usuario;
import excepciones.PersistenciaException;
import interfaces.IConexion;
import javax.persistence.EntityManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.TypedQuery;
import interfaces.IUsuariosDAO;
import java.util.List;
import javax.persistence.NoResultException;

/**
 * Implementa la interfaz IUsuarios que, a su vez, extiende de la interfaz
 * IGenericaDAO, y se encarga de la persistencia de objetos Usuario en una base
 * de datos. La clase tiene métodos para agregar, actualizar, eliminar y
 * consultar usuarios en la base de datos, y utiliza el patrón DAO (Data Access
 * Object) para encapsular la lógica de acceso a los datos. La clase recibe una
 * instancia de IConexion en su constructor para establecer la conexión con la
 * base de datos.
 *
 */
public class UsuariosDAO implements IUsuariosDAO {

    private final IConexion conexion;

    public UsuariosDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * Agrega un usuario a la base de datos.
     *
     * @param usuario El usuario a agregar.
     * @throws PersistenciaException Si ocurre algún error en la operación de
     * persistencia.
     */
    @Override
    public void agregar(Usuario usuario) throws PersistenciaException {
        try {
            Usuario usuarioExistente = consultarPorNombre(usuario.getNombre());
            if (usuarioExistente != null){
                throw new PersistenciaException("El usuario ya se encuentra registrado en la base de datos.");
            }
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                em.persist(usuario);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible agregar al usuario");
        }
    }

    /**
     * Actualiza los datos de un usuario existente en la base de datos.
     *
     * @param usuarioActualizado Objeto Usuario con los datos actualizados del
     * usuario.
     * @throws PersistenciaException Si no se puede actualizar el usuario en la
     * base de datos.
     */
    @Override
    public void actualizar(Usuario usuarioActualizado) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Usuario usuarioGuardado = em.find(Usuario.class, usuarioActualizado.getId());
                if (usuarioGuardado == null) {
                    throw new PersistenciaException("No se encontró al usuario en la base de datos, por lo que no se pudo actualizar.");
                }
                usuarioGuardado.setNombre(usuarioActualizado.getNombre());
                usuarioGuardado.setDireccion(usuarioActualizado.getDireccion());
                usuarioGuardado.setTelefono(usuarioActualizado.getTelefono());
                usuarioGuardado.setEmail(usuarioActualizado.getEmail());
                usuarioGuardado.setPassword(usuarioActualizado.getPassword());
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos del usuario.");
        }
    }

    /**
     * Elimina un usuario de la base de datos.
     *
     * @param usuario Usuario a eliminar.
     * @throws PersistenciaException Si no se puede acceder a la base de datos o
     * si no se encuentra la información del usuario en la base de datos.
     */
    @Override
    public void eliminar(Usuario usuario) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Usuario usuarioGuardado = em.find(Usuario.class, usuario.getId());
                if (usuarioGuardado == null) {
                    throw new PersistenciaException("No se encontró la información del usuario en la base de datos.");
                }
                em.remove(usuarioGuardado);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos del usuario.");
        }
    }

    /**
     * Busca un usuario en la base de datos por su nombre utilizando una
     * consulta JPQL. Se espera obtener un objeto de tipo Usuario. Se lanza una
     * excepción PersistenciaException si no se encuentra ningún usuario con el
     * nombre proporcionado.
     *
     * @param nombre El nombre del usuario a buscar
     * @return El objeto Usuario correspondiente al nombre proporcionado
     * @throws PersistenciaException Si ocurre un error al realizar la consulta
     */
    @Override
    public Usuario consultarPorNombre(String nombre) throws PersistenciaException {

        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                //Se utiliza una consulta JPQL para buscar el proveedor por su nombre
                TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nombre = :nombre", Usuario.class);
                query.setParameter("nombre", nombre);
                Usuario usuario = query.getSingleResult();
                return usuario;
            } catch (NoResultException e) {
                //Si no encuentra ningún usuario, asignamos null al usuario
                //y lo devolvemos en lugar de lanzar una excepción
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la lista de usuarios.");
        }
    }

    @Override
    public Usuario consultarPorId(Long id) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Usuario usuarioGuardado = em.find(Usuario.class, id);
                em.getTransaction().commit();
                return usuarioGuardado;
            } catch (NoResultException e) {
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la lista de usuarios.");
        }
    }

    @Override
    public List<Usuario> consultarTodos() throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
                List<Usuario> usuarios = query.getResultList();
                return usuarios;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la lista de usuarios.");
        }
    }
}
