package GUI;

import Database.DB;
import Model.Save;
import java.awt.Color;
import javax.swing.JOptionPane;

public class User_Privileges extends javax.swing.JFrame {

    String user = "panda";

    public User_Privileges() {
        initComponents();
        viewData_HR_Department();
        viewData_Production_Department();
        viewData_Sales_Marketing();
        viewData_Purchasing_Department();
        viewData_Finance_Department();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btn_Minimize = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Purchasing_Department = new javax.swing.JCheckBox();
        hr_department = new javax.swing.JCheckBox();
        Production_Department = new javax.swing.JCheckBox();
        Sales_Marketing = new javax.swing.JCheckBox();
        Finance_Department = new javax.swing.JCheckBox();
        attendanace_Print = new javax.swing.JCheckBox();
        reports = new javax.swing.JCheckBox();
        employeeRegistration = new javax.swing.JCheckBox();
        attendanceManagement = new javax.swing.JCheckBox();
        attendanace_Save = new javax.swing.JCheckBox();
        payrollManagement = new javax.swing.JCheckBox();
        departmentSections = new javax.swing.JCheckBox();
        users = new javax.swing.JCheckBox();
        Products_Details = new javax.swing.JCheckBox();
        Products_Details_Add_Product = new javax.swing.JCheckBox();
        Raw_Materials = new javax.swing.JCheckBox();
        Product_Item_Stock_Export = new javax.swing.JCheckBox();
        Product_Item_Stock = new javax.swing.JCheckBox();
        Bill_Of_Materilas = new javax.swing.JCheckBox();
        Bill_Of_Materilas_New_Bom = new javax.swing.JCheckBox();
        Raw_materials_GRN = new javax.swing.JCheckBox();
        Raw_Cost_Per_Product = new javax.swing.JCheckBox();
        Raw_Cost_Per_Product_Edit = new javax.swing.JCheckBox();
        Dashboard = new javax.swing.JCheckBox();
        Customer_Registation = new javax.swing.JCheckBox();
        Advise_of_Dispatch = new javax.swing.JCheckBox();
        Advise_of_Dispatch_Pending_AOD = new javax.swing.JCheckBox();
        Customer_History = new javax.swing.JCheckBox();
        Payment_Receipts = new javax.swing.JCheckBox();
        Credit_Notes = new javax.swing.JCheckBox();
        Suppliers_Registartion = new javax.swing.JCheckBox();
        Supplier_Paymets = new javax.swing.JCheckBox();
        Sales_Commission = new javax.swing.JCheckBox();
        Item_Movement = new javax.swing.JCheckBox();
        Add_Journals = new javax.swing.JCheckBox();
        Ledger_Accounts = new javax.swing.JCheckBox();
        Discounts_Offers = new javax.swing.JCheckBox();
        Products_Details_Export_Pro = new javax.swing.JCheckBox();
        Products_Details_Add_Brand = new javax.swing.JCheckBox();
        Products_Details_Add_Category = new javax.swing.JCheckBox();
        Add_New_Item_Raw = new javax.swing.JCheckBox();
        Export_Raw = new javax.swing.JCheckBox();
        Bill_Of_Materilas_pending_Approvels = new javax.swing.JCheckBox();
        Product_GRN = new javax.swing.JCheckBox();
        Reports_Preweew = new javax.swing.JCheckBox();
        Advise_of_Dispatch_New_AOD = new javax.swing.JCheckBox();
        Advise_of_Dispatch_Printing = new javax.swing.JCheckBox();
        Dispatch_Note = new javax.swing.JCheckBox();
        Sales_Returns = new javax.swing.JCheckBox();
        Reports_Preweew_Finance = new javax.swing.JCheckBox();
        Reports_Preweew_Sales = new javax.swing.JCheckBox();
        Purchasing_Reports_Preweew = new javax.swing.JCheckBox();
        btn_Save = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1120, 620));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 10, 580));

        jSeparator6.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 10, 580));

        jSeparator7.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 10, 580));

        jSeparator8.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 10, 580));

        btn_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mini1.png"))); // NOI18N
        btn_Minimize.setBorder(null);
        btn_Minimize.setContentAreaFilled(false);
        btn_Minimize.setFocusPainted(false);
        btn_Minimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mini2.png"))); // NOI18N
        btn_Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinimizeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1302, 1, 30, 31));

        btn_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close_black.png"))); // NOI18N
        btn_Exit.setBorder(null);
        btn_Exit.setContentAreaFilled(false);
        btn_Exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close_red_.png"))); // NOI18N
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1332, 0, 34, 31));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 128, 185));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("User Privilege Manegment");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 30));

        Purchasing_Department.setBackground(new java.awt.Color(255, 255, 255));
        Purchasing_Department.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Purchasing_Department.setText("Purchasing Department");
        Purchasing_Department.setFocusPainted(false);
        Purchasing_Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchasing_DepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(Purchasing_Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, 30));

        hr_department.setBackground(new java.awt.Color(255, 255, 255));
        hr_department.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hr_department.setText("H/R Department");
        hr_department.setFocusPainted(false);
        hr_department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr_departmentActionPerformed(evt);
            }
        });
        jPanel1.add(hr_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, 30));

        Production_Department.setBackground(new java.awt.Color(255, 255, 255));
        Production_Department.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Production_Department.setText("Production Department");
        Production_Department.setFocusPainted(false);
        Production_Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Production_DepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(Production_Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 30));

        Sales_Marketing.setBackground(new java.awt.Color(255, 255, 255));
        Sales_Marketing.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sales_Marketing.setText("Sales & Marketing");
        Sales_Marketing.setFocusPainted(false);
        Sales_Marketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sales_MarketingActionPerformed(evt);
            }
        });
        jPanel1.add(Sales_Marketing, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, 30));

        Finance_Department.setBackground(new java.awt.Color(255, 255, 255));
        Finance_Department.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Finance_Department.setText("Finance Department");
        Finance_Department.setFocusPainted(false);
        Finance_Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finance_DepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(Finance_Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 70, -1, 30));

        attendanace_Print.setBackground(new java.awt.Color(255, 255, 255));
        attendanace_Print.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        attendanace_Print.setText("Print");
        attendanace_Print.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        attendanace_Print.setFocusPainted(false);
        jPanel1.add(attendanace_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        reports.setBackground(new java.awt.Color(255, 255, 255));
        reports.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        reports.setForeground(new java.awt.Color(41, 128, 185));
        reports.setText("Reports");
        reports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reports.setFocusPainted(false);
        jPanel1.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        employeeRegistration.setBackground(new java.awt.Color(255, 255, 255));
        employeeRegistration.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        employeeRegistration.setForeground(new java.awt.Color(41, 128, 185));
        employeeRegistration.setText("Employee Registartion");
        employeeRegistration.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        employeeRegistration.setFocusPainted(false);
        jPanel1.add(employeeRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        attendanceManagement.setBackground(new java.awt.Color(255, 255, 255));
        attendanceManagement.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        attendanceManagement.setForeground(new java.awt.Color(41, 128, 185));
        attendanceManagement.setText("Attendance Management");
        attendanceManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        attendanceManagement.setFocusPainted(false);
        attendanceManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceManagementActionPerformed(evt);
            }
        });
        jPanel1.add(attendanceManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        attendanace_Save.setBackground(new java.awt.Color(255, 255, 255));
        attendanace_Save.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        attendanace_Save.setText("Save");
        attendanace_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        attendanace_Save.setFocusPainted(false);
        jPanel1.add(attendanace_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        payrollManagement.setBackground(new java.awt.Color(255, 255, 255));
        payrollManagement.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        payrollManagement.setForeground(new java.awt.Color(41, 128, 185));
        payrollManagement.setText("PayRoll Management");
        payrollManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        payrollManagement.setFocusPainted(false);
        jPanel1.add(payrollManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        departmentSections.setBackground(new java.awt.Color(255, 255, 255));
        departmentSections.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        departmentSections.setForeground(new java.awt.Color(41, 128, 185));
        departmentSections.setText("Dep & Sections");
        departmentSections.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        departmentSections.setFocusPainted(false);
        jPanel1.add(departmentSections, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        users.setBackground(new java.awt.Color(255, 255, 255));
        users.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        users.setForeground(new java.awt.Color(41, 128, 185));
        users.setText("Users");
        users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        users.setFocusPainted(false);
        jPanel1.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        Products_Details.setBackground(new java.awt.Color(255, 255, 255));
        Products_Details.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Products_Details.setForeground(new java.awt.Color(41, 128, 185));
        Products_Details.setText("Products & Details");
        Products_Details.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Products_Details.setFocusPainted(false);
        Products_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Products_DetailsActionPerformed(evt);
            }
        });
        jPanel1.add(Products_Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        Products_Details_Add_Product.setBackground(new java.awt.Color(255, 255, 255));
        Products_Details_Add_Product.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Products_Details_Add_Product.setText("Add Product");
        Products_Details_Add_Product.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Products_Details_Add_Product.setFocusPainted(false);
        jPanel1.add(Products_Details_Add_Product, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 235, -1, 20));

        Raw_Materials.setBackground(new java.awt.Color(255, 255, 255));
        Raw_Materials.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Raw_Materials.setForeground(new java.awt.Color(41, 128, 185));
        Raw_Materials.setText("Raw Materials");
        Raw_Materials.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Raw_Materials.setFocusPainted(false);
        Raw_Materials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Raw_MaterialsActionPerformed(evt);
            }
        });
        jPanel1.add(Raw_Materials, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        Product_Item_Stock_Export.setBackground(new java.awt.Color(255, 255, 255));
        Product_Item_Stock_Export.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Product_Item_Stock_Export.setText("Export");
        Product_Item_Stock_Export.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Product_Item_Stock_Export.setFocusPainted(false);
        jPanel1.add(Product_Item_Stock_Export, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        Product_Item_Stock.setBackground(new java.awt.Color(255, 255, 255));
        Product_Item_Stock.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Product_Item_Stock.setForeground(new java.awt.Color(41, 128, 185));
        Product_Item_Stock.setText("Product Item Stock");
        Product_Item_Stock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Product_Item_Stock.setFocusPainted(false);
        Product_Item_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_Item_StockActionPerformed(evt);
            }
        });
        jPanel1.add(Product_Item_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        Bill_Of_Materilas.setBackground(new java.awt.Color(255, 255, 255));
        Bill_Of_Materilas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Bill_Of_Materilas.setForeground(new java.awt.Color(41, 128, 185));
        Bill_Of_Materilas.setText("Bill Of Materilas");
        Bill_Of_Materilas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bill_Of_Materilas.setFocusPainted(false);
        Bill_Of_Materilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bill_Of_MaterilasActionPerformed(evt);
            }
        });
        jPanel1.add(Bill_Of_Materilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        Bill_Of_Materilas_New_Bom.setBackground(new java.awt.Color(255, 255, 255));
        Bill_Of_Materilas_New_Bom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Bill_Of_Materilas_New_Bom.setText("New BOM");
        Bill_Of_Materilas_New_Bom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bill_Of_Materilas_New_Bom.setFocusPainted(false);
        jPanel1.add(Bill_Of_Materilas_New_Bom, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        Raw_materials_GRN.setBackground(new java.awt.Color(255, 255, 255));
        Raw_materials_GRN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Raw_materials_GRN.setForeground(new java.awt.Color(41, 128, 185));
        Raw_materials_GRN.setText("Raw materials GRN");
        Raw_materials_GRN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Raw_materials_GRN.setFocusPainted(false);
        jPanel1.add(Raw_materials_GRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        Raw_Cost_Per_Product.setBackground(new java.awt.Color(255, 255, 255));
        Raw_Cost_Per_Product.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Raw_Cost_Per_Product.setForeground(new java.awt.Color(41, 128, 185));
        Raw_Cost_Per_Product.setText("Raw Cost Per Product");
        Raw_Cost_Per_Product.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Raw_Cost_Per_Product.setFocusPainted(false);
        Raw_Cost_Per_Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Raw_Cost_Per_ProductActionPerformed(evt);
            }
        });
        jPanel1.add(Raw_Cost_Per_Product, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));

        Raw_Cost_Per_Product_Edit.setBackground(new java.awt.Color(255, 255, 255));
        Raw_Cost_Per_Product_Edit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Raw_Cost_Per_Product_Edit.setText("Edit");
        Raw_Cost_Per_Product_Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Raw_Cost_Per_Product_Edit.setFocusPainted(false);
        jPanel1.add(Raw_Cost_Per_Product_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, -1, -1));

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Dashboard.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(41, 128, 185));
        Dashboard.setText("Dashboard");
        Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Dashboard.setFocusPainted(false);
        jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        Customer_Registation.setBackground(new java.awt.Color(255, 255, 255));
        Customer_Registation.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Customer_Registation.setForeground(new java.awt.Color(41, 128, 185));
        Customer_Registation.setText("Customer Registation");
        Customer_Registation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Customer_Registation.setFocusPainted(false);
        jPanel1.add(Customer_Registation, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        Advise_of_Dispatch.setBackground(new java.awt.Color(255, 255, 255));
        Advise_of_Dispatch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Advise_of_Dispatch.setForeground(new java.awt.Color(41, 128, 185));
        Advise_of_Dispatch.setText("Advise of Dispatch");
        Advise_of_Dispatch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Advise_of_Dispatch.setFocusPainted(false);
        Advise_of_Dispatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Advise_of_DispatchActionPerformed(evt);
            }
        });
        jPanel1.add(Advise_of_Dispatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        Advise_of_Dispatch_Pending_AOD.setBackground(new java.awt.Color(255, 255, 255));
        Advise_of_Dispatch_Pending_AOD.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Advise_of_Dispatch_Pending_AOD.setText("Pending AOD");
        Advise_of_Dispatch_Pending_AOD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Advise_of_Dispatch_Pending_AOD.setFocusPainted(false);
        jPanel1.add(Advise_of_Dispatch_Pending_AOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));

        Customer_History.setBackground(new java.awt.Color(255, 255, 255));
        Customer_History.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Customer_History.setForeground(new java.awt.Color(41, 128, 185));
        Customer_History.setText("Customer History");
        Customer_History.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Customer_History.setFocusPainted(false);
        jPanel1.add(Customer_History, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        Payment_Receipts.setBackground(new java.awt.Color(255, 255, 255));
        Payment_Receipts.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Payment_Receipts.setForeground(new java.awt.Color(41, 128, 185));
        Payment_Receipts.setText("Payment Receipts");
        Payment_Receipts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Payment_Receipts.setFocusPainted(false);
        jPanel1.add(Payment_Receipts, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        Credit_Notes.setBackground(new java.awt.Color(255, 255, 255));
        Credit_Notes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Credit_Notes.setForeground(new java.awt.Color(41, 128, 185));
        Credit_Notes.setText("Credit Notes");
        Credit_Notes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Credit_Notes.setFocusPainted(false);
        jPanel1.add(Credit_Notes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));

        Suppliers_Registartion.setBackground(new java.awt.Color(255, 255, 255));
        Suppliers_Registartion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Suppliers_Registartion.setForeground(new java.awt.Color(41, 128, 185));
        Suppliers_Registartion.setText("Suppliers Registartion");
        Suppliers_Registartion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Suppliers_Registartion.setFocusPainted(false);
        jPanel1.add(Suppliers_Registartion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, -1));

        Supplier_Paymets.setBackground(new java.awt.Color(255, 255, 255));
        Supplier_Paymets.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Supplier_Paymets.setForeground(new java.awt.Color(41, 128, 185));
        Supplier_Paymets.setText("Supplier Paymets");
        Supplier_Paymets.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Supplier_Paymets.setFocusPainted(false);
        jPanel1.add(Supplier_Paymets, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        Sales_Commission.setBackground(new java.awt.Color(255, 255, 255));
        Sales_Commission.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Sales_Commission.setForeground(new java.awt.Color(41, 128, 185));
        Sales_Commission.setText("Sales Commission");
        Sales_Commission.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sales_Commission.setFocusPainted(false);
        jPanel1.add(Sales_Commission, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, -1, -1));

        Item_Movement.setBackground(new java.awt.Color(255, 255, 255));
        Item_Movement.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Item_Movement.setForeground(new java.awt.Color(41, 128, 185));
        Item_Movement.setText("Item Movement");
        Item_Movement.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Item_Movement.setFocusPainted(false);
        jPanel1.add(Item_Movement, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, -1));

        Add_Journals.setBackground(new java.awt.Color(255, 255, 255));
        Add_Journals.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Add_Journals.setForeground(new java.awt.Color(41, 128, 185));
        Add_Journals.setText("Add Journals");
        Add_Journals.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Add_Journals.setFocusPainted(false);
        Add_Journals.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jPanel1.add(Add_Journals, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 130, -1, -1));

        Ledger_Accounts.setBackground(new java.awt.Color(255, 255, 255));
        Ledger_Accounts.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Ledger_Accounts.setForeground(new java.awt.Color(41, 128, 185));
        Ledger_Accounts.setText("Ledger Accounts");
        Ledger_Accounts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ledger_Accounts.setFocusPainted(false);
        Ledger_Accounts.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jPanel1.add(Ledger_Accounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 170, -1, -1));

        Discounts_Offers.setBackground(new java.awt.Color(255, 255, 255));
        Discounts_Offers.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Discounts_Offers.setForeground(new java.awt.Color(41, 128, 185));
        Discounts_Offers.setText("Discounts & Offers");
        Discounts_Offers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Discounts_Offers.setFocusPainted(false);
        Discounts_Offers.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jPanel1.add(Discounts_Offers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 210, -1, -1));

        Products_Details_Export_Pro.setBackground(new java.awt.Color(255, 255, 255));
        Products_Details_Export_Pro.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Products_Details_Export_Pro.setText("Export");
        Products_Details_Export_Pro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Products_Details_Export_Pro.setFocusPainted(false);
        jPanel1.add(Products_Details_Export_Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, 20));

        Products_Details_Add_Brand.setBackground(new java.awt.Color(255, 255, 255));
        Products_Details_Add_Brand.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Products_Details_Add_Brand.setText("Add Brand");
        Products_Details_Add_Brand.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Products_Details_Add_Brand.setFocusPainted(false);
        jPanel1.add(Products_Details_Add_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 185, -1, 20));

        Products_Details_Add_Category.setBackground(new java.awt.Color(255, 255, 255));
        Products_Details_Add_Category.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Products_Details_Add_Category.setText("Add Category");
        Products_Details_Add_Category.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Products_Details_Add_Category.setFocusPainted(false);
        jPanel1.add(Products_Details_Add_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, 20));

        Add_New_Item_Raw.setBackground(new java.awt.Color(255, 255, 255));
        Add_New_Item_Raw.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Add_New_Item_Raw.setText("Add New Item");
        Add_New_Item_Raw.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Add_New_Item_Raw.setFocusPainted(false);
        jPanel1.add(Add_New_Item_Raw, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        Export_Raw.setBackground(new java.awt.Color(255, 255, 255));
        Export_Raw.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Export_Raw.setText("Export");
        Export_Raw.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Export_Raw.setFocusPainted(false);
        jPanel1.add(Export_Raw, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        Bill_Of_Materilas_pending_Approvels.setBackground(new java.awt.Color(255, 255, 255));
        Bill_Of_Materilas_pending_Approvels.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Bill_Of_Materilas_pending_Approvels.setText("Approvals");
        Bill_Of_Materilas_pending_Approvels.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bill_Of_Materilas_pending_Approvels.setFocusPainted(false);
        jPanel1.add(Bill_Of_Materilas_pending_Approvels, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        Product_GRN.setBackground(new java.awt.Color(255, 255, 255));
        Product_GRN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Product_GRN.setForeground(new java.awt.Color(41, 128, 185));
        Product_GRN.setText("Product GRN");
        Product_GRN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Product_GRN.setFocusPainted(false);
        jPanel1.add(Product_GRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        Reports_Preweew.setBackground(new java.awt.Color(255, 255, 255));
        Reports_Preweew.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Reports_Preweew.setForeground(new java.awt.Color(41, 128, 185));
        Reports_Preweew.setText("Reports");
        Reports_Preweew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Reports_Preweew.setFocusPainted(false);
        jPanel1.add(Reports_Preweew, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, -1, 20));

        Advise_of_Dispatch_New_AOD.setBackground(new java.awt.Color(255, 255, 255));
        Advise_of_Dispatch_New_AOD.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Advise_of_Dispatch_New_AOD.setText("New AOD");
        Advise_of_Dispatch_New_AOD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Advise_of_Dispatch_New_AOD.setFocusPainted(false);
        jPanel1.add(Advise_of_Dispatch_New_AOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        Advise_of_Dispatch_Printing.setBackground(new java.awt.Color(255, 255, 255));
        Advise_of_Dispatch_Printing.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Advise_of_Dispatch_Printing.setText("Printing");
        Advise_of_Dispatch_Printing.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Advise_of_Dispatch_Printing.setFocusPainted(false);
        jPanel1.add(Advise_of_Dispatch_Printing, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));

        Dispatch_Note.setBackground(new java.awt.Color(255, 255, 255));
        Dispatch_Note.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Dispatch_Note.setForeground(new java.awt.Color(41, 128, 185));
        Dispatch_Note.setText("Dispatch Note");
        Dispatch_Note.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Dispatch_Note.setFocusPainted(false);
        jPanel1.add(Dispatch_Note, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        Sales_Returns.setBackground(new java.awt.Color(255, 255, 255));
        Sales_Returns.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Sales_Returns.setForeground(new java.awt.Color(41, 128, 185));
        Sales_Returns.setText("Sales Returns");
        Sales_Returns.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sales_Returns.setFocusPainted(false);
        Sales_Returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sales_ReturnsActionPerformed(evt);
            }
        });
        jPanel1.add(Sales_Returns, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));

        Reports_Preweew_Finance.setBackground(new java.awt.Color(255, 255, 255));
        Reports_Preweew_Finance.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Reports_Preweew_Finance.setForeground(new java.awt.Color(41, 128, 185));
        Reports_Preweew_Finance.setText("Reports");
        Reports_Preweew_Finance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Reports_Preweew_Finance.setFocusPainted(false);
        Reports_Preweew_Finance.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jPanel1.add(Reports_Preweew_Finance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 250, -1, 20));

        Reports_Preweew_Sales.setBackground(new java.awt.Color(255, 255, 255));
        Reports_Preweew_Sales.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Reports_Preweew_Sales.setForeground(new java.awt.Color(41, 128, 185));
        Reports_Preweew_Sales.setText("Reports");
        Reports_Preweew_Sales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Reports_Preweew_Sales.setFocusPainted(false);
        jPanel1.add(Reports_Preweew_Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, -1, 20));

        Purchasing_Reports_Preweew.setBackground(new java.awt.Color(255, 255, 255));
        Purchasing_Reports_Preweew.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Purchasing_Reports_Preweew.setForeground(new java.awt.Color(41, 128, 185));
        Purchasing_Reports_Preweew.setText("Reports");
        Purchasing_Reports_Preweew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Purchasing_Reports_Preweew.setFocusPainted(false);
        jPanel1.add(Purchasing_Reports_Preweew, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, 20));

        btn_Save.setBackground(new java.awt.Color(41, 128, 185));
        btn_Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        jPanel1.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 700, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizeActionPerformed
        this.setState(Main_menu.ICONIFIED);
    }//GEN-LAST:event_btn_MinimizeActionPerformed

    private void Finance_DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finance_DepartmentActionPerformed
        if (Finance_Department.isSelected()) {
            Add_Journals.setEnabled(true);
            Ledger_Accounts.setEnabled(true);
            Discounts_Offers.setEnabled(true);
            Reports_Preweew_Finance.setEnabled(true);
        } else {

            Add_Journals.setEnabled(false);
            Ledger_Accounts.setEnabled(false);
            Reports_Preweew_Finance.setEnabled(false);
            Discounts_Offers.setEnabled(false);
        }
    }//GEN-LAST:event_Finance_DepartmentActionPerformed

    private void Advise_of_DispatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Advise_of_DispatchActionPerformed
        if (Advise_of_Dispatch.isSelected()) {
            Advise_of_Dispatch_New_AOD.setEnabled(true);
            Advise_of_Dispatch_Pending_AOD.setEnabled(true);
            Advise_of_Dispatch_Printing.setEnabled(true);
        } else {
            Advise_of_Dispatch_New_AOD.setEnabled(false);
            Advise_of_Dispatch_Pending_AOD.setEnabled(false);
            Advise_of_Dispatch_Printing.setEnabled(false);
        }
    }//GEN-LAST:event_Advise_of_DispatchActionPerformed

    private void hr_departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hr_departmentActionPerformed
        if (hr_department.isSelected()) {
            employeeRegistration.setEnabled(true);
            attendanceManagement.setEnabled(true);
            payrollManagement.setEnabled(true);
            departmentSections.setEnabled(true);
            reports.setEnabled(true);
            users.setEnabled(true);

        } else {
            employeeRegistration.setEnabled(false);
            attendanceManagement.setEnabled(false);
            attendanace_Save.setEnabled(false);
            attendanace_Print.setEnabled(false);
            payrollManagement.setEnabled(false);
            departmentSections.setEnabled(false);
            reports.setEnabled(false);
            users.setEnabled(false);
        }
    }//GEN-LAST:event_hr_departmentActionPerformed

    private void Production_DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Production_DepartmentActionPerformed
        if (Production_Department.isSelected()) {
            Products_Details.setEnabled(true);
            Raw_Materials.setEnabled(true);
            Product_Item_Stock.setEnabled(true);
            Bill_Of_Materilas.setEnabled(true);
            Product_GRN.setEnabled(true);
            Raw_materials_GRN.setEnabled(true);
            Raw_Cost_Per_Product.setEnabled(true);
            Reports_Preweew.setEnabled(true);

        } else {
            Products_Details.setEnabled(false);
            Products_Details_Add_Brand.setEnabled(false);
            Products_Details_Add_Category.setEnabled(false);
            Products_Details_Add_Product.setEnabled(false);
            Products_Details_Export_Pro.setEnabled(false);
            Export_Raw.setEnabled(false);
            Add_New_Item_Raw.setEnabled(false);
            Raw_Materials.setEnabled(false);
            Product_Item_Stock.setEnabled(false);
            Product_Item_Stock_Export.setEnabled(false);
            Bill_Of_Materilas.setEnabled(false);
            Bill_Of_Materilas_New_Bom.setEnabled(false);
            Bill_Of_Materilas_pending_Approvels.setEnabled(false);
            Product_GRN.setEnabled(false);
            Raw_materials_GRN.setEnabled(false);
            Raw_Cost_Per_Product.setEnabled(false);
            Raw_Cost_Per_Product_Edit.setEnabled(false);
            Reports_Preweew.setEnabled(false);
        }
    }//GEN-LAST:event_Production_DepartmentActionPerformed

    private void Sales_ReturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sales_ReturnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sales_ReturnsActionPerformed

    private void Sales_MarketingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sales_MarketingActionPerformed
        if (Sales_Marketing.isSelected()) {
            Dashboard.setEnabled(true);
            Customer_Registation.setEnabled(true);
            Advise_of_Dispatch.setEnabled(true);
            Customer_History.setEnabled(true);
            Payment_Receipts.setEnabled(true);
            Dispatch_Note.setEnabled(true);
            Sales_Returns.setEnabled(true);
            Credit_Notes.setEnabled(true);
            Reports_Preweew_Sales.setEnabled(true);

        } else {
            Dashboard.setEnabled(false);
            Customer_Registation.setEnabled(false);
            Advise_of_Dispatch.setEnabled(false);
            Advise_of_Dispatch_New_AOD.setEnabled(false);
            Advise_of_Dispatch_Pending_AOD.setEnabled(false);
            Advise_of_Dispatch_Printing.setEnabled(false);
            Customer_History.setEnabled(false);
            Payment_Receipts.setEnabled(false);
            Dispatch_Note.setEnabled(false);
            Sales_Returns.setEnabled(false);
            Credit_Notes.setEnabled(false);
            Reports_Preweew_Sales.setEnabled(false);
        }
    }//GEN-LAST:event_Sales_MarketingActionPerformed

    private void Purchasing_DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchasing_DepartmentActionPerformed
        if (Purchasing_Department.isSelected()) {
            Suppliers_Registartion.setEnabled(true);
            Supplier_Paymets.setEnabled(true);
            Sales_Commission.setEnabled(true);
            Item_Movement.setEnabled(true);
            Purchasing_Reports_Preweew.setEnabled(true);

        } else {
            Suppliers_Registartion.setEnabled(false);
            Supplier_Paymets.setEnabled(false);
            Sales_Commission.setEnabled(false);
            Item_Movement.setEnabled(false);
            Purchasing_Reports_Preweew.setEnabled(false);
        }
    }//GEN-LAST:event_Purchasing_DepartmentActionPerformed

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

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        if (JOptionPane.showConfirmDialog(this, "You want to do this?") == 0) {
            if (hr_department.isSelected()) {
                int employeeReg;
                int attendance;
                int attendanceSave;
                int attendancePrint;
                int payroll;
                int section;
                int report;
                int userss;

                if (employeeRegistration.isSelected()) {
                    employeeReg = 1;
                } else {
                    employeeReg = 0;
                }
                if (attendanceManagement.isSelected()) {
                    attendance = 1;
                } else {
                    attendance = 0;
                }
                if (payrollManagement.isSelected()) {
                    payroll = 1;
                } else {
                    payroll = 0;
                }
                if (attendanace_Save.isSelected()) {
                    attendanceSave = 1;
                } else {
                    attendanceSave = 0;
                }
                if (attendanace_Save.isSelected()) {
                    attendanceSave = 1;
                } else {
                    attendanceSave = 0;
                }
                if (attendanace_Print.isSelected()) {
                    attendancePrint = 1;
                } else {
                    attendancePrint = 0;
                }
                if (departmentSections.isSelected()) {
                    section = 1;
                } else {
                    section = 0;
                }
                if (reports.isSelected()) {
                    report = 1;
                } else {
                    report = 0;
                }
                if (users.isSelected()) {
                    userss = 1;
                } else {
                    userss = 0;
                }

                try {
                    DB.iud("INSERT INTO privilege_hr_department (username, employee_registration, attendance_management, attendance_management_save, attendance_management_print, payroll, department_sections, reports, user_management)"
                            + " VALUES('" + user + "', '" + employeeReg + "', '" + attendance + "', '" + attendanceSave + "', '" + attendancePrint + "', '" + payroll + "', '" + section + "', '" + report + "', '" + userss + "')");

                } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
                    try {
                        DB.iud("UPDATE privilege_hr_department SET employee_registration='" + employeeReg + "', attendance_management='" + attendance + "', attendance_management_save='" + attendanceSave + "', attendance_management_print='" + attendancePrint + "', "
                                + "payroll='" + payroll + "', department_sections='" + section + "', reports='" + report + "', user_management='" + userss + "' WHERE username='" + user + "' ");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            if (Production_Department.isSelected()) {

                int ProductsDetails;
                int Products_DetailsExport;
                int Products_DetailsAddBrand;
                int Products_DetailsAddCategory;
                int Products_DetailsAddProduct;
                int RawMaterials;
                int ExportRaw;
                int Add_NewItemRaw;
                int ProductItemStock;
                int Product_ItemStockExport;
                int BillOfMaterilas;
                int BOM_pendingApprovels;
                int BOM_New;
                int ProductGRN;
                int Raw_materialsGRN;
                int Raw_CostPerProduct;
                int Reports;

                if (Products_Details.isSelected()) {
                    ProductsDetails = 1;
                } else {
                    ProductsDetails = 0;
                }
                if (Products_Details_Export_Pro.isSelected()) {
                    Products_DetailsExport = 1;
                } else {
                    Products_DetailsExport = 0;
                }
                if (Products_Details_Add_Brand.isSelected()) {
                    Products_DetailsAddBrand = 1;
                } else {
                    Products_DetailsAddBrand = 0;
                }
                if (Products_Details_Add_Category.isSelected()) {
                    Products_DetailsAddCategory = 1;
                } else {
                    Products_DetailsAddCategory = 0;
                }
                if (Products_Details_Add_Product.isSelected()) {
                    Products_DetailsAddProduct = 1;
                } else {
                    Products_DetailsAddProduct = 0;
                }
                if (Raw_Materials.isSelected()) {
                    RawMaterials = 1;
                } else {
                    RawMaterials = 0;
                }
                if (Export_Raw.isSelected()) {
                    ExportRaw = 1;
                } else {
                    ExportRaw = 0;
                }
                if (Add_New_Item_Raw.isSelected()) {
                    Add_NewItemRaw = 1;
                } else {
                    Add_NewItemRaw = 0;
                }
                if (Product_Item_Stock.isSelected()) {
                    ProductItemStock = 1;
                } else {
                    ProductItemStock = 0;
                }
                if (Product_Item_Stock_Export.isSelected()) {
                    Product_ItemStockExport = 1;
                } else {
                    Product_ItemStockExport = 0;
                }
                if (Bill_Of_Materilas.isSelected()) {
                    BillOfMaterilas = 1;
                } else {
                    BillOfMaterilas = 0;
                }
                if (Bill_Of_Materilas_pending_Approvels.isSelected()) {
                    BOM_pendingApprovels = 1;
                } else {
                    BOM_pendingApprovels = 0;
                }
                if (Bill_Of_Materilas_New_Bom.isSelected()) {
                    BOM_New = 1;
                } else {
                    BOM_New = 0;
                }
                if (Product_GRN.isSelected()) {
                    ProductGRN = 1;
                } else {
                    ProductGRN = 0;
                }
                if (Raw_materials_GRN.isSelected()) {
                    Raw_materialsGRN = 1;
                } else {
                    Raw_materialsGRN = 0;
                }
                if (Raw_Cost_Per_Product.isSelected()) {
                    Raw_CostPerProduct = 1;
                } else {
                    Raw_CostPerProduct = 0;
                }
                if (Reports_Preweew.isSelected()) {
                    Reports = 1;
                } else {
                    Reports = 0;
                }

                try {
                    DB.iud("INSERT INTO privilege_production_department (username, product_details, product_details_export, product_details_addbrand, product_details_addcategory, product_details_addproduct, raw_materials, raw_materials_add, raw_materials_export, product_stock, product_stock_export, bom, bom_pending, bom_addnew, grn_product, grn_raw, raw_cost_perproduct, report) "
                            + "VALUES('" + user + "', '" + ProductsDetails + "', '" + Products_DetailsExport + "', '" + Products_DetailsAddBrand + "', '" + Products_DetailsAddCategory + "', '" + Products_DetailsAddProduct + "', '" + RawMaterials + "', '" + Add_NewItemRaw + "', '" + ExportRaw + "', '" + ProductItemStock + "', '" + Product_ItemStockExport + "', '" + BillOfMaterilas + "', '" + BOM_pendingApprovels + "', '" + BOM_New + "', '" + ProductGRN + "', '" + Raw_materialsGRN + "', '" + Raw_CostPerProduct + "', '" + Reports + "') ");

                } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
                    try {
                        DB.iud("UPDATE privilege_production_department SET product_details='" + ProductsDetails + "', product_details_export='" + Products_DetailsExport + "', product_details_addbrand='" + Products_DetailsAddBrand + "', product_details_addcategory='" + Products_DetailsAddCategory + "', product_details_addproduct='" + Products_DetailsAddProduct + "', raw_materials='" + RawMaterials + "', raw_materials_add='" + Add_NewItemRaw + "', raw_materials_export='" + ExportRaw + "', product_stock='" + ProductItemStock + "', product_stock_export='" + Product_ItemStockExport + "', bom='" + BillOfMaterilas + "', bom_pending='" + BOM_pendingApprovels + "', bom_addnew='" + BOM_New + "', grn_product='" + ProductGRN + "', grn_raw='" + Raw_materialsGRN + "', raw_cost_perproduct='" + Raw_CostPerProduct + "', report='" + Reports + "' WHERE  username='" + user + "'");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            if (Sales_Marketing.isSelected()) {
                int dashboard;
                int customer_registration;
                int aod;
                int new_aod;
                int aod_approve;
                int aod_print;
                int customer_history;
                int payment_receipt;
                int dispatch_note;
                int sales_return;
                int credit_note;
                int report;

                if (Dashboard.isSelected()) {
                    dashboard = 1;
                } else {
                    dashboard = 0;
                }
                if (Customer_Registation.isSelected()) {
                    customer_registration = 1;
                } else {
                    customer_registration = 0;
                }
                if (Advise_of_Dispatch.isSelected()) {
                    aod = 1;
                } else {
                    aod = 0;
                }
                if (Advise_of_Dispatch_Printing.isSelected()) {
                    aod_print = 1;
                } else {
                    aod_print = 0;
                }
                if (Advise_of_Dispatch_Pending_AOD.isSelected()) {
                    aod_approve = 1;
                } else {
                    aod_approve = 0;
                }
                if (Advise_of_Dispatch_New_AOD.isSelected()) {
                    new_aod = 1;
                } else {
                    new_aod = 0;
                }
                if (Customer_History.isSelected()) {
                    customer_history = 1;
                } else {
                    customer_history = 0;
                }
                if (Payment_Receipts.isSelected()) {
                    payment_receipt = 1;
                } else {
                    payment_receipt = 0;
                }
                if (Dispatch_Note.isSelected()) {
                    dispatch_note = 1;
                } else {
                    dispatch_note = 0;
                }
                if (Sales_Returns.isSelected()) {
                    sales_return = 1;
                } else {
                    sales_return = 0;
                }
                if (Credit_Notes.isSelected()) {
                    credit_note = 1;
                } else {
                    credit_note = 0;
                }
                if (Reports_Preweew_Sales.isSelected()) {
                    report = 1;
                } else {
                    report = 0;
                }

                try {
                    DB.iud("INSERT INTO privilege_salesmarketing (username, dashboard, customer_registration, aod, new_aod, aod_approve, aod_print, customer_history, payment_receipt, dispatch_note, sales_return, credit_note, report)"
                            + " VALUES('" + user + "', '" + dashboard + "', '" + customer_registration + "', '" + aod + "', '" + new_aod + "', '" + aod_approve + "', '" + aod_print + "', '" + customer_history + "', '" + payment_receipt + "', '" + dispatch_note + "', '" + sales_return + "', '" + credit_note + "', '" + report + "')");

                } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
                    try {
                        DB.iud("UPDATE privilege_salesmarketing SET dashboard='" + dashboard + "', customer_registration='" + customer_registration + "', aod='" + aod + "', new_aod='" + new_aod + "', aod_approve='" + aod_approve + "', aod_print='" + aod_print + "', customer_history='" + customer_history + "', payment_receipt='" + payment_receipt + "', dispatch_note='" + dispatch_note + "', sales_return='" + sales_return + "', credit_note='" + credit_note + "', report='" + report + "' WHERE  username='" + user + "'");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            if (Purchasing_Department.isSelected()) {
                int SuppliersRegistartion;
                int SupplierPaymets;
                int SalesCommission;
                int ItemMovement;
                int PurchasingReports;

                if (Suppliers_Registartion.isSelected()) {
                    SuppliersRegistartion = 1;
                } else {
                    SuppliersRegistartion = 0;
                }
                if (Supplier_Paymets.isSelected()) {
                    SupplierPaymets = 1;
                } else {
                    SupplierPaymets = 0;
                }
                if (Sales_Commission.isSelected()) {
                    SalesCommission = 1;
                } else {
                    SalesCommission = 0;
                }
                if (Item_Movement.isSelected()) {
                    ItemMovement = 1;
                } else {
                    ItemMovement = 0;
                }
                if (Purchasing_Reports_Preweew.isSelected()) {
                    PurchasingReports = 1;
                } else {
                    PurchasingReports = 0;
                }

                try {
                    DB.iud("INSERT INTO central_insdustries.privilege_purchasing (username, supplier_reg, supplier_payment, sales_commission, item_movement, report)"
                            + " VALUES('" + user + "', '" + SuppliersRegistartion + "', '" + SupplierPaymets + "', '" + SalesCommission + "', '" + ItemMovement + "', '" + PurchasingReports + "')");

                } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException ex) {
                    try {
                        DB.iud("UPDATE privilege_purchasing SET supplier_reg='" + SuppliersRegistartion + "', supplier_payment='" + SupplierPaymets + "', sales_commission='" + SalesCommission + "', item_movement='" + ItemMovement + "', report='" + PurchasingReports + "' WHERE username='" + user + "'");

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            if (Finance_Department.isSelected()) {
                int AddJournals;
                int LedgerAccounts;
                int DiscountsOffers;
                int Reports_Finance;

                if (Add_Journals.isSelected()) {
                    AddJournals = 1;
                } else {
                    AddJournals = 0;
                }
                if (Ledger_Accounts.isSelected()) {
                    LedgerAccounts = 1;
                } else {
                    LedgerAccounts = 0;
                }
                if (Discounts_Offers.isSelected()) {
                    DiscountsOffers = 1;
                } else {
                    DiscountsOffers = 0;
                }
                if (Reports_Preweew_Finance.isSelected()) {
                    Reports_Finance = 1;
                } else {
                    Reports_Finance = 0;
                }

                try {
                    DB.iud("INSERT INTO privilege_finance (username, add_journal, ledger_accounts, discounts_offers, reports) "
                            + "VALUES ('" + user + "', '" + AddJournals + "', '" + LedgerAccounts + "', '" + DiscountsOffers + "', '" + Reports_Finance + "') ");

                } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException ex) {
                    try {
                        DB.iud("UPDATE privilege_finance SET add_journal='" + AddJournals + "', ledger_accounts='" + LedgerAccounts + "', discounts_offers='" + DiscountsOffers + "', reports='" + Reports_Finance + "' WHERE username='" + user + "'");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            new Save().setVisible(true);
        }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void attendanceManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceManagementActionPerformed
        if (attendanceManagement.isSelected()) {
            attendanace_Save.setEnabled(true);
            attendanace_Print.setEnabled(true);
        } else {
            attendanace_Save.setEnabled(false);
            attendanace_Print.setEnabled(false);
        }
    }//GEN-LAST:event_attendanceManagementActionPerformed

    private void Products_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Products_DetailsActionPerformed
        if (Products_Details.isSelected()) {
            Products_Details_Add_Brand.setEnabled(true);
            Products_Details_Add_Category.setEnabled(true);
            Products_Details_Add_Product.setEnabled(true);
            Products_Details_Export_Pro.setEnabled(true);
        } else {
            Products_Details_Add_Brand.setEnabled(false);
            Products_Details_Add_Category.setEnabled(false);
            Products_Details_Add_Product.setEnabled(false);
            Products_Details_Export_Pro.setEnabled(false);
        }
    }//GEN-LAST:event_Products_DetailsActionPerformed

    private void Raw_MaterialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Raw_MaterialsActionPerformed
        if (Raw_Materials.isSelected()) {
            Export_Raw.setEnabled(true);
            Add_New_Item_Raw.setEnabled(true);
        } else {
            Export_Raw.setEnabled(false);
            Add_New_Item_Raw.setEnabled(false);
        }
    }//GEN-LAST:event_Raw_MaterialsActionPerformed

    private void Product_Item_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_Item_StockActionPerformed
        if (Product_Item_Stock.isSelected()) {
            Product_Item_Stock_Export.setEnabled(true);
        } else {
            Product_Item_Stock_Export.setEnabled(false);
        }
    }//GEN-LAST:event_Product_Item_StockActionPerformed

    private void Bill_Of_MaterilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bill_Of_MaterilasActionPerformed
        if (Bill_Of_Materilas.isSelected()) {
            Bill_Of_Materilas_New_Bom.setEnabled(true);
            Bill_Of_Materilas_pending_Approvels.setEnabled(true);
        } else {
            Bill_Of_Materilas_New_Bom.setEnabled(false);
            Bill_Of_Materilas_pending_Approvels.setEnabled(false);
        }
    }//GEN-LAST:event_Bill_Of_MaterilasActionPerformed

    private void Raw_Cost_Per_ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Raw_Cost_Per_ProductActionPerformed
        if (Raw_Cost_Per_Product.isSelected()) {
            Raw_Cost_Per_Product_Edit.setEnabled(true);
        } else {
            Raw_Cost_Per_Product_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_Raw_Cost_Per_ProductActionPerformed

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
            java.util.logging.Logger.getLogger(User_Privileges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Privileges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Privileges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Privileges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Privileges().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Add_Journals;
    private javax.swing.JCheckBox Add_New_Item_Raw;
    private javax.swing.JCheckBox Advise_of_Dispatch;
    private javax.swing.JCheckBox Advise_of_Dispatch_New_AOD;
    private javax.swing.JCheckBox Advise_of_Dispatch_Pending_AOD;
    private javax.swing.JCheckBox Advise_of_Dispatch_Printing;
    private javax.swing.JCheckBox Bill_Of_Materilas;
    private javax.swing.JCheckBox Bill_Of_Materilas_New_Bom;
    private javax.swing.JCheckBox Bill_Of_Materilas_pending_Approvels;
    private javax.swing.JCheckBox Credit_Notes;
    private javax.swing.JCheckBox Customer_History;
    private javax.swing.JCheckBox Customer_Registation;
    private javax.swing.JCheckBox Dashboard;
    private javax.swing.JCheckBox Discounts_Offers;
    private javax.swing.JCheckBox Dispatch_Note;
    private javax.swing.JCheckBox Export_Raw;
    private javax.swing.JCheckBox Finance_Department;
    private javax.swing.JCheckBox Item_Movement;
    private javax.swing.JCheckBox Ledger_Accounts;
    private javax.swing.JCheckBox Payment_Receipts;
    private javax.swing.JCheckBox Product_GRN;
    private javax.swing.JCheckBox Product_Item_Stock;
    private javax.swing.JCheckBox Product_Item_Stock_Export;
    private javax.swing.JCheckBox Production_Department;
    private javax.swing.JCheckBox Products_Details;
    private javax.swing.JCheckBox Products_Details_Add_Brand;
    private javax.swing.JCheckBox Products_Details_Add_Category;
    private javax.swing.JCheckBox Products_Details_Add_Product;
    private javax.swing.JCheckBox Products_Details_Export_Pro;
    private javax.swing.JCheckBox Purchasing_Department;
    private javax.swing.JCheckBox Purchasing_Reports_Preweew;
    private javax.swing.JCheckBox Raw_Cost_Per_Product;
    private javax.swing.JCheckBox Raw_Cost_Per_Product_Edit;
    private javax.swing.JCheckBox Raw_Materials;
    private javax.swing.JCheckBox Raw_materials_GRN;
    private javax.swing.JCheckBox Reports_Preweew;
    private javax.swing.JCheckBox Reports_Preweew_Finance;
    private javax.swing.JCheckBox Reports_Preweew_Sales;
    private javax.swing.JCheckBox Sales_Commission;
    private javax.swing.JCheckBox Sales_Marketing;
    private javax.swing.JCheckBox Sales_Returns;
    private javax.swing.JCheckBox Supplier_Paymets;
    private javax.swing.JCheckBox Suppliers_Registartion;
    private javax.swing.JCheckBox attendanace_Print;
    private javax.swing.JCheckBox attendanace_Save;
    private javax.swing.JCheckBox attendanceManagement;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Minimize;
    private javax.swing.JButton btn_Save;
    private javax.swing.JCheckBox departmentSections;
    private javax.swing.JCheckBox employeeRegistration;
    private javax.swing.JCheckBox hr_department;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JCheckBox payrollManagement;
    private javax.swing.JCheckBox reports;
    private javax.swing.JCheckBox users;
    // End of variables declaration//GEN-END:variables

    private void viewData_HR_Department() {

        employeeRegistration.setEnabled(false);
        attendanceManagement.setEnabled(false);
        attendanace_Save.setEnabled(false);
        attendanace_Print.setEnabled(false);
        payrollManagement.setEnabled(false);
        departmentSections.setEnabled(false);
        reports.setEnabled(false);
        users.setEnabled(false);

    }

    private void viewData_Production_Department() {
        Products_Details.setEnabled(false);
        Products_Details_Add_Brand.setEnabled(false);
        Products_Details_Add_Category.setEnabled(false);
        Products_Details_Add_Product.setEnabled(false);
        Products_Details_Export_Pro.setEnabled(false);
        Export_Raw.setEnabled(false);
        Add_New_Item_Raw.setEnabled(false);
        Raw_Materials.setEnabled(false);

        Product_Item_Stock.setEnabled(false);
        Product_Item_Stock_Export.setEnabled(false);
        Bill_Of_Materilas.setEnabled(false);
        Bill_Of_Materilas_New_Bom.setEnabled(false);
        Bill_Of_Materilas_pending_Approvels.setEnabled(false);
        Product_GRN.setEnabled(false);
        Raw_materials_GRN.setEnabled(false);
        Raw_Cost_Per_Product.setEnabled(false);
        Raw_Cost_Per_Product_Edit.setEnabled(false);
        Reports_Preweew.setEnabled(false);

    }

    private void viewData_Sales_Marketing() {
        Dashboard.setEnabled(false);
        Customer_Registation.setEnabled(false);
        Advise_of_Dispatch.setEnabled(false);
        Advise_of_Dispatch_New_AOD.setEnabled(false);
        Advise_of_Dispatch_Pending_AOD.setEnabled(false);
        Advise_of_Dispatch_Printing.setEnabled(false);
        Customer_History.setEnabled(false);
        Payment_Receipts.setEnabled(false);
        Dispatch_Note.setEnabled(false);
        Sales_Returns.setEnabled(false);
        Credit_Notes.setEnabled(false);
        Reports_Preweew_Sales.setEnabled(false);
    }

    private void viewData_Purchasing_Department() {
        Suppliers_Registartion.setEnabled(false);
        Supplier_Paymets.setEnabled(false);
        Sales_Commission.setEnabled(false);
        Item_Movement.setEnabled(false);
        Purchasing_Reports_Preweew.setEnabled(false);

    }

    private void viewData_Finance_Department() {
        Add_Journals.setEnabled(false);
        Ledger_Accounts.setEnabled(false);
        Reports_Preweew_Finance.setEnabled(false);
        Discounts_Offers.setEnabled(false);

    }

}
