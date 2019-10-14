<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Add a Camper</title>
<style>
	body {
		background-color: lightgray;
	}
	
	h2 {
		text-align: center;
		color: green;
	}
</style>
</head>
<body>

<h2>Welcome to Camp Chippewa!</h2>

	<form action = "addCamperServlet" method="post" >
		<table>
			<tr>
				<td>First Name: <input type="text" name="fName" ></td><br /><br />   
				<td>Last Name: <input type="text" name="lName" ></td><br /><br />  
				<td>Age: <input type="text" name="age" ></td><br /><br />
			</tr>  
		</table>    
		<input type = "submit" value= "AddCamper" > 
	</form> <br /><br />

	<a href="index.jsp">Home</a>
</body>
</html>