package in.co.rays.practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CollegeModel { 
	
	
	public Integer nextPk() throws Exception{  
		
		int pk=0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","root"); 
		
		String sql = "select max(id) from college";
		
		PreparedStatement pstmt = conn.prepareStatement(sql); 
		
		ResultSet rs=pstmt.executeQuery(); 
		
		while(rs.next()) { 
			
			pk= rs.getInt(1);
			
		} 
		return pk+1;
		
		
	}

	public void add(CollegeBean bean) throws Exception { 
		
		int pk=nextPk();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		String sql = "insert into college values(? ,? ,? ,? ,? ,? ,?)"; 
		
		PreparedStatement pstmt = conn.prepareStatement(sql); 
		
		pstmt.setInt(1, pk);
		pstmt.setString(2,bean.getFirstName());
		pstmt.setString(3,bean.getLastName());
		pstmt.setString(4,bean.getLoginId());
		pstmt.setString(5,bean.getPassword());
		pstmt.setDate(6,new java.sql.Date(bean.getDob().getTime()));
		pstmt.setString(7,bean.getAddress()); 
		
		System.out.println("Sql => "+sql);
		
		int i = pstmt.executeUpdate();
		
		System.out.println("Data Inserted = "+i);
	}

}
