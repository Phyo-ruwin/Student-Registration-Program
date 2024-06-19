package login;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() throws SQLException {
        initComponents();
    }

    
    public void initComponents() throws SQLException {


    	ClassUser clsUser=new ClassUser();
		ResultSet rsU=clsUser.ViewUser();
		rsU.last();
		int Ucount=rsU.getRow();
		String[] uid= new String[Ucount];
		String[] uname= new String[Ucount];
		String[] upwd= new String[Ucount];
	
		rsU.first();
		for (int i=0;i<Ucount;i++)
		{
			uid[i]=rsU.getString("user_id");
			uname[i]=rsU.getString("user_name");
			upwd[i]=rsU.getString("user_pass");
		
			rsU.next();
		}
		
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblParadise = new javax.swing.JLabel();
        lblCinema = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblerror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(".\\paradise.png"));
        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(null);

        lblParadise.setFont(new java.awt.Font("U4 Brothers. 00112", 0, 55));
        lblParadise.setForeground(new java.awt.Color(0, 51, 255));
        lblParadise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Machaon Butterfly_48px.png"))); // NOI18N
        lblParadise.setText("Paradise ");
        jPanel1.add(lblParadise);
        lblParadise.setBounds(320, 50, 330, 80);

        lblCinema.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 24));
        lblCinema.setForeground(new java.awt.Color(255, 0, 153));
        lblCinema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3D Glasses_48px.png"))); // NOI18N
        lblCinema.setText("Cinema");
        jPanel1.add(lblCinema);
        lblCinema.setBounds(550, 110, 160, 40);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer_96px.png"))); // NOI18N
        jPanel1.add(lblIcon);
        lblIcon.setBounds(420, 180, 160, 110);

        lblusername.setFont(new java.awt.Font("Tahoma", 1, 24));
        lblusername.setForeground(new java.awt.Color(0, 0, 153));
        lblusername.setText("Username");
        jPanel1.add(lblusername);
        lblusername.setBounds(260, 320, 180, 30);

        lblpassword.setFont(new java.awt.Font("Tahoma", 1, 24));
        lblpassword.setForeground(new java.awt.Color(0, 0, 153));
        lblpassword.setText("Password");
        jPanel1.add(lblpassword);
        lblpassword.setBounds(260, 370, 180, 29);

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
        txtusername.setBounds(440, 320, 190, 30);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(440, 370, 190, 30);

        btnSignUp.setForeground(new java.awt.Color(0, 0, 204));
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp);
        btnSignUp.setBounds(290, 443, 120, 30);

        btnLogin.setForeground(new java.awt.Color(0, 0, 204));
        btnLogin.setText("Log In");
        btnLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent arg0) {
              try
    		{
    			for (int i=0;i<Ucount;i++)
    			{
    				if(txtusername.getText().trim().equals("") && txtPassword.getText().trim().equals(""))
    				{
    					JOptionPane.showConfirmDialog(btnLogin, this,"You must fill username and password.", i);
    					break;
    				}
    				else if(txtusername.getText().trim().equals(uname[i]) && txtPassword.getText().trim().equals(upwd[i]))
    				{
    					dispose();
    					movie e=new movie();
    					e.show();
    					
    				}
    				else if(txtusername.getText().trim().equals(uname[i]) && txtPassword.getText().trim().equals(upwd[i])==false)
    				{
    					lblerror.setText("Your passwored is invalid!");
    					break;
    				}
    				else if(txtusername.getText().equals(uname[i])==false && txtPassword.getText().equals(upwd[i])==false)
					{
						lblerror.setText("Your account does not exist.");
					}
    				
    			}
    		}
    		catch (Exception e)
    		{
    			
    		}
    		
        } 
  });

        jPanel1.add(btnLogin);
        btnLogin.setBounds(620, 440, 120, 30);

        lblerror.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblerror.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblerror);
        lblerror.setBounds(260, 410, 370, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void txtusernameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {                                          
     SignUpForm e=new SignUpForm();
     e.show();        
    }                                         

  
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new LoginForm().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCinema;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblParadise;
    private javax.swing.JLabel lblerror;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration
}
