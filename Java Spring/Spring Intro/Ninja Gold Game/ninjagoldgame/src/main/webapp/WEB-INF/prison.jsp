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
	<div class="container">
	<h1 style="color:red; ">You lost your fortune and you are in debt by <c:out value="${gold}"/> gold.... </h1>
	<form action="/prisonOut" method="post">
	<label>You completed your period you get out with 0 gold fortune.</label>
	<input type="submit" value="Get Out"/>
	</form>
	</div>
</body>
</html>