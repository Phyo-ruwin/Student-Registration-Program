package login;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class Review extends javax.swing.JFrame {

	
   
    public Review() throws SQLException {
        initComponents();
    }

    Classcategory clsCat=new Classcategory();
	ResultSet rsC=clsCat.category();
	
	ClassTime clsBrand=new ClassTime();
	ResultSet rsB=clsBrand.ShowCate();
	
	ClassTime clstime=new ClassTime();
	ResultSet rst=clstime.ShowTime();
	
	ClassTime clsthe=new ClassTime();
	ResultSet rs=clsthe.ShowThe();
	
    private void initComponents() throws SQLException {
    	rsC.last();
		int Ccount=rsC.getRow();
		rsB.last();
		int Bcount=rsB.getRow();
		rst.last();
		int Tcount=rst.getRow();
		rs.last();
		int Hcount=rs.getRow();
    	
    	
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblMovieName = new javax.swing.JLabel();
        lblProducer = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        txtmname = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        comTime = new javax.swing.JComboBox<String>();
        lblType = new javax.swing.JLabel();
        comTherater = new javax.swing.JComboBox<String>();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();
        txtMovieName = new javax.swing.JTextField();
        txtRatings = new javax.swing.JTextField();
        lblTherater1 = new javax.swing.JLabel();
        lblCastings = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        btnClose = new javax.swing.JToggleButton();
        cboCate = new javax.swing.JComboBox();
        txtDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(".\\paradise.png"));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("U4 Brothers. 00112", 0, 48));
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Machaon Butterfly_48px.png"))); // NOI18N
        jLabel1.setText("Paradise");

        jLabel2.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 36));
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3D Glasses_48px.png"))); // NOI18N
        jLabel2.setText("Cinema");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Film Reel_48px.png"))); // NOI18N

        lblTime.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time:");

        lblCategory.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setText("Category:");

        lblMovieName.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblMovieName.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieName.setText("Movie Name:");

        lblProducer.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblProducer.setForeground(new java.awt.Color(255, 255, 255));
        lblProducer.setText("Director:");

        lblDate.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date:");

        lblDescription.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setText("Description:");

        lblRating.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblRating.setForeground(new java.awt.Color(255, 255, 255));
        lblRating.setText("Rating:");

       

        
		
		 final String[] cid= new String[Ccount];
			String[] cname= new String[Ccount];
			cboCate.addItem("Category");
			rsC.first();
			for (int i=0;i<Ccount;i++)
			{
				cid[i]=rsC.getString("category_id");
				cname[i]=rsC.getString("category_name");
				cboCate.addItem(cname[i]);
				rsC.next();
			}
			
			

	    
		final String[] tid= new String[Tcount];
    	String[] tname= new String[Tcount];
    	comTime.addItem("Time");
    	rst.first();
    	for (int i=0;i<Tcount;i++)
    	{
    		tid[i]=rst.getString("timeId");
    		tname[i]=rst.getString("TT");
    		comTime.addItem(tname[i]);
    		rst.next();
    		 
    	}
    	
    	 final String[] bid= new String[Bcount];
 		String[] bname= new String[Bcount];
 		jComboBox1.addItem("Type");
 		rsB.first();
 		for (int i=0;i<Bcount;i++)
 		{
 			bid[i]=rsB.getString("cate_id");
 			bname[i]=rsB.getString("cate_name");
 			jComboBox1.addItem(bname[i]);
 			rsB.next();
 		}
 		
    	final String[] hid= new String[Tcount];
    	String[] hname= new String[Tcount];
    	comTherater.addItem("Theatre");
    	rs.first();
    	for (int i=0;i<Tcount;i++)
    	{
    		hid[i]=rs.getString("tid");
    		hname[i]=rs.getString("tname");
    		comTherater.addItem(hname[i]);
    		rs.next();
    		 
    	}
    	

        lblType.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblType.setForeground(new java.awt.Color(255, 255, 255));
        lblType.setText("Type:");

        

        btnEdit.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnEdit.setForeground(new java.awt.Color(0, 0, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit_50px.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnAdd.setForeground(new java.awt.Color(0, 0, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add Image_50px.png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					int confirm;
					confirm=JOptionPane.showConfirmDialog(null, "Are you sure want to add?","Confirm Add New Item",0);
					if(confirm==0)
					{
						double irating=0.0;
						
						String idire=txtDirector.getText();
						String iname=txtmname.getText();
						String icast=jTextField1.getText();
						irating=Double.valueOf(txtRatings.getText());
						String ides=txtDescription.getText();
						String idate=txtDate.getText();
					    String itype=bid[jComboBox1.getSelectedIndex()-1];
						String icid=cid[cboCate.getSelectedIndex()-1];
						String itid=tid[comTime.getSelectedIndex()-1];
						String ibid=hid[comTherater.getSelectedIndex()-1];
						ClassMovie clsm= new ClassMovie();
						
						clsm.InsertMovie(icast, icid, idire, itid, iname, irating, ides, itype, ibid);
						txtDate.setText(null);
						txtDescription.setText(null);
						txtDirector.setText(null);
						txtmname.setText(null);
						txtRatings.setText(null);
						jTextField1.setText(null);
						comTherater.setSelectedIndex(-1);
						comTime.setSelectedIndex(-1);
						cboCate.setSelectedIndex(-1);
						jComboBox1.setSelectedIndex(-1);
						
					}
				}
				catch (Exception e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
	});
        btnSave.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnSave.setForeground(new java.awt.Color(0, 0, 204));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save_48px.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        btnDelete.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        btnDelete.setForeground(new java.awt.Color(0, 0, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Trash_48px.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtMovieName.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 12));
        txtMovieName.setForeground(new java.awt.Color(0, 0, 204));

        txtRatings.setFont(new java.awt.Font("Tahoma", 2, 14));
        txtRatings.setForeground(new java.awt.Color(0, 255, 0));

        lblTherater1.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblTherater1.setForeground(new java.awt.Color(255, 255, 255));
        lblTherater1.setText("Theratre:");

        lblCastings.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 11));
        lblCastings.setForeground(new java.awt.Color(255, 255, 255));
        lblCastings.setText("Castings:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
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
       
		
       

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRating)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addComponent(lblMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCastings, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblType)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comTime, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtRatings, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comTherater, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboCate, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDirector, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtmname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblTherater1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtmname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRating, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRatings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTherater1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comTherater, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(txtMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCastings, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

   
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {

}

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Save successfully!");
}

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
    	
}

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
}

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
}

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
    	int confirm;
		confirm=JOptionPane.showConfirmDialog(null, "Are you sure want to exit?","Confirm Exit",0);
		if(confirm==0)
		{
			System.exit(confirm);
		}
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
		            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        //</editor-fold>

		        /* Create and display the form */
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                try {
							new Review().setVisible(true);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        });
		   }

   
    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JToggleButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cboCate;
    private javax.swing.JComboBox<String> comTherater;
    private javax.swing.JComboBox<String> comTime;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCastings;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblMovieName;
    private javax.swing.JLabel lblProducer;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblTherater1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtMovieName;
    private javax.swing.JTextField txtRatings;
    private javax.swing.JTextField txtmname;
    // End of variables declaration

}
