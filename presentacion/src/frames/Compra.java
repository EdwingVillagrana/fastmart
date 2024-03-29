package frames;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kevin Rios
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Venta
     */
    public Compra() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableArticulosCarrito = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblLogoCabecera = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblApartado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        FondoTitulo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        lblNombreProducto = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        lblDatosProducto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTotalApagar = new javax.swing.JLabel();
        txtTotalApagar = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        lblIVA = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblImagenSuper = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDatosCompra = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        dateFechaCompra = new com.toedter.calendar.JDateChooser();
        lblFecha = new javax.swing.JLabel();
        comboProveedores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(null);

        tableArticulosCarrito.setForeground(new java.awt.Color(102, 255, 102));
        tableArticulosCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableArticulosCarrito);

        Fondo.add(jScrollPane1);
        jScrollPane1.setBounds(50, 360, 640, 110);

        btnSalir.setBackground(new java.awt.Color(255, 145, 77));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setInheritsPopupMenu(true);
        btnSalir.setName(""); // NOI18N
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        Fondo.add(btnSalir);
        btnSalir.setBounds(710, 150, 110, 90);
        Fondo.add(jSeparator1);
        jSeparator1.setBounds(0, 28, 720, 0);

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_header.png"))); // NOI18N
        Fondo.add(lblLogoCabecera);
        lblLogoCabecera.setBounds(310, 0, 220, 30);

        jLabel2.setBackground(new java.awt.Color(153, 102, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subtotal");
        Fondo.add(jLabel2);
        jLabel2.setBounds(420, 330, 50, 30);

        lblApartado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApartado.setForeground(new java.awt.Color(255, 255, 255));
        lblApartado.setText("Compra");
        Fondo.add(lblApartado);
        lblApartado.setBounds(10, 0, 66, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Articulo");
        Fondo.add(jLabel3);
        jLabel3.setBounds(60, 330, 50, 30);

        jLabel6.setBackground(new java.awt.Color(153, 102, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");
        Fondo.add(jLabel6);
        jLabel6.setBounds(210, 330, 50, 30);

        jLabel7.setBackground(new java.awt.Color(153, 102, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");
        Fondo.add(jLabel7);
        jLabel7.setBounds(320, 330, 50, 30);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(163, 148, 132));
        Fondo.add(jTextField3);
        jTextField3.setBounds(50, 330, 640, 30);

        FondoTitulo.setEditable(false);
        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        Fondo.add(FondoTitulo);
        FondoTitulo.setBounds(0, 0, 834, 30);

        btnGuardar.setBackground(new java.awt.Color(255, 145, 77));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_agregarCompras.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setInheritsPopupMenu(true);
        btnGuardar.setName(""); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        Fondo.add(btnGuardar);
        btnGuardar.setBounds(710, 50, 110, 90);

        jPanel1.setBackground(new java.awt.Color(0, 145, 155));
        jPanel1.setLayout(null);

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecio.setText("PRECIO:");
        jPanel1.add(lblPrecio);
        lblPrecio.setBounds(330, 90, 70, 20);

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setText("CÓDIGO:");
        jPanel1.add(lblCodigo);
        lblCodigo.setBounds(30, 40, 70, 20);

        txtNombreProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombreProducto.setBorder(null);
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreProducto);
        txtNombreProducto.setBounds(30, 122, 170, 20);

        txtPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(330, 111, 60, 20);

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodigo.setBorder(null);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(30, 62, 150, 20);

        lblStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStock.setText("STOCK:");
        jPanel1.add(lblStock);
        lblStock.setBounds(240, 90, 60, 20);

        lblNombreProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreProducto.setText("NOMBRE:");
        jPanel1.add(lblNombreProducto);
        lblNombreProducto.setBounds(30, 100, 70, 20);

        txtStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtStock.setBorder(null);
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        jPanel1.add(txtStock);
        txtStock.setBounds(240, 112, 60, 20);

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_lupa.png"))); // NOI18N
        btnBuscarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(btnBuscarProducto);
        btnBuscarProducto.setBounds(190, 57, 30, 30);

        lblDatosProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatosProducto.setText("Datos del Producto");
        jPanel1.add(lblDatosProducto);
        lblDatosProducto.setBounds(10, 10, 150, 20);

        Fondo.add(jPanel1);
        jPanel1.setBounds(50, 120, 430, 150);

        jPanel2.setBackground(new java.awt.Color(0, 145, 155));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(null);

        lblTotalApagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalApagar.setText("TOTAL A PAGAR");
        jPanel2.add(lblTotalApagar);
        lblTotalApagar.setBounds(530, 10, 100, 20);

        txtTotalApagar.setEditable(false);
        txtTotalApagar.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalApagar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtTotalApagar.setForeground(new java.awt.Color(0, 255, 51));
        txtTotalApagar.setText("0.00");
        txtTotalApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalApagarActionPerformed(evt);
            }
        });
        jPanel2.add(txtTotalApagar);
        txtTotalApagar.setBounds(530, 30, 100, 20);

        txtIva.setEditable(false);
        txtIva.setBackground(new java.awt.Color(204, 204, 204));
        txtIva.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtIva.setText("0.00");
        txtIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvaActionPerformed(evt);
            }
        });
        jPanel2.add(txtIva);
        txtIva.setBounds(450, 30, 70, 20);

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(204, 204, 204));
        txtSubtotal.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtSubtotal.setText("0.00");
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });
        jPanel2.add(txtSubtotal);
        txtSubtotal.setBounds(360, 30, 70, 20);

        lblIVA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIVA.setText("IVA");
        jPanel2.add(lblIVA);
        lblIVA.setBounds(450, 10, 30, 20);

        lblSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSubTotal.setText("SUB TOTAL");
        jPanel2.add(lblSubTotal);
        lblSubTotal.setBounds(360, 10, 70, 20);

        Fondo.add(jPanel2);
        jPanel2.setBounds(50, 480, 640, 60);

        jPanel4.setBackground(new java.awt.Color(0, 145, 155));
        jPanel4.setLayout(null);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setText("TOTAL:");
        jPanel4.add(lblTotal);
        lblTotal.setBounds(160, 10, 50, 20);

        txtCantidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel4.add(txtCantidad);
        txtCantidad.setBounds(90, 5, 60, 30);

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidad.setText("CANTIDAD:");
        jPanel4.add(lblCantidad);
        lblCantidad.setBounds(10, 10, 90, 20);

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTotal.setText("0.00");
        txtTotal.setBorder(null);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel4.add(txtTotal);
        txtTotal.setBounds(220, 5, 50, 30);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_eliminar.png"))); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(btnEliminar);
        btnEliminar.setBounds(340, 5, 30, 30);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_agregar.png"))); // NOI18N
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(btnAgregar);
        btnAgregar.setBounds(300, 5, 30, 30);

        Fondo.add(jPanel4);
        jPanel4.setBounds(50, 275, 430, 40);

        lblImagenSuper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_abarrotesC.PNG"))); // NOI18N
        Fondo.add(lblImagenSuper);
        lblImagenSuper.setBounds(490, 120, 200, 195);

        jPanel3.setBackground(new java.awt.Color(0, 145, 155));
        jPanel3.setLayout(null);

        lblDatosCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatosCompra.setText("Datos de la Compra");
        jPanel3.add(lblDatosCompra);
        lblDatosCompra.setBounds(10, -2, 150, 20);

        lblProveedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProveedor.setText("PROVEEDOR:");
        jPanel3.add(lblProveedor);
        lblProveedor.setBounds(25, 13, 90, 20);

        dateFechaCompra.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(dateFechaCompra);
        dateFechaCompra.setBounds(230, 35, 170, 22);

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setText("FECHA:");
        jPanel3.add(lblFecha);
        lblFecha.setBounds(230, 13, 60, 20);

        comboProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel3.add(comboProveedores);
        comboProveedores.setBounds(25, 35, 190, 22);

        Fondo.add(jPanel3);
        jPanel3.setBounds(50, 50, 640, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtTotalApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalApagarActionPerformed

    private void txtIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaActionPerformed

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

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
//            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Compra().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField FondoTitulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboProveedores;
    private com.toedter.calendar.JDateChooser dateFechaCompra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblApartado;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDatosCompra;
    private javax.swing.JLabel lblDatosProducto;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblImagenSuper;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalApagar;
    private javax.swing.JTable tableArticulosCarrito;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalApagar;
    // End of variables declaration//GEN-END:variables
}
