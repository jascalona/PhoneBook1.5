package phonebook;

//conections
import Conn_db.Conexion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;



/**
 *
 * @author JEscalona
 */
public class Interface_II extends javax.swing.JFrame {

    //Creation Instancia
    Conexion cn = new Conexion();
    Connection  Conn;
    
    //VAR
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    
    public Interface_II() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/1-ISOTIPO XDV pequeño.png")).getImage());
        setLocationRelativeTo(null);
        query();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Pantalla = new javax.swing.JPanel();
        jBuscar = new javax.swing.JTextField();
        btn_log_out = new javax.swing.JButton();
        btn_drop = new javax.swing.JButton();
        btn_agg = new javax.swing.JButton();
        btn_cog = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Footer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pantalla.setBackground(new java.awt.Color(252, 249, 249));

        jBuscar.setBackground(new java.awt.Color(250, 237, 237));
        jBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBuscarKeyReleased(evt);
            }
        });

        btn_log_out.setBackground(new java.awt.Color(255, 204, 204));
        btn_log_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-out.png"))); // NOI18N
        btn_log_out.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_log_outMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_log_outMouseExited(evt);
            }
        });
        btn_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_log_outActionPerformed(evt);
            }
        });

        btn_drop.setBackground(new java.awt.Color(255, 204, 204));
        btn_drop.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_drop.setForeground(new java.awt.Color(204, 204, 204));
        btn_drop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btn_drop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_drop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dropMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dropMouseExited(evt);
            }
        });
        btn_drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dropActionPerformed(evt);
            }
        });

        btn_agg.setBackground(new java.awt.Color(255, 204, 204));
        btn_agg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_agg.setForeground(new java.awt.Color(204, 204, 204));
        btn_agg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Agguser.png"))); // NOI18N
        btn_agg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_agg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_aggMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_aggMouseExited(evt);
            }
        });
        btn_agg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aggActionPerformed(evt);
            }
        });

        btn_cog.setBackground(new java.awt.Color(255, 204, 204));
        btn_cog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cog.png"))); // NOI18N
        btn_cog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cogMouseExited(evt);
            }
        });
        btn_cog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cogActionPerformed(evt);
            }
        });

        Title.setBackground(new java.awt.Color(204, 204, 204));
        Title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(102, 102, 102));
        Title.setText("Administrator Views");

        Footer.setBackground(new java.awt.Color(204, 204, 204));
        Footer.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Footer.setForeground(new java.awt.Color(102, 102, 102));
        Footer.setText("PhoneBook © Todos los derechos reservados. XDV | Designed by JE  ");

        Tabla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        btn_edit.setBackground(new java.awt.Color(255, 204, 204));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btn_edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editMouseExited(evt);
            }
        });
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addComponent(btn_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cog, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Footer)
                                .addGroup(PantallaLayout.createSequentialGroup()
                                    .addGap(285, 285, 285)
                                    .addComponent(btn_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_agg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addComponent(btn_agg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cog, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 360, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/table.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 610));

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

    private void btn_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_log_outActionPerformed
        // btn_volver
        Login Lg =new Login();
        Lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_log_outActionPerformed

    private void btn_dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dropActionPerformed
        // btn_drop
        dropDt();
    }//GEN-LAST:event_btn_dropActionPerformed

    private void btn_aggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aggActionPerformed
        // btn_agg
        Uloap_register UpR =new Uloap_register();
        UpR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_aggActionPerformed

    private void btn_cogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cogActionPerformed
        // btn_setting_su
        Interface_III InterIII =new Interface_III();
        InterIII.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_cogActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            query();
        }
    }//GEN-LAST:event_jBuscarKeyPressed

    private void jBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyReleased
        // Busqueda en tiempo real
        if(jBuscar.getText().trim().equals(""));{
            query();
        }
    }//GEN-LAST:event_jBuscarKeyReleased

    private void btn_aggMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aggMouseEntered
        // Efecto Header
        btn_agg.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_aggMouseEntered

    private void btn_aggMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aggMouseExited
        // Salida de Hover
        btn_agg.setBackground(new Color (255,204,204));
    }//GEN-LAST:event_btn_aggMouseExited

    private void btn_dropMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dropMouseEntered
        // Efecto Hover
        btn_drop.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_dropMouseEntered

    private void btn_dropMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dropMouseExited
        // Salida de Hover
        btn_drop.setBackground(new Color(255,204,204));
    }//GEN-LAST:event_btn_dropMouseExited

    private void btn_log_outMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_log_outMouseEntered
        // Efecto Hover
        btn_log_out.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_log_outMouseEntered

    private void btn_log_outMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_log_outMouseExited
        // Salida de Hover
        btn_log_out.setBackground(new Color(255,204,204,204));
    }//GEN-LAST:event_btn_log_outMouseExited

    private void btn_cogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cogMouseEntered
        // Efecto Hover
        btn_cog.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_cogMouseEntered

    private void btn_cogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cogMouseExited
        // Salida de Hover
        btn_cog.setBackground(new Color(255,204,204));
    }//GEN-LAST:event_btn_cogMouseExited

    private void btn_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseEntered
        // Efecto Hover
        btn_edit.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_editMouseEntered

    private void btn_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseExited
        // Salida de Hover
        btn_edit.setBackground(new Color(255,204,204,204));
    }//GEN-LAST:event_btn_editMouseExited

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // btn Edit
        modificar();
    }//GEN-LAST:event_btn_editActionPerformed

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
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_II().setVisible(true);
            }
        });
    }
    
    //Metodo Query
   private void query (){
       String busqueda = jBuscar.getText();
       
       DefaultTableModel modelo = new DefaultTableModel(){
           @Override
           public boolean isCellEditable(int row, int column) {
               if (column==0) {
                   return true;
               } else {
                    return false;
               }
           }
       };
       
       
       modelo.addColumn("ID");
       modelo.addColumn("Nombre");
       modelo.addColumn("Apellido");
       modelo.addColumn("GEO");
       modelo.addColumn("Phone");
       modelo.addColumn("Extension");
       
       Tabla.setModel(modelo);
       
       Tabla.getColumnModel().getColumn(0).setPreferredWidth(35);
       Tabla.getColumnModel().getColumn(1);
       Tabla.getColumnModel().getColumn(2);
       Tabla.getColumnModel().getColumn(3);
       Tabla.getColumnModel().getColumn(4);
       Tabla.getColumnModel().getColumn(5);
       
       String sql = "SELECT *FROM p_list_phone WHERE NAME LIKE '%"+busqueda+"%' OR SURNAME LIKE '%"+busqueda+"%' OR GEO LIKE '%"+busqueda+"%' OR PHONE LIKE '%"+busqueda+"%' OR EXTENSION LIKE '%"+busqueda+"%' ";
       
       String datos [] = new String[6];
       
       try {
            Conn = cn.conectar();
            st = Conn.createStatement();
            rs = st.executeQuery(sql);
           
           while (rs.next()){
               datos [0] = rs.getString("id");
               datos [1] = rs.getString("name");
               datos [2] = rs.getString("surname");
               datos [3] = rs.getString("GEO");
               datos [4] = rs.getString("phone");
               datos [5] = rs.getString("extension");
               
               modelo.addRow(datos);
           }
           
           Tabla.setModel(modelo);
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       } /*finally {
           cn.desconectar();
       }*/
       
   }
   
   //Edit
   public void modificar(){
       int rowE =Tabla.getSelectedRow();
        if (rowE>=0) {
           EditRE ERE =new EditRE();
           ERE.setVisible(true);
           this.setVisible(false);
           
           //Import datos EditRE
           ERE.SetModificationid(Tabla.getValueAt(rowE,0).toString());
           ERE.setModification1(Tabla.getValueAt(rowE,1).toString());
           ERE.setModification2(Tabla.getValueAt(rowE,2).toString());
           ERE.setModification3((Tabla.getValueAt(rowE,3).toString()));
           ERE.setModification4((Tabla.getValueAt(rowE,4).toString()));  
           ERE.setModification5((Tabla.getValueAt(rowE,5).toString()));           

           
           
       } else {
                JOptionPane.showMessageDialog(null, "Seleccione almenos un Registro");
        }
   }
   
   //Metodo DropR
    public void dropDt(){
        
        try{
            int fila = Tabla.getSelectedRow();
            
            String sql = " delete from p_list_phone where  id =" +Tabla.getValueAt(fila,0);
            
            Statement st= Conn.createStatement();
            
            int n=st.executeUpdate(sql);
            
            if (n>=0){
                JOptionPane.showMessageDialog(null, "Un Usuario ha sido Eliminado!");
                Interface_II interII = new Interface_II();
                interII.setVisible(true);
                this.setVisible(false);
            } 
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error, debe selecionar almenos un registro!" +e.getMessage());

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Footer;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btn_agg;
    private javax.swing.JButton btn_cog;
    private javax.swing.JButton btn_drop;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_log_out;
    private javax.swing.JTextField jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
