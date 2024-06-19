package login;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Total extends javax.swing.JFrame  {

   
    public Total() throws SQLException {
        initComponents();
    }
                     
    private void initComponents() throws SQLException {

        jPanel1 = new javax.swing.JPanel();
        lblparadise = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblcinema = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTheatre = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        btnSetting = new javax.swing.JButton();
        btnReview = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnaddmovie = new javax.swing.JButton();
        btnSalemovie = new javax.swing.JButton();
        btnDatabase = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnforward = new javax.swing.JButton();
        btnClose = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpayment = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(".\\paradise.png"));
        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        lblparadise.setBackground(new java.awt.Color(51, 153, 255));
        lblparadise.setFont(new java.awt.Font("U4 Brothers. 00112", 0, 48)); // NOI18N
        lblparadise.setForeground(new java.awt.Color(0, 153, 255));
        lblparadise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Machaon Butterfly_48px.png"))); // NOI18N
        lblparadise.setText("Paradise");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Film Reel_48px.png"))); // NOI18N

        lblcinema.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 36)); // NOI18N
        lblcinema.setForeground(new java.awt.Color(0, 153, 255));
        lblcinema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3D Glasses_48px.png"))); // NOI18N
        lblcinema.setText("Cinema");

        jPanel2.setBackground(new java.awt.Color(153, 208, 229));

        btnTheatre.setBackground(new java.awt.Color(102, 255, 255));
        btnTheatre.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11)); // NOI18N
        btnTheatre.setForeground(new java.awt.Color(0, 51, 255));
        btnTheatre.setIcon(new javax.swing.ImageIcon("E:\\New Folder\\Frmlogin\\src\\images\\Audience_48px.png")); // NOI18N
        btnTheatre.setText("Theatre");
        btnTheatre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheatreActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Administrator Male_96px.png"))); // NOI18N

        lblAdmin.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 24)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(0, 0, 204));
        lblAdmin.setText("Admin");
        

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblicon))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSetting.setBackground(new java.awt.Color(102, 255, 255));
        btnSetting.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11)); // NOI18N
        btnSetting.setForeground(new java.awt.Color(0, 0, 255));
        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Services_48px.png"))); // NOI18N
        btnSetting.setText("Settings");
        btnSetting.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        btnReview.setBackground(new java.awt.Color(102, 255, 255));
        btnReview.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11)); // NOI18N
        btnReview.setForeground(new java.awt.Color(0, 0, 255));
        btnReview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit_48px.png"))); // NOI18N
        btnReview.setText("Review");
        btnReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnReviewActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnPayment.setBackground(new java.awt.Color(102, 255, 255));
        btnPayment.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11)); // NOI18N
        btnPayment.setForeground(new java.awt.Color(0, 0, 255));
        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Money Bag_48px.png"))); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnaddmovie.setBackground(new java.awt.Color(102, 255, 255));
        btnaddmovie.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11)); // NOI18N
        btnaddmovie.setForeground(new java.awt.Color(0, 51, 255));
        btnaddmovie.setIcon(new javax.swing.ImageIcon("E:\\New Folder\\Frmlogin\\src\\images\\Add Image_48px.png")); // NOI18N
        btnaddmovie.setText("Add movie");
        btnaddmovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddmovieActionPerformed(evt);
            }
        });

        btnSalemovie.setBackground(new java.awt.Color(102, 255, 255));
        btnSalemovie.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11)); // NOI18N
        btnSalemovie.setForeground(new java.awt.Color(0, 51, 255));
        btnSalemovie.setIcon(new javax.swing.ImageIcon("E:\\New Folder\\Frmlogin\\src\\images\\Land Sales_48px.png")); // NOI18N
        btnSalemovie.setText("Sale movie");
        btnSalemovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalemovieActionPerformed(evt);
            }
        });

        btnDatabase.setBackground(new java.awt.Color(102, 255, 255));
        btnDatabase.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11)); // NOI18N
        btnDatabase.setForeground(new java.awt.Color(0, 0, 255));
        btnDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add Database_48px.png"))); // NOI18N
        btnDatabase.setText("Database");
        btnDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnDatabaseActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTheatre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalemovie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnaddmovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnaddmovie, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReview, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTheatre, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalemovie, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        btnback.setBackground(new java.awt.Color(51, 51, 51));
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back po_50px.png"))); // NOI18N

        btnforward.setBackground(new java.awt.Color(51, 51, 51));
        btnforward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Next page_50px.png"))); // NOI18N

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close Window_48px.png"))); // NOI18N
        btnClose.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClose.setBorderPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        DefaultTableModel model = new DefaultTableModel();
        
		
		ClassUser clsUser=new ClassUser();
		ResultSet rsU=clsUser.ViewUser();
		
		ResultSetMetaData rsmt = rsU.getMetaData();
		int UcolC= rsmt.getColumnCount();
		for(int i = 1; i <= UcolC; i++) 
		{
			model.addColumn(rsmt.getColumnName(i));
		}
		Vector row = new Vector();
        while(rsU.next())
        { 
            row = new Vector(UcolC); 
           int c=row.toString().length();
          
           
            for(int i = 1; i <= UcolC; i++)
            { 
            	
                row.add(rsU.getString(i)); 
            }    
            
     		model.addRow(row);
        }
        
	  
	   
		
		
		
        
        tblpayment.setBackground(new java.awt.Color(204, 255, 204));
        tblpayment.setModel(model);
        jScrollPane2.setViewportView(tblpayment);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnforward, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblcinema)
                        .addGap(261, 261, 261))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(lblparadise)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblparadise, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcinema, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnforward, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnaddmovieActionPerformed(java.awt.event.ActionEvent evt) {                                            
       adiminlogin e= new adiminlogin();
     e.show();
    }                                           

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnDatabaseActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                            
      Total e=new Total();
      e.show();
    }                                           

    private void btnReviewActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                          
      Review e=new Review();
      e.show();
    }                                         

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {                                           
    payment e=new payment();
    e.show();
    }                                          

    private void btnTheatreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnSalemovieActionPerformed(java.awt.event.ActionEvent evt) {                                             
      Sale e=new Sale();
      e.show();
    }                                            

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	int confirm;
		confirm=JOptionPane.showConfirmDialog(null, "Are you sure want to exit?","Confirm Exit",0);
		if(confirm==0)
		{
			System.exit(confirm);
		}
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
            java.util.logging.Logger.getLogger(Total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new Total().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton btnClose;
    private javax.swing.JButton btnDatabase;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnReview;
    private javax.swing.JButton btnSalemovie;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnTheatre;
    private javax.swing.JButton btnaddmovie;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnforward;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblcinema;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblparadise;
    private javax.swing.JTable tblpayment;
}
