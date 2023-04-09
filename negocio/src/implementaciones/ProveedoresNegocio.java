/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Proveedor;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import interfaces.IProveedoresDAO;
import interfaces.IProveedoresNegocio;
import java.util.List;

/**
 *
 * @author EDW
 */
public class ProveedoresNegocio implements IProveedoresNegocio {

    private final IProveedoresDAO proveedoresDAO;

    public ProveedoresNegocio() {
        this.proveedoresDAO = new ProveedoresDAO(new Conexion());
    }

    /**
     * Agrega un nuevo proveedor a la base de datos.
     *
     * @param proveedor el proveedor que se desea agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Proveedor proveedor) throws NegocioException {
        try {
            proveedoresDAO.agregar(proveedor);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar agregar al proveedor: ", e);
        }
    }

    /**
     * * Actualiza un proveedor existente en la base de datos.
     *
     * @param proveedor el proveedor a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void actualizar(Proveedor proveedor) throws NegocioException {
        try {
            proveedoresDAO.actualizar(proveedor);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar actualizar al proveedor: ", e);
        }
    }

    /**
     * Elimina un proveedor de la base de datos.
     *
     * @param proveedor El proveedor a eliminar.
     * @throws NegocioException Si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Proveedor proveedor) throws NegocioException {
        try {
            proveedoresDAO.eliminar(proveedor);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al intentar eliminar al proveedor: ", e);
        }
    }

    /**
     * Consulta un proveedor por su nombre.
     *
     * @param nombre El nombre del proveedor a buscar.
     * @return El proveedor encontrado.
     * @throws NegocioException Si ocurre un error en la capa de negocio.
     */
    @Override
    public Proveedor consultarPorNombre(String nombre) throws NegocioException {
        try {
            Proveedor proveedor = this.proveedoresDAO.consultarPorNombre(nombre);
            if (proveedor == null) {
                throw new NegocioException("No se encontró al proveedor");
            }
            return proveedor;
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        }
    }

    @Override
    public Proveedor consultarPorId(Long id) throws NegocioException {
        Proveedor proveedorExistente = null;
        try {
            proveedorExistente = proveedoresDAO.consultarPorId(id);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return proveedorExistente;
        }
    }

    @Override
    public List<Proveedor> consultarTodos() throws NegocioException {
        List<Proveedor> proveedores = null;
        try {
            proveedores = proveedoresDAO.consultarTodos();
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al realizar la consulta: ", e);
        } finally {
            return proveedores;
        }
    }
}
