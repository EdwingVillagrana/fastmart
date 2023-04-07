/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Categoria;
import excepciones.PersistenciaException;
import interfaces.IConexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import interfaces.ICategoriasDAO;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author Kevin Rios
 */
public class CategoriasDAO implements ICategoriasDAO {

    private final IConexion conexion;

    public CategoriasDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * Agrega una categoria a la base de datos.
     *
     * @param categoria La Categoria a agregar.
     * @throws PersistenciaException Si ocurre algún error en la operación de
     * persistencia.
     */
    @Override
    public void agregar(Categoria categoria) throws PersistenciaException {
        try {
            Categoria categoriaExistente = this.consultarPorNombre(categoria.getNombre());
            if (categoriaExistente != null) {
                throw new PersistenciaException("La categoría ya existe en la base de datos.");
            }
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                em.persist(categoria);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(CategoriasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible agregar la categoria");
        }
    }

    /**
     * Actualiza los datos de una categoria existente en la base de datos.
     *
     * @param categoriaActualizada Objeto Categoria con los datos actualizados
     * del proveedor.
     * @throws PersistenciaException Si no se puede actualizar la categoria en
     * la base de datos.
     */
    @Override
    public void actualizar(Categoria categoriaActualizada) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Categoria categoriaGuardada = consultarPorId(categoriaActualizada.getId());
                if (categoriaGuardada == null) {
                    throw new PersistenciaException("No se encontró la categoria en la base de datos, por lo que no se pudo actualizar.");
                }
                categoriaGuardada.setNombre(categoriaActualizada.getNombre());
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(CategoriasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos de la categoria.");
        }
    }

    /**
     * Elimina un proveedor de la base de datos.
     *
     * @param categoria Categoria a eliminar.
     * @throws PersistenciaException Si no se puede acceder a la base de datos o
     * si no se encuentra la información de la categoria en la base de datos.
     */
    @Override
    public void eliminar(Categoria categoria) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Categoria categoriaGuardada = consultarPorId(categoria.getId());
                if (categoriaGuardada == null) {
                    throw new PersistenciaException("No se encontró la información de la categoria en la base de datos.");
                }
                em.remove(categoriaGuardada);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(CategoriasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos de la categoria.");
        }
    }

    /**
     * Busca una categoria en la base de datos por su nombre utilizando una
     * consulta JPQL. Se espera obtener un objeto de tipo Categoria. Se lanza
     * una excepción PersistenciaException si no se encuentra ningúna Categoria
     * con el nombre proporcionado.
     *
     * @param nombre El nombre de la categoria a buscar
     * @return El objeto Categoria correspondiente al nombre proporcionado
     * @throws PersistenciaException Si ocurre un error al realizar la consulta
     */
    @Override
    public Categoria consultarPorNombre(String nombre) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                //Se utiliza una consulta JPQL para buscar la categoria por su nombre
                TypedQuery<Categoria> query = em.createQuery("SELECT c FROM Categoria c WHERE c.nombre = :nombre", Categoria.class);
                query.setParameter("nombre", nombre);
                Categoria categoria = query.getSingleResult();
                return categoria; // se devuelve la categoria encontrada
            } catch (NoResultException e) {
                // Si la consulta no encuentra resultados, se devuelve null
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(CategoriasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    @Override
    public Categoria consultarPorId(Long id) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Categoria categoriaGuardada = em.find(Categoria.class, id);
                em.getTransaction().commit();
                return categoriaGuardada;
            } catch (NoResultException e) {
                //Si la consulta no encuentra resultados, devolvemos null
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(CategoriasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    @Override
    public List<Categoria> consultarTodos() throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                // Se utiliza una consulta JPQL para obtener todas las categorías
                TypedQuery<Categoria> query = em.createQuery("SELECT c FROM Categoria c", Categoria.class);
                List<Categoria> categorias = query.getResultList();
                return categorias;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(CategoriasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

}
