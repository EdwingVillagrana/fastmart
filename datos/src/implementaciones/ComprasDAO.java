/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Compra;
import entidades.DetalleCompra;
import entidades.Usuario;
import excepciones.PersistenciaException;
import interfaces.IComprasDAO;
import interfaces.IConexion;
import interfaces.IProductosDAO;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

/**
 *
 * @author edw_v
 */
public class ComprasDAO implements IComprasDAO {

    private final IConexion conexion;
    private final IProductosDAO productosDAO;

    public ComprasDAO(IConexion conexion) {
        this.conexion = conexion;
        productosDAO = new ProductosDAO(conexion);
    }

    /**
     * Agrega una compra a la base de datos y actualiza el stock de cada uno de
     * los productos que se encuentra en la lista de DetalleCompra que contiene
     * la compra.
     *
     * @param compra Objeto Compra a agregar.
     * @throws PersistenciaException Si ocurre un error al agregar la
     * información a la base de datos.
     */
    @Override
    public void agregar(Compra compra) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                em.persist(compra);
                List<DetalleCompra> productosComprados = compra.getProductos();
                for (DetalleCompra detalleCompra : productosComprados) {
                    Long idProducto = detalleCompra.getProducto().getId();
                    Long cantidad = detalleCompra.getCantidad();
                    productosDAO.actualizarStock(idProducto, cantidad, true);
                }
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible agregar la compra");
        }
    }

    /**
     * Actualiza los datos de una compra existente en la base de datos.
     *
     * @param compraActualizada Objeto Compra con los datos actualizados de la
     * compra.
     * @throws PersistenciaException Si ocurre un error al actualizar la
     * información en la base de datos.
     */
    @Override
    public void actualizar(Compra compraActualizada) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Compra compraGuardada = em.find(Compra.class, compraActualizada.getId());
                if (compraGuardada == null) {
                    throw new PersistenciaException("No se encontró la compra en la base de datos, por lo que no se pudo actualizar.");
                }
                compraGuardada.setUsuario(compraActualizada.getUsuario());
                compraGuardada.setFechaDeCompra(compraActualizada.getFechaDeCompra());
                compraGuardada.setTotal(compraActualizada.getTotal());
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos de la compra.");
        }
    }

    /**
     * Elimina una compra de la base de datos.
     *
     * @param compra Objeto Compra a eliminar
     * @throws PersistenciaException Si ocurre un error al eliminar la
     * información de la base de datos.
     */
    @Override
    public void eliminar(Compra compra) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Compra compraGuardada = em.find(Compra.class, compra.getId());
                if (compraGuardada == null) {
                    throw new PersistenciaException("No se encontró la información de la compra en la base de datos.");
                }
                em.remove(compraGuardada);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos de la venta.");
        }
    }

    /**
     * Consulta una compra por su ID.
     *
     * @param id ID de la compra a consultar.
     * @return Objeto de tipo Compra con la información de la compra consultada.
     * Devuelve null si no encuentra ninguna compra con el ID especificado.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public Compra consultarPorId(Long id) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Compra compraGuardada = em.find(Compra.class, id);
                em.getTransaction().commit();
                return compraGuardada;
            } catch (NoResultException e) {
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    /**
     * Consulta la lista de compras que se encuentran dentro de un periodo.
     *
     * @param fechaInicio Objeto de tipo SQLDate con la fecha de inicio de
     * búsqueda del periodo.
     * @param fechaFin Objeto de tipo SQLDate con la fecha de finalización de
     * búsqueda del periodo.
     * @return Lista con todas las compras registradas en la base en el periodo
     * indicado. Una lista vacía en caso de no encontrar ninguna compra
     * registrada.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public List<Compra> consultarPorPeriodo(Date fechaInicio, Date fechaFin) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                String jpql = "SELECT c FROM Compra c WHERE c.fechaDeCompra BETWEEN :fechaInicio AND :fechaFin";
                TypedQuery<Compra> query = em.createQuery(jpql, Compra.class);
                query.setParameter("fechaInicio", fechaInicio, TemporalType.DATE);
                query.setParameter("fechaFin", fechaFin, TemporalType.DATE);
                return query.getResultList();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("Error al consultar ventas por periodo", e);
        }
    }

    /**
     * Consulta la lista de compras realizadas por un usuario.
     *
     * @param usuario Objeto de tipo Usuario con la información del usuario.
     * @return Lista con todas las compras registradas en la base realizadas por
     * el usuario indicado. Una lista vacía en caso de no encontrar ninguna
     * compra registrada.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public List<Compra> consultarPorUsuario(Usuario usuario) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                TypedQuery<Compra> query = em.createQuery("SELECT c FROM Compra c WHERE c.usuario.id = :usuarioId", Compra.class);
                query.setParameter("usuarioId", usuario.getId());
                em.getTransaction().commit();
                return query.getResultList();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("Error al consultar ventas por usuario", e);
        }
    }

    /**
     * Consulta la lista de todas las compras en la base de datos.
     *
     * @return Lista con todas las compras registradas en la base. Una lista
     * vacía en caso de no encontrar ninguna compra registrada.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public List<Compra> consultarTodos() throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                // Se utiliza una consulta JPQL para obtener todas las categorías
                TypedQuery<Compra> query = em.createQuery("SELECT c FROM Compra c", Compra.class);
                List<Compra> compras = query.getResultList();
                return compras;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }
}
