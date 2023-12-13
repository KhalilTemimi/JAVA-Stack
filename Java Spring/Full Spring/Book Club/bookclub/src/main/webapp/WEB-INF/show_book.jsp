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
			<span style="color:#D85552"><c:out value="${book.user.userName}" /></span>
			read
			<span style="color:#AB2EFE"><c:out value="${book.title}" /></span>
			by
			<span style="color:#14A522"><c:out value="${book.author}" /></span>
		</h3>
		<h3>
			Here are
			<c:out value="${book.user.userName}" />
			's thoughts:
		</h3>
		<h5>
			<c:out value="${book.thoughts}" />
		</h5>
	</div>
</body>
</html>