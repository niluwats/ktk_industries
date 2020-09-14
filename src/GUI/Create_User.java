package GUI;

import Database.DB;
import Model.Save;
import Resources.HashingEncription;
import java.awt.Color;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Create_User extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    Main_menu menu;

    public Create_User() {
        initComponents();
        jScrollPane1.setVisible(false);

        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel13.setVisible(false);

        jLabel17.setVisible(false);

    }

    public Create_User(Main_menu mMenu) {
        this();
        this.menu = mMenu;
        menu.setEnabled(false);
    }
    Users_Manage umm;

    public Create_User(Users_Manage um) {
        this();
        umm = um;
    }

    static String emp_id;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        emp_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        seq1ans = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        repeat_pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        seq3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        seq1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        seq2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        seq2ans = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        seq3ans = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emp_name.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        emp_name.setForeground(new java.awt.Color(39, 55, 70));
        emp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_nameActionPerformed(evt);
            }
        });
        emp_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emp_nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emp_nameKeyTyped(evt);
            }
        });
        jPanel1.add(emp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 460, 25));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 115, 460, 110));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Registration");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 730, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 73, 73));
        jLabel2.setText("Emp Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 80, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("Retype Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, 25));

        btn_Cancel.setBackground(new java.awt.Color(179, 182, 183));
        btn_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Cancel.setText("Clear");
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
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 100, 30));

        btn_Add.setBackground(new java.awt.Color(41, 128, 185));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Add");
        btn_Add.setBorder(null);
        btn_Add.setBorderPainted(false);
        btn_Add.setContentAreaFilled(false);
        btn_Add.setFocusPainted(false);
        btn_Add.setOpaque(true);
        btn_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_AddMouseReleased(evt);
            }
        });
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 100, 30));

        jLabel8.setBackground(new java.awt.Color(250, 251, 250));
        jLabel8.setOpaque(true);
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 700, 30));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 34, 32));

        seq1ans.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        seq1ans.setForeground(new java.awt.Color(39, 55, 70));
        seq1ans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seq1ansKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                seq1ansKeyTyped(evt);
            }
        });
        jPanel1.add(seq1ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 460, 25));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("Answer");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 80, 25));

        repeat_pass.setToolTipText("Please type the same password you typed before");
        repeat_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                repeat_passKeyReleased(evt);
            }
        });
        jPanel1.add(repeat_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 460, 25));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 73, 73));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 25));

        password.setToolTipText("Password length must be 8 characters");
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 460, 25));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 630, 10));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 73, 73));
        jLabel6.setText("Sequrity Question 3");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 140, 25));

        seq3.setEditable(true);
        seq3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        seq3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Sequrity Question 3-", "What was your childhood nickname?", "What was your favorite food as a child?", "What was your favorite sport?", "What is the first name of your high school crush?", "In what town or city was your first job?" }));
        seq3.setFocusable(false);
        seq3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq3ActionPerformed(evt);
            }
        });
        jPanel1.add(seq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 460, 25));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Sequrity Question 1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 140, 25));

        seq1.setEditable(true);
        seq1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        seq1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Sequrity Question 1-", "In what year was your father born?", "What school did you attend for sixth grade?", "What was the last name of your favourite teacher?", "What was the name of the boy/girl you had your second kiss with?", "What was the name of your pet?", " " }));
        seq1.setFocusable(false);
        seq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq1ActionPerformed(evt);
            }
        });
        jPanel1.add(seq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 460, 25));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 73, 73));
        jLabel9.setText("Sequrity Question 2");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 140, 25));

        seq2.setEditable(true);
        seq2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        seq2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Sequrity Question 2-", "Who was your childhood hero?", "What was your favorite food?", "What is the name of the place your wedding reception was held?", "What is the name of your favorite childhood friend?", "What was your first child born year?" }));
        seq2.setFocusable(false);
        seq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq2ActionPerformed(evt);
            }
        });
        jPanel1.add(seq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 460, 25));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(66, 73, 73));
        jLabel10.setText("User Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 80, 25));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(66, 73, 73));
        jLabel11.setText("Answer");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 80, 25));

        seq2ans.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        seq2ans.setForeground(new java.awt.Color(39, 55, 70));
        seq2ans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seq2ansKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                seq2ansKeyTyped(evt);
            }
        });
        jPanel1.add(seq2ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 460, 25));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(66, 73, 73));
        jLabel12.setText("Answer");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 80, 25));

        seq3ans.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        seq3ans.setForeground(new java.awt.Color(39, 55, 70));
        seq3ans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seq3ansKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                seq3ansKeyTyped(evt);
            }
        });
        jPanel1.add(seq3ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 460, 25));

        un.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        un.setForeground(new java.awt.Color(39, 55, 70));
        un.setToolTipText("Enter a Valid user name");
        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unKeyTyped(evt);
            }
        });
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 460, 25));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 88, 30, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 30, 25));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 30, 25));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 30, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 690));

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

    private void btn_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseEntered
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseEntered

    private void btn_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseExited
        btn_Add.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_AddMouseExited

    private void btn_AddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMousePressed
        btn_Add.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_AddMousePressed

    private void btn_AddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseReleased
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseReleased

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel8MouseDragged

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel8MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //menu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
     int i = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this employee?");
        if (i == 0) {
                  if (emp_name.getText().isEmpty() | un.getText().isEmpty() | password.getText().isEmpty() | repeat_pass.getText().isEmpty() | seq1ans.getText().isEmpty() | seq2ans.getText().isEmpty() | seq3ans.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the fields", "Feilds not filled", JOptionPane.INFORMATION_MESSAGE);
        } else if (jLabel17.isVisible()) {
            JOptionPane.showMessageDialog(this, "Please type a differance username", "User Name already taken", JOptionPane.INFORMATION_MESSAGE);
        } else if (jLabel15.isVisible()) {
            JOptionPane.showMessageDialog(this, "Please type atleast 8 characters", "Password Not Strength", JOptionPane.INFORMATION_MESSAGE);
        } else if (jLabel14.isVisible() | repeat_pass.getText().length() < 8) {
            jLabel14.setVisible(true);
            JOptionPane.showMessageDialog(this, "Please type the same password again", "Password Not match", JOptionPane.INFORMATION_MESSAGE);
        } else if (seq1.getSelectedIndex() == 0 | seq2.getSelectedIndex() == 0 | seq3.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a suitable sequrity question", "Please Select a Question", JOptionPane.INFORMATION_MESSAGE);
        } else if (seq1ans.getText().isEmpty() | seq2ans.getText().isEmpty() | seq3ans.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter answers for the questions", "Enter Answers", JOptionPane.INFORMATION_MESSAGE);
        } else if (!jLabel13.isVisible()) {
            JOptionPane.showMessageDialog(this, "Please select a correct emp name", "Select an employee", JOptionPane.INFORMATION_MESSAGE);

        } else {
            try {
                String seq1id = seq1.getSelectedItem().toString();
                String seq1id2 = seq2.getSelectedItem().toString();
                String seq1id3 = seq3.getSelectedItem().toString();
                String emp_id = null;
                ResultSet rs = DB.search("SELECT * from employee where fname='" + emp_name.getText().split(" ")[0] + "'");

                if (rs.next()) {
                    emp_id = rs.getString("id_employee");
                }

                DB.iud("INSERT into user (username,id_employee,password,state,date_created,Seq1_id,Seq1_ans,Seq2_id,Seq2_ans,Seq3_id,Seq3_ans) VALUES ('" + un.getText() + "','" + emp_id + "','" + HashingEncription.getEncription(password.getText().toString()) + "','" + 1 + "','" + LocalDate.now() + "','" + seq1id + "','" + seq1ans.getText() + "','" + seq1id2 + "','" + seq2ans.getText() + "','" + seq1id3 + "','" + seq3ans.getText() + "');");
                new Save().setVisible(true);
                emp_name.setEnabled(true);
                clearall();
                umm.load_user();

            } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(this, "Employee selected already has a user account", "Employee Account Created Before", JOptionPane.INFORMATION_MESSAGE);
                clearall();

            } catch (Exception e) {
                e.printStackTrace();
//        
            }
        }  
        }

    }//GEN-LAST:event_btn_AddActionPerformed

    private void seq1ansKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seq1ansKeyReleased

    }//GEN-LAST:event_seq1ansKeyReleased

    private void seq1ansKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seq1ansKeyTyped

    }//GEN-LAST:event_seq1ansKeyTyped

    private void seq3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seq3ActionPerformed

    private void seq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seq1ActionPerformed

    private void seq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seq2ActionPerformed

    private void emp_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emp_nameKeyReleased
        if (emp_name.getText().isEmpty()) {
            jScrollPane1.setVisible(false);
        } else {
            try {
                String search = emp_name.getText();
                ResultSet rs = DB.search("SELECT * from employee where fname like '%" + search + "%' or lname like '%" + search + "%' or mname like '%" + search + "%' or id_employee like '%" + search + "%'");

                Vector v = new Vector();
                while (rs.next()) {
                    v.add(rs.getString("fname") + " " + rs.getString("mname") + " " + rs.getString("lname"));
                }
                jScrollPane1.setVisible(true);
                jList1.setListData(v);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_emp_nameKeyReleased

    private void emp_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emp_nameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_nameKeyTyped

    private void seq2ansKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seq2ansKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_seq2ansKeyReleased

    private void seq2ansKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seq2ansKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_seq2ansKeyTyped

    private void seq3ansKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seq3ansKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_seq3ansKeyReleased

    private void seq3ansKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seq3ansKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_seq3ansKeyTyped

    private void unKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyReleased
        if (un.getText().isEmpty()) {
            jLabel17.setVisible(false);
        } else {
            try {
                ResultSet rs = DB.search("SELECT * from user where username='" + un.getText() + "'");
                if (rs.next()) {
                    jLabel17.setVisible(true);
                } else {
                    jLabel17.setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_unKeyReleased

    private void unKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_unKeyTyped

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String a = jList1.getSelectedValue();
        emp_name.setText(a);
        jLabel13.setVisible(true);
        emp_name.setEnabled(false);
        jScrollPane1.setVisible(false);

    }//GEN-LAST:event_jList1MouseClicked

    private void repeat_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repeat_passKeyReleased
        if (!password.getText().toString().equals(repeat_pass.getText().toString())) {

            jLabel14.setVisible(true);
        } else {
            jLabel14.setVisible(false);
        }
    }//GEN-LAST:event_repeat_passKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        if (password.getText().toString().length() < 8) {
            jLabel15.setVisible(true);
        } else {
            jLabel15.setVisible(false);
        }
    }//GEN-LAST:event_passwordKeyReleased

    private void emp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_nameActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        emp_name.setEnabled(true);
        emp_name.setText("");
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        clearall();
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
            java.util.logging.Logger.getLogger(Create_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JTextField emp_name;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField repeat_pass;
    private javax.swing.JComboBox<String> seq1;
    private javax.swing.JTextField seq1ans;
    private javax.swing.JComboBox<String> seq2;
    private javax.swing.JTextField seq2ans;
    private javax.swing.JComboBox<String> seq3;
    private javax.swing.JTextField seq3ans;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
 private void load_employee() {
        try {
            ResultSet rs = DB.search("SELECT * from employee");

            while (rs.next()) {
                String name = rs.getString("fname") + " " + rs.getString("mname") + " " + rs.getString("lname");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearall() {
        {
            jLabel13.setVisible(false);
            jLabel14.setVisible(false);
            jLabel15.setVisible(false);
            jLabel17.setVisible(false);
            emp_name.setText("");
            un.setText("");
            password.setText("");
            repeat_pass.setText("");
            seq1ans.setText("");
            seq2ans.setText("");
            seq3ans.setText("");
            seq1.setSelectedIndex(0);
            seq2.setSelectedIndex(0);
            seq3.setSelectedIndex(0);

        }
    }
}