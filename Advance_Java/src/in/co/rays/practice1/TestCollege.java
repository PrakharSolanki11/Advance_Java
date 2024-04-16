package in.co.rays.practice1;

import java.text.SimpleDateFormat;

public class TestCollege { 
	
	public static void main (String[] args) throws Exception{ 
		
		testAdd();
		
	}

	private static void testAdd() throws Exception{ 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		CollegeBean bean=new CollegeBean();
		
//		bean.setId(1);
		bean.setFirstName("Sameer");
		bean.setLastName("Khan");
		bean.setLoginId("sameerkhan@gamil.com");
		bean.setPassword("Sameer@123");
		bean.setDob(sdf.parse("01-01-2001")); 
		bean.setAddress("Indore"); 
		
		CollegeModel model= new CollegeModel(); 
		
		model.add(bean);
		
	}

}
