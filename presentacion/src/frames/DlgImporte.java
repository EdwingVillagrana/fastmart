/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package frames;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class DlgImporte extends javax.swing.JDialog {

    private Double importe = 0.00;

    /**
     * Creates new form DlgImporte
     */
    public DlgImporte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptarImporte = new javax.swing.JButton();
        FondoTitulo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_principal.png"))); // NOI18N
        jPanel1.add(lblLogoCabecera);
        lblLogoCabecera.setBounds(130, 0, 280, 30);

        lblApartado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApartado.setForeground(new java.awt.Color(255, 255, 255));
        lblApartado.setText("Importe");
        jPanel1.add(lblApartado);
        lblApartado.setBounds(60, 0, 90, 30);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese el importe");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 50, 130, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_monedas.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 60, 50, 50);

        txtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteKeyTyped(evt);
            }
        });
        jPanel1.add(txtImporte);
        txtImporte.setBounds(140, 72, 230, 30);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(290, 110, 80, 25);

        btnAceptarImporte.setText("Aceptar");
        btnAceptarImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarImporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptarImporte);
        btnAceptarImporte.setBounds(140, 110, 80, 25);

        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        jPanel1.add(FondoTitulo);
        FondoTitulo.setBounds(0, 0, 410, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        String precioTexto = txtImporte.getText() + caracter;
        Pattern patron = Pattern.compile("^\\d{0,4}(\\.\\d{0,2})?$");
        Matcher matcher = patron.matcher(precioTexto);
        if (!matcher.matches()) {
            evt.consume();
        }
    }//GEN-LAST:event_txtImporteKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarImporteActionPerformed
        if (txtImporte.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CUADRO VACÍO!!!!!");
            txtImporte.requestFocus();
        } else {
            importe = Double.parseDouble(txtImporte.getText());
            this.dispose();
        }
    }//GEN-LAST:event_btnAceptarImporteActionPerformed

    public Double obtenerImporte() {
        return importe;
    }

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
            java.util.logging.Logger.getLogger(DlgImporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgImporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgImporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgImporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgImporte dialog = new DlgImporte(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FondoTitulo;
    private javax.swing.JButton btnAceptarImporte;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApartado;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.JTextField txtImporte;
    // End of variables declaration//GEN-END:variables
}
