/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Producto;
import excepciones.PersistenciaException;

/**
 *
 * @author Kevin Rios
 */
public interface IProductosDAO extends IGenericaDAO<Producto, Long> {

    public void actualizarStock (Long id, Long cantidad, boolean sumarStock) throws PersistenciaException;
    
    public Producto consultarPorNombre(String nombre) throws PersistenciaException;

    public Producto consultarPorId(Long id) throws PersistenciaException;

    public Producto consultarPorCodigo(Long codigo) throws PersistenciaException;
}
