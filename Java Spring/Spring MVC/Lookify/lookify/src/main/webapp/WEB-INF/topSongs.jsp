<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- handling form and errors -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Songs</title>
</head>
<body>
	<div class="container" >
	
		<h1>Top Songs</h1>
			<c:forEach var="playList" items="${rangedPlayList}">
				
					<p><c:out value="${playList.rating}"/>
					<a href="/songs/${playList.id}"><c:out value="${playList.title}"/></a>
					 - <c:out value="${playList.artist}"/>
			</c:forEach>
		<a href="/dashboard">Dashboard</a>
	</div>
</body>
</html>