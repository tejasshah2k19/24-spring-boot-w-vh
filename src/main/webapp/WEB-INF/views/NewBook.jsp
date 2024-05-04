<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>New Book</h2>

	<form action="savebook" method="post">
		BookName: <input type="text" name="bookName" /><br>
		<br> AuthorName:<input type="text" name="authorName" /><br>
		<br> <input type="submit" value="SaveBook" />
	</form>
</body>
</html>