/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

/**
 *
 * @author EDW
 */
@Entity
@Table(name = "compras")
public class Compra implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
    
    @Column(name = "fecha")
    private Date fechaDeCompra;
    
    @Column(name = "total", nullable = false)
    private Double total;
    
    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleCompra> productos;

    public Compra() {
    }

    public Compra(Long id) {
        this.id = id;
    }

    public Compra(Usuario usuario, Date fechaDeCompra, Double total, List<DetalleCompra> detalles) {
        this.usuario = usuario;
        this.fechaDeCompra = fechaDeCompra;
        this.total = total;
        this.productos = detalles;
    }

    public Compra(Long id, Usuario usuario, Date fechaDeCompra, Double total, List<DetalleCompra> detalles) {
        this.id = id;
        this.usuario = usuario;
        this.fechaDeCompra = fechaDeCompra;
        this.total = total;
        this.productos = detalles;
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

    public Date getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(Date fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<DetalleCompra> getProductos() {
        return productos;
    }

    public void setProductos(List<DetalleCompra> productos) {
        this.productos = productos;
    }
    
    public void agregarDetalle(DetalleCompra detalles){
        productos.add(detalles);
    }
}
