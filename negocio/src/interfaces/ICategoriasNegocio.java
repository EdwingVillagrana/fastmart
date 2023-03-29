/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Categoria;
import excepciones.NegocioException;

/**
 *
 * @author guero
 */
public interface ICategoriasNegocio extends IGenericaNegocio<Categoria> {
        public Categoria consultarPorNombre(String nombre) throws NegocioException;
}