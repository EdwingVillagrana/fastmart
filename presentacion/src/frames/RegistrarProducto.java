package frames;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kevin Rios
 */
public class RegistrarProducto extends javax.swing.JFrame {
    
    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarProducto() {
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

        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        lblApartado = new javax.swing.JLabel();
        lblLogoCabecera = new javax.swing.JLabel();
        FondoTitulo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblProveedor = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblIDProducto = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPrecioCompra = new javax.swing.JLabel();
        txtVenta = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCompra = new javax.swing.JTextField();
        lblPrecioVenta = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        comboProveedor = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        btnMenu.setBackground(new java.awt.Color(110, 88, 68));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("🏠");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu);
        btnMenu.setBounds(0, 0, 50, 30);

        lblApartado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApartado.setForeground(new java.awt.Color(255, 255, 255));
        lblApartado.setText("Registrar Usuario");
        jPanel1.add(lblApartado);
        lblApartado.setBounds(60, 0, 150, 30);

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_principal.png"))); // NOI18N
        jPanel1.add(lblLogoCabecera);
        lblLogoCabecera.setBounds(230, 0, 190, 30);

        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        FondoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FondoTituloActionPerformed(evt);
            }
        });
        jPanel1.add(FondoTitulo);
        FondoTitulo.setBounds(40, 0, 610, 30);

        jPanel2.setBackground(new java.awt.Color(0, 145, 155));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel2.setLayout(null);

        lblProveedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProveedor.setText("Proveedor:");
        jPanel2.add(lblProveedor);
        lblProveedor.setBounds(78, 90, 80, 20);

        txtID.setEditable(false);
        jPanel2.add(txtID);
        txtID.setBounds(170, 25, 60, 22);

        lblIDProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIDProducto.setText("ID Producto:");
        jPanel2.add(lblIDProducto);
        lblIDProducto.setBounds(70, 25, 90, 20);

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria:");
        jPanel2.add(lblCategoria);
        lblCategoria.setBounds(83, 190, 80, 20);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        jPanel2.add(lblNombre);
        lblNombre.setBounds(93, 60, 70, 20);

        lblPrecioCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioCompra.setText("Precio de Compra:");
        jPanel2.add(lblPrecioCompra);
        lblPrecioCompra.setBounds(28, 120, 130, 20);

        txtVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentaKeyTyped(evt);
            }
        });
        jPanel2.add(txtVenta);
        txtVenta.setBounds(170, 155, 140, 22);

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(txtNombre);
        txtNombre.setBounds(170, 60, 330, 22);

        txtCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCompraKeyTyped(evt);
            }
        });
        jPanel2.add(txtCompra);
        txtCompra.setBounds(170, 120, 140, 22);

        lblPrecioVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioVenta.setText("Precio de Venta:");
        jPanel2.add(lblPrecioVenta);
        lblPrecioVenta.setBounds(44, 155, 120, 20);

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel2.add(comboCategoria);
        comboCategoria.setBounds(170, 190, 240, 22);

        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel2.add(comboProveedor);
        comboProveedor.setBounds(170, 90, 240, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 80, 570, 240);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("Datos del Producto");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(240, 50, 170, 25);

        panelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        panelBotones.setLayout(null);

        btnCancelar.setBackground(new java.awt.Color(255, 145, 77));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setInheritsPopupMenu(true);
        btnCancelar.setName(""); // NOI18N
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelBotones.add(btnCancelar);
        btnCancelar.setBounds(130, 5, 110, 90);

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
        panelBotones.add(btnSalir);
        btnSalir.setBounds(250, 5, 110, 90);

        btnRegistrar.setBackground(new java.awt.Color(255, 145, 77));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_registrar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setInheritsPopupMenu(true);
        btnRegistrar.setName(""); // NOI18N
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panelBotones.add(btnRegistrar);
        btnRegistrar.setBounds(10, 5, 110, 90);

        jPanel1.add(panelBotones);
        panelBotones.setBounds(240, 330, 370, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void FondoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FondoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FondoTituloActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validarCampos()) {
            JOptionPane.showMessageDialog(null, "Se ha registrado el producto exitosamente", "Registro", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompraKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCompraKeyTyped

    private void limpiarCampos(){
        this.txtNombre.setText("");
        this.txtCompra.setText("");
        this.txtVenta.setText("");
        this.comboCategoria.setSelectedIndex(0);
        this.comboProveedor.setSelectedIndex(0);
    }
    
    private boolean validarCampos(){
        if (this.txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Compleme el campo nombre", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }else if (this.txtCompra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Compleme el campo precio compra", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }else if(this.txtVenta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Compleme el campo precio venta", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }else if(this.comboCategoria.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione la categoria", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }else if(this.comboProveedor.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione el proveedor", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void txtVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentaKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtVentaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FondoTitulo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApartado;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblIDProducto;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JTextField txtCompra;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVenta;
    // End of variables declaration//GEN-END:variables
}
