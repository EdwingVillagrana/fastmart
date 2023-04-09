/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Compra;
import entidades.Proveedor;
import excepciones.NegocioException;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author edw_v
 */
public interface IComprasNegocio extends IGenericaNegocio<Compra> {

    public Compra consultarPorId(Long id) throws NegocioException;

    public List<Compra> consultarPorPeriodo(Date fechaInicio, Date fechaFin) throws NegocioException;

    public List<Compra> consultarPorProveedor(Proveedor proveedor) throws NegocioException;
}
