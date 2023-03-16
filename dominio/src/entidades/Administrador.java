/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.eclipse.persistence.annotations.DiscriminatorClass;

/**
 *
 * @author EDW
 */
@Entity
@DiscriminatorValue(value = "administrador")
public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(String nombre, String direccion, String telefono, String email, String password) {
        super(nombre, direccion, telefono, email, password);
    }

    public Administrador(Long id, String nombre, String direccion, String telefono, String email, String password, List<Venta> listaVentas) {
        super(id, nombre, direccion, telefono, email, password, listaVentas);
    }
    
}
