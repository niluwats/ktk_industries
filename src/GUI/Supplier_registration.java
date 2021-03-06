package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Supplier_registration extends javax.swing.JFrame {

    public Supplier_registration() {
        initComponents();
        generateID();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        fax = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        tp = new javax.swing.JTextField();
        com_name = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        c_mobile = new javax.swing.JTextField();
        btn_Save = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        c_email = new javax.swing.JTextField();
        sup_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Supplier ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 25));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 30));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(66, 73, 73));
        jLabel10.setText("E-mail");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 305, -1, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("Fax");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, -1, 25));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 73, 73));
        jLabel9.setText("Mobile");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 225, -1, 25));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 73, 73));
        jLabel5.setText("Telephone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 225, 80, 25));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("City");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 73, 73));
        jLabel6.setText("Street");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 25));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 73, 73));
        jLabel8.setText("Address  :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 165, -1, 25));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 73, 73));
        jLabel2.setText("Company Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 125, 105, 25));

        email.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 305, 620, 25));

        fax.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        fax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                faxKeyTyped(evt);
            }
        });
        jPanel1.add(fax, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 265, 250, 25));

        mobile.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 225, 250, 25));

        tp.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        tp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tpKeyTyped(evt);
            }
        });
        jPanel1.add(tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 225, 250, 25));

        com_name.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jPanel1.add(com_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 125, 840, 25));

        city.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        city.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityKeyTyped(evt);
            }
        });
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 250, 25));

        street.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jPanel1.add(street, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, 25));

        jSeparator1.setForeground(new java.awt.Color(41, 128, 185));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 990, 10));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("Contact Person");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(66, 73, 73));
        jLabel12.setText("Mobile");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, 25));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(66, 73, 73));
        jLabel13.setText("Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, 25));

        c_name.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        c_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_nameKeyTyped(evt);
            }
        });
        jPanel1.add(c_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 250, 25));

        c_mobile.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        c_mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_mobileKeyTyped(evt);
            }
        });
        jPanel1.add(c_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 250, 25));

        btn_Save.setBackground(new java.awt.Color(41, 128, 185));
        btn_Save.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btn_Save.setForeground(new java.awt.Color(255, 255, 255));
        btn_Save.setText("Save");
        btn_Save.setBorder(null);
        btn_Save.setBorderPainted(false);
        btn_Save.setContentAreaFilled(false);
        btn_Save.setFocusPainted(false);
        btn_Save.setOpaque(true);
        btn_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_SaveMouseReleased(evt);
            }
        });
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 550, 90, 30));

        btn_Cancel.setBackground(new java.awt.Color(179, 182, 183));
        btn_Cancel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.setBorder(null);
        btn_Cancel.setBorderPainted(false);
        btn_Cancel.setContentAreaFilled(false);
        btn_Cancel.setFocusPainted(false);
        btn_Cancel.setOpaque(true);
        btn_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_CancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_CancelMouseReleased(evt);
            }
        });
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 90, 30));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(66, 73, 73));
        jLabel14.setText("Email");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        c_email.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        c_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_emailKeyTyped(evt);
            }
        });
        jPanel1.add(c_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 250, 25));

        sup_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(sup_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 270, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseEntered
        btn_Save.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_SaveMouseEntered

    private void btn_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseExited
        btn_Save.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_SaveMouseExited

    private void btn_SaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMousePressed
        btn_Save.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_SaveMousePressed

    private void btn_SaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseReleased
        btn_Save.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_SaveMouseReleased

    private void btn_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseEntered
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseEntered

    private void btn_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseExited
        btn_Cancel.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_CancelMouseExited

    private void btn_CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMousePressed
        btn_Cancel.setBackground(new Color(98, 101, 103));
    }//GEN-LAST:event_btn_CancelMousePressed

    private void btn_CancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseReleased
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseReleased

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        if (com_name.getText().equals("") | street.getText().equals("") | city.getText().equals("") | tp.getText().equals("") | mobile.getText().equals("") | email.getText().equals("") | fax.getText().equals("") | c_name.getText().equals("") | c_mobile.getText().equals("") | c_email.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all the feilds", "Fields Not Filled", JOptionPane.PLAIN_MESSAGE);

        } else if (email.getForeground() == Color.red) {
            JOptionPane.showMessageDialog(this, "Enter a correct email address", "Wrong Email Address", JOptionPane.PLAIN_MESSAGE);
        } else if (mobile.getText().length() < 10) {
            JOptionPane.showMessageDialog(this, "Enter a correct mobile no", "Incorrect mobile no", JOptionPane.PLAIN_MESSAGE);
        } else if (tp.getText().length() < 10) {
            JOptionPane.showMessageDialog(this, "Enter a correct telephoe no", "Incorrect telephone no", JOptionPane.PLAIN_MESSAGE);
        } else if (fax.getText().length() < 10) {
            JOptionPane.showMessageDialog(this, "Enter a correct fax", "Incorrect fax no", JOptionPane.PLAIN_MESSAGE);
        } else if (c_mobile.getText().length() < 10) {
            JOptionPane.showMessageDialog(this, "Enter a correct contact person mobile no", "Incorrect  contact person mobile no", JOptionPane.PLAIN_MESSAGE);
        } else if (c_email.getForeground() == Color.red) {
            JOptionPane.showMessageDialog(this, "Enter a correct contact person email address", "Wrong contact  Email Address", JOptionPane.PLAIN_MESSAGE);
        } else {

            try {
                int state = 1;
                DB.iud("Insert into supplier(id_supplier,company,street,city,telephoneno,mobile,email,fax,contact_person,contact_person_mobile,contact_person_email,state,created_by,modifiedby) Values ('" + sup_id.getText() + "','" + com_name.getText() + "','" + street.getText() + "','" + city.getText() + "','" + tp.getText() + "','" + mobile.getText() + "','" + email.getText() + "','" + fax.getText() + "','" + c_name.getText() + "','" + c_mobile.getText() + "','" + c_email.getText() + "','" + state + "','Panda','Panda')");
                new Save().setVisible(true);
                clearAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btn_SaveActionPerformed

    private void cityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityKeyTyped
        Validation.setLettersOnly(evt);
    }//GEN-LAST:event_cityKeyTyped

    private void c_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_nameKeyTyped
        Validation.setLettersOnly(evt);
    }//GEN-LAST:event_c_nameKeyTyped

    private void tpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpKeyTyped
        Validation.setDigitsOnly(evt);
        Validation.setLength(evt, tp.getText(), 10);
    }//GEN-LAST:event_tpKeyTyped

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
        Validation.setDigitsOnly(evt);
        Validation.setLength(evt, mobile.getText(), 10);
    }//GEN-LAST:event_mobileKeyTyped

    private void c_mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_mobileKeyTyped
        Validation.setDigitsOnly(evt);
        Validation.setLength(evt, c_mobile.getText(), 10);
    }//GEN-LAST:event_c_mobileKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        Boolean validemail = Validation.isValidemail(email.getText());
        if (validemail) {
            email.setForeground(new Color(39, 55, 70));
        } else {
            email.setForeground(Color.red);
        }
    }//GEN-LAST:event_emailKeyTyped

    private void c_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_emailKeyTyped
        Boolean validemail = Model.Validation.isValidemail(c_email.getText());
        if (validemail) {
            Color c = new Color(39, 55, 70);
            c_email.setForeground(c);
            ;
        } else {
            c_email.setForeground(Color.red);
        }
    }//GEN-LAST:event_c_emailKeyTyped

    private void faxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faxKeyTyped
        Validation.setLength(evt, fax.getText(), 10);
    }//GEN-LAST:event_faxKeyTyped

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
            java.util.logging.Logger.getLogger(Supplier_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Save;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_mobile;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField city;
    private javax.swing.JTextField com_name;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField street;
    private javax.swing.JLabel sup_id;
    private javax.swing.JTextField tp;
    // End of variables declaration//GEN-END:variables
     
    private void generateID() {
        try {
            ResultSet rs = DB.search("SELECT COUNT(id_supplier) AS id FROM supplier");
            if (rs.next()) {
                int rowcount = rs.getInt("id");
                rowcount++;
                sup_id.setText("SP" + String.format("%0" + 4 + "d", rowcount));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     private void clearAll(){
         com_name.setText(null);
         street.setText(null);
         city.setText(null);
         tp.setText(null);
         mobile.setText(null);
         fax.setText(null);
         email.setText(null);
         c_name.setText(null);
         c_mobile.setText(null);
         c_email.setText(null);
     }
     
     
}
