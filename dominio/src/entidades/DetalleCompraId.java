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
public class DetalleCompraId implements Serializable{
    private Long id_compra;
    private Long id_producto;

    public DetalleCompraId(Long id_compra, Long id_producto) {
        this.id_compra = id_compra;
        this.id_producto = id_producto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.id_compra);
        hash = 73 * hash + Objects.hashCode(this.id_producto);
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
        final DetalleCompraId other = (DetalleCompraId) obj;
        if (!Objects.equals(this.id_compra, other.id_compra)) {
            return false;
        }
        return Objects.equals(this.id_producto, other.id_producto);
    }
    
    
}
