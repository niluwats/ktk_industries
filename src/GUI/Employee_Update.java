package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Employee_Update extends javax.swing.JFrame {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private String user = "";
    private String categoryID;
    private String sectionID;

    public Employee_Update() {
        initComponents();

        loadData();

        JTextFieldDateEditor f = (JTextFieldDateEditor) dob.getDateEditor();
        f.setEditable(false);
        f.setBackground(Color.WHITE);

    }

    Employee_Update(String id) {

    }
    Employee_detail ed;

    Employee_Update(Employee_detail aThis, String id) {
        this();
        ed = aThis;
        search(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        bankName = new javax.swing.JTextField();
        branch = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        dob = new com.toedter.calendar.JDateChooser();
        image = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        section = new javax.swing.JComboBox<>();
        designation = new javax.swing.JTextField();
        department = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        accountNo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        emp_id = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        lable = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        jTextField7.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(39, 55, 70));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Update");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 250, 29));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 73, 73));
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("Middle Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 90, 25));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 60, 25));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 73, 73));
        jLabel5.setText("Date of Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 90, 25));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 73, 73));
        jLabel6.setText("NIC");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 30, 25));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel7.setText("Employees' Bank Details");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 140, 20));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 73, 73));
        jLabel8.setText("City");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 80, 25));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 73, 73));
        jLabel9.setText("Bank Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 80, 25));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(66, 73, 73));
        jLabel10.setText("Mobile");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 80, 25));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(66, 73, 73));
        jLabel11.setText("E- mail");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 70, 25));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(66, 73, 73));
        jLabel12.setText("Branch");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 60, 25));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(66, 73, 73));
        jLabel13.setText("Emp ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 60, 25));

        mname.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        mname.setForeground(new java.awt.Color(39, 55, 70));
        mname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mnameKeyTyped(evt);
            }
        });
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 250, 25));

        nic.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        nic.setForeground(new java.awt.Color(39, 55, 70));
        nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicKeyTyped(evt);
            }
        });
        jPanel1.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 250, 25));

        city.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        city.setForeground(new java.awt.Color(39, 55, 70));
        city.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityKeyTyped(evt);
            }
        });
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 250, -1));

        fname.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        fname.setForeground(new java.awt.Color(39, 55, 70));
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnameKeyTyped(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 250, 25));

        email.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(39, 55, 70));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 250, -1));

        mobile.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        mobile.setForeground(new java.awt.Color(39, 55, 70));
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 250, -1));

        bankName.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        bankName.setForeground(new java.awt.Color(39, 55, 70));
        jPanel1.add(bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 250, -1));

        branch.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        branch.setForeground(new java.awt.Color(39, 55, 70));
        jPanel1.add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 190, -1));

        street.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        street.setForeground(new java.awt.Color(39, 55, 70));
        jPanel1.add(street, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 250, -1));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(66, 73, 73));
        jLabel14.setText("Street Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 80, 25));

        male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        male.setForeground(new java.awt.Color(66, 73, 73));
        male.setSelected(true);
        male.setText("Male");
        male.setContentAreaFilled(false);
        male.setFocusable(false);
        male.setOpaque(true);
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 80, 25));

        female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        female.setForeground(new java.awt.Color(66, 73, 73));
        female.setText("Female");
        female.setContentAreaFilled(false);
        female.setFocusable(false);
        female.setOpaque(true);
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 80, 25));

        dob.setDateFormatString("yyyy-MM-dd");
        dob.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 250, 25));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_asfsaf.png"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 170, 180));

        jSeparator1.setForeground(new java.awt.Color(41, 128, 185));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 900, 10));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(66, 73, 73));
        jLabel16.setText("Section");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 60, 25));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(66, 73, 73));
        jLabel17.setText("Department");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 80, 25));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(66, 73, 73));
        jLabel18.setText("Designation");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 80, 25));

        section.setEditable(true);
        section.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -" }));
        section.setFocusable(false);
        section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionActionPerformed(evt);
            }
        });
        jPanel1.add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 200, 25));

        designation.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        designation.setForeground(new java.awt.Color(39, 55, 70));
        jPanel1.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 250, -1));

        department.setEditable(true);
        department.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -", "Human Resource", "Production", "Sales & Marketing", "Purchasing", "Finance" }));
        department.setFocusable(false);
        jPanel1.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 250, 25));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel19.setText("Home Address ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 20));

        jSeparator2.setForeground(new java.awt.Color(41, 128, 185));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 1039, 10));

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(66, 73, 73));
        jLabel20.setText("Account No");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 80, 25));

        accountNo.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        accountNo.setForeground(new java.awt.Color(39, 55, 70));
        jPanel1.add(accountNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 250, -1));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(66, 73, 73));
        jLabel21.setText("Last Name");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 80, 25));

        lname.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lname.setForeground(new java.awt.Color(39, 55, 70));
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnameKeyTyped(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 250, 25));

        btn_update.setBackground(new java.awt.Color(41, 128, 185));
        btn_update.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.setBorder(null);
        btn_update.setBorderPainted(false);
        btn_update.setContentAreaFilled(false);
        btn_update.setFocusPainted(false);
        btn_update.setOpaque(true);
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_updateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_updateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_updateMouseReleased(evt);
            }
        });
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 90, 30));

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
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 90, 30));

        emp_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 250, 25));

        browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageBrowse.png"))); // NOI18N
        browse.setBorderPainted(false);
        browse.setContentAreaFilled(false);
        browse.setFocusPainted(false);
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel1.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 32, 32));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel24.setText("Browse");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, 40, -1));

        lable.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lable.setForeground(new java.awt.Color(66, 73, 73));
        lable.setText("Category");
        jPanel1.add(lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 60, 25));

        category.setEditable(true);
        category.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -" }));
        category.setFocusable(false);
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        jPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 200, 25));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 34, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseEntered
        btn_update.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_updateMouseEntered

    private void btn_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseExited
        btn_update.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_updateMouseExited

    private void btn_updateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMousePressed
        btn_update.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_updateMousePressed

    private void btn_updateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseReleased
        btn_update.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_updateMouseReleased

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

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Are you sure you want to save updated details?");
        if (i == 0) {
            if (fname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "You must enter the first name", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
            } else if (nic.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "You must enter the NIC", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
            } else if (email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "You must enter the email address", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
            } else if (accountNo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "You must enter the Account No", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
            } else if (bankName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "You must enter the Bank ", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
            } else if (branch.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "You must enter the barnch", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
            } else if (department.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "You must enter the department", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
            } else if (section.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "You must enter the section", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
            } else if (category.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "You must enter the sub category", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
            } else {
                if (dob.getDate() != null) {
                    String gender = null;
                    try {
                        if (male.isSelected()) {
                            gender = "Male";
                        } else {
                            gender = "Female";
                        }

                        DB.iud("update employee set fname='" + fname.getText() + "',mname='" + mname.getText() + "',lname='" + lname.getText() + "',nic='" + nic.getText() + "',gender='" + gender + "',dob='" + dateFormat.format(dob.getDate()) + "',street='" + street.getText() + "',city='" + city.getText() + "',email='" + email.getText() + "',mobile='" + mobile.getText() + "',department='" + department.getSelectedItem().toString() + "',category='" + category.getSelectedIndex() + "',depat_section='" + section.getSelectedIndex() + "' where id_employee='" + emp_id.getText() + "'");

                        DB.iud("update employee_bank_data set account_no='" + accountNo.getText() + "',bank='" + bankName.getText() + "',branch='" + branch.getText() + "'");
                        this.dispose();
                        new Save().setVisible(true);

                        clear();
                        ed.load_employee();

                    } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "You must enter the Date of Birth", "Uncomplete Data Entry", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyTyped
        Validation.setLettersOnly(evt);
    }//GEN-LAST:event_fnameKeyTyped

    private void mnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnameKeyTyped
        Validation.setLettersOnly(evt);
    }//GEN-LAST:event_mnameKeyTyped

    private void lnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyTyped
        Validation.setLettersOnly(evt);
    }//GEN-LAST:event_lnameKeyTyped

    private void nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyTyped
        Validation.setLength(evt, nic.getText(), 12);
    }//GEN-LAST:event_nicKeyTyped

    private void cityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityKeyTyped
        Validation.setLettersOnly(evt);
    }//GEN-LAST:event_cityKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped

        if (Validation.isValidemail(email.getText())) {
            Color c = new Color(39, 55, 70);
            email.setForeground(c);

        } else {
            email.setForeground(Color.red);
        }
    }//GEN-LAST:event_emailKeyTyped

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
        Model.Validation.setDigitsOnly(evt);
        Model.Validation.setLength(evt, mobile.getText(), 10);
    }//GEN-LAST:event_mobileKeyTyped

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            int option = chooser.showOpenDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                File selectedFile = chooser.getSelectedFile();
                selectedFile = new File(selectedFile.getAbsolutePath().replace("\\", "/"));

                Image im = ImageIO.read(selectedFile);
                im = im.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_FAST);
                image.setIcon(new ImageIcon(im));
                employeeImage(selectedFile, new File("EmployeeImages\\" + emp_id.getText() + ".jpg"));
            }
        } catch (HeadlessException | IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_browseActionPerformed

    private void sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionActionPerformed
        try {
            ResultSet rs = DB.search("SELECT id FROM department_section WHERE section='" + section.getSelectedItem().toString() + "' ");
            if (rs.next()) {
                sectionID = rs.getString("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_sectionActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        try {
            ResultSet rs = DB.search("SELECT id_category FROM employee_category WHERE category='" + category.getSelectedItem().toString() + "' ");
            if (rs.next()) {
                categoryID = rs.getString("id_category");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_categoryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //menu.setEnabled(true);
        this.dispose();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        dispose();
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
            java.util.logging.Logger.getLogger(Employee_Update.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Update.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Update.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Update.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNo;
    private javax.swing.JTextField bankName;
    private javax.swing.JTextField branch;
    private javax.swing.JButton browse;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField designation;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emp_id;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lable;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField nic;
    private javax.swing.JComboBox<String> section;
    private javax.swing.JTextField street;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        try {
            ResultSet rs = DB.search("SELECT section FROM department_section");
            while (rs.next()) {
                section.addItem(rs.getString("section"));
            }

            ResultSet rs1 = DB.search("SELECT category FROM employee_category");
            while (rs1.next()) {
                category.addItem(rs1.getString("category"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        fname.setText(null);
        mname.setText(null);
        lname.setText(null);
        nic.setText(null);
        street.setText(null);
        city.setText(null);
        email.setText(null);
        mobile.setText(null);
        accountNo.setText(null);
        branch.setText(null);
        bankName.setText(null);
        designation.setText(null);
        department.setSelectedIndex(0);
        section.setSelectedIndex(0);
        category.setSelectedIndex(0);
        dob.setDate(null);
    }

    private static void employeeImage(File sourceFile, File destFile) throws IOException {
        if (!destFile.exists()) {
            destFile.createNewFile();
        }

        FileChannel source = null;
        FileChannel destination = null;
        try {
            source = new RandomAccessFile(sourceFile, "rw").getChannel();
            destination = new RandomAccessFile(destFile, "rw").getChannel();

            long position = 0;
            long count = source.size();

            source.transferTo(position, count, destination);
        } finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
    }

    private void search(String id) {
        try {
            emp_id.setText(id);
            ResultSet rs = DB.search("select * from employee e inner join employee_bank_data eb on e.id_employee=eb.emp_id where e.id_employee='" + id + "'");

            if (rs.next()) {
                fname.setText(rs.getString("fname"));
                mname.setText(rs.getString("mname"));
                lname.setText(rs.getString("lname"));
                nic.setText(rs.getString("nic"));
                if (rs.getString("gender").equals("Male")) {
                    male.setSelected(true);
                } else {
                    female.setSelected(true);
                }
                dob.setDate(rs.getDate("dob"));
                street.setText(rs.getString("street"));
                city.setText(rs.getString("city"));
                email.setText(rs.getString("email"));
                mobile.setText(rs.getString("mobile"));
                accountNo.setText(rs.getString("account_no"));
                bankName.setText(rs.getString("bank"));
                branch.setText(rs.getString("branch"));
                department.setSelectedItem(rs.getString("department"));
                section.setSelectedIndex(rs.getInt("depat_section"));
                designation.setText(rs.getString("designation"));
                category.setSelectedIndex(rs.getInt("category"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
