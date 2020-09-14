package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Add_RawMaterials extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    String rawCategoryID;

    public Add_RawMaterials() {
        initComponents();
        generateID();
        loadDate();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        raw_Item = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        unit = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        item_Code = new javax.swing.JLabel();
        warning_msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Raw Materials");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 73, 73));
        jLabel2.setText("Item Code");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, 25));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("Unit");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, 25));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 73, 73));
        jLabel5.setText("Discription");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 25));

        raw_Item.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        raw_Item.setForeground(new java.awt.Color(39, 55, 70));
        raw_Item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                raw_ItemKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                raw_ItemKeyTyped(evt);
            }
        });
        jPanel1.add(raw_Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 490, 25));

        description.setColumns(20);
        description.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        description.setForeground(new java.awt.Color(39, 55, 70));
        description.setRows(5);
        description.setPreferredSize(new java.awt.Dimension(310, 100));
        description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descriptionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 320, 130));

        unit.setEditable(true);
        unit.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        unit.setForeground(new java.awt.Color(39, 55, 70));
        unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -", "NOS", "Milimeter", "Centimeter", "Inch", "Foot", "Meter", "Kilometer", "Milligram", "Gram", "Kilogram", "Metric Ton", "Milliliter", "Liter" }));
        unit.setFocusable(false);
        jPanel1.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 220, 25));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 73, 73));
        jLabel6.setText("Item Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, 25));

        category.setEditable(true);
        category.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        category.setForeground(new java.awt.Color(39, 55, 70));
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -" }));
        category.setFocusable(false);
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        jPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 220, 25));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Category");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 80, 25));

        btn_Cancel.setBackground(new java.awt.Color(179, 182, 183));
        btn_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 90, 30));

        btn_Add.setBackground(new java.awt.Color(41, 128, 185));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Add");
        btn_Add.setBorder(null);
        btn_Add.setBorderPainted(false);
        btn_Add.setContentAreaFilled(false);
        btn_Add.setFocusPainted(false);
        btn_Add.setOpaque(true);
        btn_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_AddMouseReleased(evt);
            }
        });
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 90, 30));

        jLabel8.setBackground(new java.awt.Color(250, 251, 250));
        jLabel8.setOpaque(true);
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 663, 30));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 1, 34, 32));

        item_Code.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jPanel1.add(item_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 180, 25));

        warning_msg.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        warning_msg.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(warning_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 260, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseEntered
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseEntered

    private void btn_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseExited
        btn_Add.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_AddMouseExited

    private void btn_AddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMousePressed
        btn_Add.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_AddMousePressed

    private void btn_AddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseReleased
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseReleased

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel8MouseDragged

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel8MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed

        try {
            ResultSet rs = DB.search("SELECT id FROM raw_category WHERE category='" + category.getSelectedItem().toString().trim() + "' ");
            if (rs.next()) {
                rawCategoryID = rs.getString("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_categoryActionPerformed

    private void raw_ItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_raw_ItemKeyReleased
        if (rawCategoryID != null) {
            try {
                ResultSet rs = DB.search("SELECT name FROM raw_matrials WHERE category='" + rawCategoryID + "' AND name='" + raw_Item.getText() + "' ");
                if (rs.next()) {
                    warning_msg.setText("This item category already available");
                } else {
                    warning_msg.setText(null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_raw_ItemKeyReleased

    private void raw_ItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_raw_ItemKeyTyped
        Validation.setLength(evt, raw_Item.getText(), 75);
    }//GEN-LAST:event_raw_ItemKeyTyped

    private void descriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionKeyTyped
        Validation.setLength(evt, raw_Item.getText(), 350);
    }//GEN-LAST:event_descriptionKeyTyped

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        if (raw_Item.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plaese enter Details before save", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if (warning_msg.getText() == null) {
                if (unit.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Plaese enter Unit before save", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        DB.iud("INSERT INTO raw_matrials VALUES('" + item_Code.getText() + "','" + rawCategoryID + "','" + raw_Item.getText() + "','" + unit.getSelectedItem().toString() + "','" + description.getText() + "','1') ");
                        new Save().setVisible(true);
                        clear();
                        generateID();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "Plaese check details before save", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_AddActionPerformed

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
            java.util.logging.Logger.getLogger(Add_RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_RawMaterials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel item_Code;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField raw_Item;
    private javax.swing.JComboBox<String> unit;
    private javax.swing.JLabel warning_msg;
    // End of variables declaration//GEN-END:variables

    private void generateID() {
        try {
            ResultSet rs = DB.search("SELECT COUNT(idraw_matrials) AS id FROM raw_matrials");
            if (rs.next()) {
                int rowcount = rs.getInt("id");
                rowcount++;
                item_Code.setText("RMI" + String.format("%0" + 4 + "d", rowcount)); //Raw Material Item
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadDate() {
        try {
            ResultSet rs = DB.search(" SELECT category FROM raw_category WHERE state='1' ");
            while (rs.next()) {
                category.addItem(" " + rs.getString("category"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        category.setSelectedIndex(0);
        raw_Item.setText(null);
        unit.setSelectedIndex(0);
        warning_msg.setText(null);
        description.setText(null);
    }

}