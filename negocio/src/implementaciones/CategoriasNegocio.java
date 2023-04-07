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

/**
 *
 * @author guero
 */
public class CategoriasNegocio implements ICategoriasNegocio{
    
    private final ICategoriasDAO categoriasDAO;

    public CategoriasNegocio(ICategoriasDAO categoriasDAO) {
        this.categoriasDAO = categoriasDAO;
    }
    
    /**
     * Agrega una nueva categoría en la base de datos.
     * @param entidad Categoría a agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Categoria entidad) throws NegocioException {
        try {
            categoriasDAO.agregar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible agregar la información a la base de datos.", e);
        }
    }
    
    /**
     * Actualiza una categoría existente de la base de datos.
     * @param entidad La categoría a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */

    @Override
    public void actualizar(Categoria entidad) throws NegocioException {
        try {
            categoriasDAO.actualizar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible actualizar la información de la base de datos.", e);
        }
    }

    /**
     * Elimina una categoría de la base de datos.
     * @param entidad La categoría a eliminar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Categoria entidad) throws NegocioException {
        try {
            categoriasDAO.eliminar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible eliminar la información de la base de datos.", e);
        }
    }

    /**
     * Consulta una categoría por su nombre.
     * @param nombre El nombre de la categoría a buscar.
     * @return La categoría encontrada.
     * @throws NegocioException si ocurre un error en la capa de negocio.
     */
    @Override
    public Categoria consultarPorNombre(String nombre) throws NegocioException {
        try {
            Categoria categoria = this.categoriasDAO.consultarPorNombre(nombre);
            if (categoria == null) {
                throw new NegocioException("No se encontró la categoría");
            }
            return categoria;
        } catch (PersistenciaException e) {
            throw new NegocioException("No se encontró la categoría en la capa de negocio.", e);
        }
    }
}