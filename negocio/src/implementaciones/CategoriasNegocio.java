/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import entidades.Categoria;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import interfaces.ICategoriasDAO;
import interfaces.ICategoriasNegocio;
import java.util.List;

/**
 *
 * @author guero
 */
public class CategoriasNegocio implements ICategoriasNegocio {

    private final ICategoriasDAO categoriasDAO;

    public CategoriasNegocio() {
        this.categoriasDAO = new CategoriasDAO(new Conexion());
    }

    /**
     * Agrega una nueva categoría en la base de datos.
     *
     * @param categoria Categoría a agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Categoria categoria) throws NegocioException {
        try {
            categoriasDAO.agregar(categoria);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar agregar la categoría: ", e);
        }
    }

    /**
     * Actualiza una categoría existente de la base de datos.
     *
     * @param categoria La categoría a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void actualizar(Categoria categoria) throws NegocioException {
        try {
            categoriasDAO.actualizar(categoria);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar actualizar la categoría: ", e);
        }
    }

    /**
     * Elimina una categoría de la base de datos.
     *
     * @param categoria La categoría a eliminar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Categoria categoria) throws NegocioException {
        try {
            categoriasDAO.eliminar(categoria);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar eliminar la categoria: ", e);
        }
    }

    /**
     * Consulta una categoría por su nombre.
     *
     * @param nombre El nombre de la categoría a buscar.
     * @return La categoría encontrada.
     * @throws NegocioException si ocurre un error en la capa de negocio.
     */
    @Override
    public Categoria consultarPorNombre(String nombre) throws NegocioException {
        Categoria categoriaExistente = null;
        try {
            categoriaExistente = this.categoriasDAO.consultarPorNombre(nombre);
            if (categoriaExistente == null) {
                throw new NegocioException("No se encontró la categoría");
            }
            return categoriaExistente;
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        }
    }

    @Override
    public Categoria consultarPorId(Long id) throws NegocioException {
        Categoria categoriaExistente = null;
        try {
            categoriaExistente = categoriasDAO.consultarPorId(id);
            if (categoriaExistente == null) {
                throw new NegocioException("No se encontró la categoría.");
            }
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return categoriaExistente;
        }
    }

    @Override
    public List<Categoria> consultarTodos() throws NegocioException {
        List<Categoria> categorias = null;
        try {
            categorias = categoriasDAO.consultarTodos();
            if (categorias == null) {
                throw new NegocioException("No hay categorias registradas");
            }
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        }
        return categorias;
    }
}
