package login;

import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws SQLException {
		
		DbConn conn= new DbConn();
		conn.ViewData();

	}

}