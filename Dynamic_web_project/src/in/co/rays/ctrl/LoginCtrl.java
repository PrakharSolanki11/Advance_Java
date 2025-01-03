package in.co.rays.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/LoginCtrl")
public class LoginCtrl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String op = req.getParameter("operation");

		if (op != null) {

			HttpSession session = req.getSession();

			session.invalidate();
		}

		resp.sendRedirect("LoginView.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String op = req.getParameter("operation");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String uri = req.getParameter("uri");

		if (op.equals("signIn")) {

			HttpSession session = req.getSession();

			UserModel model = new UserModel();

			try {
				UserBean bean = model.authenticate(loginId, password);

				if (bean != null) {

					session.setAttribute("user", bean);

					if (uri.equalsIgnoreCase("null")) {
						resp.sendRedirect("Welcome.jsp");
					} else {
						resp.sendRedirect(uri);
					}

				} else {

					req.setAttribute("msg", "LoginID & password is invalid..!!!");

					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					rd.forward(req, resp);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (op.equals("signUp")) {
			resp.sendRedirect("UserRegistrationCtrl");
		}
	}
}
