<!DOCTYPE html>
<%@page import="com.sirion.entity.UserBean"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<form action="add">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="text" name="dob"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
	<h2>${msg}</h2>

	<table border="1">
		<tr>
			<th>UserName</th>
			<th>Name</th>
			<th>Password</th>
			<th>Email</th>
			<th>dob</th>
		</tr>
		<c:forEach var="ub" items="${user}">
			<tr>
				<td>${ub.uname}</td>
				<td>${ub.name}</td>
				<td>${ub.pass}</td>
				<td>${ub.email}</td>
				<td>${ub.dob}</td>
			</tr>
		</c:forEach>
	</table>
	<%-- <%
		List<UserBean> li = (List<UserBean>) request.getAttribute("user");
		if (li != null) {
			for (UserBean ub : li) {
		%>
		<tr>
			<td><%=ub.getUname()%></td>
			<td><%=ub.getName()%></td>
			<td><%=ub.getPass()%></td>
			<td><%=ub.getEmail()%></td>
			<td><%=ub.getDob()%></td>
		</tr>
	
	<%
	}
	}
	%> --%>

</body>
</html>