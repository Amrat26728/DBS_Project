/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBSProject;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class StdDataCollectionNonAC extends javax.swing.JFrame {

    Date date=new Date();
    SimpleDateFormat dateformat=new SimpleDateFormat("dd/MMMM/YYYY");
    
    /**
     * Creates new form StdDataCollectionNonAC
     */
    public StdDataCollectionNonAC() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rollnotf = new javax.swing.JTextField();
        rollno = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        fnametf = new javax.swing.JTextField();
        fname = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        contacttf = new javax.swing.JTextField();
        bg = new javax.swing.JComboBox<>();
        bloodgroup = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        countrytf = new javax.swing.JTextField();
        provincetf = new javax.swing.JTextField();
        province = new javax.swing.JLabel();
        district = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        addresstf = new javax.swing.JTextField();
        districttf = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        emergcontacttf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        emergcontact = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(10, 10, 25, 30);

        jPanel1.setBackground(new java.awt.Color(248, 245, 241));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("( i.e 19SW01 )");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 20, 90, 30);

        rollnotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rollnotfKeyPressed(evt);
            }
        });
        jPanel1.add(rollnotf);
        rollnotf.setBounds(180, 50, 230, 30);

        rollno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollno.setText(" Roll No");
        jPanel1.add(rollno);
        rollno.setBounds(120, 50, 60, 30);

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText(" Name");
        jPanel1.add(name);
        name.setBounds(130, 100, 50, 30);

        nametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nametfKeyPressed(evt);
            }
        });
        jPanel1.add(nametf);
        nametf.setBounds(180, 100, 230, 30);

        fnametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnametfKeyPressed(evt);
            }
        });
        jPanel1.add(fnametf);
        fnametf.setBounds(180, 150, 230, 30);

        fname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fname.setText("  Father's Name");
        jPanel1.add(fname);
        fname.setBounds(70, 150, 110, 30);

        contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contact.setText("Contact");
        jPanel1.add(contact);
        contact.setBounds(120, 200, 60, 30);

        contacttf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contacttfKeyPressed(evt);
            }
        });
        jPanel1.add(contacttf);
        contacttf.setBounds(180, 200, 230, 30);

        bg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(bg);
        bg.setBounds(180, 250, 59, 22);

        bloodgroup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bloodgroup.setText("Blood Group");
        jPanel1.add(bloodgroup);
        bloodgroup.setBounds(90, 250, 90, 20);

        country.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        country.setText("Country");
        jPanel1.add(country);
        country.setBounds(120, 290, 60, 30);

        countrytf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                countrytfKeyPressed(evt);
            }
        });
        jPanel1.add(countrytf);
        countrytf.setBounds(180, 290, 230, 30);

        provincetf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                provincetfKeyPressed(evt);
            }
        });
        jPanel1.add(provincetf);
        provincetf.setBounds(180, 340, 230, 30);

        province.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        province.setText(" Province");
        jPanel1.add(province);
        province.setBounds(110, 340, 70, 30);

        district.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        district.setText(" District");
        jPanel1.add(district);
        district.setBounds(120, 390, 60, 30);

        address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address.setText("  Address");
        jPanel1.add(address);
        address.setBounds(110, 440, 70, 30);

        addresstf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addresstfKeyPressed(evt);
            }
        });
        jPanel1.add(addresstf);
        addresstf.setBounds(180, 440, 230, 30);

        districttf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                districttfKeyPressed(evt);
            }
        });
        jPanel1.add(districttf);
        districttf.setBounds(180, 390, 230, 30);

        clear.setBackground(new java.awt.Color(153, 204, 255));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(280, 600, 100, 30);

        submit.setBackground(new java.awt.Color(153, 204, 255));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(130, 600, 100, 30);

        emergcontacttf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emergcontacttfKeyPressed(evt);
            }
        });
        jPanel1.add(emergcontacttf);
        emergcontacttf.setBounds(180, 540, 230, 30);
        jPanel1.add(emailtf);
        emailtf.setBounds(180, 490, 230, 30);

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setText(" Email");
        jPanel1.add(email);
        email.setBounds(130, 490, 50, 30);

        emergcontact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emergcontact.setText("Emergency Contact");
        jPanel1.add(emergcontact);
        emergcontact.setBounds(40, 540, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Non AC Room.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(610, 130, 500, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1210, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        rollnotf.setText(null);
        nametf.setText(null);
        fnametf.setText(null);
        contacttf.setText(null);
        countrytf.setText(null);
        provincetf.setText(null);
        districttf.setText(null);
        addresstf.setText(null);
        emailtf.setText(null);
        emergcontacttf.setText(null);
        
    }//GEN-LAST:event_clearActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        if(rollnotf.getText().isEmpty() || nametf.getText().isEmpty() || fnametf.getText().isEmpty() || contacttf.getText().isEmpty() || countrytf.getText().isEmpty() || provincetf.getText().isEmpty() || districttf.getText().isEmpty() || addresstf.getText().isEmpty() || emailtf.getText().isEmpty() || emergcontacttf.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Something is wrong while giving data!", null, JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
            String Roll_no=rollnotf.getText();
            boolean check=false;
        
        try{
            Connection con2 = new DBConnection().getConnection();
            Statement s=con2.createStatement();
            
            ResultSet rs=s.executeQuery("select roll_no from hostel_data_non_ac");
            while(rs.next())
            {
                String string=rs.getString(1);
                if(string.equals(Roll_no))
                {
                    check=true;
                    break;
                }
                else
                {
                    check=false;
                }   
            }
            
            if(check)
            {
                JOptionPane.showMessageDialog(null, "Roll No already exists");
            }
            else
            {
                String str=null;
                int counter1=0;
                int counter2=0;
                
                ResultSet rs2=s.executeQuery("select room_no from room_allocation_2");
                while(rs2.next())
                {
                    counter1++;
                }
                
                ResultSet rs3=s.executeQuery("select non_ac_rooms from rooms");
                while(rs3.next())
                {
                    str=String.valueOf(rs3.getInt("non_ac_rooms"));
                }
                
                counter2=Integer.parseInt(str);
                
                if(counter1<counter2)
                {
                    String Name=nametf.getText();
                    String Fname=fnametf.getText();
                    double Contact=Double.parseDouble(contacttf.getText());
                    String Blood_group=(String)bg.getSelectedItem();
                    String Country=countrytf.getText();
                    String Province=provincetf.getText();
                    String District=districttf.getText();
                    String Address=addresstf.getText();
                    String Email=emailtf.getText();
                    double Emerg_contact=Double.parseDouble(emergcontacttf.getText());

                    if(Pattern.matches("^[A-Z]+$",Roll_no) || Pattern.matches("^[0-9]+$",Roll_no))
                    {
                        JOptionPane.showMessageDialog(null, "Roll no is not correct!",null,JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        if(Email.endsWith("@gmail.com") || Email.endsWith("@email.com"))
                        {
                            int counter=0;
                            s.executeQuery("insert into hostel_data_non_ac(roll_no, name, f_name, contact_no, blood_group, country, province, district, address, email, emerg_contact, room_allow_date) values('"+Roll_no+"','"+Name+"','"+Fname+"','"+Contact+"','"+Blood_group+"','"+Country+"','"+Province+"','"+District+"','"+Address+"','"+Email+"','"+Emerg_contact+"','"+dateformat.format(date)+"')");
                            s.executeQuery("commit");
                            
                            ResultSet rs4=s.executeQuery("select * from room_allocation_2");
                            while(rs4.next())
                            {
                                counter++;
                                String str2=rs4.getString(3);
                                if(str2.equals(" "))
                                {
                                    check=true;
                                }
                            }

                            if(counter==0)
                            {
                                s.executeQuery("insert into room_allocation_2(room_no, std_1_roll_no, std_2_roll_no) values("+(counter+1)+",'"+Roll_no+"','"+" "+"')");
                                s.executeQuery("commit");
                                JOptionPane.showMessageDialog(null, "your room no is "+(counter+1));
                            }

                            else
                            {
                                if(check)
                                {
                                    s.executeQuery("update room_allocation_2 set std_2_roll_no='"+Roll_no+"' where room_no="+counter);
                                    s.executeQuery("commit");
                                    JOptionPane.showMessageDialog(null, "Your room no is "+counter);
                                }

                                else
                                {
                                    s.executeQuery("insert into room_allocation_2(room_no, std_1_roll_no, std_2_roll_no) values("+(counter+1)+",'"+Roll_no+"','"+" "+"')");
                                    s.executeQuery("commit");
                                    JOptionPane.showMessageDialog(null, "Your room no is "+(counter+1));
                                }
                            }
                            
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Pattern of the email is not correct!",null,JOptionPane.ERROR_MESSAGE);
                        }

                    }
                
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Room is not available");
                }
                
            }
            con2.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
       }
      
    }//GEN-LAST:event_submitActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        
        new UserFrame().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_backMouseClicked

    private void nametfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametfKeyPressed
        
        char ch=evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch))
        {
            nametf.setEditable(true);
        }
        else
        {
            nametf.setEditable(false);
        }
        
    }//GEN-LAST:event_nametfKeyPressed

    private void fnametfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnametfKeyPressed
       
        char ch=evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch))
        {
            fnametf.setEditable(true);
        }
        else
        {
            fnametf.setEditable(false);
        }
                
    }//GEN-LAST:event_fnametfKeyPressed

    private void countrytfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_countrytfKeyPressed
        
        char ch=evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch))
        {
            countrytf.setEditable(true);
        }
        else
        {
            countrytf.setEditable(false);
        }
        
    }//GEN-LAST:event_countrytfKeyPressed

    private void provincetfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_provincetfKeyPressed
        
        char ch=evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch))
        {
            provincetf.setEditable(true);
        }
        else
        {
            provincetf.setEditable(false);
        }
        
    }//GEN-LAST:event_provincetfKeyPressed

    private void districttfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_districttfKeyPressed
        
        char ch=evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch))
        {
            districttf.setEditable(true);
        }
        else
        {
            districttf.setEditable(false);
        }
        
    }//GEN-LAST:event_districttfKeyPressed

    private void addresstfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addresstfKeyPressed
        
        char ch=evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch))
        {
            addresstf.setEditable(true);
        }
        else
        {
            addresstf.setEditable(false);
        }
        
    }//GEN-LAST:event_addresstfKeyPressed

    private void contacttfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contacttfKeyPressed
        
           char ch=evt.getKeyChar();
           
           if(Character.isDigit(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch))
           {
               contacttf.setEditable(true);
           }
           else
           {
               contacttf.setEditable(false);
           }
        
    }//GEN-LAST:event_contacttfKeyPressed

    private void emergcontacttfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emergcontacttfKeyPressed
        
           char ch=evt.getKeyChar();
           
           if(Character.isDigit(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch))
           {
               emergcontacttf.setEditable(true);
           }
           else
           {
               emergcontacttf.setEditable(false);
           }
        
    }//GEN-LAST:event_emergcontacttfKeyPressed

    private void rollnotfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollnotfKeyPressed
        
            char ch=evt.getKeyChar();
            
           if(Character.isLetter(ch) || Character.isDigit(ch) || Character.isISOControl(ch))
           {
               rollnotf.setEditable(true);
           }
           else
           {
               rollnotf.setEditable(false);
           }
        
    }//GEN-LAST:event_rollnotfKeyPressed

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
            java.util.logging.Logger.getLogger(StdDataCollectionNonAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StdDataCollectionNonAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StdDataCollectionNonAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StdDataCollectionNonAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StdDataCollectionNonAC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextField addresstf;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> bg;
    private javax.swing.JLabel bloodgroup;
    private javax.swing.JButton clear;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField contacttf;
    private javax.swing.JLabel country;
    private javax.swing.JTextField countrytf;
    private javax.swing.JLabel district;
    private javax.swing.JTextField districttf;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtf;
    private javax.swing.JLabel emergcontact;
    private javax.swing.JTextField emergcontacttf;
    private javax.swing.JLabel fname;
    private javax.swing.JTextField fnametf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametf;
    private javax.swing.JLabel province;
    private javax.swing.JTextField provincetf;
    private javax.swing.JLabel rollno;
    private javax.swing.JTextField rollnotf;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
