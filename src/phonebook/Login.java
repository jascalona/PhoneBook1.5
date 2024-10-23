package phonebook;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Conn_db.Conexion;
import Conn_db.LoginGetSet;
import Conn_db.QueryL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author JEscalona
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Interface_I
     */
    public Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/1-ISOTIPO XDV pequeño.png")).getImage());
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pantalla = new javax.swing.JPanel();
        btn_ingresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputUser = new javax.swing.JTextField();
        inputPassword = new javax.swing.JPasswordField();
        Footer = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/table.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 610));

        Pantalla.setBackground(new java.awt.Color(252, 249, 249));

        btn_ingresar.setBackground(new java.awt.Color(255, 204, 204));
        btn_ingresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseExited(evt);
            }
        });
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        btn_ingresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_ingresarKeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xven.png"))); // NOI18N

        inputUser.setBackground(new java.awt.Color(250, 237, 237));
        inputUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inputUser.setForeground(new java.awt.Color(102, 102, 102));
        inputUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        inputUser.setVerifyInputWhenFocusTarget(false);
        inputUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputUserMousePressed(evt);
            }
        });
        inputUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserActionPerformed(evt);
            }
        });

        inputPassword.setBackground(new java.awt.Color(250, 237, 237));
        inputPassword.setForeground(new java.awt.Color(102, 102, 102));
        inputPassword.setToolTipText("");
        inputPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        inputPassword.setCaretColor(new java.awt.Color(102, 102, 102));
        inputPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputPasswordMousePressed(evt);
            }
        });
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });

        Footer.setBackground(new java.awt.Color(204, 204, 204));
        Footer.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Footer.setForeground(new java.awt.Color(102, 102, 102));
        Footer.setText("PhoneBook © Todos los derechos reservados. XDV | Designed by JE  ");

        btn_volver.setBackground(new java.awt.Color(255, 204, 204));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/volver.png"))); // NOI18N
        btn_volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_volverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_volverMousePressed(evt);
            }
        });
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputUser, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(inputPassword)))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PantallaLayout.createSequentialGroup()
                                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(Footer))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // btn Ingresar
        //Reposity_dtUser
        String name = inputUser.getText();
        //Reposity_dtPassword
        String password = new String(inputPassword.getPassword());
        
        QueryL Conn=new QueryL();
        ArrayList<LoginGetSet> re=Conn.login(name,password);
        String datos[]=new String[5];
        for(LoginGetSet lo:re){
            datos[0]=lo.getId();
            datos[1]=lo.getName();
            datos[2]=lo.getSurname();
            datos[3]=lo.getPassword();
            datos[4]=lo.getRoll();
        }
        
        if(re.isEmpty()){
            JOptionPane.showInternalMessageDialog(null,"Acceso Denegado!");
        } else{
            //Inicio de Sesion PanelAdmin
            Interface_II InterII = new Interface_II();
            this.dispose();
            InterII.setVisible(true);
           // Interface_II.NameUser.setText(datos[1]);
        }
        
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void btn_ingresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_ingresarKeyPressed

    }//GEN-LAST:event_btn_ingresarKeyPressed

    private void inputUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUserMousePressed
      
    }//GEN-LAST:event_inputUserMousePressed

    private void inputPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPasswordMousePressed
       
    }//GEN-LAST:event_inputPasswordMousePressed

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_volverMouseClicked

    private void btn_volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseEntered
        // Efecto HOVER
        btn_volver.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_volverMouseEntered

    private void btn_volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseExited
        // Salida de Efecto HOVER:
        btn_volver.setBackground(new Color(255,204,204));
    }//GEN-LAST:event_btn_volverMouseExited

    private void btn_volverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMousePressed
        // TODO add your handling code here:
        btn_volver.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_volverMousePressed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // btn_login
        Interface_I inter_i =new Interface_I();
        inter_i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void inputUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserActionPerformed

    private void btn_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseEntered
        // Efecto HOVER
        btn_ingresar.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_ingresarMouseEntered

    private void btn_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseExited
        // Salida de Efecto HOVER:
        btn_ingresar.setBackground(new Color(255,204,204));    }//GEN-LAST:event_btn_ingresarMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Footer;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
