/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Producto;
import excepciones.PersistenciaException;
import interfaces.IConexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import interfaces.IProductosDAO;

/**
 * Implementa la interfaz IProductos que, a su vez, extiende la interfaz
 * IGenericaDAO, y se encarga de la persistencia de objetos Producto en una base
 * de datos. La clase tiene métodos para agregar, actualizar, eliminar y
 * consultar productos en la base de datos, y utiliza el patrón DAO (Data Access
 * Object) para encapsular la lógica de acceso a los datos. La clase recibe una
 * instancia de IConexion en su constructor para establecer la conexión con la
 * base de datos.
 *
 */
public class ProductosDAO implements IProductosDAO {

    private final IConexion conexion;

    public ProductosDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * Agrega un productoGuardado a la base de datos.
     *
     * @param producto El productoGuardado a agregar.
     * @throws PersistenciaException Si ocurre algún error en la operación de
     * persistencia.
     */
    @Override
    public void agregar(Producto producto) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible agregar el producto");
        }
    }

    /**
     * Actualiza los datos de un productoGuardado existente en la base de datos.
     *
     * @param productoActualizado Objeto Producto con los datos actualizados del
 productoGuardado.
     * @throws PersistenciaException Si no se puede actualizar el productoGuardado en la
 base de datos.
     */
    @Override
    public void actualizar(Producto productoActualizado) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            em.getTransaction().begin();
            Producto productoGuardado = em.find(Producto.class, productoActualizado.getId());
            if (productoGuardado == null) {
                throw new PersistenciaException("No se encontró el producto en la base de datos, por lo que no se pudo actualizar.");
            }
            productoGuardado.setNombre(productoActualizado.getNombre());
            productoGuardado.setProveedor(productoActualizado.getProveedor());
            productoGuardado.setPrecio_compra(productoActualizado.getPrecio_compra());
            productoGuardado.setPrecio_venta(productoActualizado.getPrecio_venta());
            productoGuardado.setCategoria(productoActualizado.getCategoria());
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos del producto.");
        }

    }

    /**
     * Elimina un productoGuardado de la base de datos.
     *
     * @param producto Producto a eliminar.
     * @throws PersistenciaException Si no se puede acceder a la base de datos o
 si no se encuentra la información del productoGuardado en la base de datos.
     */
    @Override
    public void eliminar(Producto producto) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            em.getTransaction().begin();
            Producto productoGuardado = em.find(Producto.class, producto.getId());
            if (productoGuardado == null) {
                throw new PersistenciaException("No se encontró la información del producto en la base de datos.");
            }
            em.remove(productoGuardado);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos del producto.");
        }
    }

    /**
     * Busca un producto en la base de datos por su nombre utilizando una
     * consulta JPQL. Se espera obtener un objeto de tipo Provducto. Se lanza
     * una excepción PersistenciaException si no se encuentra ningún pproducto
     * con el nombre proporcionado.
     *
     * @param nombre El nombre del productoGuardado a buscar
     * @return El objeto Producto correspondiente al nombre proporcionado
     * @throws PersistenciaException Si ocurre un error al realizar la consulta
     */
    @Override
    public Producto consultarPorNombre(String nombre) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            //Se utiliza una consulta JPQL para buscar el productoGuardado por su nombre
            TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p WHERE p.nombre = :nombre", Producto.class);
            query.setParameter("nombre", nombre);
            Producto productoGuardado = query.getSingleResult();
            if (productoGuardado == null) {
                throw new PersistenciaException("No se encontró al producto");
            }
            em.close();
            return productoGuardado;
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    @Override
    public Producto consultarPorId(Long id) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            em.getTransaction().begin();
            Producto productoGuardado = em.find(Producto.class, id);
            if (productoGuardado == null) {
                throw new PersistenciaException("No se encontró al producto");
            }
            em.close();
            return productoGuardado;
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    @Override
    public Producto consultarPorCodigo(Long codigo) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            em.getTransaction().begin();
            TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p WHERE p.codigo = :codigo", Producto.class);
            query.setParameter("codigo", codigo);
            Producto productoGuardado = query.getSingleResult();
            if (productoGuardado == null) {
                throw new PersistenciaException("No se encontró al producto");
            }
            em.close();
            return productoGuardado;
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

}