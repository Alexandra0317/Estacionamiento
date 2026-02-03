/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estacionamiento;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Principal extends javax.swing.JFrame {

    Ingresar ig = new Ingresar();
    Salida_Automovil sa = new Salida_Automovil();
    Precios_Establecidos pe = new Precios_Establecidos();
    Usuario ur = new Usuario();
    Reportes rp = new Reportes();
    private Connection con = null;
    DefaultTableModel modeloRegistro = new DefaultTableModel();
    private List<Automoviles> ListaRegistros = new ArrayList<>();
    private List<Precios> ListaPrecio = new ArrayList<>();
    private TableRowSorter<DefaultTableModel> sorter;


    public Principal(String rol) {
        initComponents();
        Reloj r = new Reloj();
        r.start();
        if(rol != "ADMIN"){
            btnPrecios.setEnabled(true);
            btnPrecios.setVisible(false);
            btnNuevoUsuario.setEnabled(true);
            btnNuevoUsuario.setVisible(false);
            
        }
        modeloRegistro = (DefaultTableModel)tbAutomoviles.getModel();
        sorter = new TableRowSorter<>(modeloRegistro);
        tbAutomoviles.setRowSorter(sorter);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/coche.png")).getImage());
        con = ConectarBD.Conexion();
        cargarTiposVehiculo();
        cargarRegistros();
        mostrarDatos();
        buscador();
        sa.setPrincipal(this);
        ig.setPrincipal(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBarra = new javax.swing.JPanel();
        btnSalida = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnPrecios = new javax.swing.JButton();
        lbBienvenida = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        pnInicio = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo3 = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAutomoviles = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 410));

        pnBarra.setBackground(new java.awt.Color(44, 62, 80));
        pnBarra.setForeground(new java.awt.Color(0, 102, 204));
        pnBarra.setPreferredSize(new java.awt.Dimension(370, 0));

        btnSalida.setBackground(new java.awt.Color(44, 62, 80));
        btnSalida.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida(1).png"))); // NOI18N
        btnSalida.setText("SALIDA");
        btnSalida.setBorder(null);
        btnSalida.setContentAreaFilled(false);
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        btnNuevoUsuario.setBackground(new java.awt.Color(44, 62, 80));
        btnNuevoUsuario.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nueva-cuenta.png"))); // NOI18N
        btnNuevoUsuario.setText("NUEVO USUARIO");
        btnNuevoUsuario.setBorder(null);
        btnNuevoUsuario.setContentAreaFilled(false);
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(44, 62, 80));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton1.setText("CERRAR SESIÓN");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(44, 62, 80));
        btnIngresar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seguro-de-auto(1).png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(null);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(44, 62, 80));
        btnInicio.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagina-de-inicio(2).png"))); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnPrecios.setBackground(new java.awt.Color(44, 62, 80));
        btnPrecios.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnPrecios.setForeground(new java.awt.Color(255, 255, 255));
        btnPrecios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro-nuevo(1).png"))); // NOI18N
        btnPrecios.setText("PRECIOS");
        btnPrecios.setBorder(null);
        btnPrecios.setContentAreaFilled(false);
        btnPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreciosActionPerformed(evt);
            }
        });

        lbBienvenida.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lbBienvenida.setForeground(new java.awt.Color(255, 255, 255));

        btnReportes.setBackground(new java.awt.Color(44, 62, 80));
        btnReportes.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informe-seo(1).png"))); // NOI18N
        btnReportes.setText("REPORTES");
        btnReportes.setBorder(null);
        btnReportes.setContentAreaFilled(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBarraLayout = new javax.swing.GroupLayout(pnBarra);
        pnBarra.setLayout(pnBarraLayout);
        pnBarraLayout.setHorizontalGroup(
            pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBarraLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lbBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(pnBarraLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReportes)
                    .addComponent(jButton1)
                    .addComponent(btnPrecios)
                    .addComponent(btnSalida)
                    .addComponent(btnIngresar)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBarraLayout.setVerticalGroup(
            pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBarraLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnInicio)
                .addGap(30, 30, 30)
                .addComponent(btnIngresar)
                .addGap(30, 30, 30)
                .addComponent(btnSalida)
                .addGap(30, 30, 30)
                .addComponent(btnPrecios)
                .addGap(33, 33, 33)
                .addComponent(btnNuevoUsuario)
                .addGap(30, 30, 30)
                .addComponent(btnReportes)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(pnBarra, java.awt.BorderLayout.WEST);

        pnInicio.setBackground(new java.awt.Color(178, 190, 195));
        pnInicio.setPreferredSize(new java.awt.Dimension(100, 100));
        pnInicio.setLayout(null);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa(1).png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnInicio.add(btnBuscar);
        btnBuscar.setBounds(990, 140, 130, 30);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        pnInicio.add(txtBuscar);
        txtBuscar.setBounds(510, 140, 460, 30);
        txtBuscar.getAccessibleContext().setAccessibleName("");

        pnTitulo.setBackground(new java.awt.Color(44, 62, 80));
        pnTitulo.setPreferredSize(new java.awt.Dimension(368, 55));

        lbTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        lbTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo3.setText("ESTACIONAMIENTO");

        lbHora.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbHora.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTituloLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(lbTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnTituloLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(lbTitulo3)))
                .addGap(15, 15, 15))
        );

        pnInicio.add(pnTitulo);
        pnTitulo.setBounds(0, 20, 1230, 90);

        tbAutomoviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_auto", "Propietario", "Placas", "Marca", "Color", "Tipo", "Descripcion", "Hora_llegada"
            }
        ));
        tbAutomoviles.setRowHeight(35);
        jScrollPane2.setViewportView(tbAutomoviles);

        pnInicio.add(jScrollPane2);
        jScrollPane2.setBounds(50, 200, 1070, 530);

        getContentPane().add(pnInicio, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        isVisiblePanels();
        this.add(ig);
        ig.setBounds(0, 79, 637, 319);
        ig.setVisible(true);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        int row = tbAutomoviles.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila de la tabla para registrar la salida.", "Sin selección", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int modelRow = tbAutomoviles.convertRowIndexToModel(row);
        Automoviles au = ListaRegistros.get(modelRow);
        sa.cargarDatos(au);
        isVisiblePanels();
        this.add(sa);
        sa.setBounds(0, 79, 637, 319);
        sa.setVisible(true);
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        isVisiblePanels();
        this.add(ur);
        ur.setBounds(0, 79, 637, 319);
        ur.setVisible(true);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        isVisiblePanels();
        refrescarDatos();
        this.add(pnInicio);
        pnInicio.setBounds(0, 79, 637, 319);
        pnInicio.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreciosActionPerformed
        isVisiblePanels();
        this.add(pe);
        pe.setBounds(0, 79, 637, 319);
        pe.setVisible(true);
    }//GEN-LAST:event_btnPreciosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        aplicarFiltroBusqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        isVisiblePanels();
        this.add(rp);
        rp.setBounds(0, 79, 637, 319);
        rp.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String texto = txtBuscar.getText().trim();
        
        if(texto.length() == 0){
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(texto)));
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    public void  isVisiblePanels() {
        this.pnInicio.setVisible(false);
        this.ig.setVisible(false);
        this.sa.setVisible(false);
        this.pe.setVisible(false);
        this.ur.setVisible(false);
        this.ur.pnUsuario.setVisible(false);
        this.pe.pnPrecio.setVisible(false);
        this.rp.setVisible(false);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal("ADMIN").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnPrecios;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lbBienvenida;
    public static javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbTitulo3;
    private javax.swing.JPanel pnBarra;
    public static javax.swing.JPanel pnInicio;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JTable tbAutomoviles;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

   private void cargarRegistros() {
        if (con == null) {
            return;
        }
        try {
            limpiarTabla();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM automoviles WHERE activo = true ORDER BY id_auto");
            while (rs.next()) {
                Automoviles au = new Automoviles();
                au.setId_auto(rs.getInt("id_auto"));
                au.setPropietario(rs.getString("propietario"));
                au.setPlacas(rs.getString("placas"));
                au.setMarca(rs.getString("marca"));
                au.setColor(rs.getString("color"));
                au.setHora_llegada(rs.getTime("hora_llegada"));
                au.setId_precio(rs.getInt("id_precio"));
                au.setActivo(rs.getBoolean("activo"));
                au.setDescripcion(rs.getString("descripcion"));
                au.setTipo(getIdPrecioGuardado(rs.getInt("id_precio")));
                ListaRegistros.add(au);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error al cargar registros: " + e.getMessage());
        }
    }
   
   private void cargarTiposVehiculo() {
        if (con == null) {
            return;
        }
        try {
            ListaPrecio.clear();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM precios ORDER BY id_precio");
            while (rs.next()) {
                Precios pr = new Precios();
                pr.setId_precio(rs.getInt("id_precio"));
                pr.setTipo(rs.getString("tipo"));
                pr.setCosto_horas(rs.getString("costo_horas"));
                pr.setDescripcion(rs.getString("descripcion"));
                ListaPrecio.add(pr);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error al cargar tipos: " + e.getMessage());
        }
    }
   
   public String getIdPrecioGuardado(int n) {
        for (Precios p : ListaPrecio) {
            if (n == p.getId_precio()) {
                return p.getTipo();
            }
        }
        return "";
    }

    public void mostrarDatos() {
        try {
            for (Automoviles au : ListaRegistros) {
                Object[] fila = {au.getId_auto(), au.getPropietario(), au.getPlacas(), au.getMarca(), au.getColor(), au.getTipo(), au.getDescripcion(),au.getHora_llegadaFormato()};
                modeloRegistro.addRow(fila);
            }
            tbAutomoviles.setModel(modeloRegistro);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void refrescarDatos() {
        modeloRegistro.setRowCount(0);
        cargarRegistros();
        mostrarDatos();
    }
    
    public void volverAInicio(){
        isVisiblePanels();
        refrescarDatos();
        this.add(pnInicio);
        pnInicio.setBounds(0, 79, 637, 319);
        pnInicio.setVisible(true);
        
    }
    
    public void limpiarTabla(){
        int a = modeloRegistro.getRowCount();
        while(a != 0){
            if(a != 0){
                modeloRegistro.removeRow(0);
            a = modeloRegistro.getRowCount();
            }
        }
        ListaRegistros.clear();
    }

    private void buscador(){
        sorter = new TableRowSorter<>(modeloRegistro);
        tbAutomoviles.setRowSorter(sorter);
        txtBuscar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                aplicarFiltroBusqueda();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                aplicarFiltroBusqueda();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                aplicarFiltroBusqueda();
            }
        });
    }
    
    private void aplicarFiltroBusqueda() {
        String texto = txtBuscar.getText().trim();
        if (sorter == null) return;
        if (texto.isEmpty()) {
            sorter.setRowFilter(null);
            return;
        }
        String busqueda = "(?i)" + java.util.regex.Pattern.quote(texto);
        sorter.setRowFilter(RowFilter.regexFilter(busqueda));
    }
}
