/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import entidades.Administrador;
import entidades.Proveedor;
import entidades.Trabajador;
import entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author EDW
 */
public class PruebasUsuarios {

    private static EntityManager manager;
    private static EntityManagerFactory emf;

    public static void main(String[] args) {

        //Se inicializa el EntityManagerFactory con la persistencia que se encuentra en el xml, en el paquete META-INF
        emf = Persistence.createEntityManagerFactory("Persistencia");
        //Se inicializa el EntityManager por medio del EntityManagerFactory
        manager = emf.createEntityManager();

        //Le indicamos al EntityManager que habra la conexión
        manager.getTransaction().begin();
        Usuario trabajador = new Trabajador("Ricardo Pacheco", "Francisco Zarcon #264, colonia Constitución", "6623856074", "pacheco@gmail.com", "rpacheco555");

        //Interacción con la base de datos
        
        manager.persist(trabajador);
        //Le indicamos al EntityManager que cierre la conexión
        manager.getTransaction().commit();

    }
}
