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
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<form:form action="/books/${book.id}" method="POST" modelAttribute="book">
					<input type="hidden" name="_method" value="put">
					<div class="mb-3">
						<form:label path="title" class="form-label">Title</form:label>
						<form:errors path="title" style="color:red" />
						<form:input type="text" path="title" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="author" class="form-label">Author</form:label>
						<form:errors path="author" style="color:red" />
						<form:input type="text" path="author" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="thoughts" class="form-label">My thoughts</form:label>
						<form:errors path="thoughts" style="color:red" />
						<form:input type="text" path="thoughts" class="form-control" />
					</div>
					<button type="submit" class="btn btn-primary">update</button>
				</form:form>
			</div>
		</div>
		<a href="/books">Back to the shelves</a>
	</div>
</body>
</html>