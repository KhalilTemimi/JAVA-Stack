<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- handling form and errors -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dorms</title>
</head>
<body>
	<div class="container">

		<h1 class="text-center">Dorms</h1>
		<nav
			class="navbar navbar-expand-lg navbar-light bg-light justify-content-around">
			<a href="/dorms/new">Add New Dorm</a> <a href="/students/new">Add
				New Student</a>
		</nav>
		<table class="table table-stripped">
			<tr class="text-center">
				<th>Dorm</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="dorm" items="${dorms}">
				<tr class="text-center">
					<td><c:out value="${dorm.name}" /></td>
					<td><a href="dorms/${dorm.id}">See students</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>