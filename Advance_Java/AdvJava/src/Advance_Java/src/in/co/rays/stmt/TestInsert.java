package in.co.rays.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {   
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "prakhar");
		
		Statement stmt = conn.createStatement();
		
		String sql = "insert into marksheet values (9,119,'Neeraj',22,35,40)";
		
		int i = stmt.executeUpdate(sql);
		
		System.out.println("Date Inserted = "+i);
	}

}
