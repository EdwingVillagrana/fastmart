/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import entidades.Venta;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import interfaces.IVentasDAO;
import interfaces.IVentasNegocio;
import java.util.Date;
import java.util.List;

/**
 *
 * @author guero
 */
public class VentasNegocio implements IVentasNegocio {

    private final IVentasDAO ventasDAO;

    public VentasNegocio(IVentasDAO ventasDAO) {
        this.ventasDAO = ventasDAO;
    }

    /**
     * Agrega una nueva venta en la base de datos.
     *
     * @param venta La venta a agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Venta venta) throws NegocioException {
        try {
            ventasDAO.agregar(venta);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar agregar la venta: ", e);
        }
    }

    /**
     * Actualiza una nueva venta existente en la base de datos.
     *
     * @param venta La venta a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void actualizar(Venta venta) throws NegocioException {
        try {
            ventasDAO.actualizar(venta);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar actualizar la venta: ", e);
        }
    }

    /**
     * Elimina una venta de la base de datos.
     *
     * @param venta La venta a eliminar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Venta venta) throws NegocioException {
        try {
            ventasDAO.agregar(venta);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar eliminar la venta: ", e);
        }
    }

    /**
     *
     * @param fechaInicio Fecha de inicio de la venta a buscar.
     * @param fechaFin Fecha final de la venta a buscar.
     * @return La venta encontrada.
     * @throws NegocioException si ocurre un error en la capa de negocio.
     */
    @Override
    public List<Venta> consultarPorPeriodo(Date fechaInicio, Date fechaFin) throws NegocioException {
        List<Venta> ventas = null;
        try {
            ventas = ventasDAO.consultarPorPeriodo(fechaFin, fechaFin);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally{
            return ventas;
        }
    }

    @Override
    public Venta consultarPorId(Long id) throws NegocioException {
        Venta ventaExistente = null;
        try {
            ventaExistente = ventasDAO.consultarPorId(id);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return ventaExistente;
        }
    }

    @Override
    public List<Venta> consultarTodos() throws NegocioException {
        List<Venta> ventas = null;
        try {
            ventas = ventasDAO.consultarTodos();
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return ventas;
        }
    }
}
