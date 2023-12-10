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
<title>Dashboard</title>
</head>
<body>
	<div class="container" >
	
		<nav class="navbar navbar-expand-lg navbar-light bg-light justify-content-around">
			<a href="/dojos/new">Add New Dojo</a>
			<a href="/ninjas/new">Add New Ninja</a>
		</nav>
		<h1>Available Dojo List</h1>
		<ul>
			<c:forEach var="dojo" items="${dojos}">
				<li><a href="dojos/${dojo.id}"><c:out value="${dojo.name}"/></a></li>
			</c:forEach>		
		</ul>
	</div>
</body>
</html>