<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Camper</title>
</head>
<body>

<p>Welcome to Camp Chippewa!</p>

	<form action = "addCamperServlet" method="post" ><br /><br />  
		First Name: <input type="text" name="fName" ><br /><br />   
		Last Name: <input type="text" name="lName" ><br /><br />  
		Age: <input type="text" name="age" ><br /><br />    
		<input type = "submit" value= "AddCamper" > 
	</form> <br /><br />

	<a href="index.jsp">Home</a>
</body>
</html>