/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import entidades.Usuario;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import interfaces.IUsuariosDAO;
import interfaces.IUsuariosNegocio;

/**
 *
 * @author guero
 */
public class UsuariosNegocio implements IUsuariosNegocio {
    
    private final IUsuariosDAO usuariosDAO;

    public UsuariosNegocio(IUsuariosDAO usuariosDAO) {
        this.usuariosDAO = usuariosDAO;
    }
        
    /**
     * Agrega un usuario nuevo en la base de datos.
     * @param entidad El usuario a agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Usuario entidad) throws NegocioException {
        try {
            usuariosDAO.agregar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible agregar la información a la base de datos.", e);
        }
    }

    /**
     * Actualiza un usuario existente de la base de datos.
     * @param entidad El usuario a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void actualizar(Usuario entidad) throws NegocioException {
        try {
            usuariosDAO.actualizar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible actualizar la información de la base de datos.", e);
        }
    }

    /**
     * Elimina un usuario de la base de datos.
     * @param entidad El usuario a eliminar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Usuario entidad) throws NegocioException {
        try {
            usuariosDAO.eliminar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible eliminar los datos de la base de datos.", e);
        }
    }
    
    /**
     * Consulta un usuario por su nombre.
     * @param nombre El nombre del usuario a buscar.
     * @return El usuario encontrado.
     * @throws NegocioException si ocurre un error en la capa de negocio.
     */
    @Override
    public Usuario consultarPorNombre(String nombre) throws NegocioException {
        try {
            Usuario usuario = this.usuariosDAO.consultarPorNombre(nombre);
            if (usuario == null) {
                throw new NegocioException("No se encontró al proveedor");
            }
            return usuario;
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible consultar la información en la base de datos.", e);
        }
    }
}