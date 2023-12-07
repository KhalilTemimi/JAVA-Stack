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
		<div>
			<h1>Expense Details</h1>
			<a href="/">Go Back</a>
		</div>
		<h5>
			Expense Name:
			<c:out value="${saveTravel.expense}" />
		</h5>
		<h5>
			Expense Description:
			<c:out value="${saveTravel.notes}" />
		</h5>
		<h5>
			Vendor:
			<c:out value="${saveTravel.vendor}" />
		</h5>
		<h5>
			Amount Spent: $
			<c:out value="${saveTravel.amount}" />
		</h5>
	</div>
</body>
</html>