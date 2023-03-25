/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Venta;
import excepciones.PersistenciaException;
import java.util.Date;

/**
 *
 * @author Kevin Rios
 */
public interface IVentas extends IGenericaDAO<Venta, Date>{
    public Venta consultarPorPeriodo(Date date) throws PersistenciaException;
}
