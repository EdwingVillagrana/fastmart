/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author EDW
 */
@Entity
@DiscriminatorValue(value = "trabajador")
public class Trabajador extends Usuario{
    
    public Trabajador() {
    }

    public Trabajador(String nombre, String direccion, String telefono, String email, String password) {
        super(nombre, direccion, telefono, email, password);
    }

    public Trabajador(Long id, String nombre, String direccion, String telefono, String email, String password, List<Venta> listaVentas) {
        super(id, nombre, direccion, telefono, email, password, listaVentas);
    }
    
}
