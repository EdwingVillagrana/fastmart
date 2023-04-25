/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package frames;

import java.sql.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Kevin Rios
 */
public class DlgFechaSelector extends javax.swing.JDialog {

    private Date fechaInicio;
    private Date fechaFinal;
    
    /**
     * Creates new form DlgFechaSelector
     */
    public DlgFechaSelector(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
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
        btnMenu = new javax.swing.JButton();
        lblApartado = new javax.swing.JLabel();
        lblLogoCabecera = new javax.swing.JLabel();
        FondoTitulo = new javax.swing.JTextField();
        lblSeleccionarFechas = new javax.swing.JLabel();
        DateFechaInicio = new com.toedter.calendar.JDateChooser();
        DateFechaFinal = new com.toedter.calendar.JDateChooser();
        lblHasta = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        lblApartado.setText("Fechas");
        jPanel1.add(lblApartado);
        lblApartado.setBounds(60, 0, 90, 30);

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_principal.png"))); // NOI18N
        jPanel1.add(lblLogoCabecera);
        lblLogoCabecera.setBounds(130, 0, 280, 30);

        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        jPanel1.add(FondoTitulo);
        FondoTitulo.setBounds(0, 0, 410, 30);

        lblSeleccionarFechas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSeleccionarFechas.setText("Seleccione las fechas del período");
        jPanel1.add(lblSeleccionarFechas);
        lblSeleccionarFechas.setBounds(110, 40, 222, 20);
        jPanel1.add(DateFechaInicio);
        DateFechaInicio.setBounds(20, 70, 155, 22);
        jPanel1.add(DateFechaFinal);
        DateFechaFinal.setBounds(240, 70, 155, 22);

        lblHasta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHasta.setText("hasta");
        jPanel1.add(lblHasta);
        lblHasta.setBounds(190, 75, 37, 16);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar);
        btnAceptar.setBounds(180, 110, 90, 22);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(305, 110, 90, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
            Long milisFechaInicio = DateFechaInicio.getDate().getTime();
            Long milisFechaFinal = DateFechaFinal.getDate().getTime();
            Date sqlFechaInicio = new java.sql.Date(milisFechaInicio);
            Date sqlFechaFinal = new java.sql.Date(milisFechaFinal);
        if (DateFechaInicio.getDate() == null || DateFechaFinal.getDate() == null) {
            JOptionPane.showMessageDialog(null, "ERROR", "Ingrese las fechas", JOptionPane.ERROR_MESSAGE);
        } else {
            fechaInicio = sqlFechaInicio;
            fechaFinal = sqlFechaFinal;
            this.dispose();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public Date obtenerFechaInicio() {

        return fechaInicio;
    }
    public Date obtenerFechaFinal() {

        return fechaFinal;
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
            java.util.logging.Logger.getLogger(DlgFechaSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgFechaSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgFechaSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgFechaSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgFechaSelector dialog = new DlgFechaSelector(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser DateFechaFinal;
    private com.toedter.calendar.JDateChooser DateFechaInicio;
    private javax.swing.JTextField FondoTitulo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApartado;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.JLabel lblSeleccionarFechas;
    // End of variables declaration//GEN-END:variables
}