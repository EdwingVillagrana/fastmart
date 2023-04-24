/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Proveedor;
import excepciones.PersistenciaException;
import interfaces.IConexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import interfaces.IProveedoresDAO;
import java.util.List;
import javax.persistence.NoResultException;

/**
 * Implementa la interfaz IProveedores que, a su vez, extiende de la interfaz
 * IGenericaDAO, y se encarga de la persistencia de objetos Proveedor en una
 * base de datos.
 *
 */
public class ProveedoresDAO implements IProveedoresDAO {

    private final IConexion conexion;

    public ProveedoresDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * Agrega un proveedor a la base de datos.
     *
     * @param proveedor Objeto Proveedor a agregar.
     * @throws PersistenciaException Si ocurre un error al agregar la
     * información en la base de datos.
     */
    @Override
    public void agregar(Proveedor proveedor) throws PersistenciaException {
        try {
            Proveedor proveedorExistente = this.consultarPorNombre(proveedor.getNombre());
            if (proveedorExistente != null) {
                throw new PersistenciaException("El proveedor ya existe en la base de datos.");
            }
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                em.persist(proveedor);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProveedoresDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible agregar al proveedor");
        }
    }

    /**
     * Actualiza los datos de un proveedor existente en la base de datos.
     *
     * @param proveedorActualizado Objeto Proveedor con los datos actualizados
     * del proveedor.
     * @throws PersistenciaException Si no se puede actualizar el proveedor en
     * la base de datos.
     */
    @Override
    public void actualizar(Proveedor proveedorActualizado) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Proveedor proveedorGuardado = em.find(Proveedor.class, proveedorActualizado.getId());
                if (proveedorGuardado == null) {
                    throw new PersistenciaException("No se encontró al proveedor en la base de datos, por lo que no se pudo actualizar.");
                }
                proveedorGuardado.setNombre(proveedorActualizado.getNombre());
                proveedorGuardado.setTelefono(proveedorActualizado.getTelefono());
                proveedorGuardado.setDireccion(proveedorActualizado.getDireccion());
                proveedorGuardado.setEmail(proveedorActualizado.getEmail());
                proveedorGuardado.setListaProductos(proveedorActualizado.getListaProductos());
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProveedoresDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos del proveedor.");
        }
    }

    /**
     * Elimina un proveedor de la base de datos.
     *
     * @param proveedor Objeto Proveedor a eliminar.
     * @throws PersistenciaException Si no se puede eliminar al proveedor en la
     * base de datos.
     */
    @Override
    public void eliminar(Proveedor proveedor) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Proveedor proveedorGuardado = em.find(Proveedor.class, proveedor.getId());
                if (proveedorGuardado == null) {
                    throw new PersistenciaException("No se encontró la información del proveedor en la base de datos.");
                }
                em.remove(proveedorGuardado);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProveedoresDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos del proveedor.");
        }
    }

    /**
     * Consulta un proveedor por su ID en la base de datos.
     *
     * @param id ID del proveedor a consultar.
     * @return Objeto de tipo Proveedor con la información del proveedor
     * consultado. Devuelve null si no se encuentra ningun proveedor con el ID
     * especificado.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public Proveedor consultarPorId(Long id) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Proveedor proveedorGuardado = em.find(Proveedor.class, id);
                em.getTransaction().commit();
                return proveedorGuardado;
            } catch (NoResultException e) {
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProveedoresDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la lista de proveedores..");
        }
    }

    /**
     * Busca un proveedor en la base de datos por su nombre utilizando una
     * consulta JPQL.
     *
     * @param nombre El nombre del proveedor a buscar.
     * @return Objeto de tipo Proveedor con la información del proveedor
     * consultado. Devuelve null si no se encuentra ningun proveedor con el
     * nombre especificado.
     * @throws PersistenciaException Si ocurre un error al realizar la consulta.
     */
    @Override
    public Proveedor consultarPorNombre(String nombre) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                TypedQuery<Proveedor> query = em.createQuery("SELECT p FROM Proveedor p WHERE p.nombre = :nombre", Proveedor.class);
                query.setParameter("nombre", nombre);
                Proveedor proveedor = query.getSingleResult();
                return proveedor;
            } catch (NoResultException e) {
                // Si no se encuentra ningún proveedor, asignamos null al proveedor
                // y lo devolvemos en lugar de lanzar una excepción
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProveedoresDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la lista de proveedores.");
        }
    }

    /**
     * Consulta la lista de todas los proveedores en la base de datos.
     *
     * @return Lista con todas los proveedores registrados en la base. Una lista
     * vacía en caso de no encontrar ningun proveedor registrado.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public List<Proveedor> consultarTodos() throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                TypedQuery<Proveedor> query = em.createQuery("SELECT p FROM Proveedor p", Proveedor.class);
                List<Proveedor> proveedores = query.getResultList();
                return proveedores;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProveedoresDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la lista de proveedores.");
        }
    }
}
