<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Book</h1>
	<form:form action = "bookprocess" modelAttribute="book">
		<form:hidden path="id"/>
		Book Name: <form:input path="name" /><br/>
		Book ISBN: <form:input path="isbnNumber" /><br/>
		Book Publish Date: <form:input path="publishDate" /><br/>
		Book Price: <form:input path="price" /><br/>
		Book Type: <form:input path="type" /><br/>

		<button type = "submit">Add Book</button>
	</form:form>
</body>
</html>