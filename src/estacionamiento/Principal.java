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


    public Principal() {
        initComponents();
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
        pnInicio = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 410));

        pnBarra.setBackground(new java.awt.Color(44, 62, 80));
        pnBarra.setForeground(new java.awt.Color(0, 102, 204));
        pnBarra.setPreferredSize(new java.awt.Dimension(310, 0));

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
        jButton1.setText("jButton1");
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

        javax.swing.GroupLayout pnBarraLayout = new javax.swing.GroupLayout(pnBarra);
        pnBarra.setLayout(pnBarraLayout);
        pnBarraLayout.setHorizontalGroup(
            pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBarraLayout.createSequentialGroup()
                .addGroup(pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBarraLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresar)
                            .addComponent(btnPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnBarraLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnInicio))
                    .addGroup(pnBarraLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBarraLayout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pnBarraLayout.setVerticalGroup(
            pnBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBarraLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnInicio)
                .addGap(50, 50, 50)
                .addComponent(btnIngresar)
                .addGap(49, 49, 49)
                .addComponent(btnSalida)
                .addGap(66, 66, 66)
                .addComponent(btnPrecios)
                .addGap(63, 63, 63)
                .addComponent(btnNuevoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
        );

        getContentPane().add(pnBarra, java.awt.BorderLayout.WEST);

        pnInicio.setBackground(new java.awt.Color(178, 190, 195));
        pnInicio.setPreferredSize(new java.awt.Dimension(100, 100));
        pnInicio.setLayout(null);

        jButton2.setText("Buscar");
        pnInicio.add(jButton2);
        jButton2.setBounds(795, 56, 72, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tipo ", "Costo x horas", "Descripción"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(500, 150));
        jScrollPane1.setViewportView(jTable1);

        pnInicio.add(jScrollPane1);
        jScrollPane1.setBounds(77, 97, 1070, 610);
        pnInicio.add(jTextField1);
        jTextField1.setBounds(490, 56, 299, 22);

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

    private void isVisiblePanels() {
        this.pnInicio.setVisible(false);
        this.ig.setVisible(false);
        this.sa.setVisible(false);
        this.pe.setVisible(false);
        this.ur.setVisible(false);
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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnPrecios;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnBarra;
    private javax.swing.JPanel pnInicio;
    // End of variables declaration//GEN-END:variables
}
