package GUI;

import java.awt.Color;
import static javax.swing.BorderFactory.createMatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class main_purchasing extends javax.swing.JFrame {

    public main_purchasing() {
        initComponents();
    }

    Main_menu menu;

    public main_purchasing(Main_menu aThis) {
        this();
        menu = aThis;
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
        btn_Suppliers = new javax.swing.JButton();
        btn_SupplierPayments = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Suppliers.setBackground(new java.awt.Color(255, 255, 255));
        btn_Suppliers.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_Suppliers.setText("     Suppliers");
        btn_Suppliers.setBorder(null);
        btn_Suppliers.setContentAreaFilled(false);
        btn_Suppliers.setFocusPainted(false);
        btn_Suppliers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Suppliers.setIconTextGap(25);
        btn_Suppliers.setMargin(new java.awt.Insets(2, 0, 2, 14));
        btn_Suppliers.setOpaque(true);
        btn_Suppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SuppliersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SuppliersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SuppliersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SuppliersMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_SuppliersMouseReleased(evt);
            }
        });
        btn_Suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuppliersActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Suppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 50));

        btn_SupplierPayments.setBackground(new java.awt.Color(255, 255, 255));
        btn_SupplierPayments.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_SupplierPayments.setText("     Supplier Paymets");
        btn_SupplierPayments.setBorder(null);
        btn_SupplierPayments.setContentAreaFilled(false);
        btn_SupplierPayments.setFocusPainted(false);
        btn_SupplierPayments.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_SupplierPayments.setIconTextGap(25);
        btn_SupplierPayments.setMargin(new java.awt.Insets(2, 0, 2, 14));
        btn_SupplierPayments.setOpaque(true);
        btn_SupplierPayments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SupplierPaymentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SupplierPaymentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SupplierPaymentsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SupplierPaymentsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_SupplierPaymentsMouseReleased(evt);
            }
        });
        btn_SupplierPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SupplierPaymentsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_SupplierPayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 547, 181, 10));

        jLabel1.setFont(new java.awt.Font("BankGothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PURCHASING");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/panel2bk.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SuppliersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuppliersMouseEntered
        btn_Suppliers.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_SuppliersMouseEntered

    private void btn_SuppliersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuppliersMouseExited
        btn_Suppliers.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_SuppliersMouseExited

    private void btn_SuppliersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuppliersMousePressed
        btn_Suppliers.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_SuppliersMousePressed

    private void btn_SuppliersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuppliersMouseReleased
        btn_Suppliers.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_SuppliersMouseReleased

    private void btn_SupplierPaymentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SupplierPaymentsMouseEntered
        btn_SupplierPayments.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_SupplierPaymentsMouseEntered

    private void btn_SupplierPaymentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SupplierPaymentsMouseExited
        btn_SupplierPayments.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_SupplierPaymentsMouseExited

    private void btn_SupplierPaymentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SupplierPaymentsMousePressed
        btn_SupplierPayments.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_SupplierPaymentsMousePressed

    private void btn_SupplierPaymentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SupplierPaymentsMouseReleased
        btn_SupplierPayments.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_SupplierPaymentsMouseReleased

    private void btn_SuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuppliersActionPerformed
        Supplier_registration r = new Supplier_registration();
        menu.jPanel3.removeAll();
        menu.jPanel3.revalidate();
        menu.jPanel3.repaint();
        menu.jPanel3.add((JPanel) r.jPanel1);
    }//GEN-LAST:event_btn_SuppliersActionPerformed

    private void btn_SupplierPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SupplierPaymentsActionPerformed
        Supplier_payment p = new Supplier_payment(menu);
        menu.jPanel3.removeAll();
        menu.jPanel3.revalidate();
        menu.jPanel3.repaint();
        menu.jPanel3.add((JPanel) p.jPanel1);
    }//GEN-LAST:event_btn_SupplierPaymentsActionPerformed

    private void btn_SuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuppliersMouseClicked

        btn_SupplierPayments.setBorder(null);

        btn_Suppliers.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_SuppliersMouseClicked

    private void btn_SupplierPaymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SupplierPaymentsMouseClicked

        btn_Suppliers.setBorder(null);
        btn_SupplierPayments.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_SupplierPaymentsMouseClicked

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
            java.util.logging.Logger.getLogger(main_purchasing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_purchasing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_purchasing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_purchasing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_purchasing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SupplierPayments;
    private javax.swing.JButton btn_Suppliers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}