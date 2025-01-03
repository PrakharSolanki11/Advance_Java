package in.co.rays.ctrl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;


@WebServlet("/UserCtrl")
public class UserCtrl extends HttpServlet {
         
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		UserModel model = new UserModel(); 
		
		if(id!=null) {
			
			try {
				UserBean bean =model.findByPk(Integer.parseInt(id)); 
				
				req.setAttribute("bean", bean);
			} 
		     catch (Exception e) {
				e.printStackTrace();
			} 
			
			
		}
		RequestDispatcher rd = req.getRequestDispatcher("UserView.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String op = req.getParameter("operation");
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");

		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(loginId);
		System.out.println(password);
		System.out.println(dob);
		System.out.println(address);

		UserBean bean = new UserBean();

		bean.setFirstName(firstName);
		bean.setLastName(lastName);
		bean.setLoginId(loginId);
		bean.setPassword(password);
		try {
			bean.setDob(sdf.parse(dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setAddress(address);

		UserModel model = new UserModel();
		
		if(op.equals("save")) {
			
			try {
				model.add(bean);  
				
				req.setAttribute("msg", "User Added Successfully...!!!");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		
		if(op.equals("update")) {
			
			try {
				model.update(bean); 
				
				bean= model.findByPk(bean.getId()); 
				
				req.setAttribute("bean", bean); 
				
				req.setAttribute("msg", "User Updated Successfully...!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("UserView.jsp");
		rd.forward(req, resp);
	}
}
