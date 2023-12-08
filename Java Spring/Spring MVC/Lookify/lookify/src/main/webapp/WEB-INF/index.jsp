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
<title>Lookify</title>
</head>
<body>
	<div class="container" >
	
		<nav class="navbar navbar-expand-lg navbar-light bg-light justify-content-around">
			<a href="/songs/new">Add New</a>
			<a style="color:purple" href="/songs/top-ten">Top Songs</a>
			 <form class="form-inline" action="/search" method="post">
			 <div class="input-group">
    			<input class="form-control" type="search" name="artist" placeholder="Search" aria-label="Search">
    			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  			</div>
  			</form>
		</nav>
		<table class="table table-stripped">
			<tr class="text-center">
				<th>Name</th>
				<th>Rating</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="playList" items="${playLists}">
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
	</div>
</body>
</html>