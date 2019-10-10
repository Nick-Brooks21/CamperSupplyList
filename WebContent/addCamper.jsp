<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Add a Camper</title>
</head>
<body>

<h1 class = "page-title">Welcome to Camp Chippewa!</h1>

	<form action = "addCamperServlet" method="post" ><br /><br />  
		First Name: <input type="text" name="fName" ><br /><br />   
		Last Name: <input type="text" name="lName" ><br /><br />  
		Age: <input type="text" name="age" ><br /><br />    
		<input type = "submit" value= "AddCamper" > 
	</form> <br /><br />

	<a href="index.jsp">Home</a>
</body>
</html>