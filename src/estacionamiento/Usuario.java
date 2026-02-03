/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package estacionamiento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class Usuario extends javax.swing.JPanel {
    DefaultTableModel modelo = new DefaultTableModel();
    List<Usuarios> listaUsuario = new ArrayList<>();
    public Connection con = null;
    boolean siSelect = false;
    Usuarios  usuSeleccionado = null;


    public Usuario() {
        initComponents();
        modelo = (DefaultTableModel)tbUsuarios.getModel();
        con = new estacionamiento.ConectarBD().Conexion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel23 = new javax.swing.JPanel();
        lbTitulo4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        pnUsuario = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lbTelefono1 = new javax.swing.JLabel();
        lbApellidos = new javax.swing.JLabel();
        lbNombre1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lbCorreo1 = new javax.swing.JLabel();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo7 = new javax.swing.JLabel();
        lbContraseña1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        lbRol = new javax.swing.JLabel();
        cboxRol = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();

        setBackground(new java.awt.Color(178, 190, 195));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1221, 831));
        setLayout(null);

        jPanel23.setBackground(new java.awt.Color(44, 62, 80));
        jPanel23.setPreferredSize(new java.awt.Dimension(233, 55));

        lbTitulo4.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        lbTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo4.setText("TABLA DE USUARIO");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(jPanel23);
        jPanel23.setBounds(0, 20, 1230, 90);

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre (s)", "Apellido (s)", "Telefono", "Correo", "Contraseña", "Rol"
            }
        ));
        tbUsuarios.setRowHeight(35);
        jScrollPane1.setViewportView(tbUsuarios);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 689, 560);

        pnUsuario.setBackground(new java.awt.Color(178, 190, 195));

        lbTelefono1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbTelefono1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTelefono1.setText("Telefono");

        lbApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbApellidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbApellidos.setText("Apellido (s)");

        lbNombre1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbNombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNombre1.setText("Nombre (s)");

        lbCorreo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbCorreo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCorreo1.setText("Correo");

        pnTitulo.setBackground(new java.awt.Color(44, 62, 80));
        pnTitulo.setPreferredSize(new java.awt.Dimension(233, 55));

        lbTitulo7.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbTitulo7.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo7.setText("OPERADORES");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbTitulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo7)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lbContraseña1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbContraseña1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbContraseña1.setText("Contraseña");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        lbRol.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbRol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbRol.setText("Rol");

        cboxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ADMIN", "OPERADOR" }));
        cboxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxRolActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar-el-archivo.png"))); // NOI18N
        btnAceptar.setText("GUARDAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-x.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnUpdate.setText("ACTUALIZAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnUsuarioLayout = new javax.swing.GroupLayout(pnUsuario);
        pnUsuario.setLayout(pnUsuarioLayout);
        pnUsuarioLayout.setHorizontalGroup(
            pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
            .addGroup(pnUsuarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnUsuarioLayout.createSequentialGroup()
                        .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboxRol, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(txtTelefono)
                    .addComponent(txtApellidos)
                    .addComponent(txtNombre)
                    .addComponent(txtContraseña))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addGap(41, 41, 41))
        );
        pnUsuarioLayout.setVerticalGroup(
            pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono1)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCorreo1)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContraseña1)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRol)
                    .addComponent(cboxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(pnUsuario);
        pnUsuario.setBounds(730, 400, 400, 370);

        btnAgregar.setBackground(new java.awt.Color(44, 62, 80));
        btnAgregar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar);
        btnAgregar.setBounds(770, 120, 423, 70);

        btnEliminar.setBackground(new java.awt.Color(44, 62, 80));
        btnEliminar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar);
        btnEliminar.setBounds(770, 190, 423, 64);

        btnActualizar.setBackground(new java.awt.Color(44, 62, 80));
        btnActualizar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario(1).png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(null);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar);
        btnActualizar.setBounds(770, 260, 423, 64);

        btnCargarDatos.setBackground(new java.awt.Color(44, 62, 80));
        btnCargarDatos.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnCargarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando.png"))); // NOI18N
        btnCargarDatos.setText("CARGAR");
        btnCargarDatos.setBorder(null);
        btnCargarDatos.setContentAreaFilled(false);
        btnCargarDatos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });
        add(btnCargarDatos);
        btnCargarDatos.setBounds(770, 330, 420, 64);
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        leerU();
        txtCorreo.enable(false);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        limpiar();
        txtCorreo.enable(true);
        pnUsuario.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarU();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxRolActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        insertarU();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        limpiarTabla();
        obtenerDatos();
        mostrarDatos();
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        actualizarU();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboxRol;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbContraseña1;
    private javax.swing.JLabel lbCorreo1;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbRol;
    private javax.swing.JLabel lbTelefono1;
    private javax.swing.JLabel lbTitulo4;
    private javax.swing.JLabel lbTitulo7;
    private javax.swing.JPanel pnTitulo;
    public static javax.swing.JPanel pnUsuario;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void insertarU() {
        if (txtNombre.getText().equals("") || txtApellidos.getText().equals("") || txtTelefono.getText().equals(" ") || txtCorreo.getText().equals("") || txtContraseña.getText().equals("") || (cboxRol.getSelectedItem()).toString().equals("")) {
            JOptionPane.showInternalMessageDialog(null, "Rellene todos los campos", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Usuarios us = new Usuarios(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(), txtCorreo.getText(), txtContraseña.getText(), (cboxRol.getSelectedItem()).toString());
                String sql = "INSERT INTO usuarios(nombre, apellidos, telefono, correo, contrasena, rol) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, us.getNombre());
                pstmt.setString(2, us.getApellidos());
                pstmt.setString(3, us.getTelefono());
                pstmt.setString(4, us.getCorreo());
                pstmt.setString(5, us.getContraseña());
                pstmt.setString(6, us.getRol());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Usuario Insertado Correctamente");
                limpiar();
//        con.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

  public void limpiarTabla() {
        int a=modelo.getRowCount();    
            while(a!=0){ 
                if(a!=0)
                    modelo.removeRow(0);                      
                a=modelo.getRowCount();        
            }
        listaUsuario.clear();
    }
  
  public void limpiar(){
        txtNombre.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtContraseña.setText("");
        cboxRol.setSelectedIndex(0);
  }

  public void obtenerDatos(){
      try{
          String sql = "SELECT*FROM Usuarios ORDER BY id_usuario";
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              Usuarios usu = new Usuarios (rs.getString("nombre"), rs.getString("apellidos"), rs.getString("telefono"), rs.getString("correo"), rs.getString("contrasena"), rs.getString("rol"));
              usu.setId_usuario(rs.getInt("id_usuario"));
              listaUsuario.add(usu);
          }
      }catch (Exception ex){
          System.out.println("AQUI falla"+ex.getMessage());
      }
  }
  
  public void mostrarDatos(){
      try{
            for(Usuarios u : listaUsuario){
                Object [] fila = {u.getId_usuario(), u.getNombre(), u.getApellidos(), u.getTelefono(), u.getCorreo(), u.getContraseña(), u.getRol()};
                modelo.addRow(fila);
            }
            tbUsuarios.setModel(modelo);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
  }
  
     public void seleccionar() {
        if (tbUsuarios.getSelectedRow() != -1) {
            siSelect = true;
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un Operador", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
     }
        
        
    public void eliminarU() {
        seleccionar();
        if (siSelect) {
            if (usuSeleccionado.getCorreo().equals("admin@gmail.com")) {
                JOptionPane.showInternalMessageDialog(null, "No se Puede Eliminar ADMINISTRADOR", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                int fila = tbUsuarios.getSelectedRow();
                int id = Integer.parseInt(tbUsuarios.getValueAt(fila, 0).toString());
                int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este Operador?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmar != JOptionPane.YES_OPTION) {
                    return;
                }
                try {
                    String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setInt(1, id);
                    int filas = pstmt.executeUpdate();
//            con.close();
                    if (filas > 0) {
                        JOptionPane.showMessageDialog(this, "Operador eliminado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                        limpiarTabla();
                        obtenerDatos();
                        mostrarDatos();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo eliminar", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar: " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public void leerU(){
        seleccionar();
        if(siSelect){
            int fila = tbUsuarios.getSelectedRow();
            int id = Integer.parseInt(tbUsuarios.getValueAt(fila,0).toString());
            for (Usuarios u : listaUsuario){
                if(u.getId_usuario() == id){
                    usuSeleccionado = u;
                    txtNombre.setText(usuSeleccionado.getNombre());
                    txtApellidos.setText(usuSeleccionado.getApellidos());
                    txtTelefono.setText(usuSeleccionado.getTelefono());
                    txtCorreo.setText(usuSeleccionado.getCorreo());
                    txtContraseña.setText(usuSeleccionado.getContraseña());
                    cboxRol.setSelectedItem(usuSeleccionado.rol);
                }
            }
            pnUsuario.setVisible(true);
        }
    }
    
    public void actualizarU(){
        if (txtCorreo.getText().equals("admin@gmail.com")){
            JOptionPane.showInternalMessageDialog(null, "No se Puede Actualizar ADMINISTRADOR", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Usuarios us = new Usuarios(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(), txtCorreo.getText(), txtContraseña.getText(), (cboxRol.getSelectedItem()).toString());
                String sql = "UPDATE usuarios SET nombre=?, apellidos=?, telefono=?, contrasena=?, rol=? WHERE correo=?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, us.getNombre());
                pstmt.setString(2, us.getApellidos());
                pstmt.setString(3, us.getTelefono());
                pstmt.setString(4, us.getContraseña());
                pstmt.setString(5, us.getRol());
                pstmt.setString(6, us.getCorreo());
                int filas = pstmt.executeUpdate();
                if (filas > 0) {
                    JOptionPane.showMessageDialog(this, "Se ah Actualizado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla();
                    obtenerDatos();
                    mostrarDatos();
                    
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo Actualizar", "Erro", JOptionPane.ERROR_MESSAGE);
                }
//        con.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    limpiar();
    }
      
  
}
