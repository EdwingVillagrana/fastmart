/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import interfaces.IConexion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author EDW
 */
public class Conexion implements IConexion{

    @Override
    public EntityManager crearConexion() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datosPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
    
}
