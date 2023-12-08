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
<title>Show Expense</title>
</head>
<body>
	<div class="container">
		<div class="card w-75">
			<div class="card-body">
				<h5 class="card-title">Song Details</h5>
				<p class="card-text">Title: <c:out value="${playList.title}"/></p>
				<p class="card-text">Atist: <c:out value="${playList.artist}"/></p>
				<p class="card-text">Rating: <c:out value="${playList.rating}"/></p>
			</div>
		</div>
		<a href="/dashboard">Dashboard</a>
	</div>
</body>
</html>