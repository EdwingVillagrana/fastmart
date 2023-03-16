/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author EDW
 */
@Entity
@Table(name = "detalle_venta")
public class DetalleVenta implements Serializable {
//Agregarle un ID individual a los detalles venta para no tener errores
    @Id
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    @Column(name = "cantidad", nullable = false)
    private Long cantidad;

    @Column(name = "precio", nullable = false)
    private Double precio;

    public DetalleVenta() {
    }

    public DetalleVenta(Venta venta) {
        this.venta = venta;
    }

    public DetalleVenta(Venta venta, Producto producto, Long cantidad, Double precio) {
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "venta=" + venta + ", producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

}
