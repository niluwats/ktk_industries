/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DB;
import Model.Save;
import Resources.HashingEncription;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pemitha Randiya
 */
public class Password_change extends javax.swing.JFrame {

    /**
     * Creates new form Password_changd
     */
    public Password_change() {
        initComponents();
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        un.setText(Login.s);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        pw1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setText("Change Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel6.setText("Account Settings");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, 25));

        un.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        un.setBorder(null);
        un.setEnabled(false);
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 300, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setText("New Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 25));

        pw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwFocusLost(evt);
            }
        });
        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwKeyReleased(evt);
            }
        });
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 300, 25));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 25));

        pw1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pw1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pw1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pw1FocusLost(evt);
            }
        });
        pw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pw1ActionPerformed(evt);
            }
        });
        pw1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pw1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pw1KeyReleased(evt);
            }
        });
        jPanel1.add(pw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 300, 25));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Change ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 170, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close_black.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close_red_.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 34, 32));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 30, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pwFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwFocusGained

    }//GEN-LAST:event_pwFocusGained

    private void pwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwFocusLost

    }//GEN-LAST:event_pwFocusLost

    private void pw1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pw1FocusGained

    }//GEN-LAST:event_pw1FocusGained

    private void pw1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pw1FocusLost

    }//GEN-LAST:event_pw1FocusLost

    private void pw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pw1ActionPerformed

    private void pw1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pw1KeyPressed

    }//GEN-LAST:event_pw1KeyPressed

    private void pw1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pw1KeyReleased
      if (!pw.getText().toString().equals(pw1.getText().toString())) {

            jLabel17.setVisible(true);
        } else {
            jLabel17.setVisible(false);
        }      
    }//GEN-LAST:event_pw1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(pw.getText().isEmpty() | pw1.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Please fill all the fields", "Feilds not filled", JOptionPane.INFORMATION_MESSAGE);
    }else if (jLabel18.isVisible()) {
            JOptionPane.showMessageDialog(this, "Please type atleast 8 characters", "Password Not Strength", JOptionPane.INFORMATION_MESSAGE);
        } else if (jLabel17.isVisible() | pw1.getText().length() < 8) {
            jLabel17.setVisible(true);
            JOptionPane.showMessageDialog(this, "Please type the same password again", "Password Not match", JOptionPane.INFORMATION_MESSAGE);
        }else{
        try {
            DB.iud("Update  user set password='"+HashingEncription.getEncription(pw.getText())+"' where username='"+un.getText()+"'");
             new Save().setVisible(true);
             pw.setText("");
             pw1.setText("");
            email_send1.l.setVisible(true);
             dispose();
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        
        
        }
    
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //menu.setEnabled(true);
        this.dispose();
        email_send1.l.setVisible(true);
               

    }//GEN-LAST:event_jButton2ActionPerformed

    private void pwKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyReleased
         if (pw.getText().toString().length() < 8) {
            jLabel18.setVisible(true);
        } else {
            jLabel18.setVisible(false);
        }
    }//GEN-LAST:event_pwKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Password_change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password_change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password_change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password_change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password_change().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pw;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables

 
}
