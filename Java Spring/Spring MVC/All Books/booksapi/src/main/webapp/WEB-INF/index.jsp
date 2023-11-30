<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<h1>All Books</h1>
	<table class="table table-stripped">
		<tr class="text-center">
			<th>ID</th>
			<th>Title</th>
			<th>Language</th>
			<th># Pages</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr class="text-center">
				<td><c:out value = "${book.id}"></c:out></td>
				<td><a href="/books/${book.id}"><c:out value = "${book.title}"></c:out></a></td>
				<td><c:out value = "${book.language}"></c:out></td>
				<td><c:out value = "${book.numberOfPages}"></c:out></td>
			</tr>
		</c:forEach>
			
	</table>
	</div>
</body>
</html>