package login;
import javax.swing.table.*;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClassUser {

	private Statement st;
	private ResultSet rs;
	private Connection con;
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	public ClassUser()
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
	public  boolean checkUser(String name, String password) {
		Connection con = null;
		String sql = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paradise", "root", "");
			sql = "SELECT * FROM tblregister WHERE user_name=? AND user_pass=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception ex) {
			System.out.print(ex.toString());
		}
		return false;
	}

	public  ResultSet ViewUser()
	{
		try
		{
			String query="SELECT* FROM tblregister";
			rs=st.executeQuery(query);
		}
		catch (Exception ex)
		{
		}
		return rs;
	}
	public  ResultSet ViewAdmin()
	{
		try
		{
			String query="SELECT* FROM tbladminsignup";
			rs=st.executeQuery(query);
		}
		catch (Exception ex)
		{
		}
		return rs;
	}
	public ResultSet fillRecord ()
	{
		try
		{
			String query="SELECT* FROM tblregister";
			rs=st.executeQuery(query);
		}
		catch (Exception ex)
		{
		}
		return rs;
	}
	public  ResultSet SearchUser()
	{
		try
		{
			String query="SELECT* FROM tblregister";
			rs=st.executeQuery(query);
		}
		catch (Exception ex)
		{
		}
		return rs;
	}
	public void EditUser(String UserID, String UserName, String UserPwd)
	{
		try
		{
			String query="UPDATE `tblregister` SET `user_name`='"+UserName+"',`user_pass`='"+UserPwd+"";
			st.execute(query);
		}
		catch (Exception ex)
		{
			
		}
	}
	public void DeleteUser(String UserID)
	{
		try
		{
			String query="DELETE FROM `tblregister` WHERE `tblregister`.`user_id` = '"+UserID+"'";
			st.execute(query);
		}
		catch (Exception ex)
		{
			System.out.println("Error Message!");
		}
	}
	
	
}

