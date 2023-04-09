/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Compra;
import entidades.Usuario;
import excepciones.PersistenciaException;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author edw_v
 */
public interface IComprasDAO extends IGenericaDAO<Compra, Long> {

    public Compra consultarPorId(Long id) throws PersistenciaException;

    public List<Compra> consultarPorPeriodo(Date fechaInicio, Date fechaFin) throws PersistenciaException;

    public List<Compra> consultarPorUsuario(Usuario usuario) throws PersistenciaException;
}
