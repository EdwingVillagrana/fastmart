package frames;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import entidades.Producto;

import excepciones.NegocioException;
import implementaciones.ProductosNegocio;
import interfaces.IProductosNegocio;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Rios
 */
public class FrmProductos extends javax.swing.JFrame {

    private IProductosNegocio productosNegocio;
    private DefaultTableModel model;
    private List<Producto> listaProductos = new ArrayList<>();

    /**
     * Creates new form ConsultarVenta
     */
    public FrmProductos() {
        initComponents();
        this.productosNegocio = new ProductosNegocio();
        model = (DefaultTableModel) this.tblProductos.getModel();
        radioNombre.setSelected(true); 
        listarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblApartado = new javax.swing.JLabel();
        lblLogoCabecera = new javax.swing.JLabel();
        FondoTitulo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        lblCriterioBusqueda = new javax.swing.JLabel();
        radioCod = new javax.swing.JRadioButton();
        radioNombre = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        tblProductos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Proveedor", "P Compra", "P Venta", "Categoria", "Código", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setShowGrid(true);
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblProductos.getColumnModel().getColumn(1).setPreferredWidth(35);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(40);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(35);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(35);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(35);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(35);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 530, 260);

        lblApartado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApartado.setForeground(new java.awt.Color(255, 255, 255));
        lblApartado.setText("Productos");
        jPanel1.add(lblApartado);
        lblApartado.setBounds(10, 0, 100, 30);

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_header.png"))); // NOI18N
        jPanel1.add(lblLogoCabecera);
        lblLogoCabecera.setBounds(190, 0, 220, 30);

        FondoTitulo.setEditable(false);
        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        jPanel1.add(FondoTitulo);
        FondoTitulo.setBounds(0, 0, 658, 30);

        jPanel2.setBackground(new java.awt.Color(0, 145, 155));
        jPanel2.setLayout(null);

        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        jPanel2.add(txtBusqueda);
        txtBusqueda.setBounds(20, 42, 230, 30);

        lblCriterioBusqueda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCriterioBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        lblCriterioBusqueda.setText("Producto");
        jPanel2.add(lblCriterioBusqueda);
        lblCriterioBusqueda.setBounds(10, 5, 52, 14);

        radioGrupo.add(radioCod);
        radioCod.setForeground(new java.awt.Color(255, 255, 255));
        radioCod.setText("Cód. Producto");
        radioCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCodActionPerformed(evt);
            }
        });
        jPanel2.add(radioCod);
        radioCod.setBounds(100, 20, 100, 20);

        radioGrupo.add(radioNombre);
        radioNombre.setForeground(new java.awt.Color(255, 255, 255));
        radioNombre.setText("Nombre");
        radioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNombreActionPerformed(evt);
            }
        });
        jPanel2.add(radioNombre);
        radioNombre.setBounds(20, 20, 67, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 370, 80);

        btnBuscar.setBackground(new java.awt.Color(255, 145, 77));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscar.setInheritsPopupMenu(true);
        btnBuscar.setMargin(new java.awt.Insets(2, 1, 2, 2));
        btnBuscar.setName(""); // NOI18N
        btnBuscar.setVerifyInputWhenFocusTarget(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(400, 50, 140, 40);

        btnListar.setBackground(new java.awt.Color(255, 145, 77));
        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_listarVentas.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnListar.setMaximumSize(new java.awt.Dimension(70, 30));
        btnListar.setMinimumSize(new java.awt.Dimension(70, 30));
        btnListar.setPreferredSize(new java.awt.Dimension(70, 30));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar);
        btnListar.setBounds(400, 95, 140, 35);

        btnAgregar.setBackground(new java.awt.Color(255, 145, 77));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_AgregarAll.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(550, 50, 90, 80);

        btnSalir.setBackground(new java.awt.Color(255, 145, 77));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(550, 320, 90, 80);

        btnModificar.setBackground(new java.awt.Color(255, 145, 77));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_ModificarAll.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(550, 140, 90, 80);

        btnEliminar.setBackground(new java.awt.Color(255, 145, 77));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_EliminarAll.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(550, 230, 90, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (radioCod.isSelected()) {
            if (txtBusqueda.getText().isEmpty() || txtBusqueda.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Ingrese el código del producto", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Long codigo = Long.parseLong(txtBusqueda.getText());
                consultarPorCodigo(codigo);
            }
        }
        if (radioNombre.isSelected()) {
            if (txtBusqueda.getText().isBlank() || txtBusqueda.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre del producto", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String nombre = txtBusqueda.getText();
                consultarPorNombre(nombre);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void consultarPorCodigo(Long codigo) {
        try {
            Producto producto = productosNegocio.consultarPorCodigo(codigo);
            this.listaProductos.add(producto);
            if (producto == null) {
                JOptionPane.showMessageDialog(null, "El producto no existe.", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                model.setRowCount(0);
                mostrarProducto(producto);
            }
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void consultarPorNombre(String nombre) {
        try {
            Producto producto = productosNegocio.consultarPorNombre(nombre);
            this.listaProductos.add(producto);
            if (producto == null) {
                JOptionPane.showMessageDialog(null, "El producto no existe.", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                model.setRowCount(0);
                mostrarProducto(producto);
            }
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void listarProductos() {
        try {
            this.listaProductos = productosNegocio.consultarTodos();
            model.setRowCount(0);

            for (Producto producto : listaProductos) {
                mostrarProducto(producto);
            }
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void mostrarProducto(Producto producto) {
        String nombre = producto.getNombre();
        String proveedor = producto.getProveedor().getNombre();
        Double precio_compra = producto.getPrecio_compra();
        Double precio_venta = producto.getPrecio_venta();
        Long id_categoria = producto.getCategoria().getId();
        Long codigo = producto.getCodigo();
        Long stock = producto.getStock();
        Object[] fila = {nombre, proveedor, precio_compra, precio_venta, id_categoria, codigo, stock};
        model.addRow(fila);
    }

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        if (radioCod.isSelected()) {
            char c = evt.getKeyChar();
            if (!(Character.isDigit(c) || (c == evt.VK_BACK_SPACE) || (c == evt.VK_DELETE))) {
                evt.consume(); // Elimina el carácter que no es del 0 al 9
            }
        }
        if (radioNombre.isSelected()) {
            char c = evt.getKeyChar();
            // Verificar si el carácter ingresado es una letra
            if (!Character.isLetter(c) && c != ' ') {
                evt.consume(); // Eliminar el carácter ingresado si no es una letra o espacio
            }
        }
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void radioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNombreActionPerformed
        if (radioNombre.isSelected()) {
            txtBusqueda.setText("");
        }
    }//GEN-LAST:event_radioNombreActionPerformed

    private void radioCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCodActionPerformed
        if (radioCod.isSelected()) {
            txtBusqueda.setText("");
        }
    }//GEN-LAST:event_radioCodActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listarProductos();
    }//GEN-LAST:event_btnListarActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int indiceFilaSeleccionada = tblProductos.getSelectedRow(); 
        int numFilas = tblProductos.getSelectedRowCount();
        
        if (indiceFilaSeleccionada == -1 || numFilas > 1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String nombre = (String) tblProductos.getValueAt(indiceFilaSeleccionada, 0);
            Producto productoAModificar;
            try {
                productoAModificar = productosNegocio.consultarPorNombre(nombre);
                DlgProducto dlgModificarProducto = new DlgProducto(this, true, productoAModificar);
                dlgModificarProducto.setVisible(true);
            } catch (NegocioException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        DlgProducto dlgModificarProducto = new DlgProducto(this, true);
        dlgModificarProducto.setVisible(true);
        while (dlgModificarProducto.isVisible()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException io) {
                io.printStackTrace();
            }
        }
        listarProductos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indiceSeleccionado = tblProductos.getSelectedRow();
        int numfilas = tblProductos.getSelectedRowCount();
        if (indiceSeleccionado == -1 || numfilas > 1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto para poder eliminar", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Producto productoAeliminar = null;
            String nombre = (String) tblProductos.getValueAt(indiceSeleccionado, 0);
            try {
                productoAeliminar = productosNegocio.consultarPorNombre(nombre);
            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            int confirmaEliminacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el producto?", "Eliminar producto", JOptionPane.YES_NO_OPTION);
            if (confirmaEliminacion == 0) {
                try {
                    productosNegocio.eliminar(productoAeliminar);
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                    listarProductos();
                } catch (NegocioException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        
    }//GEN-LAST:event_tblProductosMouseClicked

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
//            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmProductos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FondoTitulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApartado;
    private javax.swing.JLabel lblCriterioBusqueda;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.JRadioButton radioCod;
    private javax.swing.ButtonGroup radioGrupo;
    private javax.swing.JRadioButton radioNombre;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
