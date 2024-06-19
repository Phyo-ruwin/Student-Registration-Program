package login;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.*;
import javax.swing.*;

public class Newaccount extends javax.swing.JFrame {
        Connection con=null;
        Statement ste=null;
        ResultSet rs=null;
        String DB_URL="jdbc:mysql://localhost/paradise";
        String Username="root";
        String Pass="";
        
   

    
    public Newaccount() {

        jPanel1 = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        lblconfirmpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtConfrimPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblParadise = new javax.swing.JLabel();
        lblCinema = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        btnExit = new javax.swing.JToggleButton();
        lblpassword1 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(".\\paradise.png"));
        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(null);

        lblusername.setFont(new java.awt.Font("Tahoma", 0, 24));
        lblusername.setForeground(new java.awt.Color(0, 0, 153));
        lblusername.setText("Username");
        jPanel1.add(lblusername);
        lblusername.setBounds(310, 350, 120, 30);

        lblconfirmpassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblconfirmpassword.setForeground(new java.awt.Color(0, 0, 153));
        lblconfirmpassword.setText("Confirm Password");
        jPanel1.add(lblconfirmpassword);
        lblconfirmpassword.setBounds(220, 430, 210, 29);

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

        txtConfrimPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfrimPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtConfrimPassword);
        txtConfrimPassword.setBounds(440, 430, 190, 30);

        btnLogin.setForeground(new java.awt.Color(0, 0, 204));
        btnLogin.setText("Log In");
        btnLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnLoginActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(620, 490, 120, 30);

        lblParadise.setFont(new java.awt.Font("U4 Brothers. 00112", 0, 55));
        lblParadise.setForeground(new java.awt.Color(153, 153, 255));
        lblParadise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Machaon Butterfly_48px.png"))); // NOI18N
        lblParadise.setText("Paradise ");
        jPanel1.add(lblParadise);
        lblParadise.setBounds(320, 60, 330, 80);

        lblCinema.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 24));
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
                try {
					btnCreateAccountActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jPanel1.add(btnCreateAccount);
        btnCreateAccount.setBounds(290, 490, 150, 30);

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

        lblpassword1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblpassword1.setForeground(new java.awt.Color(0, 0, 153));
        lblpassword1.setText("Password");
        jPanel1.add(lblpassword1);
        lblpassword1.setBounds(310, 390, 130, 29);

        lblBackground.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.add(lblBackground);
        lblBackground.setBounds(0, 0, 940, 600);

        txtPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword1);
        txtPassword1.setBounds(440, 390, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        Writer writer = null;
		File check = new File("userPass.txt");
		if(check.exists()) {
			
		}else {
			try {
				File texting = new File("userPass.txt");
				writer = new BufferedWriter(new FileWriter(texting));
				writer.write("message");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
    }// </editor-fold>

    private void txtusernameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
        // TODO add your handling code here:
}

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
}

    private void txtConfrimPasswordActionPerformed(java.awt.event.ActionEvent evt) {

}

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	dispose();
    	LoginForm e=new LoginForm();
		e.show();

}

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	if(txtusername.getText().trim().equals(""))
    	{
    		JOptionPane.showMessageDialog(this, "You must enter your name!");
    		txtusername.requestFocus();
    	}
    	else if(txtPassword1.getText().trim().equals(""))
    	{
    		JOptionPane.showMessageDialog(this, "You must enter your password!");
    		txtPassword1.requestFocus();
    	}
    	else if(txtConfrimPassword.getText().trim().equals(""))
    	{
    		JOptionPane.showMessageDialog(this, "You must enter your name!");
    		txtConfrimPassword.requestFocus();
    	}
    	else {
    		if(txtPassword1.getText().trim().equals(txtConfrimPassword.getText().trim()))
    	{
    		
    	
    		try {
        		Connection con=DriverManager.getConnection(DB_URL,Username,Pass);
        		Statement ste=con.createStatement();
        		String mname=txtusername.getText();
				String mpass=txtPassword1.getText();
        		ste.execute("INSERT Into tblregister(user_name,user_pass)VALUE('"+mname+"','"+mpass+"')");
        		}
        catch(Exception ex)
        	{
        	}
    		
    		
    		JOptionPane.showMessageDialog(this, "Congratulations!You've registered");
    		dispose();
    		LoginFormAdmin e=new LoginFormAdmin();
    		e.show();
    	}
    		else
    		{
    		JOptionPane.showMessageDialog(null, "Your confirm passowrd is incorrect.","Error Message",JOptionPane.ERROR_MESSAGE);
    		txtPassword1.requestFocus();
    		}
    			
    	
    	}
    }
     


    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
    	 JOptionPane.showConfirmDialog(this,"Are you sure you want to close?","Confirm Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
         System.exit(0);
       
}

    private void txtPassword1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Newaccount().setVisible(true);
            }
        });
    }

   
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
    private javax.swing.JLabel lblconfirmpassword;
    private javax.swing.JLabel lblpassword1;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPasswordField txtConfrimPassword;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JTextField txtusername;
    // End of variables declaration

}
