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
import java.util.List;
import javax.persistence.NoResultException;

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
     * Agrega un producto a la base de datos.
     *
     * @param producto Objeto Producto a agregar.
     * @throws PersistenciaException Si ocurre un error al agregar la
     * información en la base de datos.
     */
    @Override
    public void agregar(Producto producto) throws PersistenciaException {
        try {
            Producto productoExistente = this.consultarPorNombre(producto.getNombre());
            if (productoExistente != null) {
                throw new PersistenciaException("El producto ya existe en la base de datos");
            }
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                em.persist(producto);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible agregar el producto");
        }
    }

    /**
     * Actualiza los datos de un producto existente en la base de datos.
     *
     * @param productoActualizado Objeto Producto con los datos actualizados del
     * producto.
     * @throws PersistenciaException Si no se puede actualizar el producto en la
     * base de datos.
     */
    @Override
    public void actualizar(Producto productoActualizado) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Producto productoGuardado = consultarPorId(productoActualizado.getId());
                if (productoGuardado == null) {
                    throw new PersistenciaException("No se encontró el producto en la base de datos, por lo que no se pudo actualizar.");
                }
                productoGuardado.setNombre(productoActualizado.getNombre());
                productoGuardado.setProveedor(productoActualizado.getProveedor());
                productoGuardado.setPrecio_compra(productoActualizado.getPrecio_compra());
                productoGuardado.setPrecio_venta(productoActualizado.getPrecio_venta());
                productoGuardado.setCategoria(productoActualizado.getCategoria());
                em.merge(productoGuardado);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos del producto.");
        }
    }

    /**
     * Elimina un producto de la base de datos.
     *
     * @param producto Objeto Producto a eliminar.
     * @throws PersistenciaException Si no se puede eliminar el producto en la
     * base de datos.
     */
    @Override
    public void eliminar(Producto producto) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Producto productoGuardado = consultarPorId(producto.getId());
                if (productoGuardado == null) {
                    throw new PersistenciaException("No se encontró la información del producto en la base de datos.");
                }
                em.remove(productoGuardado);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos del producto.");
        }
    }

    /**
     *
     * Actualiza el stock de un producto en la base de datos.
     *
     * @param id El ID del producto a actualizar.
     * @param cantidad La cantidad a sumar o restar al stock actual.
     * @param sumarStock Indica si se debe sumar o restar la cantidad al stock
     * actual.
     * @throws PersistenciaException Si ocurre un error al actualizar los datos
     * del producto.
     */
    @Override
    public void actualizarStock(Long id, Long cantidad, boolean sumarStock) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Producto productoGuardado = consultarPorId(id);
                if (productoGuardado == null) {
                    throw new PersistenciaException("No se encontró el producto a actualizar.");
                }
                if (sumarStock) {
                    productoGuardado.setStock(productoGuardado.getStock() + cantidad);
                } else {
                    productoGuardado.setStock(productoGuardado.getStock() - cantidad);
                }
                em.merge(productoGuardado);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos del producto.");
        }
    }

    /**
     * Busca un producto en la base de datos por su nombre utilizando una
     * consulta JPQL.
     *
     * @param nombre El nombre del producto a buscar
     * @return Objeto de tipo Producto correspondiente al nombre proporcionado.
     * Devuelve null si no encuentra ningun producto con el nombre especificado.
     * @throws PersistenciaException Si ocurre un error al realizar la consulta
     */
    @Override
    public Producto consultarPorNombre(String nombre) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                //Se utiliza una consulta JPQL para buscar el productoGuardado por su nombre
                TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p WHERE p.nombre = :nombre", Producto.class);
                query.setParameter("nombre", nombre);
                Producto productoGuardado = query.getSingleResult();
                return productoGuardado;
            } catch (NoResultException e) {
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    /**
     * Consulta un producto por su ID en la base de datos.
     *
     * @param id ID del producto a consultar.
     * @return Objeto de tipo Producto con la información del producto
     * consultado. Devuelve null si no se encuentra ningun producto con el ID
     * especificado.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public Producto consultarPorId(Long id) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Producto productoGuardado = em.find(Producto.class, id);
                return productoGuardado;
            } catch (NoResultException e) {
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    /**
     * Busca un producto en la base de datos por su código utilizando una
     * consulta JPQL.
     *
     * @param codigo El codigo del producto a buscar.
     * @return Objeto de tipo Producto con la información del producto
     * consultado. Devuelve null si no se encuentra ningun producto con el
     * código especificado.
     * @throws PersistenciaException Si ocurre un error al realizar la consulta.
     */
    @Override
    public Producto consultarPorCodigo(Long codigo) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p WHERE p.codigo = :codigo", Producto.class);
                query.setParameter("codigo", codigo);
                Producto productoGuardado = query.getSingleResult();
                return productoGuardado;
            } catch (NoResultException e) {
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    /**
     * Consulta la lista de todas los productos en la base de datos.
     *
     * @return Lista con todas los productos registrados en la base. Una lista
     * vacía en caso de no encontrar ningun producto registrado.
     * @throws PersistenciaException Si ocurre algún error en la base de datos
     * durante la consulta.
     */
    @Override
    public List<Producto> consultarTodos() throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                // Se utiliza una consulta JPQL para obtener todos los productos
                TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p", Producto.class);
                List<Producto> productos = query.getResultList();
                return productos;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }
}
