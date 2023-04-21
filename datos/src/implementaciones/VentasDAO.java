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
     * FALTA CORREGIR ESTE MÉTODO, COMENTARIOS EN LA LINEA 52-54
     * Agrega una venta a la base de datos.
     *
     * @param venta La Venta a agregar.
     * @throws PersistenciaException Si ocurre algún error en la operación de
     * persistencia.
     */
    @Override
    public void agregar(Venta venta) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                em.persist(venta);
                List<DetalleVenta> productosVendidos = venta.getProductos();
                // Falta corregir este método para que ingrese el ID de la venta a el Detalle de venta
                // Tira el siguiente Error: Internal Exception: java.sql.SQLIntegrityConstraintViolationException: Column 'id_venta' cannot be null
                // Al momento de hacer el query Insert Into detalle_ventas (cantidad, precio, id_producto, id_venta) VALUES (?, ?, ?, ?)
                for(DetalleVenta detalleVenta: productosVendidos){                   
                    Long idProducto = detalleVenta.getProducto().getId();
                    Long cantidad = detalleVenta.getCantidad();
                    productosDAO.actualizarStock(idProducto, cantidad, false);
                }
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible agregar la Venta");
        }
    }

    /**
     * Actualiza los datos de una venta existente en la base de datos.
     *
     * @param ventaActualizada Objeto Venta con los datos actualizados d la
     * venta.
     * @throws PersistenciaException Si no se puede actualizar la venta en la
     * base de datos.
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
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos de la venta.");
        }
    }

    /**
     * Elimina una venta de la base de datos.
     *
     * @param venta Venta a eliminar.
     * @throws PersistenciaException Si no se puede acceder a la base de datos o
     * si no se encuentra la información de la venta en la base de datos.
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
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos de la venta.");
        }
    }

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
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    @Override
    public List<Venta> consultarPorPeriodo(Date fechaInicio, Date fechaFin) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                String jpql = "SELECT v FROM Venta v WHERE v.fechaDeVenta BETWEEN :fechaInicio AND :fechaFin";
                TypedQuery<Venta> query = em.createQuery(jpql, Venta.class);
                query.setParameter("fechaInicio", fechaInicio, TemporalType.DATE);
                query.setParameter("fechaFin", fechaFin, TemporalType.DATE);
                return query.getResultList();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("Error al consultar ventas por periodo", e);
        }
    }

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
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

}
