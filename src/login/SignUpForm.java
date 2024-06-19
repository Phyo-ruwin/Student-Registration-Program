package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;
public class SignUpForm extends javax.swing.JFrame {
    
    public SignUpForm() {
        initComponents();
        
    }
                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblParadise = new javax.swing.JLabel();
        lblCinema = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        btnExit = new javax.swing.JToggleButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setIconImage(Toolkit.getDefaultToolkit().getImage(".\\paradise.png"));
        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(null);

        lblusername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblusername.setForeground(new java.awt.Color(0, 0, 153));
        lblusername.setText("Username");
        jPanel1.add(lblusername);
        lblusername.setBounds(310, 350, 120, 30);

        lblpassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 0, 153));
        lblpassword.setText("Password");
        jPanel1.add(lblpassword);
        lblpassword.setBounds(310, 390, 130, 29);

        txtusername.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtusernameInputMethodTextChanged(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername);
        txtusername.setBounds(440, 350, 190, 30);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(440, 390, 190, 30);

        btnLogin.setForeground(new java.awt.Color(0, 0, 204));
        btnLogin.setText("Log In");
        btnLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(620, 440, 120, 30);

        lblParadise.setFont(new java.awt.Font("U4 Brothers. 00112", 0, 55)); // NOI18N
        lblParadise.setForeground(new java.awt.Color(153, 153, 255));
        lblParadise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Machaon Butterfly_48px.png"))); // NOI18N
        lblParadise.setText("Paradise ");
        jPanel1.add(lblParadise);
        lblParadise.setBounds(320, 60, 330, 80);

        lblCinema.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 24)); // NOI18N
        lblCinema.setForeground(new java.awt.Color(255, 0, 153));
        lblCinema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3D Glasses_48px.png"))); // NOI18N
        lblCinema.setText("Cinema");
        jPanel1.add(lblCinema);
        lblCinema.setBounds(550, 110, 160, 40);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 240, 0, 0);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(620, 70, 70, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Film Reel_48px.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(610, 60, 60, 60);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer_96px.png"))); // NOI18N
        jPanel1.add(lblIcon);
        lblIcon.setBounds(430, 200, 160, 110);

        btnCreateAccount.setForeground(new java.awt.Color(0, 0, 204));
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateAccount);
        btnCreateAccount.setBounds(290, 443, 120, 30);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close Window_48px.png"))); // NOI18N
        btnExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(910, 0, 41, 42);

        lblBackground.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.add(lblBackground);
        lblBackground.setBounds(0, 0, 940, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtusernameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {                                                 
if(txtusername.getText().trim().equals(""))
{
    JOptionPane.showMessageDialog(this, "Please enter User Name!");
    txtusername.requestFocus(true);
}
else if(txtPassword.getText().trim().equals(""))
{
    JOptionPane.showMessageDialog(this, "Please enter Password!");
    txtPassword.requestFocus(true);
}
else{
        try
        {
            BufferedWriter bw=new BufferedWriter(new FileWriter("accountRecord.txt",true));
            bw.write(txtusername.getText()+"|"+txtPassword.getText()+System.getProperty("line.separator"));
            bw.flush();
            bw.close();
            txtusername.setText("");
            txtPassword.setText("");
            JOptionPane.showMessageDialog(this,"This record is successfully save.");
        }catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(this, "Save process is failur.");
        }
}
    }                                                

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                            
      
    }                                           

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        JOptionPane.showConfirmDialog(this,"Are you sure you want to close?","Confirm Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       System.exit(0);
    }                                       

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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCinema;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblParadise;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration                   
}
