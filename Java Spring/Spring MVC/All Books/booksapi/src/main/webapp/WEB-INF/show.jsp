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
	<h1>
		<c:out value="${book.title}" />
	</h1>
	<h5>
		Description:
		<c:out value="${book.description}" />
	</h5>
	<h5>
		Language:
		<c:out value="${book.language}" />
	</h5>
	<h5>
		Number Of Pages:
		<c:out value="${book.numberOfPages}" />
	</h5>
	</div>
</body>
</html>