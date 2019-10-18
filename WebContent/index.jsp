<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Camper Home Page</title>
<style>
	body {
		background-color: lightgray;
	}
	
	h1 {
		text-align: center;
		color: green;
	}
</style>
<script>
function newAlert() {
	alert("You clicked the button!");
}

function red() {
	document.getElementById("text").style.color="red";
}

function hide() {
	var x = document.getElementById("myTable");
	if (x.style.display === "none") {
  		x.style.display = "block";
	} else {
  		x.style.display = "none";
	}
}

function size() {
	document.getElementById('header').style.fontSize = 'xx-small';
}

</script>
</head>

<body>
	<!-- Camp Chippewa is based on the movie Addams Family Values. I just watched it this weekend and have it stuck in my head.-->
	<h1 id="header"><i>Welcome to the Camp Chippewa Summer Camp Program!</i></h1>
	<p id="text">We are ready to introduce your children to as many new experiences as possible
	and help each child feel confident and secure in a fun and safe camp environment.
	We are dedicated to molding the lives of our campers as well as creating
	friendships and memories that will last a lifetime.</p>
	
	<p>It is our desire that staff and parents become partners to better serve your
	children. Camp Chippewa is a place for families and we want to do everything 
	possible to strengthen and support your family. Start below to get your camper started!</p>
	
	<table id="myTable">
		<tr>
			<td><a href="addCamper.jsp">Register Now!</a></td>
		</tr>
		<tr>
			<td><a href="unregisterCamperServlet">Unregister a camper</a></td>
		</tr>
		<tr>
			<td><a href="deleteFoodServlet">Delete Food</a></td>
		</tr>
		<tr>
			<td><a href="deleteSuppliesServlet">Delete Supplies</a></td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td><button onclick="red()">Red Text</button></td>
			<td><button onclick="hide()">Toggle Table</button></td>
			<td><button onclick="size()">Change Header Size</button></td>
			<td><button onclick="newAlert()">Click Me!</button></td>
		</tr>
	</table>
</body>
</html>