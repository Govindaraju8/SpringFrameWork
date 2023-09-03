<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.doctorapp.spring.jdbc.model.DoctorsList" %>
<% DoctorsList doctor = (DoctorsList) request.getAttribute("doctor"); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            text-align: center;
        }

        .container {
            background-color: #fff;
            border-radius: 10px;
            padding: 20px;
            width: 80%;
            max-width: 600px;
            margin: 0 auto;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center; /* Center-align the entire content */
        }

        img {
            max-width: 100%;
            height: auto;
            display: block;
            margin: 0 auto;
            border-radius: 5px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
        }

        h4 {
            margin: 10px 0;
            text-align: center; /* Left-align the text within h4 elements */
        }

        button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
      <form action="doctorCalendar" method="GET">
      <!-- Hidden input to store doctor ID -->
      <input type="hidden" name="doctorId" value="${doctor.getDoctorID()}">
					
        <img alt="" src="<%=doctor.getPhoto()%>" width="300" height="200">
        <h4><u>Doctor ID:</u> <%=doctor.getDoctorID() %></h4>
        <h4><u>Name:</u> <%=doctor.getFullname()%></h4>
        <h4><u>Specification ID:</u> <%=doctor.getSpecID()%></h4>
        <h4><u>Qualification:</u> <%=doctor.getQualification()%></h4>
        <h4><u>Experience:</u> <%=doctor.getExperience()%></h4>
        <h4><u>Designation:</u> <%=doctor.getDesignation()%></h4>

            <button type="submit" >Booking Availability</button>
        </form>
    </div>
</body>
</html>
