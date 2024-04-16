package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicPStmt {

	public static void main(String[] args) throws Exception {

		//testAdd();

		testAdd(27, 130, "gautam", 56, 78, 22);
		testAdd(28, 131, "ayush", 15, 99, 45);
		testAdd(29, 132, "vedant", 11, 66, 76);

	}

	public static void testAdd() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		String sql = "insert into marksheet values(?, ?, ?, ?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, 26);
		pstmt.setInt(2, 110);
		pstmt.setString(3, "lmno");
		pstmt.setInt(4, 80);
		pstmt.setInt(5, 80);
		pstmt.setInt(6, 50);

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted = " + i);

	}

	public static void testAdd(int id, int rollNo, String name, int Phy, int Chemestry, int Math) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		String sql = "insert into marksheet values(?, ?, ?, ?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, id);
		pstmt.setInt(2, rollNo);
		pstmt.setString(3, name);
		pstmt.setInt(4, Phy);
		pstmt.setInt(5, Chemestry);
		pstmt.setInt(6, Math);

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted = " + i);

	}

}
