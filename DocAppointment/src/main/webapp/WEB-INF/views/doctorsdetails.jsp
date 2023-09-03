<%@ page language="java"
	import="java.io.*, java.util.*, com.doctorapp.spring.jdbc.model.DoctorsList"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor List</title>
<style>
html {
	box-sizing: border-box;
}

*, *:before, *:after {
	box-sizing: inherit;
}

.column {
	float: left;
	width: 25%;
	margin-bottom: 16px;
	padding: 0 8px;
}

@media screen and (max-width: 650px) {
	.column {
		width: 50%;
		display: block;
	}
}

.card {
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
}

.container {
	padding: 0 50px;
}

.container::after, .row::after {
	content: "";
	clear: both;
	display: table;
}

.title {
	color: grey;
}

.button {
	border: none;
	outline: 0;
	display: inline-block;
	padding: 8px;
	color: white;
	background-color: #000;
	text-align: center;
	cursor: pointer;
	width: 50%;
}

.button:hover {
	background-color: #555;
}

.card img {
	max-width: 60%;
	/* Adjust this value to control the maximum width of images */
	height: auto;
	
}
</style>
</head>
<body>

	<h1>Doctor List</h1>
	<c:forEach items="${DoctorList}" var="d">
		<div class="row">
			<div class="column">
				<div class="card">
					<form action="http://localhost:8081/DocAppointment/doctordetails" method="POST">
					<!-- Hidden input to store doctor ID -->
                        <input type="hidden" name="doctorId" value="${d.getDoctorID()}">
						<img src="${d.getPhoto()}" alt="doctor image" style="width: 100%">
						<div class="container">
							<h4><u>Name:</u>${d.getFullname()}</h4>     
							<h4><u>Specification id</u>:${d.getSpecID()}</h4>
							<h4><u>Qualification:</u>${d.getQualification()}</h4>
							<h4><u>Experience:</u>${d.getExperience()}</h4>
							<h4><u>Designation:</u>${d.getDesignation()}</h4>
							<p>
								<button class="button">details</button>
							</p>
						</div>
					</form>
				</div>
			</div>
	</c:forEach>
    
</body>
</html>
