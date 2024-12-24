<%@ page import="in.co.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		UserBean user = (UserBean) session.getAttribute("user");

		if (user != null) {
	%>


	<H3>
		Hii
		<%=user.getFirstName()%>
	</H3>

    <br>
	<a href="UserCtrl"><b>Add User</b></a>
	<a href="UserListCtrl"><b>User List</b></a>
	<a href="LoginCtrl?operation=logout"><b>Logout</b></a>
    
    <hr>
	<%
		} else {
	%>
	<H3>Hii Guest...</H3>

	<%
		}
	%>
	<hr>
	
</body>
</html>