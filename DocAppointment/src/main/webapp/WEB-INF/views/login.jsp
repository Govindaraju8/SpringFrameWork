<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: #f2f2f2; /* Set a background color */
}

.container {
  background-color: #ffffff; /* White background color for the container */
  padding: 20px;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
  width: 300px;
  margin: 0 auto; /* Center the container horizontally */
  margin-top: 50px;
}

h2 {
  text-align: center;
  color: #333; /* Dark gray text color for the heading */
}

form {
  border: 1px solid #ccc;
  padding: 20px;
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 10px;
  margin: 8px 0;
  border: 1px solid #ccc;
  border-radius: 5px;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

label {
  font-weight: bold;
}

.container label, .container input[type="text"], .container input[type="password"], .container button {
  display: block;
  margin-bottom: 10px;
}

/* Change styles for cancel button on extra small screens */
@media screen and (max-width: 300px) {
  .container button.cancelbtn {
    width: 100%;
  }
}
</style>
</head>
<body>

<div class="container">
  <h2>Patient Login</h2>

  <form action="home" method="POST">
    <label for="uname">Username</label>
    <input type="text" placeholder="Enter Username" name="username" required>

    <label for="psw">Password</label>
    <input type="password" placeholder="Enter Password" name="password" required>
        
    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </form>
</div>

</body>
</html>
