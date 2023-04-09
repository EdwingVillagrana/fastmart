/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Producto;
import excepciones.NegocioException;

/**
 *
 * @author guero
 */
public interface IProductosNegocio extends IGenericaNegocio<Producto> {

    public Producto consultarPorId(Long id) throws NegocioException;

    public Producto consultarPorNombre(String nombre) throws NegocioException;

    public Producto consultarPorCodigo(Long codigo) throws NegocioException;
}
