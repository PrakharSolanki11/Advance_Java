package in.co.rays.user;


import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUser {

	public static void main(String[] args) throws Exception {

		// testadd();
		// testUpdate();
		// testDelete();
		 testSearch();
		// testMaxId();
	}

	public static void testadd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		UserBean bean = new UserBean();

//		bean.setId(1); 
		bean.setFirstName("Sameer");
		bean.setLastName("Khan");
		bean.setLoginId("sameerkhan@gmail.com");
		bean.setPassword("Sameer@123");
		bean.setDob(sdf.parse("01-01-2002"));
		bean.setAddress("Indore");

		UserModel model = new UserModel();

		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		UserBean bean = new UserBean();

		bean.setId(6);
		bean.setFirstName("Amit");
		bean.setLastName("Tiwari");
		bean.setLoginId("amittiwari@gmail.com");
		bean.setPassword("Amit@123");
		bean.setDob(sdf.parse("01-01-2002"));
		bean.setAddress("Indore");

		UserModel model = new UserModel();

		model.update(bean);

	}

	public static void testDelete() throws Exception {

		UserModel model = new UserModel();

		model.delete(5);
	}

	public static void testMaxId() throws Exception {

		UserBean bean;

		UserModel model = new UserModel();

		bean = model.maxInfo(); 
		
		System.out.println(bean.getId());

	}
//	public static void testMaxId() throws Exception {
//
//		UserModel model = new UserModel();
//
//		model.maxInfo();
//
//	}

	public static void testSearch() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		UserBean bean = new UserBean();
		// bean.setId(2);
		// bean.setFirstName("");
		// bean.setLastName("S");
		bean.setDob(sdf.parse("02-11-2002"));

		UserModel model = new UserModel();

		List list = model.search(bean, 1, 1);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t\t" + bean.getFirstName());
			System.out.print("\t\t" + bean.getLastName());
			System.out.print("\t\t" + bean.getLoginId());
			System.out.print("\t\t" + bean.getPassword());
			System.out.print("\t\t" + bean.getDob());
			System.out.println("\t\t" + bean.getAddress());

		}

	}

}
