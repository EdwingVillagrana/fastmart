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

/**
 *
 * @author EDW
 */
public class ProveedoresNegocio implements IProveedoresNegocio {

    private final IProveedoresDAO proveedoresDAO;

    public ProveedoresNegocio(IProveedoresDAO ProveedoresDAO) {
        this.proveedoresDAO = ProveedoresDAO;
    }

    /**
     * Agrega un nuevo proveedor a la base de datos.
     *
     * @param entidad el proveedor que se desea agregar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void agregar(Proveedor entidad) throws NegocioException {
        try {
            proveedoresDAO.agregar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible agregar la información a la base de datos.", e);
        }
    }

    /**
     * * Actualiza un proveedor existente en la base de datos.
     *
     * @param entidad el proveedor a actualizar.
     * @throws NegocioException si ocurre un error en la capa de persistencia.
     */
    @Override
    public void actualizar(Proveedor entidad) throws NegocioException {
        try {
            proveedoresDAO.actualizar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible eliminar la información de la base de datos.", e);
        }
    }

    /**
     * Elimina un proveedor de la base de datos.
     *
     * @param entidad El proveedor a eliminar.
     * @throws NegocioException Si ocurre un error en la capa de persistencia.
     */
    @Override
    public void eliminar(Proveedor entidad) throws NegocioException {
        try {
            proveedoresDAO.eliminar(entidad);
        } catch (PersistenciaException e) {
            throw new NegocioException("No fue posible eliminar los datos de la base de datos.", e);
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
            throw new NegocioException("No fue posible consultar la información en la base de datos.", e);
        }
    }
}
