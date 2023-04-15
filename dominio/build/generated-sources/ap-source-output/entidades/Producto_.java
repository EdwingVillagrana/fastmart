package entidades;

import entidades.Categoria;
import entidades.Proveedor;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-14T16:26:00", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Long> codigo;
    public static volatile SingularAttribute<Producto, Double> precio_compra;
    public static volatile SingularAttribute<Producto, Categoria> categoria;
    public static volatile SingularAttribute<Producto, Double> precio_venta;
    public static volatile SingularAttribute<Producto, Proveedor> proveedor;
    public static volatile SingularAttribute<Producto, Long> id;
    public static volatile SingularAttribute<Producto, Long> stock;
    public static volatile SingularAttribute<Producto, String> nombre;

}