package login;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Time extends javax.swing.JFrame {

    /** Creates new form Time 
     * @throws SQLException */
    public Time() throws SQLException {
        initComponents();
    }

    DefaultTableModel model = new DefaultTableModel();
    ClassTime clstime=new ClassTime();
	ResultSet rsU=clstime.ShowTime();
	
	ResultSetMetaData rsmt = rsU.getMetaData();
	int UcolC= rsmt.getColumnCount();
   
    private void initComponents() throws SQLException {

        jPanel1 = new javax.swing.JPanel();
        lblParadise = new javax.swing.JLabel();
        lblCinema = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnexit = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTime = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        lblParadise.setBackground(new java.awt.Color(51, 153, 255));
        lblParadise.setFont(new java.awt.Font("U4 Brothers. 00112", 0, 48));
        lblParadise.setForeground(new java.awt.Color(0, 153, 255));
        lblParadise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Machaon Butterfly_48px.png"))); // NOI18N
        lblParadise.setText("Paradise");

        lblCinema.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 36));
        lblCinema.setForeground(new java.awt.Color(0, 153, 255));
        lblCinema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3D Glasses_48px.png"))); // NOI18N
        lblCinema.setText("Cinema");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Film Reel_48px.png"))); // NOI18N

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close Window_48px.png"))); // NOI18N
        btnexit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnexit.setBorderPainted(false);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("U4 Brothers. 00007", 0, 18));
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("Time:");

        btnAdd.setBackground(new java.awt.Color(153, 255, 153));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
       

        btnBack.setBackground(new java.awt.Color(153, 255, 153));
        btnBack.setText("Back");

        btnShow.setBackground(new java.awt.Color(153, 255, 153));
        btnShow.setText("Show");

        btnDelete.setBackground(new java.awt.Color(153, 255, 153));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        for(int i = 1; i <= UcolC; i++) 
		{
			model.addColumn(rsmt.getColumnName(i));
		}
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
        
        tblTime.setBackground(new java.awt.Color(153, 255, 153));
        tblTime.setModel(model);
        jScrollPane1.setViewportView(tblTime);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnShow))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblParadise)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(lblCinema)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblParadise, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCinema, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnBack)
                    .addComponent(btnShow)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {
    	int confirm;
		confirm=JOptionPane.showConfirmDialog(null, "Are you sure want to exit?","Confirm Exit",0);
		if(confirm==0)
		{
			System.exit(confirm);
		}
}

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
    	int z = tblTime.getSelectedRow();
		int confirm = JOptionPane.showConfirmDialog(null, "Are you sure want to delete?","Confirm delete user",0);
		if(confirm==0)
		{
			String uid=String.valueOf(model.getValueAt(z, 0));
			model.removeRow(z);
			clstime.DeleteTime(uid);}
		
			}
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
    	try
		{
			int confirm;
			confirm=JOptionPane.showConfirmDialog(null, "Are you sure want to create?","Confirm Add New Time",0);
			if(confirm==0)
			{
				
				String catname=txtTime.getText();
				ClassTime clsCat= new ClassTime();
				clsCat.InsertTime(catname);
			    txtTime.setText(null);
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
				
			}
			
			
		}
		catch (Exception e)
		{
			
		}
      

}

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new Time().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnShow;
    private javax.swing.JToggleButton btnexit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCinema;
    private javax.swing.JLabel lblParadise;
    private javax.swing.JTable tblTime;
    private javax.swing.JTextField txtTime;
    // End of variables declaration

}
