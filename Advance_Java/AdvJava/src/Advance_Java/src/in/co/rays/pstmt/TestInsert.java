package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "prakhar");

		String sql = "insert into marksheet values(13, 120, 'Amit', 78, 67, 98)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted = " + i);

	}

}
