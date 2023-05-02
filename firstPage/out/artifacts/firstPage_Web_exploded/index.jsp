<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/04/2023
  Time: 05:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home Page</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
  Welcome !<br><br>
  Create Your Account :- <br>

  <form action="CreateServlet" method="post">
  Name : <input type="text" name="inname" required><br>
  Date of Birth : <input type="date"  name="indob" required><br>
  Mobile No. : <input type="number"  name="inmobile" required><br>
  Email Id : <input type="email" name="inemail"required><br>
  Password : <input type="password" name="inpassword" required><br><br>
  Reference ID : <input type="text" name="inreference" required><br><br>
  <input type="submit" value="Create Account">
  </form>
  <br>
  <br>
  Already have an account : <br>
  <button onclick="window.location.href='loginPage.jsp'">Login Now</button>


  </body>
</html>
