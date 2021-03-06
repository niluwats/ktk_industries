package GUI;

import Database.DB;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Raw_Materials extends javax.swing.JFrame {

    Main_menu menu;

    public Raw_Materials() {
        initComponents();
        tableSettings();
        loadData();
    }

    public Raw_Materials(Main_menu mMenu) {
        this();
        this.menu = mMenu;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_Export = new javax.swing.JButton();
        btn_newProduct = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Item Code", "Raw Material", "Unit", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(30);
        table.setRowMargin(2);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setPreferredWidth(200);
            table.getColumnModel().getColumn(2).setPreferredWidth(300);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setPreferredWidth(337);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 111, 1030, 480));

        btn_Export.setBackground(new java.awt.Color(179, 182, 183));
        btn_Export.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Export.setText("Print");
        btn_Export.setBorder(null);
        btn_Export.setBorderPainted(false);
        btn_Export.setContentAreaFilled(false);
        btn_Export.setFocusPainted(false);
        btn_Export.setOpaque(true);
        btn_Export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ExportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ExportMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ExportMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_ExportMouseReleased(evt);
            }
        });
        btn_Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExportActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Export, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 120, 35));

        btn_newProduct.setBackground(new java.awt.Color(41, 128, 185));
        btn_newProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_newProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_newProduct.setText("Add New Item");
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
        jPanel1.add(btn_newProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 120, 35));

        jTextField1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(39, 55, 70));
        jTextField1.setText("  Search");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 320, 35));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 73, 73));
        jLabel2.setText("Raw Material Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMouseEntered
        btn_Export.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_ExportMouseEntered

    private void btn_ExportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMouseExited
        btn_Export.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_ExportMouseExited

    private void btn_ExportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMousePressed
        btn_Export.setBackground(new Color(98, 101, 103));
    }//GEN-LAST:event_btn_ExportMousePressed

    private void btn_ExportMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMouseReleased
        btn_Export.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_ExportMouseReleased

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

    private void btn_newProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newProductActionPerformed
        Add_RawMaterials rm = new Add_RawMaterials();
        rm.setVisible(true);
    }//GEN-LAST:event_btn_newProductActionPerformed

    private void btn_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExportActionPerformed

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            String path = "iReport\\raw_materials.jrxml";

            Map<String, Object> m = new HashMap();
            

            JasperReport cp = JasperCompileManager.compileReport(path);
            JasperPrint fr = JasperFillManager.fillReport(cp, m, DB.getConnection());
            JasperViewer.viewReport(fr, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        setCursor(null);

    }//GEN-LAST:event_btn_ExportActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jTextField1.setText(null);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty()) {
            jTextField1.setText(" Search");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        try {
            ResultSet rs = DB.search("SELECT idraw_matrials,name,unit,description FROM raw_matrials WHERE name like '"+jTextField1.getText()+"%' and state='1' ");
            int rowNo = 1;
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rowNo++);
                v.add(rs.getString("idraw_matrials"));
                v.add(" " + rs.getString("name"));
                v.add(rs.getString("unit"));
                v.add(rs.getString("description"));

                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Raw_Materials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Raw_Materials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Raw_Materials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Raw_Materials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Raw_Materials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Export;
    private javax.swing.JButton btn_newProduct;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void tableSettings() {
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 14));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer right = new DefaultTableCellRenderer();
        right.setHorizontalAlignment(JLabel.RIGHT);

        table.getColumnModel().getColumn(0).setCellRenderer(center);
        table.getColumnModel().getColumn(1).setCellRenderer(center);
        table.getColumnModel().getColumn(3).setCellRenderer(center);

    }

    private void loadData() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        try {
            ResultSet rs = DB.search("SELECT idraw_matrials,name,unit,description FROM raw_matrials WHERE state='1' ");
            int rowNo = 1;
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rowNo++);
                v.add(rs.getString("idraw_matrials"));
                v.add(" " + rs.getString("name"));
                v.add(rs.getString("unit"));
                v.add(rs.getString("description"));

                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
