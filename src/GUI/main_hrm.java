package GUI;

import Database.DB;
import Model.Access_Denied;
import java.awt.Color;
import java.sql.ResultSet;
import static javax.swing.BorderFactory.createMatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class main_hrm extends javax.swing.JFrame {

    Main_menu menu;
    int access;

    public main_hrm() {
        initComponents();
        setPrivilages();
    }

    public main_hrm(Main_menu aThis) {
        this();
        this.menu = aThis;
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
        btn_employee_reg = new javax.swing.JButton();
        btn_attendance = new javax.swing.JButton();
        btn_payroll = new javax.swing.JButton();
        btn_section = new javax.swing.JButton();
        btn_emp_details = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_reports = new javax.swing.JButton();
        btn_assign_salary = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_users = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_employee_reg.setBackground(new java.awt.Color(255, 255, 255));
        btn_employee_reg.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_employee_reg.setText("     Employee Registartion");
        btn_employee_reg.setBorder(null);
        btn_employee_reg.setContentAreaFilled(false);
        btn_employee_reg.setFocusPainted(false);
        btn_employee_reg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_employee_reg.setIconTextGap(25);
        btn_employee_reg.setOpaque(true);
        btn_employee_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_employee_regMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_employee_regMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_employee_regMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_employee_regMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_employee_regMouseReleased(evt);
            }
        });
        btn_employee_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_employee_regActionPerformed(evt);
            }
        });
        jPanel1.add(btn_employee_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 50));

        btn_attendance.setBackground(new java.awt.Color(255, 255, 255));
        btn_attendance.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_attendance.setText("     Attendance");
        btn_attendance.setBorder(null);
        btn_attendance.setContentAreaFilled(false);
        btn_attendance.setFocusPainted(false);
        btn_attendance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_attendance.setIconTextGap(25);
        btn_attendance.setMargin(new java.awt.Insets(2, 25, 2, 14));
        btn_attendance.setOpaque(true);
        btn_attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_attendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_attendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_attendanceMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_attendanceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_attendanceMouseReleased(evt);
            }
        });
        btn_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attendanceActionPerformed(evt);
            }
        });
        jPanel1.add(btn_attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, 50));

        btn_payroll.setBackground(new java.awt.Color(255, 255, 255));
        btn_payroll.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_payroll.setText("     Payroll Management");
        btn_payroll.setBorder(null);
        btn_payroll.setContentAreaFilled(false);
        btn_payroll.setFocusPainted(false);
        btn_payroll.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_payroll.setIconTextGap(25);
        btn_payroll.setMargin(new java.awt.Insets(2, 25, 2, 14));
        btn_payroll.setOpaque(true);
        btn_payroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_payrollMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_payrollMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_payrollMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_payrollMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_payrollMouseReleased(evt);
            }
        });
        btn_payroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payrollActionPerformed(evt);
            }
        });
        jPanel1.add(btn_payroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 50));

        btn_section.setBackground(new java.awt.Color(255, 255, 255));
        btn_section.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_section.setText("     Sections");
        btn_section.setBorder(null);
        btn_section.setContentAreaFilled(false);
        btn_section.setFocusPainted(false);
        btn_section.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_section.setIconTextGap(25);
        btn_section.setMargin(new java.awt.Insets(2, 25, 2, 14));
        btn_section.setOpaque(true);
        btn_section.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sectionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_sectionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_sectionMouseReleased(evt);
            }
        });
        btn_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sectionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, 50));

        btn_emp_details.setBackground(new java.awt.Color(255, 255, 255));
        btn_emp_details.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_emp_details.setText("     Employee Details");
        btn_emp_details.setBorder(null);
        btn_emp_details.setContentAreaFilled(false);
        btn_emp_details.setFocusPainted(false);
        btn_emp_details.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_emp_details.setIconTextGap(25);
        btn_emp_details.setMargin(new java.awt.Insets(2, 25, 2, 14));
        btn_emp_details.setOpaque(true);
        btn_emp_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_emp_detailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_emp_detailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_emp_detailsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_emp_detailsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_emp_detailsMouseReleased(evt);
            }
        });
        btn_emp_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emp_detailsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_emp_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 547, 181, 10));

        btn_reports.setBackground(new java.awt.Color(255, 255, 255));
        btn_reports.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_reports.setText("     Reports");
        btn_reports.setBorder(null);
        btn_reports.setContentAreaFilled(false);
        btn_reports.setFocusPainted(false);
        btn_reports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_reports.setIconTextGap(25);
        btn_reports.setMargin(new java.awt.Insets(2, 25, 2, 14));
        btn_reports.setOpaque(true);
        btn_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reportsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_reportsMouseReleased(evt);
            }
        });
        btn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 220, 50));

        btn_assign_salary.setBackground(new java.awt.Color(255, 255, 255));
        btn_assign_salary.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_assign_salary.setText("     Assign salary");
        btn_assign_salary.setBorder(null);
        btn_assign_salary.setContentAreaFilled(false);
        btn_assign_salary.setFocusPainted(false);
        btn_assign_salary.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_assign_salary.setIconTextGap(25);
        btn_assign_salary.setMargin(new java.awt.Insets(2, 25, 2, 14));
        btn_assign_salary.setOpaque(true);
        btn_assign_salary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_assign_salaryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_assign_salaryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_assign_salaryMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_assign_salaryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_assign_salaryMouseReleased(evt);
            }
        });
        btn_assign_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_assign_salaryActionPerformed(evt);
            }
        });
        jPanel1.add(btn_assign_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, 50));

        jLabel1.setFont(new java.awt.Font("BankGothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Human  resource");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        btn_users.setBackground(new java.awt.Color(255, 255, 255));
        btn_users.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        btn_users.setText("     Users");
        btn_users.setBorder(null);
        btn_users.setContentAreaFilled(false);
        btn_users.setFocusPainted(false);
        btn_users.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_users.setIconTextGap(25);
        btn_users.setMargin(new java.awt.Insets(2, 25, 2, 14));
        btn_users.setOpaque(true);
        btn_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_usersMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_usersMouseReleased(evt);
            }
        });
        btn_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usersActionPerformed(evt);
            }
        });
        jPanel1.add(btn_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_employee_regMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_employee_regMouseEntered
        btn_employee_reg.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_employee_regMouseEntered

    private void btn_employee_regMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_employee_regMouseExited
        btn_employee_reg.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_employee_regMouseExited

    private void btn_employee_regMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_employee_regMousePressed
        btn_employee_reg.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_employee_regMousePressed

    private void btn_employee_regMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_employee_regMouseReleased
        btn_employee_reg.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_employee_regMouseReleased

    private void btn_attendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_attendanceMouseEntered
        btn_attendance.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_attendanceMouseEntered

    private void btn_attendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_attendanceMouseExited
        btn_attendance.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_attendanceMouseExited

    private void btn_attendanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_attendanceMousePressed
        btn_attendance.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_attendanceMousePressed

    private void btn_attendanceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_attendanceMouseReleased
        btn_attendance.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_attendanceMouseReleased

    private void btn_payrollMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payrollMouseEntered
        btn_payroll.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_payrollMouseEntered

    private void btn_payrollMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payrollMouseExited
        btn_payroll.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_payrollMouseExited

    private void btn_payrollMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payrollMousePressed
        btn_payroll.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_payrollMousePressed

    private void btn_payrollMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payrollMouseReleased
        btn_payroll.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_payrollMouseReleased

    private void btn_sectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sectionMouseEntered
        btn_section.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_sectionMouseEntered

    private void btn_sectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sectionMouseExited
        btn_section.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_sectionMouseExited

    private void btn_sectionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sectionMousePressed
        btn_section.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_sectionMousePressed

    private void btn_sectionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sectionMouseReleased
        btn_section.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_sectionMouseReleased

    private void btn_emp_detailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_emp_detailsMouseEntered
        btn_emp_details.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_emp_detailsMouseEntered

    private void btn_emp_detailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_emp_detailsMouseExited
        btn_emp_details.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_emp_detailsMouseExited

    private void btn_emp_detailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_emp_detailsMousePressed
        btn_emp_details.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_emp_detailsMousePressed

    private void btn_emp_detailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_emp_detailsMouseReleased
        btn_emp_details.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_emp_detailsMouseReleased

    private void btn_reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseEntered
        btn_reports.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_reportsMouseEntered

    private void btn_reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseExited
        btn_reports.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_reportsMouseExited

    private void btn_reportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMousePressed
        btn_reports.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_reportsMousePressed

    private void btn_reportsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseReleased
        btn_reports.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_reportsMouseReleased

    private void btn_assign_salaryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_assign_salaryMouseEntered
        btn_assign_salary.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_assign_salaryMouseEntered

    private void btn_assign_salaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_assign_salaryMouseExited
        btn_assign_salary.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_assign_salaryMouseExited

    private void btn_assign_salaryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_assign_salaryMousePressed
        btn_assign_salary.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_assign_salaryMousePressed

    private void btn_assign_salaryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_assign_salaryMouseReleased
        btn_assign_salary.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_assign_salaryMouseReleased

    private void btn_employee_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_employee_regActionPerformed

        if (true) {
            Employee_Reg e = new Employee_Reg();
            menu.jPanel3.removeAll();
            menu.jPanel3.revalidate();
            menu.jPanel3.repaint();
            menu.jPanel3.add((JPanel) e.jPanel1);
        } else {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btn_employee_regActionPerformed

    private void btn_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attendanceActionPerformed
        Attendance_management am = new Attendance_management();
        menu.jPanel3.removeAll();
        menu.jPanel3.revalidate();
        menu.jPanel3.repaint();
        menu.jPanel3.add((JPanel) am.jPanel1);
    }//GEN-LAST:event_btn_attendanceActionPerformed

    private void btn_payrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payrollActionPerformed
        Pay_Roll p = new Pay_Roll();
        menu.jPanel3.removeAll();
        menu.jPanel3.revalidate();
        menu.jPanel3.repaint();
        menu.jPanel3.add((JPanel) p.jPanel1);
    }//GEN-LAST:event_btn_payrollActionPerformed

    private void btn_assign_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_assign_salaryActionPerformed
        basic_salary bs = new basic_salary();
        menu.jPanel3.removeAll();
        menu.jPanel3.revalidate();
        menu.jPanel3.repaint();
        menu.jPanel3.add((JPanel) bs.jPanel1);
    }//GEN-LAST:event_btn_assign_salaryActionPerformed

    private void btn_employee_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_employee_regMouseClicked
        btn_reports.setBorder(null);
        btn_section.setBorder(null);
        btn_emp_details.setBorder(null);
        btn_attendance.setBorder(null);
        btn_payroll.setBorder(null);
        btn_assign_salary.setBorder(null);
        btn_users.setBorder(null);
        btn_employee_reg.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_employee_regMouseClicked

    private void btn_attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_attendanceMouseClicked
        btn_employee_reg.setBorder(null);
        btn_section.setBorder(null);
        btn_emp_details.setBorder(null);
        btn_reports.setBorder(null);
        btn_payroll.setBorder(null);
        btn_assign_salary.setBorder(null);
        btn_users.setBorder(null);
        btn_attendance.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_attendanceMouseClicked

    private void btn_payrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payrollMouseClicked
        btn_employee_reg.setBorder(null);
        btn_section.setBorder(null);
        btn_emp_details.setBorder(null);
        btn_attendance.setBorder(null);
        btn_reports.setBorder(null);
        btn_assign_salary.setBorder(null);
        btn_users.setBorder(null);
        btn_payroll.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_payrollMouseClicked

    private void btn_sectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sectionMouseClicked
        btn_employee_reg.setBorder(null);
        btn_reports.setBorder(null);
        btn_emp_details.setBorder(null);
        btn_attendance.setBorder(null);
        btn_payroll.setBorder(null);
        btn_assign_salary.setBorder(null);
        btn_users.setBorder(null);
        btn_section.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_sectionMouseClicked

    private void btn_emp_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_emp_detailsMouseClicked
        btn_employee_reg.setBorder(null);
        btn_section.setBorder(null);
        btn_reports.setBorder(null);
        btn_attendance.setBorder(null);
        btn_payroll.setBorder(null);
        btn_assign_salary.setBorder(null);
        btn_users.setBorder(null);
        btn_emp_details.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_emp_detailsMouseClicked

    private void btn_reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseClicked
        btn_employee_reg.setBorder(null);
        btn_section.setBorder(null);
        btn_emp_details.setBorder(null);
        btn_attendance.setBorder(null);
        btn_payroll.setBorder(null);
        btn_assign_salary.setBorder(null);
        btn_users.setBorder(null);
        btn_reports.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_reportsMouseClicked

    private void btn_assign_salaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_assign_salaryMouseClicked
        btn_employee_reg.setBorder(null);
        btn_section.setBorder(null);
        btn_emp_details.setBorder(null);
        btn_attendance.setBorder(null);
        btn_payroll.setBorder(null);
        btn_reports.setBorder(null);
        btn_users.setBorder(null);
        btn_assign_salary.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_assign_salaryMouseClicked

    private void btn_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sectionActionPerformed
        Sections p = new Sections();
        menu.jPanel3.removeAll();
        menu.jPanel3.revalidate();
        menu.jPanel3.repaint();
        menu.jPanel3.add((JPanel) p.panel);
    }//GEN-LAST:event_btn_sectionActionPerformed

    private void btn_emp_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emp_detailsActionPerformed
        Employee_detail ed = new Employee_detail();
        menu.jPanel3.removeAll();
        menu.jPanel3.revalidate();
        menu.jPanel3.repaint();
        menu.jPanel3.add((JPanel) ed.jPanel1);
    }//GEN-LAST:event_btn_emp_detailsActionPerformed

    private void btn_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseClicked
        btn_employee_reg.setBorder(null);
        btn_section.setBorder(null);
        btn_emp_details.setBorder(null);
        btn_attendance.setBorder(null);
        btn_payroll.setBorder(null);
        btn_reports.setBorder(null);
        btn_assign_salary.setBorder(null);
        btn_users.setBorder(createMatteBorder(0, 5, 0, 5, new ImageIcon(getClass().getResource("/Images/pixel.png"))));
    }//GEN-LAST:event_btn_usersMouseClicked

    private void btn_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseEntered
        btn_users.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_usersMouseEntered

    private void btn_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseExited
        btn_users.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_usersMouseExited

    private void btn_usersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMousePressed
        btn_users.setBackground(new Color(93, 173, 226));
    }//GEN-LAST:event_btn_usersMousePressed

    private void btn_usersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseReleased
        btn_users.setBackground(new Color(174, 214, 241));
    }//GEN-LAST:event_btn_usersMouseReleased

    private void btn_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersActionPerformed
        Users_Manage um = new Users_Manage();
        menu.jPanel3.removeAll();
        menu.jPanel3.revalidate();
        menu.jPanel3.repaint();
        menu.jPanel3.add((JPanel) um.jPanel1);
    }//GEN-LAST:event_btn_usersActionPerformed

    private void btn_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportsActionPerformed
        hrm_reports r = new hrm_reports();
        menu.jPanel3.removeAll();
        menu.jPanel3.revalidate();
        menu.jPanel3.repaint();
    
        menu.jPanel3.add((JPanel) r.jPanel2);
        
    }//GEN-LAST:event_btn_reportsActionPerformed

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
            java.util.logging.Logger.getLogger(main_hrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_hrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_hrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_hrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_hrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_assign_salary;
    private javax.swing.JButton btn_attendance;
    private javax.swing.JButton btn_emp_details;
    private javax.swing.JButton btn_employee_reg;
    private javax.swing.JButton btn_payroll;
    private javax.swing.JButton btn_reports;
    private javax.swing.JButton btn_section;
    private javax.swing.JButton btn_users;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void setPrivilages() {

        try {
            ResultSet rs = DB.search("SELECT * FROM privilege_hr_department WHERE username='panda'");
            if (rs.next()) {
                access = rs.getInt("employee_registration");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
