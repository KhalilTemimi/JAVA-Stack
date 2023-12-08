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
<title>Search</title>
</head>
<body>
	<div class="container" >
	
		<h1>Songs by: <c:out value="${playList.artist}"></c:out></h1>
		<table class="table table-stripped">
			<tr class="text-center">
				<th>Name</th>
				<th>Rating</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="playList" items="${searchedPlayList}">
				<tr class="text-center">
					<td><a href="/songs/${playList.id}"><c:out
								value="${playList.title}"></c:out></a></td>
					<td><c:out value="${playList.rating}"></c:out></td>
					<td><form action="/songs/${playList.id}" method="post">
							<input type="hidden" name="_method" value="delete"><input
								type="submit" value="Delete" class="btn btn-danger">
						</form></td>
				</tr>
			</c:forEach>
		</table>
		<a href="/dashboard">Dashboard</a>
	</div>
</body>
</html>