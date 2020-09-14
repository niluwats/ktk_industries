package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class AOD extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    Main_menu menu;
    String empID_SalesRep;
    public String customer_ID;
    String availabilitystatus;
    String stockID;
    double availableQty;
    String unit_product;
    double productprice;

    public AOD() {
        initComponents();
        generateID();
        SystemDate();
        loadData();
        tableSettings();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        aodNo = new javax.swing.JLabel();
        customerID = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        productCode = new javax.swing.JTextField();
        netTotal = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        unit = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        subTotal = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        aod_discount = new javax.swing.JTextField();
        btn_Cancel = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        cash = new javax.swing.JRadioButton();
        cheque = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        product_code = new javax.swing.JButton();
        searchCustomer = new javax.swing.JButton();
        salesRep = new javax.swing.JComboBox<String>();
        productName = new javax.swing.JLabel();
        itemPrice = new javax.swing.JLabel();
        availa = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1306, 1, 34, 32));

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 29, 1336, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setText("Payment Method");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 120, 25));

        qty.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        qty.setForeground(new java.awt.Color(39, 55, 70));
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 160, 25));

        table.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Product Code", "Product Name", "Unit", "Unit Price", "Quantity", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

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
            table.getColumnModel().getColumn(0).setPreferredWidth(80);
            table.getColumnModel().getColumn(1).setPreferredWidth(240);
            table.getColumnModel().getColumn(2).setPreferredWidth(437);
            table.getColumnModel().getColumn(3).setPreferredWidth(100);
            table.getColumnModel().getColumn(4).setPreferredWidth(80);
            table.getColumnModel().getColumn(5).setPreferredWidth(100);
            table.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 1240, 320));

        aodNo.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        aodNo.setForeground(new java.awt.Color(66, 73, 73));
        jPanel1.add(aodNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 210, 25));

        customerID.setEditable(false);
        customerID.setBackground(new java.awt.Color(255, 255, 255));
        customerID.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        customerID.setForeground(new java.awt.Color(39, 55, 70));
        jPanel1.add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 210, 25));

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(66, 73, 73));
        jLabel24.setText("Customer");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 25));

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(66, 73, 73));
        jLabel25.setText("Product Name");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, 25));

        productCode.setEditable(false);
        productCode.setBackground(new java.awt.Color(255, 255, 255));
        productCode.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        productCode.setForeground(new java.awt.Color(39, 55, 70));
        jPanel1.add(productCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, 25));

        netTotal.setEditable(false);
        netTotal.setBackground(new java.awt.Color(255, 255, 255));
        netTotal.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        netTotal.setForeground(new java.awt.Color(39, 55, 70));
        netTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(netTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 630, 180, 25));

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(66, 73, 73));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Net Total");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 630, 60, 25));

        unit.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        unit.setForeground(new java.awt.Color(66, 73, 73));
        jPanel1.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 90, 25));

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(66, 73, 73));
        jLabel32.setText("AOD NO");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, 25));

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(66, 73, 73));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Total");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 570, 60, 25));

        subTotal.setEditable(false);
        subTotal.setBackground(new java.awt.Color(255, 255, 255));
        subTotal.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        subTotal.setForeground(new java.awt.Color(39, 55, 70));
        subTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(subTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 570, 180, 25));

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(66, 73, 73));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Discount (%)");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, 100, 25));

        aod_discount.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        aod_discount.setForeground(new java.awt.Color(39, 55, 70));
        aod_discount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        aod_discount.setText("0");
        aod_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aod_discountActionPerformed(evt);
            }
        });
        aod_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aod_discountKeyTyped(evt);
            }
        });
        jPanel1.add(aod_discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 600, 180, 25));

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
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 110, 90, 30));

        btn_Save.setBackground(new java.awt.Color(41, 128, 185));
        btn_Save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jPanel1.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 110, 90, 30));

        cash.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cash);
        cash.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cash.setSelected(true);
        cash.setText("   Cash");
        cash.setBorder(null);
        jPanel1.add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 80, 25));

        cheque.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cheque);
        cheque.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cheque.setText("   Cheque");
        cheque.setBorder(null);
        jPanel1.add(cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, -1, 25));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Sales Rep");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 70, 25));

        date.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        date.setForeground(new java.awt.Color(66, 73, 73));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 220, 25));

        product_code.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        product_code.setBorderPainted(false);
        product_code.setContentAreaFilled(false);
        product_code.setFocusPainted(false);
        product_code.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search2.png"))); // NOI18N
        product_code.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search1.png"))); // NOI18N
        product_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_codeActionPerformed(evt);
            }
        });
        jPanel1.add(product_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 178, 30, 30));

        searchCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        searchCustomer.setBorderPainted(false);
        searchCustomer.setContentAreaFilled(false);
        searchCustomer.setFocusPainted(false);
        searchCustomer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search2.png"))); // NOI18N
        searchCustomer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search1.png"))); // NOI18N
        searchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(searchCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 138, 30, 30));

        salesRep.setEditable(true);
        salesRep.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        salesRep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -" }));
        salesRep.setFocusable(false);
        salesRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesRepActionPerformed(evt);
            }
        });
        jPanel1.add(salesRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 220, 25));

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

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(66, 73, 73));
        jLabel14.setText("Quantity");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 60, 25));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(66, 73, 73));
        jLabel10.setText("Date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 50, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void product_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_codeActionPerformed
        SearchProduct sp = new SearchProduct(menu, this);
        sp.setVisible(true);
    }//GEN-LAST:event_product_codeActionPerformed

    private void qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyTyped
        Validation.setDigitsOnly(evt);
    }//GEN-LAST:event_qtyKeyTyped

    private void aod_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aod_discountActionPerformed
        getNetTotal();
    }//GEN-LAST:event_aod_discountActionPerformed

    private void aod_discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aod_discountKeyTyped
        Validation.setDigitsOnly(evt);
        Validation.setLength(evt, aod_discount.getText(), 3);
    }//GEN-LAST:event_aod_discountKeyTyped

    private void searchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerActionPerformed
        SearchCustomer s = new SearchCustomer(menu, this);
        s.setVisible(true);
    }//GEN-LAST:event_searchCustomerActionPerformed

    private void salesRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesRepActionPerformed
        String fname = salesRep.getSelectedItem().toString().split(" ")[0];
        //String lname = salesRep.getSelectedItem().toString().split(" ")[1];
        try {
            ResultSet rs = DB.search("SELECT id_employee FROM employee WHERE fname='" + fname + "' ");
            if (rs.next()) {
                empID_SalesRep = rs.getString("id_employee");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_salesRepActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        if (availa.getText().equals("Available")) {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            if (!productCode.getText().isEmpty() | !qty.getText().isEmpty()) {
                boolean b = true;
                for (int i = 0; i < table.getRowCount(); i++) {
                    if (table.getValueAt(i, 1).toString().equals(productCode.getText())) {
                        b = false;
                        double availQty = Double.parseDouble(table.getValueAt(i, 4).toString());
                        double newQty = Double.parseDouble(qty.getText());

                        table.setValueAt(availQty + newQty, i, 4);
                        table.setValueAt((availQty + newQty) * productprice, i, 5);
                    }
                }
                if (b) {
                    Vector v = new Vector();
                    v.add(stockID);
                    v.add(productCode.getText());
                    v.add(productName.getText());
                    v.add(unit.getText());
                    v.add(productprice);
                    v.add(qty.getText());
                    v.add(productprice * Double.parseDouble(qty.getText()));
                    dtm.addRow(v);
                }
                productCode.setText(null);
                productName.setText(null);
                qty.setText(null);
                unit.setText(null);
                itemPrice.setText(null);
                availa.setText(null);
                getSubTotal();
                getNetTotal();
            }
        }
    }//GEN-LAST:event_qtyActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(d);
        if ( !customerID.getText().isEmpty() | salesRep.getSelectedIndex() != 0) {
            if (cash.isSelected() | cheque.isSelected()) {
                String paymethod;
                if (cash.isSelected()) {
                    paymethod = "Cash";
                } else {
                    paymethod = "Cheque";
                }

                try {
                    DB.iud("INSERT INTO invoice_aod (id_invoice, id_customer, employee_salesrep, date, payment_type, sub_total, discount, net_total, state) "
                            + "VALUES('" + aodNo.getText() + "', '" + customerID.getText() + "', '" + empID_SalesRep + "', '" +date+ "', '" + paymethod + "', '" + subTotal.getText() + "', '" + aod_discount.getText() + "', '" + netTotal.getText() + "', '"+1+"') ");
                    for (int i = 0; i < table.getRowCount(); i++) {
                        DB.iud("INSERT INTO invoice_item (id_invoice, idproduct_stock, qty, value) VALUES ('" + aodNo.getText() + "', '" + table.getValueAt(i, 0).toString() + "', '" + table.getValueAt(i, 5).toString() + "', '" + table.getValueAt(i, 6).toString() + "') ");
                        DB.iud("UPDATE product_stock SET qty=qty-'" + table.getValueAt(i, 5).toString() + "' WHERE idproduct_stock='" + table.getValueAt(i, 0).toString() + "' ");
                    }
                    new Save().setVisible(true);
                    clearAll();
                    printInvoice();
                    generateID();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("select pay method");
        }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyReleased
        if (!qty.getText().isEmpty()) {
            double d = Double.parseDouble(qty.getText());
            for (int i = 0; i < table.getRowCount(); i++) {
                if (table.getValueAt(i, 1).toString().equals(productCode.getText())) {
                    d = d + Double.parseDouble(table.getValueAt(i, 5).toString());
                }
            }
            if (availableQty >= d) {
                availa.setText("Available");
                availa.setForeground(Color.GREEN);
            } else {
                availa.setText("Qty Out of Stock");
                availa.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_qtyKeyReleased

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
            customerID.setText(null);
            productCode.setText(null);
            
    }//GEN-LAST:event_btn_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(AOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AOD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aodNo;
    private javax.swing.JTextField aod_discount;
    private javax.swing.JLabel availa;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cash;
    private javax.swing.JRadioButton cheque;
    public javax.swing.JTextField customerID;
    private javax.swing.JLabel date;
    private javax.swing.JLabel itemPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField netTotal;
    public javax.swing.JTextField productCode;
    public javax.swing.JLabel productName;
    private javax.swing.JButton product_code;
    public javax.swing.JTextField qty;
    private javax.swing.JComboBox<String> salesRep;
    private javax.swing.JButton searchCustomer;
    private javax.swing.JTextField subTotal;
    private javax.swing.JTable table;
    public javax.swing.JLabel unit;
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
        table.getColumnModel().getColumn(3).setCellRenderer(center);
        table.getColumnModel().getColumn(4).setCellRenderer(center);
        table.getColumnModel().getColumn(5).setCellRenderer(center);
        table.getColumnModel().getColumn(6).setCellRenderer(right);
    }

    private void generateID() {
        try {
            ResultSet rs = DB.search("SELECT COUNT(id_invoice) AS id FROM invoice_aod");
            if (rs.next()) {
                int rowcount = rs.getInt("id");
                rowcount++;
                aodNo.setText("AOD" + String.format("%0" + 6 + "d", rowcount));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadData() {
        try {
            ResultSet rs1 = DB.search("select * from employee where category=(select id_category from employee_category where category='SalesRep')");
            
            while (rs1.next()) {
                salesRep.addItem(rs1.getString("fname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadStockDetails() {
        try {
            ResultSet rs = DB.search("SELECT product_stock.idproduct_stock, product.retail_price,product_stock.qty "
                    + "FROM product INNER JOIN product_stock ON product.id_product=product_stock.product_id WHERE product_stock.product_id='" + productCode.getText() + "' AND product_stock.qty>0");
            if (rs.next()) {
                stockID = rs.getString("idproduct_stock");
                productprice = rs.getDouble("retail_price");
                availableQty = rs.getDouble("qty");
                itemPrice.setText(String.valueOf(productprice));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getSubTotal() {
        double total = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            total = total + Double.parseDouble(table.getValueAt(i, 6).toString());
        }
        subTotal.setText(String.valueOf(total));
    }

    private void getNetTotal() {
        if (!subTotal.getText().isEmpty()) {
            if (Double.parseDouble(aod_discount.getText()) <= 100) {
                double subT = Double.parseDouble(subTotal.getText());
                double name = (subT * (100 - Double.parseDouble(aod_discount.getText()))) / 100;
                netTotal.setText(String.valueOf(name));
            } else {
                JOptionPane.showMessageDialog(this, "wrong value");
            }
        }
    }

    private void clearAll() {
        ((DefaultTableModel)table.getModel()).setRowCount(0);
        customerID.setText(null);
        productCode.setText(null);
        productName.setText(null);
        unit.setText(null);
        salesRep.setSelectedIndex(0);
        subTotal.setText("0.00");
        aod_discount.setText("0");
        netTotal.setText("0.00");
        cash.setSelected(false);
        cheque.setSelected(false);
    }

    private void printInvoice() {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            String path = "iReport\\AOD_new.jrxml";

            Map<String, Object> m = new HashMap();
            m.put("Invoice_id", aodNo.getText());

            JasperReport cp = JasperCompileManager.compileReport(path);
            JasperPrint fr = JasperFillManager.fillReport(cp, m, DB.getConnection());
            JasperViewer.viewReport(fr, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        setCursor(null);
    }
    
    
    
SimpleDateFormat sdf;
Date d;
    private void SystemDate() {
     Timer t = new Timer(100, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                sdf = new SimpleDateFormat("HH:mm:ss");
                d = new Date();
                //Sys_Time.setText(sdf.format(d));
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                date.setText(sdf.format(d));
                sdf = null;
                d = null;

            }
        });
        t.start();
    }
    
}
