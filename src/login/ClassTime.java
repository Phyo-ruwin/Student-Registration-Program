package login;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class ClassTime {
	
	private Statement st;
	private ResultSet rs;
	private Connection con;
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	
	public ClassTime()
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
	
	public void InsertTime( String ItemCat) throws IOException
	{
		try
		{
			String query="INSERT INTO tblTT(TT) VALUES('"+ItemCat+"')";
			st.execute(query);
		}
		catch (Exception ex)
		{
			
		}
	}
	public ResultSet ShowTime()
	{
		try {
			String query="SELECT* FROM tblTT";
			rs=st.executeQuery(query);
			
		}
		catch(Exception ex)
		{
			
		}
		return rs;
	}
	public ResultSet ShowThe()
	{
		try {
			String query="SELECT* FROM tbltheatre";
			rs=st.executeQuery(query);
			
		}
		catch(Exception ex)
		{
			
		}
		return rs;
	}
	public ResultSet ShowCate()
	{
		try {
			String query="SELECT* FROM category";
			rs=st.executeQuery(query);
			
		}
		catch(Exception ex)
		{
			
		}
		return rs;
	}
	public void EditTime(String ItemCatID, String ItemCat)
	{
		try
		{
			String query="UPDATE `tblTT` SET `TT` = '"+ItemCat+"' WHERE `tblTT`.`timeId` = "+ItemCatID+"";
			st.execute(query);
		}
		catch (Exception ex)
		{
			
		}
		
	}
	public void DeleteTime(String ItemCatID)
	{
		try
		{
			String query="DELETE FROM `tblTT` WHERE `tblTT`.`timeId` = '"+ItemCatID+"'";
			st.execute(query);
		}
		catch (Exception ex)
		{
			
		}
	}
}

	
