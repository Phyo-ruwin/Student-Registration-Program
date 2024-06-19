package login;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClassMovie {

	private Statement st;
	private ResultSet rs;
	private Connection con;
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	public ClassMovie()
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
	public void InsertMovie(String icast, String icid, String idire,String itid, String iname, Double irating,String ides, String itype,String ibid ) throws IOException
	{
		try
		{
			String query="INSERT INTO `tblmovie`(`castings`, `category_id`, `director`, `timeId`,  `mname`, `rating`, `review`, `tid`, `cate_id`) VALUES( '"+icast+"',+'"+icid+"','"+idire+"','"+itid+"','"+iname+"','"+irating+"','"+ides+"','"+itype+"','"+ibid+"')";
					
			st.execute(query);                                                                        
		}
		catch (Exception ex)
		{
			System.out.println("sss");
		}
	}
	public ResultSet ViewMovie()
	{
		try
		{
			String query="SELECT* FROM tblmovie";
			rs=st.executeQuery(query);
		}
		catch (Exception ex)
		{
		}
		return rs;
	}
	/*(public ResultSet EditMovie(String icast, String icid, String idire,String itid, String iname, Double irating,String ides, String itype,String ibid) throws IOException
	{
	
		try
		{
			String mid;
			String query="UPDATE `tblmovie` SET `mname`='"+iname+"',`timeId`='"+itid+"',`director`='"+idire+"',`review`='"+ides+"',`category_id`='"+icid+"',`rating`='"+irating+"',`cate_id`='"+itype+"',`castings`='"+icast+"' WHERE `tblmovie`.`mid` = "+mid+"'";
			st.execute(query);
		}
		catch (Exception ex)
		{
			
		}
		return rs;
	}*/
	public void DeleteMovie(String mid)
	{
		try
		{
			String query="DELETE FROM `tblmovie` WHERE `tblmovie`.`mid` = '"+mid+"'";
			st.execute(query);
		}
		catch (Exception ex)
		{
			
		}
	}
	public ResultSet SearchMovie(String UserName)
	{
		try
		{
			String query="SELECT * FROM `tblmovie` WHERE UserName LIKE '"+UserName+"'";
			rs=st.executeQuery(query);
		}
		catch (Exception ex)
		{
			
		}
		return rs;
	}
	
	

	
}

