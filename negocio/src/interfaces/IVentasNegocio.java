/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Venta;
import excepciones.NegocioException;
import java.util.Date;

/**
 *
 * @author guero
 */
public interface IVentasNegocio extends IGenericaNegocio<Venta> {
    public Venta consultarPorPeriodo(Date date, Date fechaFin) throws NegocioException;
}
