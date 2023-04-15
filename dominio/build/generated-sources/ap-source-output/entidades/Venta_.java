package entidades;

import entidades.DetalleVenta;
import entidades.Usuario;
import java.sql.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-14T16:26:00", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Double> total;
    public static volatile SingularAttribute<Venta, Usuario> usuario;
    public static volatile SingularAttribute<Venta, Date> fechaDeVenta;
    public static volatile SingularAttribute<Venta, Long> id;
    public static volatile ListAttribute<Venta, DetalleVenta> productos;

}