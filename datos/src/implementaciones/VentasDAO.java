/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.DetalleVenta;
import entidades.Venta;
import excepciones.PersistenciaException;
import interfaces.IConexion;
import interfaces.IProductosDAO;
import java.util.Date;
import javax.persistence.EntityManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.IVentasDAO;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

/**
 *
 * @author Kevin Rios
 */
public class VentasDAO implements IVentasDAO {

    private final IConexion conexion;
    private final IProductosDAO productosDAO;

    public VentasDAO(IConexion conexion) {
        this.conexion = conexion;
        productosDAO = new ProductosDAO(conexion);
    }

    /**
     * Agrega una venta a la base de datos y actualiza el stock de cada uno de
     * los productos que se encuentra en la lista de DetalleVenta que contiene
     * la venta.
     *
     * @param venta Objeto Venta a agregar.
     * @throws PersistenciaException Si ocurre un error al agregar la
     * información en la base de datos.
     */
    @Override
    public void agregar(Venta venta) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                em.persist(venta);
                List<DetalleVenta> productosVendidos = venta.getProductos();
                /*
                Recorremos la lista de DetalleVenta que tiene la venta para obtener sus datos,
                setearle la venta previamente persistida para que tenga un ID y así poder
                relacionarlas directamente en la base de datos. También se actualiza el stock de
                cada uno de los productos incluídos en la lista.
                 */
                for (DetalleVenta detalleVenta : productosVendidos) {
                    Long idProducto = detalleVenta.getProducto().getId();
                    Long cantidad = detalleVenta.getCantidad();
                    detalleVenta.setVenta(venta);
                    //Si no se persiste no se queda guardada la información en la base.
                    em.persist(detalleVenta);
                    productosDAO.actualizarStock(idProducto, cantidad, false);
                }
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            throw new PersistenciaException("No fue posible agregar la Venta");
        }
    }

    /**
     * Actualiza los datos de una venta existente en la base de datos.
     *
     * @param ventaActualizada Objeto Venta con los datos actualizados de la
     * venta.
     * @throws PersistenciaException Si ocurre un error al actualizar la
     * información en la base de datos.
     */
    @Override
    public void actualizar(Venta ventaActualizada) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Venta ventaGuardada = em.find(Venta.class, ventaActualizada.getId());
                if (ventaGuardada == null) {
                    throw new PersistenciaException("No se encontró la venta en la base de datos, por lo que no se pudo actualizar.");
                }
                ventaGuardada.setUsuario(ventaActualizada.getUsuario());
                ventaGuardada.setFechaDeVenta(ventaActualizada.getFechaDeVenta());
                ventaGuardada.setTotal(ventaActualizada.getTotal());
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            throw new PersistenciaException("No fue posible actualizar los datos de la venta.");
        }
    }

    /**
     * Elimina una venta de la base de datos.
     *
     * @param venta Objeto Venta a eliminar.
     * @throws PersistenciaException Si ocurre un error al eliminar la
     * información en la base de datos.
     */
    @Override
    public void eliminar(Venta venta) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Venta ventaGuardada = em.find(Venta.class, venta.getId());
                if (ventaGuardada == null) {
                    throw new PersistenciaException("No se encontró la información de la venta en la base de datos.");
                }
                em.remove(ventaGuardada);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            throw new PersistenciaException("No fue posible eliminar los datos de la venta.");
        }
    }

    /**
     * Consulta una venta por su ID.
     *
     * @param id ID de la venta a consultar.
     * @return Objeto de tipo Venta con la información de la venta consultada.
     * Devuelve null si no encuentra ninguna venta con el ID especificado.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public Venta consultarPorId(Long id) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Venta ventaGuardada = em.find(Venta.class, id);
                em.getTransaction().commit();
                return ventaGuardada;
            } catch (NoResultException e) {
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    /**
     * Consulta la lista de ventas que se encuentran dentro de un periodo.
     *
     * @param fechaInicio Objeto de tipo SQLDate con la fecha de inicio de
     * búsqueda del periodo.
     * @param fechaFin Objeto de tipo SQLDate con la fecha de finalización de
     * búsqueda del periodo.
     * @return Lista con todas las venta registradas en la base en el periodo
     * indicado. Una lista vacía en caso de no encontrar ninguna venta
     * registrada.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public List<Venta> consultarPorPeriodo(String fechaInicio, String fechaFin) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                String jpql = "SELECT v FROM Venta v WHERE v.fechaDeVenta BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "'";
                TypedQuery<Venta> query = em.createQuery(jpql, Venta.class);
                return query.getResultList();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar ventas por periodo", e);
        }
    }

    /**
     * Consulta la lista de todas las venta en la base de datos.
     *
     * @return Lista con todas las ventas registradas en la base. Una lista
     * vacía en caso de no encontrar ninguna venta registrada.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public List<Venta> consultarTodos() throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                // Se utiliza una consulta JPQL para obtener todas las categorías
                TypedQuery<Venta> query = em.createQuery("SELECT v FROM Venta v", Venta.class);
                List<Venta> ventas = query.getResultList();
                return ventas;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

}
