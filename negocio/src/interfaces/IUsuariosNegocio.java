/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Usuario;
import excepciones.NegocioException;

/**
 *
 * @author guero
 */
public interface IUsuariosNegocio extends IGenericaNegocio<Usuario> {

    public Usuario consultarPorId(Long id) throws NegocioException;

    public Usuario consultarPorNombre(String nombre) throws NegocioException;
    
    public Usuario consultarPorEmail (String email) throws NegocioException;
    
}
