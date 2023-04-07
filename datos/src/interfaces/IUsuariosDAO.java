/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Usuario;
import excepciones.PersistenciaException;

/**
 *
 * @author Kevin Rios
 */
public interface IUsuariosDAO extends IGenericaDAO<Usuario, Long> {
    
    public Usuario consultarPorId (Long id) throws PersistenciaException;
    
    public Usuario consultarPorNombre(String nombre) throws PersistenciaException;
}
