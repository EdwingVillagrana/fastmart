/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package frames;

import entidades.Proveedor;
import excepciones.NegocioException;
import implementaciones.ProveedoresNegocio;
import interfaces.IProveedoresNegocio;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Kevin Rios
 */
public class DlgProveedor extends javax.swing.JDialog {

    private Proveedor proveedorActualizar;
    private IProveedoresNegocio proveedoresNegocio;
    /**
     * Creates new form DlgModificarProveedor
     */
    public DlgProveedor(java.awt.Frame parent, boolean modal, Proveedor proveedor) {
        super(parent, modal);
        initComponents();
        this.proveedorActualizar = proveedor;
        proveedoresNegocio = new ProveedoresNegocio();
        llenarCamposActualizar();
    }
    
    public DlgProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        proveedoresNegocio = new ProveedoresNegocio();
    }
    
    private void llenarCamposActualizar(){
        this.txtID.setText(proveedorActualizar.getId().toString());
        this.txtNombre.setText(proveedorActualizar.getNombre());
        this.txtDireccion.setText(proveedorActualizar.getDireccion());
        this.txtTelefono.setText(proveedorActualizar.getTelefono());
        this.txtEmail.setText(proveedorActualizar.getEmail());
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
        lblLogoCabecera = new javax.swing.JLabel();
        lblApartado = new javax.swing.JLabel();
        FondoTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_header.png"))); // NOI18N
        jPanel1.add(lblLogoCabecera);
        lblLogoCabecera.setBounds(70, 0, 210, 30);

        lblApartado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApartado.setForeground(new java.awt.Color(255, 255, 255));
        lblApartado.setText("Proveedor");
        jPanel1.add(lblApartado);
        lblApartado.setBounds(10, 0, 100, 30);

        FondoTitulo.setEditable(false);
        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        jPanel1.add(FondoTitulo);
        FondoTitulo.setBounds(0, 0, 277, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese los datos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 50, 120, 20);

        jLabel3.setText("ID :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 30, 16);

        jLabel4.setText("Nombre :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 50, 16);

        btnAceptar.setBackground(new java.awt.Color(255, 145, 77));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar);
        btnAceptar.setBounds(20, 300, 90, 30);

        btnCancelar.setBackground(new java.awt.Color(255, 145, 77));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(140, 300, 90, 30);

        txtID.setEditable(false);
        jPanel1.add(txtID);
        txtID.setBounds(50, 85, 50, 22);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(80, 115, 160, 30);

        jPanel2.setBackground(new java.awt.Color(0, 145, 155));
        jPanel2.setLayout(null);

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel2.add(txtEmail);
        txtEmail.setBounds(50, 165, 180, 30);

        jLabel2.setText("Email :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 170, 50, 16);

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono);
        txtTelefono.setBounds(70, 125, 160, 30);

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel2.add(txtDireccion);
        txtDireccion.setBounds(80, 80, 150, 30);

        jLabel6.setText("Télefono :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 130, 60, 16);

        jLabel5.setText("Dirección :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 90, 60, 16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 80, 250, 210);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (proveedorActualizar != null) {
            if (validarCampos()) {
                proveedorActualizar.setNombre(txtNombre.getText());
                proveedorActualizar.setDireccion(txtDireccion.getText());
                proveedorActualizar.setTelefono(txtTelefono.getText());
                proveedorActualizar.setEmail(txtEmail.getText());
                try {
                    int confirmaActualizacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea actualizar el proveedor: " + proveedorActualizar.getNombre() + " ?", "Actualizar proveedor", JOptionPane.YES_NO_OPTION);
                    if (confirmaActualizacion == 0) {
                        proveedoresNegocio.actualizar(proveedorActualizar);
                        JOptionPane.showMessageDialog(null, "Se ha actualizado la información del proveedor", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }

                } catch (NegocioException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Proveedor no actualizado", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            if (validarCampos()) {
                String nombre = txtNombre.getText();
                String direccion = txtDireccion.getText();
                String email = txtEmail.getText();
                String telefono = txtTelefono.getText();
                Proveedor proveedorAgregar = new Proveedor(nombre, direccion, telefono, email);
                try {
                    int confirmaAgregar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea agregar el proveedor: " + nombre + " ?", "Agregar proveedor", JOptionPane.YES_NO_OPTION);
                    if (confirmaAgregar == 0) {
                    proveedoresNegocio.agregar(proveedorAgregar);
                    JOptionPane.showMessageDialog(null, "Se ha registrado el proveedor exitosamente", "Registro", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    }
                } catch (NegocioException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Proveedor no registrado", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (txtNombre.getText().length() >= 100 || !Character.isLetter(c) && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
       char c = evt.getKeyChar();
        if (txtDireccion.getText().length() >= 250) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
       
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtTelefono.getText().length() >=10 ) {
            evt.consume(); //Si no coincide va a hacer esto: 
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private boolean validarCampos() {
        if (this.txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Compleme el campo nombre", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (this.txtDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Compleme el campo dirección", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if (this.txtTelefono.getText().isEmpty() || this.txtTelefono.getText().length() < 10) {
            JOptionPane.showMessageDialog(null, "Complete el campo Teléfono", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (this.txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Compleme el campo E-mail", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }return true;
    }
    
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
//            java.util.logging.Logger.getLogger(DlgProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DlgProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DlgProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DlgProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DlgProveedor dialog = new DlgProveedor(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FondoTitulo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApartado;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
