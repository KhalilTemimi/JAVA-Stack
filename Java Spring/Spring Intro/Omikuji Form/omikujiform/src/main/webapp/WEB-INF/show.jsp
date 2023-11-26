<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!DOCTYPE html>
<html>
<head>
<title>Welcome, again</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<div class = "container">
		<h1>Here's Your Omikuji!</h1>
		<box>In <c:out value = "${number}"/> years, you will live in
		<c:out value = "${city}"/> with <c:out value = "${person}"/> as your roomate,
		<c:out value = "${hobby}"/> for a living. The next time you see a 
		<c:out value = "${thing}"/>, you will have good luck.Also, 
		<c:out value = "${message}"/>.</box><br>
		<a href = "/"> Go Back</a>
		

	</div>
</body>
</html>