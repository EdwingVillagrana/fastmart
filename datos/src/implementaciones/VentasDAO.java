 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Venta;
import excepciones.PersistenciaException;
import interfaces.IConexion;
import java.util.Date;
import javax.persistence.EntityManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.IVentasDAO;
import java.util.List;
import javax.persistence.Query;

/**
 * Esta clase implementa la interfaz IVentasDAO y se encarga de realizar
 * operaciones CRUD en la tabla de ventas en la base de datos. Las operaciones
 * incluyen agregar una venta, actualizar los datos de una venta existente,
 * eliminar una venta y consultar las ventas registradas en un período
 * determinado.
 *
 * @author EDW
 */
public class VentasDAO implements IVentasDAO {

    private final IConexion conexion;

    public VentasDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
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
                em.close();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos de la venta.");
        }
    }

    /**
     *
     * Método que permite consultar las ventas registradas en un período
     * determinado.
     *
     * @param fechaInicio La fecha de inicio del período.
     * @param fechaFin La fecha de fin del período.
     * @return Una lista con las ventas encontradas en el período especificado.
     * @throws PersistenciaException Si ocurre un error al consultar las ventas.
     */
    @Override
    public List<Venta> consultarPorPeriodo(Date fechaInicio, Date fechaFin) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                Query query = em.createQuery("SELECT v FROM Venta v WHERE v.fechaDeVenta BETWEEN :fechaInicio AND :fechaFin");
                query.setParameter("fechaInicio", fechaInicio);
                query.setParameter("fechaFin", fechaFin);
                List<Venta> ventasEncontradas = query.getResultList();
                return ventasEncontradas;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("Error al consultar las ventas del periodo: " + fechaInicio + " - " + fechaFin, e);
        }
    }

}
