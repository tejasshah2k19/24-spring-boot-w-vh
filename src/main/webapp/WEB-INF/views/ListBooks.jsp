<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<br>
	<a href="searchbook">Search</a>
<br><br>
	<table border="1">
		<tr>
			<th>BookId</th>
			<th>BookName</th>
			 
			<th>Action</th>
		</tr>

		<c:forEach items="${books}" var="b">
			<tr>
				<td>${b.bookId}</td>
				<td>${b.bookName}</td>
 				<td>
 				<a href="deletebook?bookId=${b.bookId}">Delete</a>| 
 				<a href="viewbook?bookId=${b.bookId}">View</a> |
 				<a href="editbook?bookId=${b.bookId}">Edit</a>
 				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>