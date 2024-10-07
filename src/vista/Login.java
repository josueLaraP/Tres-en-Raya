
package vista;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioService;

/**
 * La clase Login crea una interfaz gráfica para el inicio de sesión del usuario.
 * Permite a los usuarios ingresar su nombre de usuario y contraseña para
 * acceder a la aplicación, validando estos datos con un servicio de usuario.
 * Además, proporciona acceso a la ventana de registro si el usuario aún no
 * tiene una cuenta.
 */
public class Login extends javax.swing.JFrame {

    /**
     * Constructor de la clase Login que inicializa los componentes gráficos.
     * Configura el tamaño, localización y apariencia general de la ventana.
     */
    public Login() {
        
        init();
    }
    /**
     * Método que configura y personaliza las propiedades básicas de la ventana,
     * como la posición, la opción de cierre y el comportamiento de redimensionamiento.
     * También establece que no tendrá decoración visible (sin barra de título).
     */
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLogin.setBackground(new java.awt.Color(14, 19, 49));
        panelLogin.setPreferredSize(new java.awt.Dimension(416, 315));
        panelLogin.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelLogin.add(lblCierre);
        lblCierre.setBounds(380, 10, 30, 30);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 251, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIO DE SESION");
        panelLogin.add(jLabel2);
        jLabel2.setBounds(0, 50, 420, 45);

        txtUsuario.setBackground(new java.awt.Color(214, 252, 249));
        txtUsuario.setFont(new java.awt.Font("Montserrat", 1, 22)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(101, 175, 245));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseExited(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        panelLogin.add(txtUsuario);
        txtUsuario.setBounds(160, 140, 150, 30);

        Password.setBackground(new java.awt.Color(202, 105, 220));
        Password.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        panelLogin.add(Password);
        Password.setBounds(160, 180, 150, 30);

        lblContraseña.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("CONTRASEÑA");
        panelLogin.add(lblContraseña);
        lblContraseña.setBounds(50, 190, 110, 18);

        lblUsuario.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("USUARIO");
        panelLogin.add(lblUsuario);
        lblUsuario.setBounds(70, 150, 90, 18);

        btnEntrar.setText("ENTRAR");
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        panelLogin.add(btnEntrar);
        btnEntrar.setBounds(280, 240, 75, 23);

        jButton1.setText("REGISTRARSE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelLogin.add(jButton1);
        jButton1.setBounds(60, 240, 100, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método que se ejecuta cuando el usuario hace clic en la etiqueta de cierre.
     * Cierra la aplicación.
     */
    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked
    /**
     * Método que se ejecuta cuando el usuario pasa el mouse sobre la etiqueta de cierre.
     * Cambia el color del texto de la etiqueta a rojo.
     */
    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered
    /**
     * Método que se ejecuta cuando el mouse sale de la etiqueta de cierre.
     * Restablece el color original del texto.
     */
    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMouseEntered

    private void txtUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMouseExited

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed
 /**
     * Método que se ejecuta al hacer clic en el botón "ENTRAR".
     * Verifica si el nombre de usuario y la contraseña ingresados son correctos
     * a través del servicio de usuario.
     */
    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
         String nombreIngresado = txtUsuario.getText();         // Nombre de usuario ingresado
    String contraseñaIngresada = new String(Password.getPassword());  // Contraseña ingresada

    // Crear el objeto Usuario con los datos ingresados
    Usuario usuario1 = new Usuario(nombreIngresado, contraseñaIngresada);

    // Instanciar el servicio de usuarios para manejar la validación
    UsuarioService usuarioService = new UsuarioService();

    try {
        // Verificar si el usuario y contraseña ingresados existen en el archivo de persistencia
        if (usuarioService.iniciarSesion(usuario1)) {
            // Si la validación es correcta, iniciar la siguiente ventana
            FormInicio formInicio = new FormInicio();
            formInicio.setVisible(true);
            dispose();  // Cerrar la ventana actual
        } else {
            Error error=new Error();
            error.setVisible(true);
        }
    } catch (IOException e) {
        // En caso de error al acceder al archivo de usuarios, mostrar mensaje de error
        Error error=new Error();
            error.setVisible(true);

    }
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "REGISTRARSE".
     * Abre la ventana de registro de usuario.
     */
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Registro registro=new Registro();
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
