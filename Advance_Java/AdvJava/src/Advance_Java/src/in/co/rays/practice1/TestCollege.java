package in.co.rays.practice1;

import java.text.SimpleDateFormat;

public class TestCollege {

	public static void main(String[] args) throws Exception {
		
		//testAdd();
		//testUpdate(); 
		testDelete();
	}

	public static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		CollegeBean bean = new CollegeBean();

//		bean.setId(1);
		bean.setFirstName("");
		bean.setLastName("");
		bean.setLoginId("");
		bean.setPassword("");
		bean.setDob(sdf.parse("02-11-2002"));
		bean.setAddress("");

		CollegeModel model = new CollegeModel();

		model.add(bean);

	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		CollegeBean bean = new CollegeBean();
		
		bean.setId(5);
		bean.setFirstName("Neeraj");
		bean.setLastName("Patil");
		bean.setLoginId("neerajpatil@gamil.com");
		bean.setPassword("Neeraj@123");
		bean.setDob(sdf.parse("07-11-2002"));
		bean.setAddress("Indore");
		

		CollegeModel model = new CollegeModel();

		model.update(bean);

	} 
	
	public static void testDelete()throws Exception{
		
		CollegeModel model = new CollegeModel();
		
		model.delete(7);
		
	}
}
