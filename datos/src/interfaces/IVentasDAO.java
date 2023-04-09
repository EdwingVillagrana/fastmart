/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Venta;
import excepciones.PersistenciaException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Kevin Rios
 */
public interface IVentasDAO extends IGenericaDAO<Venta, Long> {

    public Venta consultarPorId(Long id) throws PersistenciaException;

    public List<Venta> consultarPorPeriodo(Date fechaInicio, Date fechaFin) throws PersistenciaException;
}
