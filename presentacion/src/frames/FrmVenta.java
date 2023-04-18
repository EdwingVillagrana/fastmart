package frames;

import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Usuario;
import entidades.Venta;
import excepciones.NegocioException;
import implementaciones.ProductosNegocio;
import implementaciones.VentasNegocio;
import interfaces.IProductosNegocio;
import interfaces.IVentasNegocio;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Kevin Rios
 */
public class FrmVenta extends javax.swing.JFrame {

    private Usuario usuarioLogueado = null;
    private DefaultTableModel model;
    private List<Producto> productosRegistradosEnBase = new ArrayList<>();
    private List<DetalleVenta> listaProductos = new ArrayList<>();
    private IVentasNegocio ventasNegocio;
    private IProductosNegocio producotsNegocio;

    //Atributos que nos ayudarán para realizar la modificación de un producto que se encuentre en el carrito
    private boolean seEstaModificando = false;
    private int indiceEnModificacion = -1;

    //Instancia de tipo Producto que se usará cada vez que se realice una consulta
    private Producto productoActual = null;

    //Variables utilizadas para manejar los cálculos
    private Double importe = 0.00;
    private Double cambio = 0.00;
    private Double total = 0.00;

    //Lista en donde se guardaran los productos     
    /**
     * Creates new form Venta
     *
     * @param usuarioLogueado
     */
    public FrmVenta(Usuario usuarioLogueado) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ventasNegocio = new VentasNegocio();

        this.producotsNegocio = new ProductosNegocio();
        this.usuarioLogueado = usuarioLogueado;

        model = (DefaultTableModel) tableArticulosCarrito.getModel();
        JTableHeader header = tableArticulosCarrito.getTableHeader();
        header.setVisible(false);
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
        btnMenu = new javax.swing.JButton();
        FondoTitulo = new javax.swing.JTextField();
        btnCancelarVenta = new javax.swing.JButton();
        btnImporte = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        lblDatosProducto = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        lblNombreProducto = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnLimpiarCampos = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblCambio = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        lblImporte = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblTotalApagar = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregarACarrito = new javax.swing.JButton();
        lblImagenSuper = new javax.swing.JLabel();
        btnGenerarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(null);

        tableArticulosCarrito.setForeground(new java.awt.Color(102, 255, 102));
        tableArticulosCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Cantidad", "Precio", "Subtotal"
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
        tableArticulosCarrito.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableArticulosCarrito);
        if (tableArticulosCarrito.getColumnModel().getColumnCount() > 0) {
            tableArticulosCarrito.getColumnModel().getColumn(0).setResizable(false);
            tableArticulosCarrito.getColumnModel().getColumn(1).setResizable(false);
            tableArticulosCarrito.getColumnModel().getColumn(2).setResizable(false);
            tableArticulosCarrito.getColumnModel().getColumn(3).setResizable(false);
        }

        Fondo.add(jScrollPane1);
        jScrollPane1.setBounds(50, 290, 640, 180);

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
        btnSalir.setBounds(710, 350, 110, 90);
        Fondo.add(jSeparator1);
        jSeparator1.setBounds(0, 28, 720, 0);

        lblLogoCabecera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogoCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_principal.png"))); // NOI18N
        Fondo.add(lblLogoCabecera);
        lblLogoCabecera.setBounds(280, 0, 280, 30);

        jLabel2.setBackground(new java.awt.Color(153, 102, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subtotal");
        Fondo.add(jLabel2);
        jLabel2.setBounds(420, 260, 50, 30);

        lblApartado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApartado.setForeground(new java.awt.Color(255, 255, 255));
        lblApartado.setText("Ventas");
        Fondo.add(lblApartado);
        lblApartado.setBounds(60, 0, 60, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Articulo");
        Fondo.add(jLabel3);
        jLabel3.setBounds(60, 260, 50, 30);

        jLabel6.setBackground(new java.awt.Color(153, 102, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");
        Fondo.add(jLabel6);
        jLabel6.setBounds(210, 260, 50, 30);

        jLabel7.setBackground(new java.awt.Color(153, 102, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");
        Fondo.add(jLabel7);
        jLabel7.setBounds(320, 260, 50, 30);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(163, 148, 132));
        Fondo.add(jTextField3);
        jTextField3.setBounds(50, 260, 640, 30);

        btnMenu.setBackground(new java.awt.Color(110, 88, 68));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("🏠");
        Fondo.add(btnMenu);
        btnMenu.setBounds(0, 0, 50, 30);

        FondoTitulo.setBackground(new java.awt.Color(110, 88, 68));
        Fondo.add(FondoTitulo);
        FondoTitulo.setBounds(0, 0, 840, 30);

        btnCancelarVenta.setBackground(new java.awt.Color(255, 145, 77));
        btnCancelarVenta.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnCancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_cancelarVenta.png"))); // NOI18N
        btnCancelarVenta.setText("Cancelar Venta");
        btnCancelarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarVenta.setInheritsPopupMenu(true);
        btnCancelarVenta.setName(""); // NOI18N
        btnCancelarVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });
        Fondo.add(btnCancelarVenta);
        btnCancelarVenta.setBounds(710, 150, 110, 90);

        btnImporte.setBackground(new java.awt.Color(255, 145, 77));
        btnImporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnImporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_importe.png"))); // NOI18N
        btnImporte.setText("Importe");
        btnImporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImporte.setInheritsPopupMenu(true);
        btnImporte.setName(""); // NOI18N
        btnImporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImporteActionPerformed(evt);
            }
        });
        Fondo.add(btnImporte);
        btnImporte.setBounds(710, 250, 110, 90);

        jPanel1.setBackground(new java.awt.Color(0, 145, 155));
        jPanel1.setLayout(null);

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecio.setText("PRECIO:");
        jPanel1.add(lblPrecio);
        lblPrecio.setBounds(330, 90, 70, 20);

        lblDatosProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatosProducto.setText("Datos del Producto");
        jPanel1.add(lblDatosProducto);
        lblDatosProducto.setBounds(10, 10, 150, 20);

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setText("CÓDIGO:");
        jPanel1.add(lblCodigo);
        lblCodigo.setBounds(30, 40, 70, 20);

        txtNombreProducto.setEditable(false);
        txtNombreProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombreProducto.setBorder(null);
        jPanel1.add(txtNombreProducto);
        txtNombreProducto.setBounds(30, 120, 170, 20);

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPrecio.setBorder(null);
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(330, 111, 60, 20);

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodigo.setBorder(null);
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(30, 62, 150, 20);

        lblStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStock.setText("STOCK:");
        jPanel1.add(lblStock);
        lblStock.setBounds(240, 90, 60, 20);

        lblNombreProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreProducto.setText("NOMBRE:");
        jPanel1.add(lblNombreProducto);
        lblNombreProducto.setBounds(30, 90, 70, 20);

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtStock.setBorder(null);
        jPanel1.add(txtStock);
        txtStock.setBounds(240, 112, 60, 20);

        btnLimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_borrarCampos.png"))); // NOI18N
        btnLimpiarCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarCampos);
        btnLimpiarCampos.setBounds(240, 57, 40, 30);

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_lupa.png"))); // NOI18N
        btnBuscarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto);
        btnBuscarProducto.setBounds(190, 57, 40, 30);

        Fondo.add(jPanel1);
        jPanel1.setBounds(50, 50, 430, 150);

        jPanel3.setBackground(new java.awt.Color(213, 240, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setLayout(null);

        lblCambio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCambio.setText("CAMBIO");
        jPanel3.add(lblCambio);
        lblCambio.setBounds(130, 10, 100, 20);

        txtCambio.setEditable(false);
        txtCambio.setBackground(new java.awt.Color(0, 0, 0));
        txtCambio.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtCambio.setForeground(new java.awt.Color(255, 255, 51));
        txtCambio.setText("0.00");
        jPanel3.add(txtCambio);
        txtCambio.setBounds(130, 30, 100, 30);

        lblImporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblImporte.setText("IMPORTE");
        jPanel3.add(lblImporte);
        lblImporte.setBounds(20, 10, 100, 20);

        txtImporte.setEditable(false);
        txtImporte.setBackground(new java.awt.Color(0, 0, 0));
        txtImporte.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtImporte.setForeground(new java.awt.Color(255, 255, 255));
        txtImporte.setText("0.00");
        jPanel3.add(txtImporte);
        txtImporte.setBounds(20, 30, 100, 30);

        Fondo.add(jPanel3);
        jPanel3.setBounds(50, 480, 250, 60);

        jPanel2.setBackground(new java.awt.Color(0, 145, 155));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(null);

        lblTotalApagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalApagar.setText("TOTAL A PAGAR");
        jPanel2.add(lblTotalApagar);
        lblTotalApagar.setBounds(270, 10, 100, 20);

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtTotal.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 255, 51));
        txtTotal.setText("0.00");
        jPanel2.add(txtTotal);
        txtTotal.setBounds(270, 30, 110, 30);

        Fondo.add(jPanel2);
        jPanel2.setBounds(310, 480, 380, 60);

        jPanel4.setBackground(new java.awt.Color(0, 145, 155));
        jPanel4.setLayout(null);

        txtCantidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCantidad.setBorder(null);
        jPanel4.add(txtCantidad);
        txtCantidad.setBounds(90, 5, 60, 30);

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidad.setText("CANTIDAD:");
        jPanel4.add(lblCantidad);
        lblCantidad.setBounds(10, 10, 90, 20);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_basurero.png"))); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar);
        btnEliminar.setBounds(340, 5, 30, 30);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_modificarVenta.png"))); // NOI18N
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar);
        btnModificar.setBounds(380, 5, 30, 30);

        btnAgregarACarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_agregar.png"))); // NOI18N
        btnAgregarACarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAgregarACarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarACarritoActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarACarrito);
        btnAgregarACarrito.setBounds(300, 5, 30, 30);

        Fondo.add(jPanel4);
        jPanel4.setBounds(50, 205, 430, 40);

        lblImagenSuper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_abarrotesC.PNG"))); // NOI18N
        Fondo.add(lblImagenSuper);
        lblImagenSuper.setBounds(490, 50, 200, 195);

        btnGenerarVenta.setBackground(new java.awt.Color(255, 145, 77));
        btnGenerarVenta.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_monedas.png"))); // NOI18N
        btnGenerarVenta.setText("Generar Venta");
        btnGenerarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerarVenta.setInheritsPopupMenu(true);
        btnGenerarVenta.setName(""); // NOI18N
        btnGenerarVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });
        Fondo.add(btnGenerarVenta);
        btnGenerarVenta.setBounds(710, 50, 110, 90);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        int confirmarEliminación = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la venta?", "Cancelar venta", JOptionPane.YES_NO_OPTION);
        if (confirmarEliminación == 0) {
            reiniciarCampos();
        }
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporteActionPerformed
        DlgImporte dlgImporte = new DlgImporte(this, true);
        dlgImporte.setVisible(true);
        while (dlgImporte.isVisible()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException io) {
                io.printStackTrace();
            }
        }
        importe = dlgImporte.obtenerImporte();

        txtImporte.setText(importe.toString());

        calculaCambio();
    }//GEN-LAST:event_btnImporteActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int indiceSeleccionado = tableArticulosCarrito.getSelectedRow();
        if (indiceSeleccionado == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun producto de la lista para modificar");
        } else {
            String nombre = listaProductos.get(indiceSeleccionado).getProducto().getNombre();
            String cantidad = listaProductos.get(indiceSeleccionado).getCantidad().toString();
            String stock = listaProductos.get(indiceSeleccionado).getProducto().getStock().toString();
            String precio = listaProductos.get(indiceSeleccionado).getPrecio().toString();
            indiceEnModificacion = indiceSeleccionado;
            this.seEstaModificando = true;

            this.txtNombreProducto.setText(nombre);
            this.txtStock.setText(stock);
            this.txtCantidad.setText(cantidad);
            this.txtPrecio.setText(precio);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarACarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarACarritoActionPerformed
        String camposValidos = validarCamposParaAgregarProducto();
        if (seEstaModificando) {
            if (camposValidos != null) {
                JOptionPane.showMessageDialog(null, camposValidos);
            } else {
                Long cantidad = Long.parseLong(this.txtCantidad.getText());
                listaProductos.get(indiceEnModificacion).setCantidad(cantidad);
                llenarTablaArticulosCarrito();
                calculaTotal();
                limpiarCamposDeProducto();
                seEstaModificando = false;
                indiceEnModificacion = -1;
            }
        } else {
            if (camposValidos != null) {
                JOptionPane.showMessageDialog(null, camposValidos);
            } else {
                Long cantidad = Long.parseLong(this.txtCantidad.getText());
                DetalleVenta nuevoProductoACarrito = new DetalleVenta(productoActual, cantidad, productoActual.getPrecio_venta());
                listaProductos.add(nuevoProductoACarrito);
                llenarTablaArticulosCarrito();
                calculaTotal();
                limpiarCamposDeProducto();
                productoActual = null;
            }
        }
    }//GEN-LAST:event_btnAgregarACarritoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indiceSeleccionado = tableArticulosCarrito.getSelectedRow();
        if (indiceSeleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un artículo para poder eliminar");
        } else {
            int confirmaEliminacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el producto del carrito?", "Eliminar producto", JOptionPane.YES_NO_OPTION);
            if (confirmaEliminacion == 0){
                listaProductos.remove(indiceSeleccionado);
                llenarTablaArticulosCarrito();
                calculaTotal();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        limpiarCamposDeProducto();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        String error = validarCamposParaGenerarVenta();
        if (error != null) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Venta venta = new Venta(this.usuarioLogueado, obtenerFecha(), this.total, this.listaProductos);

            try {
                ventasNegocio.agregar(venta);
                JOptionPane.showMessageDialog(null, "Venta Registrada", "Acción Exitosa", JOptionPane.OK_OPTION);
                //Recorremos la lista de articulos vendidos que se encuentra en la venta
                for (DetalleVenta productoVendido : listaProductos) {
                    //Obtenemos tanto la cantidad de producto vendido como el id del producto
                    Long cantidad = productoVendido.getCantidad();
                    Long idProducto = productoVendido.getProducto().getId();

                    //Recorremos la lista precargada hasta encontrar el artículo que coincida con el id del artículo vendido
                    for (Producto productoPrecargado : productosRegistradosEnBase) {
                        //Una vez encontrado, actualizamos el stock, así no debemos consultar de nuevo la base de datos
                        if (productoPrecargado.getId().equals(idProducto)) {
                            productoPrecargado.actualizaStock(cantidad);
                            break;
                        }
                    }
                }
                reiniciarCampos();
            } catch (NegocioException ex) {
                Logger.getLogger(FrmVenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "Venta no registrada!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        if (txtCodigo.getText().isEmpty() || txtCodigo.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo de código está vacío");
        } else {
            Long codigo = Long.parseLong(txtCodigo.getText());
            consultarCodigo(codigo);
            if (productoActual == null) {
                JOptionPane.showMessageDialog(null, "El producto no existe.");
            } else {
                this.txtNombreProducto.setText(productoActual.getNombre());
                this.txtPrecio.setText(productoActual.getPrecio_venta().toString());
                this.txtStock.setText(productoActual.getStock().toString());
            }
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    public String validarCamposParaAgregarProducto() {

        if (this.txtCantidad.getText().isEmpty() || this.txtCantidad.getText().isBlank()) {
            return "El campo cantidad no puede estar vacío ni contener espacios";
        } else {
            Long cantidad = Long.parseLong(this.txtCantidad.getText());
            Long stock = Long.parseLong(this.txtStock.getText());
            if (cantidad <= 0) {
                return "Debe agregar, al menos, un producto";
            }
            if (cantidad > stock) {
                return "La cantidad no puede ser mayor al stock";
            }
        }
        return null;
    }

    public void consultarCodigo(Long codigo) {
        for (Producto productoRegistrado : productosRegistradosEnBase) {
            if (productoRegistrado.getCodigo().equals(codigo)) {
                productoActual = productoRegistrado;
                break;
            }
        }
    }

    public void calculaCambio() {
        if (importe < total) {
            cambio = 0.0;
        } else {
            cambio = importe - total;
            txtCambio.setText(cambio.toString());
        }
    }

    public void calculaTotal() {
        total = 0.0;
        for (DetalleVenta detalleVenta : listaProductos) {
            total += detalleVenta.getPrecio() * detalleVenta.getCantidad();
        }
        this.txtTotal.setText(total.toString());
    }

    public void llenarTablaArticulosCarrito() {
        tableArticulosCarrito.removeAll();

        for (DetalleVenta detalleVenta : listaProductos) {
            String nombreProducto = detalleVenta.getProducto().getNombre();
            Long cantidadProducto = detalleVenta.getCantidad();
            Double precioProducto = detalleVenta.getPrecio();
            Double subTotal = cantidadProducto * precioProducto;
            //llenando la tabla.
            Object[] fila = {nombreProducto, cantidadProducto, precioProducto, subTotal};
            model.addRow(fila);
        }
    }

    /**
     * Regresa la fecha actual del sistema.
     *
     * @return Fecha actual del sistema.
     */
    public Date obtenerFecha() {
        return Date.valueOf(LocalDate.now());
    }

    /**
     * Valida que la lista de productos no esté vacía y que el importe no sea
     * menor al costo total de la venta.
     *
     * @return Un mensaje indicando el error o un mensaje vacío en caso de no
     * existir error.
     */
    private String validarCamposParaGenerarVenta() {

        if (listaProductos.isEmpty()) {
            return "La lista de productos no puede estar vacía";
        }
        if (importe < total) {
            return "El importe no puede ser menor al monto total";
        }
        return "";
    }

    /**
     * Carga el stock de productos que se encuentran en la base de datos. Este
     * método se usa con el fin de no estar realizando consultas frecuentes a la
     * base de datos.
     */
    public void llenarListaDeProductosRegistrados() {
        try {
            this.productosRegistradosEnBase = producotsNegocio.consultarTodos();
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpiarCamposDeProducto() {
        this.txtCodigo.setText("");
        this.txtNombreProducto.setText("");
        this.txtStock.setText("");
        this.txtCantidad.setText("");
        this.txtPrecio.setText("");
        productoActual = null;
    }

    public void reiniciarCampos() {
        this.listaProductos.clear();
        this.productoActual = null;
        this.cambio = 0.00;
        this.importe = 0.00;
        this.total = 0.00;
        limpiarCamposDeProducto();
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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVenta(new Usuario()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField FondoTitulo;
    private javax.swing.JButton btnAgregarACarrito;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnImporte;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
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
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDatosProducto;
    private javax.swing.JLabel lblImagenSuper;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblLogoCabecera;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTotalApagar;
    private javax.swing.JTable tableArticulosCarrito;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
