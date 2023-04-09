/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Proveedor;
import excepciones.NegocioException;

/**
 *
 * @author EDW
 */
public interface IProveedoresNegocio extends IGenericaNegocio<Proveedor> {

    public Proveedor consultarPorId(Long id) throws NegocioException;

    public Proveedor consultarPorNombre(String nombre) throws NegocioException;
}
