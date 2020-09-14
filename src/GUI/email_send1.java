package GUI;

import Database.DB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class email_send1 extends javax.swing.JFrame {

    static String email;
    static String date = null;
    static String un = null;
    static String nic = null;
    static int i = 0;
    static String reset = null;
    String fromE;
    String toE;
    String pwE;
    String subE;
    String mesE;
    String file;
    static Login l;
    Change_UserPassword changePass;

    public email_send1() {
        initComponents();
        set_email();
        set_date();
        set_time();
        set_msg_date();
    }

    public email_send1(Login aThis) {
        this();
        email_send1.l = aThis;
    }

    public email_send1(Change_UserPassword pass, String userName) {
        this();
        this.changePass = pass;
        email_send1.un = userName;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Reset Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 64, 565, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email_animation.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 400, 309));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("We will Send you an email to ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 340, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("about the password reset");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 210, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 30));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, 20));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 34, 32));

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Another Option");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String central = "MZ";

        String subject = "Central Industries | Reset Password";
        String pin = null;
        String nic4 = null;
        String code1 = null;
        String part1 = null;
        String part2 = null;
        String part3 = null;
        String part4 = null;

        boolean b = true;

        try {

            ResultSet rs = DB.search("select count(sec_id) as x from forgot_password");
            if (rs.first()) {
                i = rs.getInt("x");
                i++;

            }
            nic4 = nic.substring(7, nic.length());
            code1 = central + i;

        } catch (Exception e) {
            e.printStackTrace();
        }
        pin = code1 + nic4 + date;
        part1 = pin.substring(0, 4);
        part2 = pin.substring(4, 8);
        part3 = pin.substring(8, pin.length());

        reset = part1.concat("-") + part2.concat("-") + part3;

        String msg = "Central Industries Password Recovery,"
                + " Use this Key for Reset your Account Password : " + reset;

        System.out.println(Login.sys_email);
        System.out.println(reset);
        System.out.println(msg);

        try {
            sendMail2(Login.sys_email, email, Login.sys_pass, subject, msg);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            DB.iud("insert into forgot_password(sec_id,code,status,username) Values('" + i + "','" + reset + "','" + b + "','" + un + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Verify_Pin p = new Verify_Pin();
        p.setVisible(b);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Sequrity_question sq = new Sequrity_question(un, this);
        sq.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * @param args the command line arguments
     */
    private void setExitButton(JFrame athis) {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                boolean b = false;
                try {
                    DB.iud("update forgot_password set status ='" + b + "' where sec_id ='" + i + "'");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new Login().setVisible(true);

            }
        });
    }

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(email_send1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(email_send1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(email_send1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(email_send1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new email_send1().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void set_email() {

        try {
            ResultSet rs = DB.search("select * from user u inner join employee e on e.id_employee=u.id_employee where u.username='" + Login.s + "'");

            if (rs.next()) {
                nic = rs.getString("nic");
                un = rs.getString("username");
                email = rs.getString("email");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        jLabel4.setText(email);
    }

    private void set_date() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Timer t = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Date d = new Date();
                    jLabel6.setText(sdf.format(d));

                    d = null;
                }
            });
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void set_msg_date() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("ddss");

            Timer t = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Date d = new Date();

                    date = sdf.format(d);

                }
            });
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void set_time() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

            Timer t = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Date d = new Date();
                    jLabel7.setText(sdf.format(d));
                    d = null;
                }
            });
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendMail2(String s1, String s2, String s3, String s4, String s5) throws Exception {
        fromE = s1;
        toE = s2;
        pwE = s3;
        subE = s4;
        mesE = s5;

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromE, pwE);
            }
        });

        try {

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(fromE));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(toE));
            message.setSubject(subE);
            message.setText(mesE);

            Transport.send(message);

            JOptionPane.showMessageDialog(this, "Emai Send..!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

}
