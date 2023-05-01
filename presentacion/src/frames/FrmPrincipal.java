package frames;

import entidades.Usuario;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Kevin Rios
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private Usuario usuarioLogueado;

    /**
     * Creates new form MenuPrincipal
     *
     * @param usuarioLogueado
     */
    public FrmPrincipal(Usuario usuarioLogueado) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.usuarioLogueado = usuarioLogueado;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuInicioCerrarS = new javax.swing.JMenuItem();
        menuInicioSalirAplicacion = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        menuVentasVenta = new javax.swing.JMenuItem();
        menuCompras = new javax.swing.JMenu();
        menuComprasCompra = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuConsultasVentas = new javax.swing.JMenuItem();
        menuConsultasProductos = new javax.swing.JMenuItem();
        menuConsultasProveedores = new javax.swing.JMenuItem();
        menuConsultasCategorias = new javax.swing.JMenuItem();
        menuMantenimiento = new javax.swing.JMenu();
        menuManenimientoEmpleado = new javax.swing.JMenuItem();
        menuManenimientoProducto = new javax.swing.JMenuItem();
        menuManenimientoProveedor = new javax.swing.JMenuItem();
        menuManenimientoCategoria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(163, 148, 132));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.setLayout(null);

        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        menuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_home.png"))); // NOI18N
        menuInicio.setText("Inicio");

        menuInicioCerrarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_cerrarSesion.png"))); // NOI18N
        menuInicioCerrarS.setText("Cerrar Sesión");
        menuInicioCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioCerrarSActionPerformed(evt);
            }
        });
        menuInicio.add(menuInicioCerrarS);

        menuInicioSalirAplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_salirAplicacion.png"))); // NOI18N
        menuInicioSalirAplicacion.setText("Salir de la aplicación");
        menuInicioSalirAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioSalirAplicacionActionPerformed(evt);
            }
        });
        menuInicio.add(menuInicioSalirAplicacion);

        menu.add(menuInicio);

        menuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_ventas.png"))); // NOI18N
        menuVentas.setText("Ventas");

        menuVentasVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_ventasVenta.png"))); // NOI18N
        menuVentasVenta.setText("Venta");
        menuVentasVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentasVentaActionPerformed(evt);
            }
        });
        menuVentas.add(menuVentasVenta);

        menu.add(menuVentas);

        menuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_agregarCompras.png"))); // NOI18N
        menuCompras.setText("Compras");

        menuComprasCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_comprasCompra.png"))); // NOI18N
        menuComprasCompra.setText("Compra");
        menuComprasCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComprasCompraActionPerformed(evt);
            }
        });
        menuCompras.add(menuComprasCompra);

        menu.add(menuCompras);

        menuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_consultas.png"))); // NOI18N
        menuConsultas.setText("Consultas");

        menuConsultasVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_consultasVentas.png"))); // NOI18N
        menuConsultasVentas.setText("Consultar Ventas");
        menuConsultasVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasVentasActionPerformed(evt);
            }
        });
        menuConsultas.add(menuConsultasVentas);

        menuConsultasProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_producto.png"))); // NOI18N
        menuConsultasProductos.setText("Consultar Productos");
        menuConsultasProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasProductosActionPerformed(evt);
            }
        });
        menuConsultas.add(menuConsultasProductos);

        menuConsultasProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_añadirProveedor.png"))); // NOI18N
        menuConsultasProveedores.setText("Consultar Proveedores");
        menuConsultasProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasProveedoresActionPerformed(evt);
            }
        });
        menuConsultas.add(menuConsultasProveedores);

        menuConsultasCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_categorias.png"))); // NOI18N
        menuConsultasCategorias.setText("Consultar Categorias");
        menuConsultasCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasCategoriasActionPerformed(evt);
            }
        });
        menuConsultas.add(menuConsultasCategorias);

        menu.add(menuConsultas);

        menuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_configurar.png"))); // NOI18N
        menuMantenimiento.setText("Mantenimiento");

        menuManenimientoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_añadirEmpleado.png"))); // NOI18N
        menuManenimientoEmpleado.setText("Añadir Usuario");
        menuManenimientoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManenimientoEmpleadoActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuManenimientoEmpleado);

        menuManenimientoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_añadirProducto.png"))); // NOI18N
        menuManenimientoProducto.setText("Añadir Producto");
        menuManenimientoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManenimientoProductoActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuManenimientoProducto);

        menuManenimientoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_añadirProveedor.png"))); // NOI18N
        menuManenimientoProveedor.setText("Añadir Proveedor");
        menuManenimientoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManenimientoProveedorActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuManenimientoProveedor);

        menuManenimientoCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_añadirCategoria.png"))); // NOI18N
        menuManenimientoCategoria.setText("Añadir Categoria");
        menuManenimientoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManenimientoCategoriaActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuManenimientoCategoria);

        menu.add(menuMantenimiento);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuVentasVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentasVentaActionPerformed
        FrmVenta frmVenta = new FrmVenta(usuarioLogueado);
        frmVenta.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Aquí es donde se ejecutará el código cuando se cierre el FrmVenta
                setVisible(true); // Hace visible el FrmPrincipal
            }
        });
        frmVenta.setVisible(true);
        setVisible(false); // Oculta el FrmPrincipal
    }//GEN-LAST:event_menuVentasVentaActionPerformed

    private void menuComprasCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComprasCompraActionPerformed

    }//GEN-LAST:event_menuComprasCompraActionPerformed

    /**
     * Se agregó la navegabilidad al formulario de consulta
     *
     * @param evt
     */
    private void menuConsultasVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasVentasActionPerformed
        FrmConsultarVentas frmConsultarVentas = new FrmConsultarVentas(usuarioLogueado);
        frmConsultarVentas.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Aquí es donde se ejecutará el código cuando se cierre el FrmConsultarVentas
                setVisible(true); // Hace visible el FrmPrincipal
            }
        });
        frmConsultarVentas.setVisible(true);
        setVisible(false); // Oculta el FrmPrincipal

    }//GEN-LAST:event_menuConsultasVentasActionPerformed

    private void menuManenimientoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManenimientoEmpleadoActionPerformed

    }//GEN-LAST:event_menuManenimientoEmpleadoActionPerformed

    private void menuManenimientoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManenimientoProductoActionPerformed
        RegistrarProducto registrarProducto = new RegistrarProducto();
        registrarProducto.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                // Aquí es donde se ejecutará el código cuando se cierre el registrarCategoria
                setVisible(true); // Hace visible el registrarCategoria
            }
        });
        registrarProducto.setVisible(true);
        setVisible(false); //Ocultando el FrmPrincipal
    }//GEN-LAST:event_menuManenimientoProductoActionPerformed

    private void menuInicioSalirAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioSalirAplicacionActionPerformed
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿DESEA CERRAR LA APLICACIÓN?", "SALIR", a);
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuInicioSalirAplicacionActionPerformed

    private void menuInicioCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioCerrarSActionPerformed


    }//GEN-LAST:event_menuInicioCerrarSActionPerformed

    private void menuManenimientoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManenimientoProveedorActionPerformed
        RegistrarProveedor registrarProveedor = new RegistrarProveedor();
        registrarProveedor.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                // Aquí es donde se ejecutará el código cuando se cierre el registrarCategoria
                setVisible(true); // Hace visible el registrarProveedor
            }
        });
        registrarProveedor.setVisible(true);
        setVisible(false); //Ocultando el FrmPrincipal
    }//GEN-LAST:event_menuManenimientoProveedorActionPerformed

    private void menuManenimientoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManenimientoCategoriaActionPerformed
        RegistrarCategoria registrarCategoria = new RegistrarCategoria();
        registrarCategoria.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                // Aquí es donde se ejecutará el código cuando se cierre el registrarCategoria
                setVisible(true); // Hace visible el registrarCategoria
            }
        });
        registrarCategoria.setVisible(true);
        setVisible(false); //Ocultando el FrmPrincipal
    }//GEN-LAST:event_menuManenimientoCategoriaActionPerformed

    private void menuConsultasProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasProductosActionPerformed
        ConsultarProductos frmConsultarProductos = new ConsultarProductos();
        frmConsultarProductos.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Aquí es donde se ejecutará el código cuando se cierre el frmConsultarProductos
                setVisible(true); // Hace visible el FrmPrincipal
            }
        });
        frmConsultarProductos.setVisible(true);
        setVisible(false); // Oculta el FrmPrincipal


    }//GEN-LAST:event_menuConsultasProductosActionPerformed

    private void menuConsultasProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasProveedoresActionPerformed
        ConsultarProveedores consultarProveedores = new ConsultarProveedores();
        consultarProveedores.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Aquí es donde se ejecutará el código cuando se cierre el consultarProveedores
                setVisible(true); // Hace visible el FrmPrincipal
            }
        });
        consultarProveedores.setVisible(true);
        setVisible(false); // Oculta el FrmPrincipal
    }//GEN-LAST:event_menuConsultasProveedoresActionPerformed

    private void menuConsultasCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasCategoriasActionPerformed
        frmConsultarCategorias consultarProveedores = new frmConsultarCategorias();
        consultarProveedores.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Aquí es donde se ejecutará el código cuando se cierre el consultarProveedores
                setVisible(true); // Hace visible el FrmPrincipal
            }
        });
        consultarProveedores.setVisible(true);
        setVisible(false); // Oculta el FrmPrincipal
    }//GEN-LAST:event_menuConsultasCategoriasActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuCompras;
    private javax.swing.JMenuItem menuComprasCompra;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenuItem menuConsultasCategorias;
    private javax.swing.JMenuItem menuConsultasProductos;
    private javax.swing.JMenuItem menuConsultasProveedores;
    private javax.swing.JMenuItem menuConsultasVentas;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuInicioCerrarS;
    private javax.swing.JMenuItem menuInicioSalirAplicacion;
    private javax.swing.JMenuItem menuManenimientoCategoria;
    private javax.swing.JMenuItem menuManenimientoEmpleado;
    private javax.swing.JMenuItem menuManenimientoProducto;
    private javax.swing.JMenuItem menuManenimientoProveedor;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JMenuItem menuVentasVenta;
    // End of variables declaration//GEN-END:variables
}
