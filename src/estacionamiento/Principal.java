/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estacionamiento;

public class Principal extends javax.swing.JFrame {

    Ingresar ig = new Ingresar();
    Salida_Automovil sa = new Salida_Automovil();
    Precios_Establecidos pe = new Precios_Establecidos();
    Usuario ur = new Usuario();


    public Principal(String rol) {
        initComponents();
        if(rol != "ADMIN"){
            btnPrecios.setEnabled(true);
            btnPrecios.setVisible(false);
            btnNuevoUsuario.setEnabled(true);
            btnNuevoUsuario.setVisible(false);
            
        }
        this.setExtendedState(this.MAXIMIZED_BOTH);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAutomoviles = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo3 = new javax.swing.JLabel();

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

        tbAutomoviles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbAutomoviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_auto", "Propietario", "Placas", "Marca", "Color", "Descripcion", "Hora_llegada"
            }
        ));
        tbAutomoviles.setToolTipText("");
        tbAutomoviles.setPreferredSize(new java.awt.Dimension(500, 150));
        tbAutomoviles.setRowHeight(35);
        jScrollPane1.setViewportView(tbAutomoviles);

        pnInicio.add(jScrollPane1);
        jScrollPane1.setBounds(60, 200, 1060, 550);
        pnInicio.add(txtBuscar);
        txtBuscar.setBounds(510, 140, 460, 30);
        txtBuscar.getAccessibleContext().setAccessibleName("");

        pnTitulo.setBackground(new java.awt.Color(44, 62, 80));
        pnTitulo.setPreferredSize(new java.awt.Dimension(368, 55));

        lbTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        lbTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo3.setText("ESTACIONAMIENTO");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTituloLayout.createSequentialGroup()
                .addContainerGap(653, Short.MAX_VALUE)
                .addComponent(lbTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTituloLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lbTitulo3)
                .addGap(15, 15, 15))
        );

        pnInicio.add(pnTitulo);
        pnTitulo.setBounds(0, 20, 1230, 90);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void isVisiblePanels() {
        this.pnInicio.setVisible(false);
        this.ig.setVisible(false);
        this.sa.setVisible(false);
        this.pe.setVisible(false);
        this.ur.setVisible(false);
        this.ur.pnUsuario.setVisible(false);
        this.pe.pnPrecio.setVisible(false);
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
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbBienvenida;
    private javax.swing.JLabel lbTitulo3;
    private javax.swing.JPanel pnBarra;
    private javax.swing.JPanel pnInicio;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JTable tbAutomoviles;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
