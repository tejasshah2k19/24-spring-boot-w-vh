<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

<form action="calculateResult" method="post">
	StudentName : <input type="text" name="studentName" value="${student.studentName}"/>${studentNameError}<br><br> 
	Perc :<input type="text" name="perc"   value="${student.perc}"/>${percError }<br><br> 
	BornYear : <input type="text" name="bornYear"  value="${student.bornYear}"/>${bornYearError}<br><br> 
	
	<input type="submit" value="Result"/>
</form>
</body>
</html>