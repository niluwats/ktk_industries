package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Sections extends javax.swing.JFrame {

    public Sections() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        depart = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        section = new javax.swing.JTextField();
        btn_AddNewEmpCategory = new javax.swing.JButton();
        category = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_AddNewSections = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1120, 620));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        depart.setEditable(true);
        depart.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        depart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -", "Human Resource", "Production", "Sales & Marketing", "Purchasing", "Finance" }));
        depart.setFocusable(false);
        panel.add(depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 270, 25));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel1.setText("Department");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 80, 25));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 128, 185));
        jLabel2.setText("Employee Categorization");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 280, 30));

        section.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        section.setForeground(new java.awt.Color(39, 55, 70));
        section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionActionPerformed(evt);
            }
        });
        section.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sectionKeyTyped(evt);
            }
        });
        panel.add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 580, 25));

        btn_AddNewEmpCategory.setBackground(new java.awt.Color(41, 128, 185));
        btn_AddNewEmpCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AddNewEmpCategory.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddNewEmpCategory.setText("Add");
        btn_AddNewEmpCategory.setBorder(null);
        btn_AddNewEmpCategory.setBorderPainted(false);
        btn_AddNewEmpCategory.setContentAreaFilled(false);
        btn_AddNewEmpCategory.setFocusPainted(false);
        btn_AddNewEmpCategory.setOpaque(true);
        btn_AddNewEmpCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddNewEmpCategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddNewEmpCategoryMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AddNewEmpCategoryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_AddNewEmpCategoryMouseReleased(evt);
            }
        });
        btn_AddNewEmpCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNewEmpCategoryActionPerformed(evt);
            }
        });
        panel.add(btn_AddNewEmpCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 90, 25));

        category.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        category.setForeground(new java.awt.Color(39, 55, 70));
        category.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                categoryKeyTyped(evt);
            }
        });
        panel.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 600, 25));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setText("New Category");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 140, 25));
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 750, 10));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 128, 185));
        jLabel5.setText("Department  Sub Sections");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 280, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setText("New Section");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, 25));

        btn_AddNewSections.setBackground(new java.awt.Color(41, 128, 185));
        btn_AddNewSections.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AddNewSections.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddNewSections.setText("Add");
        btn_AddNewSections.setBorder(null);
        btn_AddNewSections.setBorderPainted(false);
        btn_AddNewSections.setContentAreaFilled(false);
        btn_AddNewSections.setFocusPainted(false);
        btn_AddNewSections.setOpaque(true);
        btn_AddNewSections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddNewSectionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddNewSectionsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AddNewSectionsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_AddNewSectionsMouseReleased(evt);
            }
        });
        btn_AddNewSections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNewSectionsActionPerformed(evt);
            }
        });
        panel.add(btn_AddNewSections, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 90, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddNewEmpCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddNewEmpCategoryMouseEntered
        btn_AddNewEmpCategory.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddNewEmpCategoryMouseEntered

    private void btn_AddNewEmpCategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddNewEmpCategoryMouseExited
        btn_AddNewEmpCategory.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_AddNewEmpCategoryMouseExited

    private void btn_AddNewEmpCategoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddNewEmpCategoryMousePressed
        btn_AddNewEmpCategory.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_AddNewEmpCategoryMousePressed

    private void btn_AddNewEmpCategoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddNewEmpCategoryMouseReleased
        btn_AddNewEmpCategory.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddNewEmpCategoryMouseReleased

    private void btn_AddNewSectionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddNewSectionsMouseEntered
        btn_AddNewSections.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_AddNewSectionsMouseEntered

    private void btn_AddNewSectionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddNewSectionsMouseExited
        btn_AddNewSections.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_AddNewSectionsMouseExited

    private void btn_AddNewSectionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddNewSectionsMousePressed
        btn_AddNewSections.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_AddNewSectionsMousePressed

    private void btn_AddNewSectionsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddNewSectionsMouseReleased
        btn_AddNewSections.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddNewSectionsMouseReleased

    private void btn_AddNewSectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddNewSectionsActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this section?");
        if (i == 0) {
            if (!section.getText().isEmpty() | depart.getSelectedIndex() != 0) {
                try {
                    DB.iud("INSERT INTO department_section(section, department) VALUES('" + section.getText() + "', '" + depart.getSelectedItem().toString() + "') ");
                    new Save().setVisible(true);
                    section.setText(null);
                    depart.setSelectedIndex(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_btn_AddNewSectionsActionPerformed

    private void sectionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sectionKeyTyped
        Validation.setLettersOnly(evt);
        Validation.setLength(evt, section.getText(), 45);
    }//GEN-LAST:event_sectionKeyTyped

    private void btn_AddNewEmpCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddNewEmpCategoryActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this category?");
        if (i == 0) {
            if (!category.getText().isEmpty()) {
                try {
                    DB.iud("INSERT INTO employee_category(category) VALUES('" + category.getText() + "') ");
                    new Save().setVisible(true);
                    category.setText(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_btn_AddNewEmpCategoryActionPerformed

    private void categoryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryKeyTyped
        Validation.setLettersOnly(evt);
        Validation.setLength(evt, section.getText(), 45);
    }//GEN-LAST:event_categoryKeyTyped

    private void sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionActionPerformed

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
            java.util.logging.Logger.getLogger(Sections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddNewEmpCategory;
    private javax.swing.JButton btn_AddNewSections;
    private javax.swing.JTextField category;
    private javax.swing.JComboBox<String> depart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JPanel panel;
    private javax.swing.JTextField section;
    // End of variables declaration//GEN-END:variables
}
