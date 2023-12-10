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
<title>Add New Ninja</title>
</head>
<body>
	<div class="container">

		<h3>Add New Ninja</h3>
		<div class="row">
			<div class="col-12">
				<form:form action="/dashboard" method="POST" modelAttribute="ninja">
					<div class="mb-3">
						<form:label path="first_name" class="form-label">First Name: </form:label>
						<form:errors style="color:red" path="first_name" />
						<form:input type="text" path="first_name" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="last_name" class="form-label">Last Name: </form:label>
						<form:errors style="color:red" path="last_name" />
						<form:input type="text" path="last_name" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="age" class="form-label">Age</form:label>
						<form:errors style="color:red" path="age" />
						<form:input type="number" path="age" class="form-control" />
					</div>
					<div>
						<form:label path="dojo" class="form-label">Dojo</form:label>
						<form:select path="dojo">
							<c:forEach var="dojo" items="${dojos}">
								<option value="${dojo.id}">${dojo.name}</option>
							</c:forEach>
						</form:select>
					</div>
					<button type="submit" class="btn btn-primary">Add</button>
				</form:form>
			</div>
		</div>
		<a href="/dashboard">Dashboard</a>
	</div>
</body>
</html>