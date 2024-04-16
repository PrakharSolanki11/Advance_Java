package in.co.rays.stmt;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class TestUpdate { 
	
	public static void main(String[] args) throws Exception { 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","prakhar");
		
		Statement stmt = conn.createStatement(); 
		
		String sql = "update emp set name = 'Shivam' where id=4";
		
		int i =stmt.executeUpdate(sql); 
		
		System.out.println("Data Updated = "+i);
	}

}
