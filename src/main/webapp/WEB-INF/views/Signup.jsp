<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Signup</h2>


<form action="saveuser" method="post">
	FirstName: <input type="text" name="firstName"/><bR><Br> 
	Email:<input type="text" name="email"/><bR><Br> 
	Password:<input type="text" name="password"/><bR><Br> 
	
	<input type="submit" value="Signup"/> 
</form>

<a href="login">Login</a>
</body>
</html>