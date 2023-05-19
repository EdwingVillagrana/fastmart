package frames;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import entidades.Proveedor;
import excepciones.NegocioException;
import implementaciones.ProveedoresNegocio;
import interfaces.IProveedoresNegocio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Kevin Rios
 */
public class FrmProveedores extends javax.swing.JFrame {
    private IProveedoresNegocio proveedoresNegocio;
    private List<Proveedor> listaProveedores = new ArrayList<>();
    private DefaultTableModel model;
    /**
     * Creates new form ConsultarVenta
     */
    public FrmProveedores() {
        initComponents();
        this.proveedoresNegocio = new ProveedoresNegocio();
        model = (DefaultTableModel) this.tblProveedores.getModel();
        radioNombre.setSelected(true);
        listarProveedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGrupoP = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        lblApartado = new javax.swing.JLabel();
        lblLogoCabecera = new javax.swing.JLabel();
        FondoTitulo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        lblCriterioBusqueda = new javax.swing.JLabel();
        radioID = new javax.swing.JRadioButton();
        radioNombre = new javax.swing.JRadioButton();
        btnListarProveedores = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnSalir.setBackground(new java.awt.Color(255, 145, 77));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setInheritsPopupMenu(true);
        btnSalir.setName(""); // NOI18N
        btnSalir.setVerifyInputWhenFocusTarget(false);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(590, 320, 90, 80);

        tblProveedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Dirección", "Telefono", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblProveedores.setShowGrid(true);
        tblProveedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProveedores);
        if (tblProveedores.getColumnModel().getColumnCount() > 0) {
            tblProveedores.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblProveedores.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblProveedores.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblProveedores.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 570, 260);

        lblApartado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApartado.setForeground(new java.awt.Color(255, 255, 255));
        lblApartado.setText("Proveedores");
        jPanel1.add(lblApartado);
        lblApartado.setBounds(10, 0, 130, 30);

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_header.png"))); // NOI18N
        jPanel1.add(lblLogoCabecera);
        lblLogoCabecera.setBounds(230, 0, 230, 30);

        FondoTitulo.setEditable(false);
        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        FondoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FondoTituloActionPerformed(evt);
            }
        });
        jPanel1.add(FondoTitulo);
        FondoTitulo.setBounds(0, 0, 696, 30);

        btnBuscar.setBackground(new java.awt.Color(255, 145, 77));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscar.setInheritsPopupMenu(true);
        btnBuscar.setName(""); // NOI18N
        btnBuscar.setVerifyInputWhenFocusTarget(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(440, 50, 140, 40);

        jPanel2.setBackground(new java.awt.Color(0, 145, 155));
        jPanel2.setLayout(null);

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        jPanel2.add(txtBusqueda);
        txtBusqueda.setBounds(20, 40, 280, 30);

        lblCriterioBusqueda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCriterioBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        lblCriterioBusqueda.setText("Criterios de Búsqueda");
        jPanel2.add(lblCriterioBusqueda);
        lblCriterioBusqueda.setBounds(10, 5, 126, 14);

        radioGrupoP.add(radioID);
        radioID.setForeground(new java.awt.Color(255, 255, 255));
        radioID.setText("ID");
        radioID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIDActionPerformed(evt);
            }
        });
        jPanel2.add(radioID);
        radioID.setBounds(140, 20, 40, 20);

        radioGrupoP.add(radioNombre);
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
        jPanel2.setBounds(10, 50, 420, 80);

        btnListarProveedores.setBackground(new java.awt.Color(255, 145, 77));
        btnListarProveedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_listarVentas.png"))); // NOI18N
        btnListarProveedores.setText("Listar");
        btnListarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarProveedores);
        btnListarProveedores.setBounds(440, 95, 140, 35);

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
        btnModificar.setBounds(590, 140, 90, 80);

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
        btnEliminar.setBounds(590, 230, 90, 80);

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
        btnAgregar.setBounds(590, 50, 90, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FondoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FondoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FondoTituloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (radioID.isSelected()) {
            if (txtBusqueda.getText().isBlank() || txtBusqueda.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese el código del proveedor", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Long codigo = Long.parseLong(txtBusqueda.getText());
                consultarPorCodigo(codigo);         
            }
        }
        if (radioNombre.isSelected()) {
            if (txtBusqueda.getText().isBlank() || txtBusqueda.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre del proveedor", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                String nombre = txtBusqueda.getText();
                consultarPorNombre(nombre);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void consultarPorCodigo(Long codigo){
        try {
            Proveedor proveedor = proveedoresNegocio.consultarPorId(codigo);
            this.listaProveedores.add(proveedor);
            if (proveedor == null) {
                JOptionPane.showMessageDialog(null, "El proveedor no existe.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else{
                model.setRowCount(0);
                mostrarProveedor(proveedor);
            }            
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void consultarPorNombre(String nombre){
        try {
            Proveedor proveedor = proveedoresNegocio.consultarPorNombre(nombre);
            this.listaProveedores.add(proveedor);
            if (proveedor == null) {
                JOptionPane.showMessageDialog(null, "El proveedor no existe.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else{
                model.setRowCount(0);
                mostrarProveedor(proveedor);
            }            
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void listarProveedores(){
        try {
            this.listaProveedores = proveedoresNegocio.consultarTodos();
            model.setRowCount(0);
            for (Proveedor proveedor: listaProveedores) {
                mostrarProveedor(proveedor);
            }
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void mostrarProveedor(Proveedor proveedor){
        String direccion = proveedor.getDireccion();
        String email = proveedor.getEmail();
        String nombre = proveedor.getNombre();
        String telefono = proveedor.getTelefono();
        Object[] fila = {nombre, direccion, telefono, email};
        model.addRow(fila);
    }
    
    private void radioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNombreActionPerformed
        if (radioNombre.isSelected()) {
            txtBusqueda.setText("");
        }
    }//GEN-LAST:event_radioNombreActionPerformed

    private void radioIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIDActionPerformed
        if (radioID.isSelected()) {
            txtBusqueda.setText("");
        }
    }//GEN-LAST:event_radioIDActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        if (radioID.isSelected()) {
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

    private void btnListarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProveedoresActionPerformed
        listarProveedores();
    }//GEN-LAST:event_btnListarProveedoresActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int indiceFilaSeleccionada = tblProveedores.getSelectedRow();
        int numfilas = tblProveedores.getSelectedRowCount();
        if (indiceFilaSeleccionada == -1 || numfilas > 1) {
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }else {
            Proveedor proveedorAModificar = listaProveedores.get(indiceFilaSeleccionada);
            DlgProveedor dlgProveedor = new DlgProveedor(this, true, proveedorAModificar);
            dlgProveedor.setVisible(true);
            
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int indiceFilaSeleccionada = tblProveedores.getSelectedRow();
         int numfilas = tblProveedores.getSelectedRowCount();
        if (indiceFilaSeleccionada == -1 || numfilas > 1) {
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Proveedor proveedorAEliminar = listaProveedores.get(indiceFilaSeleccionada);
            int confirmaEliminacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el proveedor: " + proveedorAEliminar.getNombre()+" ?", "Eliminar proveedor", JOptionPane.YES_NO_OPTION);
            if (confirmaEliminacion == 0) {
                try {
                    proveedoresNegocio.eliminar(proveedorAEliminar);
                    listarProveedores();
                } catch (NegocioException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        DlgProveedor dlgProveedor = new DlgProveedor(this, true);
        dlgProveedor.setVisible(true);
        while (dlgProveedor.isVisible()) {
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    
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
//            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
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
//                new FrmProveedores().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FondoTitulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListarProveedores;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApartado;
    private javax.swing.JLabel lblCriterioBusqueda;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.ButtonGroup radioGrupoP;
    private javax.swing.JRadioButton radioID;
    private javax.swing.JRadioButton radioNombre;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
