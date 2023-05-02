<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/04/2023
  Time: 06:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Error</title>
    <link rel="stylesheet" href="style.css">
</head>
<body bgcolor="red">

<%
    response.setHeader("Cache-Control", "no-data, no-store, must-revalidate"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); // HTTP 1.0
    response.setHeader("Expires" , "0"); //Proxy

    if(session.getAttribute("username")==null){
        response.sendRedirect("index.jsp");
    }else
%>

Error :- <%= exception %>


</body>
</html>

