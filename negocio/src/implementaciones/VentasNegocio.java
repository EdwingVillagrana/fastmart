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

/**
 *
 * @author guero
 */
public class VentasNegocio implements IVentasNegocio{
    private final IVentasDAO ventasDAO;

    public VentasNegocio(IVentasDAO ventasDAO) {
        this.ventasDAO = ventasDAO;
    }
            
    /**
     * Agrega una nueva venta en la base de datos.
     * @param entidad La venta a agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Venta entidad) throws NegocioException {
        try {
            ventasDAO.agregar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible agregar la información a la base de datos.", e);
        }
    }

    /**
     * Actualiza una nueva venta existente en la base de datos.
     * @param entidad La venta a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void actualizar(Venta entidad) throws NegocioException {
        try {
            ventasDAO.actualizar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible agregar la información a la base de datos.", e);
        }
    }

    /**
     * Elimina una venta de la base de datos.
     * @param entidad La venta a eliminar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Venta entidad) throws NegocioException {
        try {
            ventasDAO.agregar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible agregar la información a la base de datos.", e);
        }
    }
    
    /**
     * 
     * @param date Fecha de inicio de la venta a buscar.
     * @param fechaFin Fecha final de la venta a buscar.
     * @return La venta encontrada.
     * @throws NegocioException si ocurre un error en la capa de negocio.
     */
    @Override
    public Venta consultarPorPeriodo(Date date, Date fechaFin) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
