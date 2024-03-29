/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Compra;
import entidades.Usuario;
import excepciones.NegocioException;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author edw_v
 */
public interface IComprasNegocio extends IGenericaNegocio<Compra> {

    public Compra consultarPorId(Long id) throws NegocioException;

    public List<Compra> consultarPorPeriodo(String fechaInicio, String fechaFin) throws NegocioException;

    public List<Compra> consultarPorUsuario(Usuario usuario) throws NegocioException;
}
