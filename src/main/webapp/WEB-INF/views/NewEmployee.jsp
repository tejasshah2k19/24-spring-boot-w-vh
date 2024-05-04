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
		
		
		Gender : Male<input type="Radio" name="gender" value="male" ${employee.gender.equals("male")?"checked":""} /> Female<input
			type="Radio" name="gender" value="female"  ${employee.gender.equals("female")?"checked":""}/>${genderError } <br> <br>
		Address:
		<textarea rows="15" cols="10" name="address"  >${employee.address }</textarea>
		<Br> <br> City:<select name="city">
			<option value="-1">---Select City----</option>
			<option value="ahmedabad"  ${employee.city.equals("ahmedabad")?"selected":""}>Ahmedabad</option>
			<option value="surat" ${employee.city.equals("surat")?"selected":""}>Surat</option>
			<option value="baroda" ${employee.city.equals("baroda")?"selected":""}>Baroda</option>

		</select> ${cityError}
		
		<br> <br> Hobby: Cricket: <input type="checkbox" 
			name="hobby" value="ckt"> Whatsapp: <input type="checkbox"
			name="hobby" value="wp"> Instagram: <input type="checkbox"
			name="hobby" value="ig"> PickleBall: <input type="checkbox"
			name="hobby" value="pBall"><br>
		<br> <input type="submit" value="Add Employee" />
	</form>





</body>
</html>