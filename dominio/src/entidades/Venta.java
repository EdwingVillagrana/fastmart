/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author EDW
 */
@Entity
@Table(name = "venta")
public class Venta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
    
    //manejo de fecha
    
    @Column(name = "total", nullable = false)
    private Double total;
    
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<DetalleVenta> productos;

    public Venta() {
    }

    public Venta(Long id) {
        this.id = id;
    }

    public Venta(Usuario usuario, Double total, List<DetalleVenta> productos) {
        this.usuario = usuario;
        this.total = total;
        this.productos = productos;
    }

    public Venta(Long id, Usuario usuario, Double total, List<DetalleVenta> productos) {
        this.id = id;
        this.usuario = usuario;
        this.total = total;
        this.productos = productos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<DetalleVenta> getProductos() {
        return productos;
    }

    public void setProductos(List<DetalleVenta> productos) {
        this.productos = productos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venta other = (Venta) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", usuario=" + usuario + ", total=" + total + ", productos=" + productos + '}';
    }
    
    
            
}
