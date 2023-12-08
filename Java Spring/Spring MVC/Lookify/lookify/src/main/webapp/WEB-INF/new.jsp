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
<title>Add Song</title>
</head>
<body>
	<div class="container">

		<h3>Add Song</h3>
		<div class="row">
			<div class="col-12">
				<form:form action="/dashboard" method="POST"
					modelAttribute="playList">
					<div class="mb-3">
						<form:label path="title" class="form-label">Title</form:label>
						<form:errors style="color:red" path="title" />
						<form:input type="text" path="title" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="artist" class="form-label">Artist</form:label>
						<form:errors style="color:red" path="artist" />
						<form:input type="text" path="artist" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="rating" class="form-label">Rating (1-10)</form:label>
						<form:errors style="color:red" path="rating" />
						<form:input type="Integer" path="rating" class="form-control" />
					</div>
					<button type="submit" class="btn btn-primary">Add</button>
				</form:form>
			</div>
		</div>
		<a href="/dashboard">Dashboard</a>
	</div>
</body>
</html>