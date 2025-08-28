<%-- 
    Document   : registered
    Created on : 13 Oct, 2024, 10:29:05 PM
    Author     : Raja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registered</title>
    </head>
    <body>
        <%
            String username = (String)session.getAttribute("username");
            
        %>
        <h1><%=username%> Registered Successfully....!</h1>
        <h5><a href="login.html">Click here to login</a></h5>
    </body>
</html>
