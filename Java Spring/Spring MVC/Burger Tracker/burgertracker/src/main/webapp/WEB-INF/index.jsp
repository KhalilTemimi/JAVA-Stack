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
		<h1>Burger Tracker</h1>
		<table class="table table-stripped">
			<tr class="text-center">
				<th>Burger Name</th>
				<th>Restaurant Name</th>
				<th>Rating (out of 5)</th>
				<th>Action</th>
			</tr>
			<c:forEach var="burger" items="${burgers}">
				<tr class="text-center">
					<td><c:out value="${burger.burgerName}"></c:out></td>
					<td><c:out value="${burger.restaurantName}"></c:out></td>
					<td><c:out value="${burger.rating}"></c:out></td>
					<td><a href="/burgers/${burger.id}/edit">edit</a></td>
				</tr>
			</c:forEach>
		</table>
		<div class="px-50">
			<h3>Add a Burger</h3>
			<div class="row">
				<div class="col-12">
					<form:form action="/burgers" method="POST" modelAttribute="burger">
						<div class="mb-3">
							<form:label path="burgerName" class="form-label">Burger Name</form:label>
							<form:errors style="color:red" path="burgerName" />
							<form:input type="text" path="burgerName" class="form-control" />
						</div>
						<div class="mb-3">
							<form:label path="restaurantName" class="form-label">Restaurant Name</form:label>
							<form:errors style="color:red" path="restaurantName" />
							<form:input type="text" path="restaurantName"
								class="form-control" />
						</div>
						<div class="mb-3">
							<form:label path="rating" class="form-label">Rating</form:label>
							<form:errors style="color:red" path="rating" />
							<form:input type="Integer" path="rating" class="form-control" />
						</div>
						<div class="mb-3">
							<form:label path="notes" class="form-label">Notes</form:label>
							<form:errors style="color:red" path="notes" />
							<form:input type="text" path="notes" class="form-control" />
						</div>

						<button type="submit" class="btn btn-primary">Submit</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>