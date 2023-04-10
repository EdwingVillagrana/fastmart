/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Compra;
import entidades.Usuario;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import interfaces.IComprasDAO;
import interfaces.IComprasNegocio;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class ComprasNegocio implements IComprasNegocio {

    private final IComprasDAO comprasDAO;

    public ComprasNegocio() {
        this.comprasDAO = new ComprasDAO(new Conexion());
    }

    @Override
    public void agregar(Compra compra) throws NegocioException {
        try {
            comprasDAO.agregar(compra);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar agregar la compra: ", e);
        }
    }

    @Override
    public void actualizar(Compra compra) throws NegocioException {
        try {
            comprasDAO.actualizar(compra);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar actualizar la compra: ", e);
        }
    }

    @Override
    public void eliminar(Compra compra) throws NegocioException {
        try {
            comprasDAO.eliminar(compra);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar eliminar la compra: ", e);
        }
    }

    @Override
    public Compra consultarPorId(Long id) throws NegocioException {
        Compra compraExistente = null;
        try {
            compraExistente = comprasDAO.consultarPorId(id);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return compraExistente;
        }
    }

    @Override
    public List<Compra> consultarPorPeriodo(Date fechaInicio, Date fechaFin) throws NegocioException {
        List<Compra> compras = null;
        try {
            compras = comprasDAO.consultarPorPeriodo(fechaInicio, fechaFin);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return compras;
        }
    }

    @Override
    public List<Compra> consultarPorUsuario(Usuario usuario) throws NegocioException {
        List<Compra> compras = null;
        try {
            compras = comprasDAO.consultarPorUsuario(usuario);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return compras;
        }
    }

    @Override
    public List<Compra> consultarTodos() throws NegocioException {
        List<Compra> compras = null;
        try {
            compras = comprasDAO.consultarTodos();
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return compras;
        }
    }

}
