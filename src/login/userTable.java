package login;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class userTable extends javax.swing.JFrame {

  
    public userTable() throws SQLException {
        initComponents();
    }
    DefaultTableModel model = new DefaultTableModel();
    ClassUser clsUser=new ClassUser();
	ResultSet rsU=clsUser.ViewUser();
	
	ResultSetMetaData rsmt = rsU.getMetaData();
	int UcolC= rsmt.getColumnCount();
    private void initComponents() throws SQLException {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnTheatre = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSetting = new javax.swing.JButton();
        btnDatabase = new javax.swing.JButton();
        btnReview = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnAddmovie = new javax.swing.JButton();
        btnSale = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClose = new javax.swing.JToggleButton();
        lblAutoID = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtmModel = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(".\\paradise.png"));
        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("U4 Brothers. 00112", 0, 48));
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Machaon Butterfly_48px.png"))); // NOI18N
        jLabel1.setText("Paradise");
        jLabel1.setName("lblParadise"); // NOI18N

        jLabel2.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 36));
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3D Glasses_48px.png"))); // NOI18N
        jLabel2.setText("Cinema");
        jLabel2.setName("lblCinema"); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Film Reel_48px.png"))); // NOI18N
        jLabel3.setName("lblParadise2"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 208, 229));

        btnTheatre.setBackground(new java.awt.Color(102, 255, 255));
        btnTheatre.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnTheatre.setForeground(new java.awt.Color(0, 51, 255));
        btnTheatre.setIcon(new javax.swing.ImageIcon("E:\\New Folder\\Frmlogin\\src\\images\\Audience_48px.png")); // NOI18N
        btnTheatre.setText("Theatre");
        btnTheatre.setName("btnTheratre"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 24));
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Admin");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Administrator Male_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnSetting.setBackground(new java.awt.Color(102, 255, 255));
        btnSetting.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnSetting.setForeground(new java.awt.Color(0, 0, 255));
        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Services_48px.png"))); // NOI18N
        btnSetting.setText("Settings");
        btnSetting.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSetting.setName("btnSetting"); // NOI18N

        btnDatabase.setBackground(new java.awt.Color(102, 255, 255));
        btnDatabase.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnDatabase.setForeground(new java.awt.Color(0, 0, 255));
        btnDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add Database_48px.png"))); // NOI18N
        btnDatabase.setText("Database");
        btnDatabase.setName("btnDatabase"); // NOI18N
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

        btnReview.setBackground(new java.awt.Color(102, 255, 255));
        btnReview.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnReview.setForeground(new java.awt.Color(0, 0, 255));
        btnReview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit_48px.png"))); // NOI18N
        btnReview.setText("Review");
        btnReview.setName("btnReview"); // NOI18N
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
        btnPayment.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnPayment.setForeground(new java.awt.Color(0, 0, 255));
        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Money Bag_48px.png"))); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.setName("btnPayment"); // NOI18N
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnAddmovie.setBackground(new java.awt.Color(102, 255, 255));
        btnAddmovie.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnAddmovie.setForeground(new java.awt.Color(0, 51, 255));
        btnAddmovie.setIcon(new javax.swing.ImageIcon("E:\\New Folder\\Frmlogin\\src\\images\\Add Image_48px.png")); // NOI18N
        btnAddmovie.setText("Add movie");
        btnAddmovie.setName("btnAddMovie"); // NOI18N
        btnAddmovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddmovieActionPerformed(evt);
            }
        });

        btnSale.setBackground(new java.awt.Color(102, 255, 255));
        btnSale.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnSale.setForeground(new java.awt.Color(0, 51, 255));
        btnSale.setIcon(new javax.swing.ImageIcon("E:\\New Folder\\Frmlogin\\src\\images\\Land Sales_48px.png")); // NOI18N
        btnSale.setText("Sale movie");
        btnSale.setName("btnSale"); // NOI18N
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnReview, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnTheatre, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnSale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAddmovie, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
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
                .addComponent(btnSale, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(btnAddmovie, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(366, Short.MAX_VALUE)))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fro.jpg"))); // NOI18N
        btnSave.setEnabled(false);
        btnSave.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnSave.setForeground(new java.awt.Color(0, 0, 204));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save_48px.png"))); // NOI18N
        btnSave.setMnemonic('S');
        btnSave.setText("SAVE");
        btnSave.setName("btnSave"); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnDelete.setEnabled(false);
        btnDelete.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnDelete.setForeground(new java.awt.Color(0, 0, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Trash_48px.png"))); // NOI18N
        btnDelete.setMnemonic('D');
        btnDelete.setText("DELETE");
        btnDelete.setName("btnDelete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnDeleteActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        btnAdd.setEnabled(false);
        btnAdd.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnAdd.setForeground(new java.awt.Color(0, 0, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Positive_48px.png"))); // NOI18N
        btnAdd.setMnemonic('A');
        btnAdd.setText("ADD");
        btnAdd.setName("btnAdd"); 
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close Window_48px.png"))); // NOI18N
        btnClose.setMnemonic('C');
        btnClose.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClose.setBorderPainted(false);
        btnClose.setName("btnClose"); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblAutoID.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblAutoID.setForeground(new java.awt.Color(255, 255, 255));
        lblAutoID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Auto ID:");
        
        model.addColumn("ID");
		model.addColumn("UserName");
		model.addColumn("Password");
		
		
		
		Vector row = new Vector();
        while(rsU.next())
        { 
            row = new Vector(UcolC); 
            for(int i = 1; i <= UcolC; i++)
            { 
                row.add(rsU.getString(i)); 
            }     		
     		model.addRow(row);
        }
        
	  
	   
        dtmModel.setBackground(new java.awt.Color(255, 255, 204));
        dtmModel.setModel(model);
        jScrollPane1.setViewportView(dtmModel);

        btnEdit.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 0, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit_48px.png"))); // NOI18N
        btnEdit.setMnemonic('D');
        btnEdit.setText("EDIT");
        btnEdit.setName("btnDelete");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(535, 535, 535)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAutoID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(57, 57, 57)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                                            .addComponent(jLabel7)))
                                    .addGap(186, 186, 186)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(555, 555, 555)
                                .addComponent(jLabel2)))
                        .addGap(101, 101, 101)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAutoID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnDatabaseActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {   
    	dispose();
        Total e=new Total();
        e.show();
} 
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)
    {
    	dispose();
    	Newaccount e=new Newaccount();
    	e.show();
    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
    	btnAdd.setEnabled(true);
		btnDelete.setEnabled(true);
		btnSave.setEnabled(true);
    }
     
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	
        
    	
			int z = dtmModel.getSelectedRow();
			int confirm = JOptionPane.showConfirmDialog(null, "Are you sure want to delete?","Confirm delete user",0);
			if(confirm==0)
			{
				String uid=String.valueOf(model.getValueAt(z, 0));
				model.removeRow(z);
				clsUser.DeleteUser(uid);
			}
		}
          
    private void btnReviewActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {  
    	dispose();
        Review e=new Review();
        e.show();
}                                         

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {    
    	dispose();
        payment e=new payment();
        e.show();
}                                          

    private void btnAddmovieActionPerformed(java.awt.event.ActionEvent evt) {      
    	dispose();
        adiminlogin e=new adiminlogin();
        e.show();
}                                           

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {   
    	dispose();
        Sale e=new Sale();
        e.show();
}                                       

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {      
    	 try {
	        	int z= dtmModel.getSelectedRow();
				int confirm = JOptionPane.showConfirmDialog(null, "Are you sure want to save?","Confirm save user",0);
				if(confirm==0)
				{
					String uid=String.valueOf(model.getValueAt(z, 0));
					String uname=String.valueOf(model.getValueAt(z, 1));
					String upwd=String.valueOf(model.getValueAt(z, 2));
					
					clsUser.EditUser(uid, uname, upwd);
					
					model.getDataVector().removeAllElements();
					Vector row = new Vector();
					ResultSet rsS=clsUser.ViewUser();
					while(rsS.next())
					{ 
					    row = new Vector(UcolC); 
					    for(int i = 1; i <= UcolC; i++)
					    { 
					        row.add(rsS.getString(i)); 
					    } 
					    model.addRow(row);
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new userTable().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddmovie;
    private javax.swing.JToggleButton btnClose;
    private javax.swing.JButton btnDatabase;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnReview;
    private javax.swing.JButton btnSale;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnTheatre;
    private javax.swing.JTable dtmModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutoID;
    // End of variables declaration

}
