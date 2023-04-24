package entidades;

import entidades.Compra;
import entidades.Producto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-24T13:09:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(DetalleCompra.class)
public class DetalleCompra_ { 

    public static volatile SingularAttribute<DetalleCompra, Compra> compra;
    public static volatile SingularAttribute<DetalleCompra, Double> precio;
    public static volatile SingularAttribute<DetalleCompra, Producto> producto;
    public static volatile SingularAttribute<DetalleCompra, Long> cantidad;

}