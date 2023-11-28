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
	<c:forEach var="activity" items="${activities}">
<!-- 	check if the message contains a specific word -->
	<c:if test="${activity.contains('earned')}">
	<p style="color:green;"><c:out value="${activity}"/></p>
	</c:if>
	<c:if test="${activity.contains('lost')}">
	<p style="color:red;"><c:out value="${activity}"/></p>
	</c:if>
	<c:if test="${activity.contains('Spa')}">
	<p style="color:blue;"><c:out value="${activity}"/></p>
	</c:if>
	</c:forEach>
	</div>
</body>
</html>