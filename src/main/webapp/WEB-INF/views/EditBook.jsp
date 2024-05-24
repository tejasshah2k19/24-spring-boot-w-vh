<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Edit Book</h2>


	<form>
	
		BookName : <input type="Text" name="bookName" value="${book.bookName}"/><br><Br> 
		
		AuthorName : <input type="text" name="authorName"   value="${book.authorName}"/><br><br> 
		
		
		<input type="submit" value="Update"/>
	</form>

</body>
</html>