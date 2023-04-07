/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Proveedor;
import excepciones.PersistenciaException;

/**
 * Esta interface extiende de IGenericaDAO, la cual contiene los métodos
 * genéricos a utilizarse para el manejo de todas las entidades. Esta interface
 * declara el método para realizar una consultar por nombre específico.
 * Proveedor es el tipo que requerimos para decirle a la interfaz genérica el
 * tipo de objeto que se estará utilizando. Long es el tipo de dato el cuál
 * almacena las llaves primarias.
 *
 */
public interface IProveedoresDAO extends IGenericaDAO<Proveedor, Long> {
    
    public Proveedor consultarPorId(Long id) throws PersistenciaException;
    
    public Proveedor consultarPorNombre(String nombre) throws PersistenciaException;
}
