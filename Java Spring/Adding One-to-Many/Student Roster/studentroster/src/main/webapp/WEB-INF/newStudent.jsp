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
<title>Add New Student</title>
</head>
<body>
	<div class="container">

		<h3 class="text-center">New Student</h3>
		<a href="/dashboard">Dashboard</a>
		<div class="row">
			<div class="col-12">
				<form:form action="/dashboard" method="POST" modelAttribute="student">
					<div class="mb-3">
						<form:label path="name" class="form-label">Student Name: </form:label>
						<form:errors style="color:red" path="name" />
						<form:input type="text" path="name" class="form-control" />
					</div>
					<div class="dropdown">
						<form:label path="dorm" class="form-label">Dorm</form:label>
						<form:select path="dorm">
							<c:forEach var="dorm" items="${dorms}">
								<option value="${dorm.id}">${dorm.name}</option>
							</c:forEach>
						</form:select>
					</div>
					<button type="submit" class="btn btn-primary">Add</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>