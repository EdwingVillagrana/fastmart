/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Proveedor;
import excepciones.PersistenciaException;
import interfaces.IConexion;
import interfaces.IProveedores;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * Implementa la interfaz IProveedores que, a su vez, extiende de la interfaz
 * IGenericaDAO, y se encarga de la persistencia de objetos Proveedor en una
 * base de datos. La clase tiene métodos para agregar, actualizar, eliminar y
 * consultar proveedores en la base de datos, y utiliza el patrón DAO (Data
 * Access Object) para encapsular la lógica de acceso a los datos. La clase
 * recibe una instancia de IConexion en su constructor para establecer la
 * conexión con la base de datos.
 *
 */
public class ProveedorDAO implements IProveedores {

    private final IConexion conexion;

    public ProveedorDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * Agrega un proveedor a la base de datos.
     *
     * @param proveedor El proveedor a agregar.
     * @throws PersistenciaException Si ocurre algún error en la operación de
     * persistencia.
     */
    @Override
    public void agregar(Proveedor proveedor) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            em.getTransaction().begin();
            em.persist(proveedor);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible agregar el proveedor");
        }
    }

    /**
     * Actualiza los datos de un proveedor existente en la base de datos.
     *
     * @param proveedorActualizado Objeto Proveedor con los datos actualizados
     * del proveedor.
     * @throws PersistenciaException Si no se puede actualizar el proveedor en
     * la base de datos.
     */
    @Override
    public void actualizar(Proveedor proveedorActualizado) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            em.getTransaction().begin();
            Proveedor proveedorGuardado = em.find(Proveedor.class, proveedorActualizado.getId());
            if (proveedorGuardado == null) {
                throw new PersistenciaException("No se encontró al proveedor en la base de datos, por lo que no se pudo actualizar.");
            }
            proveedorGuardado.setNombre(proveedorActualizado.getNombre());
            proveedorGuardado.setTelefono(proveedorActualizado.getTelefono());
            proveedorGuardado.setDireccion(proveedorActualizado.getDireccion());
            proveedorGuardado.setEmail(proveedorActualizado.getEmail());
            proveedorGuardado.setLista_productos(proveedorActualizado.getLista_productos());
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos del proveedor.");
        }
    }

    /**
     * Elimina un proveedor de la base de datos.
     *
     * @param proveedor Proveedor a eliminar.
     * @throws PersistenciaException Si no se puede acceder a la base de datos o
     * si no se encuentra la información del proveedor en la base de datos.
     */
    @Override
    public void eliminar(Proveedor proveedor) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            em.getTransaction().begin();
            Proveedor proveedorGuardado = em.find(Proveedor.class, proveedor.getId());
            if (proveedorGuardado == null) {
                throw new PersistenciaException("No se encontró la información del proveedor en la base de datos.");
            }
            em.remove(proveedorGuardado);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos del proveedor.");
        }
    }

    /**
     * Busca un proveedor en la base de datos por su nombre utilizando una
     * consulta JPQL. Se espera obtener un objeto de tipo Proveedor. Se lanza
     * una excepción PersistenciaException si no se encuentra ningún proveedor
     * con el nombre proporcionado.
     *
     * @param nombre El nombre del proveedor a buscar
     * @return El objeto Proveedor correspondiente al nombre proporcionado
     * @throws PersistenciaException Si ocurre un error al realizar la consulta
     */
    @Override
    public Proveedor consultarPorNombre(String nombre) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            //Se utiliza una consulta JPQL para buscar el proveedor por su nombre
            TypedQuery<Proveedor> query = em.createQuery("SELECT p FROM Proveedor p WHERE p.nombre = :nombre", Proveedor.class);
            query.setParameter("nombre", nombre);
            Proveedor proveedor = query.getSingleResult();
            if (proveedor == null) {
                throw new PersistenciaException("No se encontró al proveedor");
            }
            em.close();
            return proveedor;
        } catch (Exception e) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

}
