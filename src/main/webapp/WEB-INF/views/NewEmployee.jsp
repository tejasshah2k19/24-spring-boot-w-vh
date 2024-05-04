<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<h2>New Employee</h2>


	<form action="saveEmployee" method="post">

		FirstName : <input type="text" name="firstName"  value="${employee.firstName}"/> ${firstNameError }<br>
		<br> Email :<input type="email" name="email" value="${employee.email}" />${emailError }<br>
		<br> Passwod: <input type="password" name="password" /><br>
		<br> Age : <input type="text" name="age" /><br> <br>
		Gender : Male<input type="Radio" name="gender" value="male" /> Female<input
			type="Radio" name="gender" value="female" /> <br> <br>
		Address:
		<textarea rows="15" cols="10" name="address"></textarea>
		<Br> <br> City:<select name="city">
			<option value="-1">---Select City----</option>
			<option value="ahmedabad">Ahmedabad</option>
			<option value="surat">Surat</option>
			<option value="baroda">Baroda</option>

		</select> <br> <br> Hobby: Cricket: <input type="checkbox"
			name="hobby" value="ckt"> Whatsapp: <input type="checkbox"
			name="hobby" value="wp"> Instagram: <input type="checkbox"
			name="hobby" value="ig"> PickleBall: <input type="checkbox"
			name="hobby" value="pBall"><br>
		<br> <input type="submit" value="Add Employee" />
	</form>





</body>
</html>