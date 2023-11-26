<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!DOCTYPE html>
<html>
<head>
	<title>Fruity Loops</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
<div class="container">
	<h1>Fruit Store</h1>
	<table class="table table-stripped">
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="fruit" items="${fruits}">
			<tr>
				<td><c:out value = "${fruit.name}"></c:out></td>
				<td><c:out value = "${fruit.price}"></c:out></td>
			</tr>
		</c:forEach>
			
	</table>
</div>
</body>
</html>