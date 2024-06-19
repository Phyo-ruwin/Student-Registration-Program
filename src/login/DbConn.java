package login;
import java.sql.*;

public class DbConn {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	public DbConn()
	{
		try 
		{
			con= DriverManager.getConnection("jdbc:mysql://localhost:3305/paradise","root","");
			st=con.createStatement();
		}
		catch (Exception e)
		{
			System.out.println(" Error Message");
		}
	}
	public void InsertData() throws SQLException
	{
		try
		{
			String query="INSERT INTO brand(ItemBrandID,ItemBrand) VALUES('B001','Brand')";
			st.execute(query);
		}
		catch (Exception ex)
		{
			System.out.println("sss");
		}
		
	}
	
	public void ViewData()
	{
		try
		{
			String query="SELECT* FROM brand";
			rs=st.executeQuery(query);
			while(rs.next())
			{
				String bname=rs.getString(1);
				String bid=rs.getString(2);
				System.out.println(bname+"\t"+bid);
			}
		}
		catch (Exception ex)
		{
			System.out.println("error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
