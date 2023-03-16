/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import entidades.DetalleVenta;
import entidades.Venta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author EDW
 */
public class PruebasVenta {
    private static EntityManager manager;
    private static EntityManagerFactory emf;
    
    public static void main(String[] args) {
        
        //Se inicializa el EntityManagerFactory con la persistencia que se encuentra en el xml, en el paquete META-INF
        emf = Persistence.createEntityManagerFactory("Persistencia");
        //Se inicializa el EntityManager por medio del EntityManagerFactory
        manager = emf.createEntityManager();
        
        //Le indicamos al EntityManager que habra la conexión
        manager.getTransaction().begin();
        
        //Interacción con la base de datos
        Venta venta = manager.find(Venta.class, 1L);
        System.out.println(venta.getProductos().get(0).getProducto());
        
        //Le indicamos al EntityManager que cierre la conexión
        manager.getTransaction().commit();
    
    }
}
