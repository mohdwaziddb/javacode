<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/04/2023
  Time: 11:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<form action="LoginServlet" method="post">
<label>Username : </label>
<input type="text" name="loguser"><br>
<label>Password : </label>
<input type="password" name="logpassword">
    <br><br>
<table border="0" >
    <tr>
        <td align="left"><input type="submit" value="Login"></td>
        <td align="right"><input type="reset" value="Reset"></td>
    </tr>
</table>

</form>
<br>
<table>
    <tr>
        <td>Create Account : <button onclick="window.location.href='index.jsp'">Create Now</button></td>
    </tr>
</table>
</body>
</html>
