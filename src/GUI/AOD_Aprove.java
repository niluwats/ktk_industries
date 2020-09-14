/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DB;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pasindu
 */
public class AOD_Aprove extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    /**
     * Creates new form AOD_Aprove
     */
    public AOD_Aprove() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        aodNo = new javax.swing.JLabel();
        unit = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        approve = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        itemPrice = new javax.swing.JLabel();
        availa = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        pending = new javax.swing.JButton();
        approved = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1340, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close_black.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close_red_.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 34, 32));

        jLabel2.setBackground(new java.awt.Color(250, 251, 250));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 128, 185));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1306, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Advice Of Dispatch");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 29, 930, 30));

        aodNo.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        aodNo.setForeground(new java.awt.Color(66, 73, 73));
        jPanel1.add(aodNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 210, 25));

        unit.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        unit.setForeground(new java.awt.Color(66, 73, 73));
        jPanel1.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 90, 25));

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
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 90, 30));

        approve.setBackground(new java.awt.Color(41, 128, 185));
        approve.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        approve.setForeground(new java.awt.Color(255, 255, 255));
        approve.setText("Approve");
        approve.setBorder(null);
        approve.setBorderPainted(false);
        approve.setContentAreaFilled(false);
        approve.setFocusPainted(false);
        approve.setOpaque(true);
        approve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                approveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                approveMouseReleased(evt);
            }
        });
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });
        jPanel1.add(approve, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, 130, 30));

        date.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        date.setForeground(new java.awt.Color(66, 73, 73));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 220, 25));

        productName.setBackground(new java.awt.Color(255, 0, 0));
        productName.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        productName.setForeground(new java.awt.Color(66, 73, 73));
        jPanel1.add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 420, 25));

        itemPrice.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        itemPrice.setForeground(new java.awt.Color(66, 73, 73));
        jPanel1.add(itemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 120, 25));

        availa.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        availa.setForeground(new java.awt.Color(66, 73, 73));
        jPanel1.add(availa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 240, 25));

        table.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "AOD No", "Supplier", "Seles Rep", "Date", "Payment Type", "Net Total", "Discount", "Approvel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setRowHeight(25);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(1).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setPreferredWidth(150);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setPreferredWidth(100);
            table.getColumnModel().getColumn(5).setPreferredWidth(100);
            table.getColumnModel().getColumn(6).setPreferredWidth(150);
            table.getColumnModel().getColumn(7).setPreferredWidth(80);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 950, 320));

        pending.setBackground(new java.awt.Color(41, 128, 185));
        pending.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pending.setForeground(new java.awt.Color(255, 255, 255));
        pending.setText("Pending AOD");
        pending.setBorder(null);
        pending.setBorderPainted(false);
        pending.setContentAreaFilled(false);
        pending.setFocusPainted(false);
        pending.setOpaque(true);
        pending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pendingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pendingMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pendingMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pendingMouseReleased(evt);
            }
        });
        pending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingActionPerformed(evt);
            }
        });
        jPanel1.add(pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 130, 30));

        approved.setBackground(new java.awt.Color(41, 128, 185));
        approved.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        approved.setForeground(new java.awt.Color(255, 255, 255));
        approved.setText("Approved AOD");
        approved.setBorder(null);
        approved.setBorderPainted(false);
        approved.setContentAreaFilled(false);
        approved.setFocusPainted(false);
        approved.setOpaque(true);
        approved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approvedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approvedMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                approvedMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                approvedMouseReleased(evt);
            }
        });
        approved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedActionPerformed(evt);
            }
        });
        jPanel1.add(approved, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

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

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        System.out.println("65413");

    }//GEN-LAST:event_btn_CancelActionPerformed

    private void approveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseEntered
        approve.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_approveMouseEntered

    private void approveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseExited
        approve.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_approveMouseExited

    private void approveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMousePressed
        approve.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_approveMousePressed

    private void approveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseReleased
        approve.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_approveMouseReleased

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        try {
//            
            DefaultTableModel df = (DefaultTableModel) table.getModel();
            for (int i = 0; i < df.getRowCount(); i++) {
                String a = table.getValueAt(i, 1).toString();
                String s = table.getValueAt(i, 8).toString();
                if (Boolean.parseBoolean(s.toString()) == true) {
                    DB.iud("update invoice_aod set state = ' " + 2 + "' where id_invoice= '" + a + "' ");
                    //System.out.println("Innn");
                }
            }
            // System.out.println("Outt");
            ResultSet rs = DB.search("select * from invoice_aod where state='" + 1 + "'");
            df.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getRow());
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(false);
                df.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_approveActionPerformed

    private void pendingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pendingMouseEntered

    private void pendingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pendingMouseExited

    private void pendingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pendingMousePressed

    private void pendingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pendingMouseReleased

    private void pendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingActionPerformed
        try {
            ResultSet rs = DB.search("select * from invoice_aod where state='" + 1 + "'");
            DefaultTableModel df = (DefaultTableModel) table.getModel();
            df.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getRow());
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(false);
                table.setEnabled(true);
                df.addRow(v);
                approve.setEnabled(true);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_pendingActionPerformed

    private void approvedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_approvedMouseEntered

    private void approvedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_approvedMouseExited

    private void approvedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_approvedMousePressed

    private void approvedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_approvedMouseReleased

    private void approvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedActionPerformed
        try {
            ResultSet rs = DB.search("select * from invoice_aod where state='" + 2 + "'");
            DefaultTableModel df = (DefaultTableModel) table.getModel();
            df.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getRow());
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(true);
                table.setEnabled(false);
                df.addRow(v);
                approve.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_approvedActionPerformed

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
            java.util.logging.Logger.getLogger(AOD_Aprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AOD_Aprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AOD_Aprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AOD_Aprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AOD_Aprove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aodNo;
    private javax.swing.JButton approve;
    private javax.swing.JButton approved;
    private javax.swing.JLabel availa;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JLabel date;
    private javax.swing.JLabel itemPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton pending;
    public javax.swing.JLabel productName;
    private javax.swing.JTable table;
    public javax.swing.JLabel unit;
    // End of variables declaration//GEN-END:variables
}
