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
<title>Login</title>
</head>
<body>
	<div class="container">
		<div class="container">
			<p>Hello, <c:out value="${user.userName}" />. Welcome to..</p>
			<h1>The Book Broker!</h1> 
			<p><a href="/books">Back to the shelves</a></p>
			<p>Available Books to Borrow</p>
			<table class="table table-stripped">
				<tr class="text-center">
					<th>ID</th>
					<th>Title</th>
					<th>Author Name</th>
					<th>Owner</th>
					<th>Actions</th>
				</tr>
				<c:forEach var="book" items="${books}">
				<c:if test="${user.id!=book.borrower.id}">
					<tr class="text-center">
						<td><c:out value="${book.id}"></c:out></td>
						<td><a href="/books/${book.id}"><c:out
									value="${book.title}"></c:out></a></td>
						<td><c:out value="${book.author}"></c:out></td>
						<td><c:out value="${book.user.userName}"></c:out></td>
						<c:if test="${book.user.id==user.id}">
							<td>
								<a href="/edit/${book.id}">Edit</a> | 
								<a href="/books/${book.id}/delete">Delete</a>
							</td>
						</c:if> 
						<c:if test="${book.user.id!=user.id}">
								<td>
								<a href="/books/${book.id}/borrow">Borrow</a>
							</td>
						</c:if> 
					</tr>				
				</c:if>
				</c:forEach>

			</table>
			<p>Book's I'm Borrowing..</p>
			<table class="table table-stripped">
				<tr class="text-center">
					<th>ID</th>
					<th>Title</th>
					<th>Author Name</th>
					<th>Owner</th>
					<th>Actions</th>
				</tr>
				<c:forEach var="book" items="${books}">
				<c:if test="${user.id==book.borrower.id}">
					<tr class="text-center">
						<td><c:out value="${book.id}"></c:out></td>
						<td><a href="/books/${book.id}"><c:out
									value="${book.title}"></c:out></a></td>
						<td><c:out value="${book.author}"></c:out></td>
						<td><c:out value="${book.user.userName}"></c:out></td>
						<td><a href="/books/${book.id}/return">Return</a></td>
					</tr>
				</c:if>
				</c:forEach>

			</table>
		</div>
	</div>
</body>
</html>
