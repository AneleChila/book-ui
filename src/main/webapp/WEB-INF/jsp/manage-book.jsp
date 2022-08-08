<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Manage Books</h1>
	<table border = "1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>ISBN</th>
			<th>Date</th>
			<th>Price</th>
            <th>Type</th>
		</tr>
		<c:forEach items="${books}" var = "book">
			<c:url var="editlink" value="get-book">
				<c:param name="id" value="${book.id}" />
			</c:url>
			<c:url var="deletelink" value="delete-book">
				<c:param name="id" value="${book.id}" />
			</c:url>
			<tr>
				<td>${book.id}</td>
				<td>${book.name}</td>
				<td>${book.isbnNumber}</td>
				<td>${book.publishDate}</td>
                <td>${book.price}</td>
                <td>${book.type}</td>
				<td>
					<a href="${editlink}">Edit</a> | <a href="${deletelink}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<button onclick="window.location.href='open-add-book-form'">Add Book</button>
	</div>
</body>
</html>