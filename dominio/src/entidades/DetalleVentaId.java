/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author EDW
 */
public class DetalleVentaId implements Serializable{
    private Long id_venta;
    private Long id_producto;

    public DetalleVentaId(Long id_venta, Long id_producto) {
        this.id_venta = id_venta;
        this.id_producto = id_producto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id_venta);
        hash = 43 * hash + Objects.hashCode(this.id_producto);
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
        final DetalleVentaId other = (DetalleVentaId) obj;
        if (!Objects.equals(this.id_venta, other.id_venta)) {
            return false;
        }
        return Objects.equals(this.id_producto, other.id_producto);
    }
    
    
}
