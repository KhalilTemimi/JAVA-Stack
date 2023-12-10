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
<title>Create Dojo</title>
</head>
<body>
	<div class="container">

		<h3>Create New Dojo</h3>
		<div class="row">
			<div class="col-12">
				<form:form action="/dojos/new" method="POST"
					modelAttribute="dojo">
					<div class="mb-3">
						<form:label path="name" class="form-label">Dojo name: </form:label>
						<form:errors style="color:red" path="name" />
						<form:input type="text" path="name" class="form-control" />
					</div>
					<button type="submit" class="btn btn-primary">Create</button>
				</form:form>
			</div>
		</div>
		<a href="/dashboard">Dashboard</a>
	</div>
</body>
</html>