package GUI;

import Database.DB;
import static GUI.Receipt.jLabel1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AOD_PedingList extends javax.swing.JFrame {

    public AOD_PedingList() {
        initComponents();
        tableSettings();
        Onload();
    }
Main_menu menu;

    public AOD_PedingList(Main_menu aThis) {
        this();
        menu = aThis;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_newProduct = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jTable1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "AOD No", "AOD Date", "Customer", "Value", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setOpaque(false);
        jTable1.setRowHeight(25);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(188);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 111, 1030, 480));

        btn_newProduct.setBackground(new java.awt.Color(41, 128, 185));
        btn_newProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_newProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_newProduct.setText("New AOD");
        btn_newProduct.setBorder(null);
        btn_newProduct.setBorderPainted(false);
        btn_newProduct.setContentAreaFilled(false);
        btn_newProduct.setFocusPainted(false);
        btn_newProduct.setOpaque(true);
        btn_newProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_newProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_newProductMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_newProductMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_newProductMouseReleased(evt);
            }
        });
        btn_newProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newProductActionPerformed(evt);
            }
        });
        jPanel1.add(btn_newProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 120, 30));

        btn_sub.setBackground(new java.awt.Color(41, 128, 185));
        btn_sub.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_sub.setForeground(new java.awt.Color(255, 255, 255));
        btn_sub.setText("Pending AOD's");
        btn_sub.setBorder(null);
        btn_sub.setBorderPainted(false);
        btn_sub.setContentAreaFilled(false);
        btn_sub.setFocusPainted(false);
        btn_sub.setOpaque(true);
        btn_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_subMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_subMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_subMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_subMouseReleased(evt);
            }
        });
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 120, 30));

        jTextField1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(39, 55, 70));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, 350, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_newProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newProductMouseEntered
        btn_newProduct.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_newProductMouseEntered

    private void btn_newProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newProductMouseExited
        btn_newProduct.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_newProductMouseExited

    private void btn_newProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newProductMousePressed
        btn_newProduct.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_newProductMousePressed

    private void btn_newProductMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newProductMouseReleased
        btn_newProduct.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_newProductMouseReleased

    private void btn_subMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_subMouseEntered
        btn_sub.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_subMouseEntered

    private void btn_subMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_subMouseExited
        btn_sub.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_subMouseExited

    private void btn_subMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_subMousePressed
        btn_sub.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_subMousePressed

    private void btn_subMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_subMouseReleased
        btn_sub.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_subMouseReleased

    private void btn_newProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newProductActionPerformed
        AOD a = new AOD();
        a.setVisible(true);
    }//GEN-LAST:event_btn_newProductActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
   
        AOD_Aprove ad = new AOD_Aprove();
        ad.setVisible(true);
//        menu.jPanel3.removeAll();
//        menu.jPanel3.revalidate();
//        menu.jPanel3.repaint();
//        menu.jPanel3.add((JPanel) ad.jPanel1);
        
    }//GEN-LAST:event_btn_subActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        String name = jTextField1.getText();
        if (jTextField1 != null && !jTextField1.getText().equals("")) {
            try {
                if (jTextField1.getText().isEmpty()) {
                    dtm.setRowCount(0);
                } else {
                    ResultSet rs = DB.search("SELECT * FROM `invoice_aod` INNER JOIN `customer` ON invoice_aod.`id_customer` = customer.`id_customer` where customer.fname LIKE '" + jTextField1.getText() + "%' OR invoice_aod.id_invoice LIKE '" + jTextField1.getText() + "%'");

                    if (rs.next()) {
                        dtm.setRowCount(0);
                        while (rs.next()) {
                            Vector v = new Vector();
                            v.add(rs.getString("id_invoice"));
                            v.add(rs.getString("date"));
                            v.add(rs.getString("fname"));
                            v.add(rs.getString("net_total"));
                            if (rootPaneCheckingEnabled) {
                                
                            } else {
                            }
                            v.add(rs.getString("state"));

                            dtm.addRow(v);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        jTextField1.setText(null);
        dtm.setRowCount(0);
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(AOD_PedingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AOD_PedingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AOD_PedingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AOD_PedingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AOD_PedingList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_newProduct;
    private javax.swing.JButton btn_sub;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void tableSettings() {
        JTableHeader tableHeader = jTable1.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 14));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer right = new DefaultTableCellRenderer();
        right.setHorizontalAlignment(JLabel.CENTER);

        jTable1.getColumnModel().getColumn(2).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(right);
    }

    private void Onload() {
        try {
            ResultSet rs = DB.search("select * from invoice_aod ia INNER JOIN customer c ON ia.id_customer = c.id_customer order by date desc");
            
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);
            
            while (rs.next()) {
                Vector v = new Vector();
                
                 
                
                 v.add(rs.getRow());
                v.add(rs.getString("id_invoice"));
                v.add(rs.getString("date"));
                v.add(rs.getString("fname"));
                v.add(rs.getString("net_total"));
                //v.add(rs.getString("state"));
                
                if (rs.getString("state").equals("1")) {
                    v.add("Not-Approved");
                } else {
                    v.add("Approved");
                }
                df.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
