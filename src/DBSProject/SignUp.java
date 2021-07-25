/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBSProject;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        viewpasswordlogin.setVisible(false);
        viewpasswordsignup.setVisible(false);
        setSize(1200,700);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        loginpanel = new javax.swing.JPanel();
        loginbtn = new javax.swing.JButton();
        password = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        passwordtf = new javax.swing.JPasswordField();
        rollnotf = new javax.swing.JTextField();
        viewpasswordlogin = new javax.swing.JLabel();
        hide1 = new javax.swing.JLabel();
        signuppanel = new javax.swing.JPanel();
        namesignup = new javax.swing.JLabel();
        passwordsignup = new javax.swing.JLabel();
        nametfsignup = new javax.swing.JTextField();
        passwordtfsignup = new javax.swing.JPasswordField();
        rollnotfsignup = new javax.swing.JTextField();
        signupbtn = new javax.swing.JButton();
        rollnosignup = new javax.swing.JLabel();
        viewpasswordsignup = new javax.swing.JLabel();
        hide2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(6, 6, 28, 24);

        panel.setBackground(new java.awt.Color(248, 245, 241));
        panel.setLayout(null);

        loginpanel.setBackground(new java.awt.Color(248, 245, 241));
        loginpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(153, 153, 153))); // NOI18N
        loginpanel.setLayout(null);

        loginbtn.setBackground(new java.awt.Color(153, 204, 255));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginbtn.setText("Sign In");
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        loginpanel.add(loginbtn);
        loginbtn.setBounds(47, 188, 340, 32);

        password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password.setText("Password:");
        loginpanel.add(password);
        password.setBounds(47, 120, 72, 27);

        rollno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollno.setText("Roll No:");
        loginpanel.add(rollno);
        rollno.setBounds(61, 68, 58, 26);
        loginpanel.add(passwordtf);
        passwordtf.setBounds(125, 118, 260, 32);

        rollnotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rollnotfKeyPressed(evt);
            }
        });
        loginpanel.add(rollnotf);
        rollnotf.setBounds(125, 68, 260, 32);

        viewpasswordlogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewpasswordlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        viewpasswordlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewpasswordlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewpasswordloginMouseClicked(evt);
            }
        });
        viewpasswordlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                viewpasswordloginKeyPressed(evt);
            }
        });
        loginpanel.add(viewpasswordlogin);
        viewpasswordlogin.setBounds(390, 120, 30, 30);

        hide1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hide.png"))); // NOI18N
        hide1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide1MouseClicked(evt);
            }
        });
        loginpanel.add(hide1);
        hide1.setBounds(390, 120, 30, 30);

        panel.add(loginpanel);
        loginpanel.setBounds(101, 144, 430, 280);

        signuppanel.setBackground(new java.awt.Color(248, 245, 241));
        signuppanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "SignUp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(153, 153, 153))); // NOI18N
        signuppanel.setLayout(null);

        namesignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namesignup.setText(" Name:");
        signuppanel.add(namesignup);
        namesignup.setBounds(68, 97, 52, 27);

        passwordsignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordsignup.setText(" Password:");
        signuppanel.add(passwordsignup);
        passwordsignup.setBounds(44, 141, 76, 26);

        nametfsignup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nametfsignupKeyPressed(evt);
            }
        });
        signuppanel.add(nametfsignup);
        nametfsignup.setBounds(124, 95, 260, 32);
        signuppanel.add(passwordtfsignup);
        passwordtfsignup.setBounds(124, 139, 260, 32);

        rollnotfsignup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rollnotfsignupKeyPressed(evt);
            }
        });
        signuppanel.add(rollnotfsignup);
        rollnotfsignup.setBounds(124, 51, 260, 32);

        signupbtn.setBackground(new java.awt.Color(153, 204, 255));
        signupbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signupbtn.setText("SignUp");
        signupbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        signuppanel.add(signupbtn);
        signupbtn.setBounds(44, 203, 340, 32);

        rollnosignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollnosignup.setText("Roll No:");
        signuppanel.add(rollnosignup);
        rollnosignup.setBounds(62, 53, 62, 26);

        viewpasswordsignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewpasswordsignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        viewpasswordsignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewpasswordsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewpasswordsignupMouseClicked(evt);
            }
        });
        viewpasswordsignup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                viewpasswordsignupKeyPressed(evt);
            }
        });
        signuppanel.add(viewpasswordsignup);
        viewpasswordsignup.setBounds(390, 139, 30, 32);

        hide2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hide.png"))); // NOI18N
        hide2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide2MouseClicked(evt);
            }
        });
        signuppanel.add(hide2);
        hide2.setBounds(390, 140, 30, 30);

        panel.add(signuppanel);
        signuppanel.setBounds(653, 144, 430, 278);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 1190, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        
        new MainFrame().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_backMouseClicked

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        
        String RollNo = rollnotfsignup.getText();
        String Name = nametfsignup.getText();
        char[] pass = passwordtfsignup.getPassword();
        String Password = String.valueOf(pass);
        boolean check = true;
        
        if(RollNo.isEmpty() || Name.isEmpty() || Password.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Something is wrong while getting data!", null, JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
            try{
              Connection con = new DBConnection().getConnection();
              Statement s = con.createStatement();
              ResultSet rs = s.executeQuery("select roll_no, password from signup_data");
              while(rs.next())
              {
                  String str = rs.getString(1);
                  if(RollNo.equals(str))
                  {
                      check = false;
                  }
              }

              if(check)
              {
                try{
                    s.executeQuery("insert into signup_data values('"+RollNo+"','"+Name+"','"+Password+"')");
                    s.executeQuery("commit");
                    JOptionPane.showMessageDialog(null, "Succesfully Registered!", null, JOptionPane.INFORMATION_MESSAGE);
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e, null, JOptionPane.ERROR_MESSAGE);
                }
              }
              else
              {
                  rollnotfsignup.setText("");
                  nametfsignup.setText("");
                  passwordtfsignup.setText("");
                  JOptionPane.showMessageDialog(null, "Roll No is already registered!", null, JOptionPane.ERROR_MESSAGE);
              }
                con.close();
            }catch(SQLException e){

            }
        
        }
        
    }//GEN-LAST:event_signupbtnActionPerformed

    private void rollnotfsignupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollnotfsignupKeyPressed
        
        char ch = evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isDigit(ch) || Character.isISOControl(ch))
        {
            rollnotfsignup.setEditable(true);
        }
        
        else
        {
            rollnotfsignup.setEditable(false);
        }
        
    }//GEN-LAST:event_rollnotfsignupKeyPressed

    private void nametfsignupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametfsignupKeyPressed
        
        char ch = evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isISOControl(ch) || Character.isSpaceChar(ch))
        {
            nametfsignup.setEditable(true);
        }
        
        else
        {
            nametfsignup.setEditable(false);
        }
        
    }//GEN-LAST:event_nametfsignupKeyPressed

    private void rollnotfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollnotfKeyPressed
        
        char ch = evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isDigit(ch) || Character.isISOControl(ch))
        {
            rollnotf.setEditable(true);
        }
        
        else
        {
            rollnotf.setEditable(false);
        }
        
    }//GEN-LAST:event_rollnotfKeyPressed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        
        String RollNo = rollnotf.getText();
        char[] ch = passwordtf.getPassword();
        String pass = String.valueOf(ch);
        boolean check = false;
        boolean check2 = true;
        String print = "Your roll no is not registered please signup first!";
        
        if(RollNo.isEmpty() || pass.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Something is wrong while Signing In!", null, JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
            try{
                Connection con = new DBConnection().getConnection();
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("Select roll_no, password from signup_data");
                while(rs.next())
                {
                    String str = rs.getString("roll_no");
                    if(RollNo.equals(str))
                    {
                        String str2 = rs.getString("password");
                        if(pass.equals(str2))
                        {
                            check = true;
                        }
                        else
                        {
                            print = "Password is incorrect!";
                        }
                    }
                }

                if(check)
                {
                    new UserFrame().setVisible(true);
                    this.dispose();
                }

                else
                {
                    rollnotf.setText("");
                    passwordtf.setText("");
                    JOptionPane.showMessageDialog(null, print, null, JOptionPane.ERROR_MESSAGE);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void viewpasswordloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewpasswordloginKeyPressed
        
        
        
    }//GEN-LAST:event_viewpasswordloginKeyPressed

    private void viewpasswordsignupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewpasswordsignupKeyPressed
        
        
        
    }//GEN-LAST:event_viewpasswordsignupKeyPressed

    private void viewpasswordloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpasswordloginMouseClicked
        
        hide1.setVisible(true);
        viewpasswordlogin.setVisible(false);
        passwordtf.setEchoChar('*');
        
    }//GEN-LAST:event_viewpasswordloginMouseClicked

    private void viewpasswordsignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpasswordsignupMouseClicked
        
        hide2.setVisible(true);
        viewpasswordsignup.setVisible(false);
        passwordtfsignup.setEchoChar('*');
        
    }//GEN-LAST:event_viewpasswordsignupMouseClicked

    private void hide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MouseClicked
        
        viewpasswordlogin.setVisible(true);
        hide1.setVisible(false);
        passwordtf.setEchoChar((char)0);
        
    }//GEN-LAST:event_hide1MouseClicked

    private void hide2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide2MouseClicked
        
        viewpasswordsignup.setVisible(true);
        hide2.setVisible(false);
        passwordtfsignup.setEchoChar((char)0);
        
    }//GEN-LAST:event_hide2MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel hide2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JLabel namesignup;
    private javax.swing.JTextField nametfsignup;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordsignup;
    private javax.swing.JPasswordField passwordtf;
    private javax.swing.JPasswordField passwordtfsignup;
    private javax.swing.JLabel rollno;
    private javax.swing.JLabel rollnosignup;
    private javax.swing.JTextField rollnotf;
    private javax.swing.JTextField rollnotfsignup;
    private javax.swing.JButton signupbtn;
    private javax.swing.JPanel signuppanel;
    private javax.swing.JLabel viewpasswordlogin;
    private javax.swing.JLabel viewpasswordsignup;
    // End of variables declaration//GEN-END:variables
}
