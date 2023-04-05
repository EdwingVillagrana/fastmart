/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import entidades.Producto;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import interfaces.IProductosDAO;
import interfaces.IProductosNegocio;

/**
 *
 * @author guero
 */
public class ProductosNegocio implements IProductosNegocio{
    private final IProductosDAO productosDAO;

    public ProductosNegocio(IProductosDAO productosDAO) {
        this.productosDAO = productosDAO;
    }        
    
    /**
     * Agrega un nuevo producto a la base de datos.
     * @param entidad El producto a agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Producto entidad) throws NegocioException {
        try {
            productosDAO.agregar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible agregar la información a la base de datos.", e);
        }
    }

    /**
     * Actualiza un producto existente en la base de datos.
     * @param entidad El producto a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void actualizar(Producto entidad) throws NegocioException {
        try {
            productosDAO.actualizar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible actualizar la información de la base de datos.", e);
        }
    }

    /**
     * Elimina un producto de la base de datos.
     * @param entidad El producto a eliminar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Producto entidad) throws NegocioException {
        try {
            productosDAO.actualizar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible eliminar la información de la base de datos.", e);
        }
    }
    
    /**
     * Consulta un producto por su nombre.
     * @param nombre El nombre del producto a encontrar.
     * @return El producto encontrado.
     * @throws NegocioException si ocurre un error en la capa de negocio
     */
    @Override
    public Producto consultarPorNombre(String nombre) throws NegocioException {
        try {
            Producto producto = this.productosDAO.consultarPorNombre(nombre);
            if (producto == null) {
                throw new NegocioException("No se encontró el producto");
            }
            return producto;
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible consultar la información en la base de datos.", e);
        }
    }
}