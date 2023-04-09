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
import java.util.List;

/**
 *
 * @author guero
 */
public class UsuariosNegocio implements IUsuariosNegocio {

    private final IUsuariosDAO usuariosDAO;

    public UsuariosNegocio() {
        this.usuariosDAO = new UsuariosDAO(new Conexion());
    }

    /**
     * Agrega un usuario nuevo en la base de datos.
     *
     * @param usuario El usuario a agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Usuario usuario) throws NegocioException {
        try {
            usuariosDAO.agregar(usuario);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar agregar al usuario: ", e);
        }
    }

    /**
     * Actualiza un usuario existente de la base de datos.
     *
     * @param usuario El usuario a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void actualizar(Usuario usuario) throws NegocioException {
        try {
            usuariosDAO.actualizar(usuario);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar actualizar al usuario: ", e);
        }
    }

    /**
     * Elimina un usuario de la base de datos.
     *
     * @param usuario El usuario a eliminar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Usuario usuario) throws NegocioException {
        try {
            usuariosDAO.eliminar(usuario);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar eliminar al usuario: ", e);
        }
    }

    /**
     * Consulta un usuario por su nombre.
     *
     * @param nombre El nombre del usuario a buscar.
     * @return El usuario encontrado.
     * @throws NegocioException si ocurre un error en la capa de negocio.
     */
    @Override
    public Usuario consultarPorNombre(String nombre) throws NegocioException {
        Usuario usuarioExistente = null;
        try {
            usuarioExistente = this.usuariosDAO.consultarPorNombre(nombre);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return usuarioExistente;
        }
    }

    @Override
    public Usuario consultarPorId(Long id) throws NegocioException {
        Usuario usuarioExistente = null;
        try {
            usuarioExistente = usuariosDAO.consultarPorId(id);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return usuarioExistente;
        }
    }

    @Override
    public List<Usuario> consultarTodos() throws NegocioException {
        List<Usuario> usuarios = null;
        try {
            usuarios = usuariosDAO.consultarTodos();
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return usuarios;
        }
    }
}
