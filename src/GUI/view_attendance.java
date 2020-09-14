package GUI;

import Database.DB;
import Model.Save;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class view_attendance extends javax.swing.JFrame {

    public view_attendance() {
        initComponents();
        tableSettings();
        loadtoYearcmb();
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Edit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        cmb_month = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmb_year = new javax.swing.JComboBox<>();
        emp_name = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Attendance");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("Department Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, 25));

        jTable1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "In time", "Out time", "Shift", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(2);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(2);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 1010, 340));

        btn_Edit.setBackground(new java.awt.Color(179, 182, 183));
        btn_Edit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Edit.setText("Clear");
        btn_Edit.setBorder(null);
        btn_Edit.setBorderPainted(false);
        btn_Edit.setContentAreaFilled(false);
        btn_Edit.setFocusPainted(false);
        btn_Edit.setOpaque(true);
        btn_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_EditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_EditMouseReleased(evt);
            }
        });
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 90, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Year");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 50, 25));

        department.setEditable(true);
        department.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -", "Human Resource", "Production", "Sales & Marketing", "Purchasing", "Finance" }));
        department.setFocusable(false);
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });
        jPanel1.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 220, 30));

        cmb_month.setEditable(true);
        cmb_month.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cmb_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cmb_month.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_month.setFocusable(false);
        cmb_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_monthActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 120, 25));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 73, 73));
        jLabel8.setText("Month");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 50, 25));

        cmb_year.setEditable(true);
        cmb_year.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cmb_year.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_year.setFocusable(false);
        cmb_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_yearActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 90, 25));

        emp_name.setEditable(true);
        emp_name.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        emp_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        emp_name.setFocusable(false);
        emp_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emp_nameFocusLost(evt);
            }
        });
        emp_name.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                emp_namePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                emp_namePopupMenuWillBecomeVisible(evt);
            }
        });
        emp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_nameActionPerformed(evt);
            }
        });
        jPanel1.add(emp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 220, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 73, 73));
        jLabel5.setText("Employee");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        String first_name;
        String sec_name;
        String emp_id;
        try {
            emp_name.removeAllItems();
            emp_name.addItem("~Select~");
            ResultSet rs = DB.search("SELECT id_employee,fname,mname FROM employee WHERE department='" + department.getSelectedItem().toString() + "'");

            while (rs.next()) {
                first_name = rs.getString("fname");
                sec_name = rs.getString("mname");
                emp_id = rs.getString("id_employee");

                emp_name.addItem(emp_id + " - " + first_name + " " + sec_name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_departmentActionPerformed

    private void btn_EditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditMouseReleased
        btn_Edit.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_EditMouseReleased

    private void btn_EditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditMousePressed
        btn_Edit.setBackground(new Color(98, 101, 103));
    }//GEN-LAST:event_btn_EditMousePressed

    private void btn_EditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditMouseExited
        btn_Edit.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_EditMouseExited

    private void btn_EditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditMouseEntered
        btn_Edit.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_EditMouseEntered

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        department.setSelectedIndex(0);
    }//GEN-LAST:event_btn_EditActionPerformed

    private void cmb_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_monthActionPerformed

    }//GEN-LAST:event_cmb_monthActionPerformed

    private void cmb_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_yearActionPerformed

    }//GEN-LAST:event_cmb_yearActionPerformed

    private void emp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_nameActionPerformed

    }//GEN-LAST:event_emp_nameActionPerformed

    private void emp_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emp_nameFocusLost

    }//GEN-LAST:event_emp_nameFocusLost

    private void emp_namePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_emp_namePopupMenuWillBecomeInvisible
        String empid = emp_name.getSelectedItem().toString().split(" - ")[0].trim();
        System.out.println(empid);
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {
            System.out.println((cmb_month.getSelectedIndex()));
            System.out.println(cmb_year.getSelectedItem().toString().trim());
            System.out.println(empid);
            ResultSet rs = DB.search("select * from attendance where month(date)='"+cmb_month.getSelectedIndex()+"' and year(date)='"+cmb_year.getSelectedItem().toString().trim()+"' and id_employee='"+empid+"'");
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("date"));
                v.add(rs.getString("inTime"));
                v.add(rs.getString("outTime"));
                v.add(rs.getString("shift"));
                v.add(rs.getString("status"));
                dtm.addRow(v);
            }
            
            tableSettings();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_emp_namePopupMenuWillBecomeInvisible

    private void emp_namePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_emp_namePopupMenuWillBecomeVisible
        if (emp_name.getItemAt(0).toString().equals("~Select~")) {
            emp_name.removeItemAt(0);
        }
    }//GEN-LAST:event_emp_namePopupMenuWillBecomeVisible

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
            java.util.logging.Logger.getLogger(view_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Edit;
    private javax.swing.JComboBox<String> cmb_month;
    private javax.swing.JComboBox<String> cmb_year;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JComboBox<String> emp_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void tableSettings() {
        JTableHeader tableHeader = jTable1.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 14));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer right = new DefaultTableCellRenderer();
        right.setHorizontalAlignment(JLabel.RIGHT);

        jTable1.getColumnModel().getColumn(2).setCellRenderer(center);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(right);
    }

    private void loadtoYearcmb() {
        for (int i = 0; i < 100; i++) {
            int x = 2019;
            x = x + i;
            cmb_year.addItem(x + "");
        }
    }

}