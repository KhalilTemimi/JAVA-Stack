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
		<h1>Send an Omikuji!</h1>
		<form action = "/process" method = "post">
		<label>Pick any number from 5 to 25:</label><br>
		<input type="number" min="5" max="25" name="number"><br>
		<label>Enter the name of any city:</label><br>
		<input type="text" name="city"><br>
		<label>Enter the name of any real person:</label><br>
		<input type="text" name="person"><br>
		<label>Enter professional endeavor or hobby:</label><br>
		<input type="text" name="hobby"><br>
		<label>Enter any type of living thing:</label><br>
		<input type="text" name="thing"><br>
		<label>Say something nice to someone:</label><br>
		<textarea name="message" cols = "35" rows = "5"></textarea><br>
		<label>Send and show a friend.</label><br>
		<input type="submit" value = "Send"><br>
		</form>

	</div>
</body>
</html>