package in.co.rays.dynamicpstmt;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		testSearch();
	}

	public static void testSearch() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		bean.setId(5);
//		bean.setRollNo(111);
//		bean.setName("prakhar");

		MarksheetModel model = new MarksheetModel();

		List list = model.search(null, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}

	}

}
