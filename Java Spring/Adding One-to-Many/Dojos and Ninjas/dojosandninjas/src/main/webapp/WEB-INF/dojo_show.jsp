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
<title>Dojo</title>
</head>
<body>
	<div class="container" >
		<h1>Dojo : <c:out value="${dojo.name}"/></h1>
		<h3>Ninja List</h3>
		<table class="table table-stripped">
			<tr class="text-center">
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
			<c:forEach var="ninja" items="${dojo.ninjas}">
				<tr class="text-center">
					<td><c:out value="${ninja.first_name}"/></td>
					<td><c:out value="${ninja.last_name}"/></td>
					<td><c:out value="${ninja.age}"/></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>