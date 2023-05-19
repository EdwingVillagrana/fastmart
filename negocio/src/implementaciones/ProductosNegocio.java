/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import entidades.Producto;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import interfaces.IConexion;
import interfaces.IProductosDAO;
import interfaces.IProductosNegocio;
import java.util.List;

/**
 *
 * @author guero
 */
public class ProductosNegocio implements IProductosNegocio {

    private final IProductosDAO productosDAO;
    
    public ProductosNegocio() {
        this.productosDAO = new ProductosDAO(new Conexion());
    }

    /**
     * Agrega un nuevo producto a la base de datos.
     *
     * @param producto El producto a agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Producto producto) throws NegocioException {
        try {
            productosDAO.agregar(producto);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar agregar el producto: "+ e.getMessage());
        }
    }

    /**
     * Actualiza un producto existente en la base de datos.
     *
     * @param producto El producto a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void actualizar(Producto producto) throws NegocioException {
        try {
            productosDAO.actualizar(producto);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar actualizar el producto: ", e);
        }
    }

    /**
     * Elimina un producto de la base de datos.
     *
     * @param producto El producto a eliminar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Producto producto) throws NegocioException {
        try {
            productosDAO.eliminar(producto);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar eliminar el producto: ", e);
        }
    }

    /**
     * Consulta un producto por su nombre.
     *
     * @param nombre El nombre del producto a encontrar.
     * @return El producto encontrado.
     * @throws NegocioException si ocurre un error en la capa de negocio
     */
    @Override
    public Producto consultarPorNombre(String nombre) throws NegocioException {
        Producto productoExistente = null;
        try {
            productoExistente = this.productosDAO.consultarPorNombre(nombre);
            if (productoExistente == null) {
                throw new NegocioException("No se encontró el producto");
            }
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally{
            return productoExistente;
        }
    }

    @Override
    public Producto consultarPorId(Long id) throws NegocioException {
        Producto productoExistente = null;
        try {
            productoExistente = productosDAO.consultarPorId(id);
            if (productoExistente == null) {
                throw new NegocioException("No se encontró el producto");
            }
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return productoExistente;
        }
    }

    @Override
    public Producto consultarPorCodigo(Long codigo) throws NegocioException {
        Producto productoExistente = null;
        try {
            productoExistente = productosDAO.consultarPorCodigo(codigo);
            if (productoExistente == null) {
                throw new NegocioException("No se encontró el producto");
            }
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return productoExistente;
        }
    }

    @Override
    public List<Producto> consultarTodos() throws NegocioException {
        List<Producto> productos = null;
        try {
            productos = productosDAO.consultarTodos();
            if (productos == null) {
                throw new NegocioException("No hay productos registrados");
            }
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return productos;
        }
    }
}
