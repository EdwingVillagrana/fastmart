/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import entidades.Categoria;
import excepciones.NegocioException;
import implementaciones.CategoriasNegocio;
import interfaces.ICategoriasNegocio;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Rios
 */
public class FrmCategorias extends javax.swing.JFrame {
private ICategoriasNegocio categoriasNegocio;
    private DefaultTableModel model;
    private List<Categoria> listaCategorias = new ArrayList<>();
    /**
     * Creates new form frmConsultarCategorias
     */
    public FrmCategorias() {
        initComponents();
        this.categoriasNegocio = new CategoriasNegocio();
        model = (DefaultTableModel) this.tblCategorias.getModel();
        listarCategorias();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblLogoCabecera = new javax.swing.JLabel();
        lblApartado = new javax.swing.JLabel();
        FondoTitulo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListarCategorias = new javax.swing.JButton();
        btnBuscarCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_header.png"))); // NOI18N
        jPanel2.add(lblLogoCabecera);
        lblLogoCabecera.setBounds(120, 0, 220, 30);

        lblApartado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApartado.setForeground(new java.awt.Color(255, 255, 255));
        lblApartado.setText("Categorias");
        jPanel2.add(lblApartado);
        lblApartado.setBounds(10, 0, 200, 30);

        FondoTitulo.setEditable(false);
        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        FondoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FondoTituloActionPerformed(evt);
            }
        });
        jPanel2.add(FondoTitulo);
        FondoTitulo.setBounds(0, 0, 474, 30);

        jPanel3.setBackground(new java.awt.Color(0, 145, 155));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la categoría");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 10, 140, 16);

        txtNombreCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCategoriaKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombreCategoria);
        txtNombreCategoria.setBounds(20, 30, 180, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 50, 220, 80);

        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategorias.setShowGrid(true);
        tblCategorias.getTableHeader().setReorderingAllowed(false);
        tblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategorias);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 340, 260);

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
        jPanel2.add(btnModificar);
        btnModificar.setBounds(370, 140, 90, 80);

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
        jPanel2.add(btnAgregar);
        btnAgregar.setBounds(370, 50, 90, 80);

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
        jPanel2.add(btnSalir);
        btnSalir.setBounds(370, 320, 90, 80);

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
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(370, 230, 90, 80);

        btnListarCategorias.setBackground(new java.awt.Color(255, 145, 77));
        btnListarCategorias.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnListarCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_listarVentas.png"))); // NOI18N
        btnListarCategorias.setText("Listar");
        btnListarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCategoriasActionPerformed(evt);
            }
        });
        jPanel2.add(btnListarCategorias);
        btnListarCategorias.setBounds(250, 95, 110, 35);

        btnBuscarCategoria.setBackground(new java.awt.Color(255, 145, 77));
        btnBuscarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnBuscarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_lupa.png"))); // NOI18N
        btnBuscarCategoria.setText("Buscar");
        btnBuscarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCategoria);
        btnBuscarCategoria.setBounds(250, 50, 110, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCategoriaKeyTyped
        char c = evt.getKeyChar();
        // Verificar si el carácter ingresado es una letra
        if (!Character.isLetter(c) && c != ' ') {
            evt.consume(); // Eliminar el carácter ingresado si no es una letra o espacio
        }
    }//GEN-LAST:event_txtNombreCategoriaKeyTyped

    private void FondoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FondoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FondoTituloActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int indiceFilaSeleccionada = tblCategorias.getSelectedRow();
        int numfilas = tblCategorias.getSelectedRowCount();
        String catAux = txtNombreCategoria.getText();
        if (indiceFilaSeleccionada == -1 || numfilas > 1) {
            JOptionPane.showMessageDialog(null, "Seleccione una categoria", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Categoria categoriaAmodificar;
            String nombre = (String) tblCategorias.getValueAt(indiceFilaSeleccionada, 0);
            if (validarCampos()) {
                Categoria categoriaAModificar = null;
                try {
                    categoriaAModificar = categoriasNegocio.consultarPorNombre(nombre);
                } catch (NegocioException ex) {
                    Logger.getLogger(FrmCategorias.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (catAux.equals(categoriaAModificar.getNombre())) {
                    JOptionPane.showMessageDialog(null, "Modifique la categoría", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    categoriaAModificar.setNombre(txtNombreCategoria.getText());
                    try {
                        int confirmaActualizacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea actualizar la categoría: " + categoriaAModificar.getNombre() + " ?", "Actualizar categoría", JOptionPane.YES_NO_OPTION);
                        if (confirmaActualizacion == 0) {
                            categoriasNegocio.actualizar(categoriaAModificar);
                            limpiarCampos();
                            listarCategorias();
                            JOptionPane.showMessageDialog(null, "Se ha actualizado la información de la categoría", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } catch (NegocioException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Categoría no actualizada", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indiceFilaSeleccionada = tblCategorias.getSelectedRow();
        int numfilas = tblCategorias.getSelectedRowCount();
        if (indiceFilaSeleccionada == -1 || numfilas > 1) {
            JOptionPane.showMessageDialog(null, "Seleccione una categoria", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Categoria categoriasAEliminar = listaCategorias.get(indiceFilaSeleccionada);
            int confirmaEliminacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la categoría: " + categoriasAEliminar.getNombre() + " ?", "Eliminar categoría", JOptionPane.YES_NO_OPTION);
            if (confirmaEliminacion == 0) {
                try {
                    categoriasNegocio.eliminar(categoriasAEliminar);
                    listarCategorias();
                    limpiarCampos();
                    JOptionPane.showMessageDialog(null, "Se ha eliminado la categoría: " + categoriasAEliminar.getNombre() , "Eliminar categoría", JOptionPane.INFORMATION_MESSAGE);
                    
                } catch (NegocioException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    
                }

            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCategoriasActionPerformed
        listarCategorias();
    }//GEN-LAST:event_btnListarCategoriasActionPerformed

    private void btnBuscarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaActionPerformed
        if (txtNombreCategoria.getText().isEmpty() || txtNombreCategoria.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre de la categoria", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                String nombre = txtNombreCategoria.getText();
                consultarPorNombre(nombre);
            }
    }//GEN-LAST:event_btnBuscarCategoriaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (validarCampos()) {
            String nombre = txtNombreCategoria.getText();
            Categoria categoriaAgregar = new Categoria(nombre);
            try {
                int a = JOptionPane.YES_NO_OPTION;
                int resultado = JOptionPane.showConfirmDialog(this, "¿DESEA AGREGAR LA CATEGORIA: " + nombre + "?", "AGREGAR", a);
                if (resultado == 0) {
                    categoriasNegocio.agregar(categoriaAgregar);
                    limpiarCampos();
                    listarCategorias();
                    JOptionPane.showMessageDialog(null, "Se ha registrado la categoría exitosamente", "Registro", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NegocioException ex) {               
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Categoría no registrada", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriasMouseClicked
        int seleccionar = tblCategorias.rowAtPoint(evt.getPoint());
        this.txtNombreCategoria.setText(String.valueOf(tblCategorias.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_tblCategoriasMouseClicked

    
    private void limpiarCampos() {
        this.txtNombreCategoria.setText("");
    }
    public void consultarPorCodigo(Long codigo){
         try {
            Categoria categoria = categoriasNegocio.consultarPorId(codigo);
            this.listaCategorias.add(categoria);
            if (categoria == null) {
                JOptionPane.showMessageDialog(null, "La categoria no existe.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else{
                model.setRowCount(0);
                mostrarCategoria(categoria);
            }            
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
     
     public void consultarPorNombre(String nombre){
        try {
            Categoria categoria = categoriasNegocio.consultarPorNombre(nombre);
            this.listaCategorias.add(categoria);
            if (categoria == null) {
                JOptionPane.showMessageDialog(null, "La categoria existe.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else{
                model.setRowCount(0);
                mostrarCategoria(categoria);
            }            
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
     
     public void listarCategorias(){
        try {
            this.listaCategorias = categoriasNegocio.consultarTodos();
            model.setRowCount(0);

            for (Categoria categoria: listaCategorias) {
                mostrarCategoria(categoria);
            }
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

     
     private void mostrarCategoria(Categoria categoria) {
        String nombre = categoria.getNombre();
        
        Object[] fila = {nombre};
            model.addRow(fila);   
    }
    
    
     private boolean validarCampos() {
        if (this.txtNombreCategoria.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la categoría que desea agregar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
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
//            java.util.logging.Logger.getLogger(FrmCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmCategorias().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FondoTitulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCategoria;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListarCategorias;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApartado;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextField txtNombreCategoria;
    // End of variables declaration//GEN-END:variables
}
