package login;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Classcategory {
	
	private Statement st;
	private ResultSet rs;
	private Connection con;
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	
	public Classcategory()
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
	
	public void InsertCat( String ItemCat) throws IOException
	{
		try
		{
			String query="INSERT INTO tblcategory(category_name) VALUES('"+ItemCat+"')";
			st.execute(query);
		}
		catch (Exception ex)
		{
			
		}
	}
	public ResultSet category()
	{
		try {
			String query="SELECT* FROM tblcategory";
			rs=st.executeQuery(query);
			
		}
		catch(Exception ex)
		{
			
		}
		return rs;
	}
	public void EditCat(String ItemCatID, String ItemCat)
	{
		try
		{
			String query="UPDATE `tblcategory` SET `category_name` = '"+ItemCat+"' WHERE `tblcategory`.`category_id` = "+ItemCatID+"";
			st.execute(query);
		}
		catch (Exception ex)
		{
			
		}
		
	}
	public void DeleteCat(String ItemCatID)
	{
		try
		{
			String query="DELETE FROM `tblcategory` WHERE `tblcategory`.`category_id` = '"+ItemCatID+"'";
			st.execute(query);
		}
		catch (Exception ex)
		{
			
		}
	}
	public ResultSet SearchCat(String ItemCat)
	{
		try
		{
			String query="SELECT * FROM `tblcategory` WHERE category_name LIKE '"+ItemCat+"'";
			rs=st.executeQuery(query);
		}
		catch (Exception ex)
		{
			
		}
		return rs;
	}
}
