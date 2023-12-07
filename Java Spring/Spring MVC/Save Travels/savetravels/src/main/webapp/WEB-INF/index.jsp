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
<title>Save Travels</title>
</head>
<body>
	<div class="container">
		<h1>Save Travels</h1>
		<table class="table table-stripped">
			<tr class="text-center">
				<th>Expenses</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Action</th>
			</tr>
			<c:forEach var="saveTravel" items="${saveTravels}">
				<tr class="text-center">
					<td><a href="/saveTravels/${saveTravel.id}/details"><c:out
								value="${saveTravel.expense}"></c:out></a></td>
					<td><c:out value="${saveTravel.vendor}"></c:out></td>
					<td>$<c:out value="${saveTravel.amount}"></c:out></td>
					<td>
							<a href="/saveTravels/${saveTravel.id}/edit">edit</a>
							<form action="/saveTravels/${saveTravel.id}" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete" class="btn btn-danger">
							</form>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div class="px-50">
			<h3>Add an Expense</h3>
			<div class="row">
				<div class="col-12">
					<form:form action="/saveTravels" method="POST"
						modelAttribute="saveTravel">
						<div class="mb-3">
							<form:label path="expense" class="form-label">Expense Name</form:label>
							<form:errors style="color:red" path="expense" />
							<form:input type="text" path="expense" class="form-control" />
						</div>
						<div class="mb-3">
							<form:label path="vendor" class="form-label">Vendor</form:label>
							<form:errors style="color:red" path="vendor" />
							<form:input type="text" path="vendor" class="form-control" />
						</div>
						<div class="mb-3">
							<form:label path="amount" class="form-label">Amount</form:label>
							<form:errors style="color:red" path="amount" />
							<form:input type="Double" path="amount" class="form-control" />
						</div>
						<div class="mb-3">
							<form:label path="notes" class="form-label">Description</form:label>
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