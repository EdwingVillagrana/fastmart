/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author EDW
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @Column(name = "id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "id_proveedor", nullable = false)
    private Proveedor proveedor;
    
    @Column(name = "precio_compra", nullable = false)
    private Double precio_compra;
    
    @Column(name = "precio_venta", nullable = false)
    private Double precio_venta;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;
    
    @Column(name = "codigo", nullable = false)
    private Long codigo;
    
    @Column(name = "stock", nullable = false)
    private Long stock;

    public Producto() {
    }

    public Producto(String nombre, Proveedor proveedor, Double precio_compra, Double precio_venta, Categoria categoria, Long codigo) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.categoria = categoria;
        this.codigo = codigo;
        this.stock = 0L;
    }

    public Producto(Long id, String nombre, Proveedor proveedor, Double precio_compra, Double precio_venta, Categoria categoria, Long codigo, Long stock) {
        this.id = id;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.categoria = categoria;
        this.codigo = codigo;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(Double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }
    
    public void actualizaStock(Long cantidadVendida){
        this.stock -= cantidadVendida;
    }
}
