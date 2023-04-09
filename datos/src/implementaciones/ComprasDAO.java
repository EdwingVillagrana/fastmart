/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Compra;
import static entidades.Producto_.proveedor;
import entidades.Usuario;
import excepciones.PersistenciaException;
import interfaces.IComprasDAO;
import interfaces.IConexion;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

/**
 *
 * @author edw_v
 */
public class ComprasDAO implements IComprasDAO {

    private final IConexion conexion;

    public ComprasDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public void agregar(Compra compra) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                em.persist(compra);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible agregar la compra");
        }
    }

    @Override
    public void actualizar(Compra compraActualizada) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Compra compraGuardada = em.find(Compra.class, compraActualizada.getId());
                if (compraGuardada == null) {
                    throw new PersistenciaException("No se encontró la compra en la base de datos, por lo que no se pudo actualizar.");
                }
                compraGuardada.setUsuario(compraActualizada.getUsuario());
                compraGuardada.setFechaDeCompra(compraActualizada.getFechaDeCompra());
                compraGuardada.setTotal(compraActualizada.getTotal());
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible actualizar los datos de la compra.");
        }
    }

    @Override
    public void eliminar(Compra compra) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Compra compraGuardada = em.find(Compra.class, compra.getId());
                if (compraGuardada == null) {
                    throw new PersistenciaException("No se encontró la información de la compra en la base de datos.");
                }
                em.remove(compraGuardada);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible eliminar los datos de la venta.");
        }
    }

    @Override
    public Compra consultarPorId(Long id) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                Compra compraGuardada = em.find(Compra.class, id);
                em.getTransaction().commit();
                return compraGuardada;
            } catch (NoResultException e) {
                return null;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }

    @Override
    public List<Compra> consultarPorPeriodo(Date fechaInicio, Date fechaFin) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                String jpql = "SELECT c FROM Compra c WHERE c.fechaDeCompra BETWEEN :fechaInicio AND :fechaFin";
                TypedQuery<Compra> query = em.createQuery(jpql, Compra.class);
                query.setParameter("fechaInicio", fechaInicio, TemporalType.DATE);
                query.setParameter("fechaFin", fechaFin, TemporalType.DATE);
                return query.getResultList();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("Error al consultar ventas por periodo", e);
        }
    }

    @Override
    public List<Compra> consultarPorUsuario(Usuario usuario) throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                em.getTransaction().begin();
                TypedQuery<Compra> query = em.createQuery("SELECT c FROM Compra c WHERE c.usuario.id = :usuarioId", Compra.class);
                query.setParameter("usuarioId", usuario.getId());
                em.getTransaction().commit();
                return query.getResultList();
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("Error al consultar ventas por usuario", e);
        }
    }

    @Override
    public List<Compra> consultarTodos() throws PersistenciaException {
        try {
            EntityManager em = this.conexion.crearConexion();
            try {
                // Se utiliza una consulta JPQL para obtener todas las categorías
                TypedQuery<Compra> query = em.createQuery("SELECT c FROM Compra c", Compra.class);
                List<Compra> compras = query.getResultList();
                return compras;
            } finally {
                em.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ComprasDAO.class.getName()).log(Level.SEVERE, null, e);
            throw new PersistenciaException("No fue posible consultar la información en la base de datos.");
        }
    }
}
