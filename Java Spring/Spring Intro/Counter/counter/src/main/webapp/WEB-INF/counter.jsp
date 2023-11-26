<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!DOCTYPE html>
<html>
<head>
	<title>Current visit count</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
<div class="container">
	<h1>You have visited your server <c:out value = "${count}"></c:out> times.</h1>
	<a href = "/">Test another visit?</a>
	</br>
	<a href = "/two">Test another visit for +2 increment?</a>
	</br>
	<form action = "/reset">
	<input type= "submit" value = "reset counter"></input>
	</form>
</div>
</body>
</html>