<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/04/2023
  Time: 06:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<%
    response.setHeader("Cache-Control", "no-data, no-store, must-revalidate"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); // HTTP 1.0
    response.setHeader("Expires" , "0"); //Proxy

    if (session.getAttribute("username")==null){
        response.sendRedirect("index.jsp");
    }else
%>
Welcome Page !!
<br>
<br>
<label>User Name :- </label>${username}<br>
<label>Date of Birth :- </label>${userdob}<br>
<label>Mobile No. :- </label>${usermobile}<br>
<label>Emaid Id :- </label>${useremail}<br>
<label>Reference Id :- </label>${userreference}<br>
<label>Your Reference Id :- </label>${youruserid12}<br>


<br>
<br>
<form method="get" action="/LogoutServlet">
    <input type="submit" value="Logout">
</form>

</body>
</html>
