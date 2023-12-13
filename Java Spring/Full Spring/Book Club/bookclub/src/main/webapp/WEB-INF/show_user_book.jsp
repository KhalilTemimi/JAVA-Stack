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
<title>Read share</title>
</head>
<body>
	<div class="container">
		<h1>
			<c:out value="${book.title}" />
		</h1>
		<a href="/books">Back to the shelves</a>
		<h3>
			You read
			<c:out value="${book.title}" />
			by
			<c:out value="${book.author}" />
		</h3>
		<h3>Here are your thoughts:</h3>
		<h5>
			<c:out value="${book.thoughts}" />
		</h5>
		<a href="/edit/${book.id}">Edit</a>
		<form action="/books/${book.id}" method="post">
			<input type="hidden" name="_method" value="delete"> <input
				type="submit" value="Delete">
		</form>
	</div>
</body>
</html>