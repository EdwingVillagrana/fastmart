package entidades;

import entidades.DetalleCompra;
import entidades.Usuario;
import java.sql.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-14T16:26:00", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Double> total;
    public static volatile SingularAttribute<Compra, Date> fechaDeCompra;
    public static volatile SingularAttribute<Compra, Usuario> usuario;
    public static volatile SingularAttribute<Compra, Long> id;
    public static volatile ListAttribute<Compra, DetalleCompra> productos;

}