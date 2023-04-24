package entidades;

import entidades.Producto;
import entidades.Venta;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-24T13:09:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, Venta> venta;
    public static volatile SingularAttribute<DetalleVenta, Double> precio;
    public static volatile SingularAttribute<DetalleVenta, Producto> producto;
    public static volatile SingularAttribute<DetalleVenta, Long> cantidad;

}