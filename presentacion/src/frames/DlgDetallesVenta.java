/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package frames;

import entidades.DetalleVenta;
import entidades.Venta;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Rios
 */
public class DlgDetallesVenta extends javax.swing.JDialog {

    private Venta venta;
    private DefaultTableModel model;
    private List<DetalleVenta> detallesVenta;

    /**
     * Creates new form DlgMostarVenta
     */
    public DlgDetallesVenta(java.awt.Frame parent, boolean modal, Venta venta) {
        super(parent, modal);
        initComponents();
        this.venta = venta;
        model = (DefaultTableModel) tblDetalleVenta.getModel();
        detallesVenta = venta.getProductos();
        llenarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarVenta = new javax.swing.JPanel();
        txtIdUsuario = new javax.swing.JButton();
        txtFecha = new javax.swing.JButton();
        txtTotal = new javax.swing.JButton();
        txtIdVenta = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lblApartado = new javax.swing.JLabel();
        lblLogoCabecera = new javax.swing.JLabel();
        FondoTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleVenta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        MostrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MostrarVenta.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 90, 30));
        MostrarVenta.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 130, 30));
        MostrarVenta.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 90, 30));
        MostrarVenta.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 30));

        btnMenu.setBackground(new java.awt.Color(110, 88, 68));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("🏠");
        btnMenu.setActionCommand("\\u2715");
        MostrarVenta.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        lblApartado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApartado.setForeground(new java.awt.Color(255, 255, 255));
        lblApartado.setText("Detalle Venta");
        MostrarVenta.add(lblApartado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 190, 30));

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_principal.png"))); // NOI18N
        MostrarVenta.add(lblLogoCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 190, 30));

        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        MostrarVenta.add(FondoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total");
        MostrarVenta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 40, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha");
        MostrarVenta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 60, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        MostrarVenta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 50, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID Venta");
        MostrarVenta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, -1));

        jLabel5.setEnabled(false);
        MostrarVenta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 540, 10));

        tblDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetalleVenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDetalleVenta);

        MostrarVenta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 460, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MostrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MostrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void llenarCampos() {
        this.txtIdVenta.setText(venta.getId().toString());
        this.txtIdUsuario.setText(venta.getUsuario().getNombre());
        this.txtFecha.setText(venta.getFechaDeVenta().toString());
        this.txtTotal.setText(venta.getTotal().toString());
        
        for (DetalleVenta detalleVenta : detallesVenta) {
            String producto = detalleVenta.getProducto().getNombre();
            Long cantidad = detalleVenta.getCantidad();
            Double precio = detalleVenta.getPrecio();
            Double subtotal = cantidad * precio;
            //llenando la tabla.
            Object[] fila = {producto, cantidad, precio, subtotal};
            model.addRow(fila);
        }
    }

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
//            java.util.logging.Logger.getLogger(DlgDetallesVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DlgDetallesVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DlgDetallesVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DlgDetallesVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DlgDetallesVenta dialog = new DlgDetallesVenta(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel MostrarVenta;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApartado;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.JTable tblDetalleVenta;
    private javax.swing.JButton txtFecha;
    private javax.swing.JButton txtIdUsuario;
    private javax.swing.JButton txtIdVenta;
    private javax.swing.JButton txtTotal;
    // End of variables declaration//GEN-END:variables
}
