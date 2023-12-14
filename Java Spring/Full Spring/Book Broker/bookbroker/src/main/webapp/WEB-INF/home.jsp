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
<title>Login</title>
</head>
<body>
<div class="container">
	<h1>Welcome, <c:out value="${user.userName}"/></h1>
	<a href="/logout">LogOut</a>
	<p>Books from everyone's shelves</p>
	<a href="books/new">+ Add a to my shelf</a>
	<table class="table table-stripped">
		<tr class="text-center">
			<th>ID</th>
			<th>Title</th>
			<th>Author Name</th>
			<th>Posted By</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr class="text-center">
				<td><c:out value = "${book.id}"></c:out></td>
				<td><a href="/books/${book.id}"><c:out value = "${book.title}"></c:out></a></td>
				<td><c:out value = "${book.author}"></c:out></td>
				<td><c:out value = "${book.user.userName}"></c:out></td>
			</tr>
		</c:forEach>
			
	</table>
	<a href="bookBroker">Go to the Book Broker</a>
	</div>
</body>
</html>
