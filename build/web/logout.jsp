<%-- 
    Document   : logout
    Created on : 21 Apr, 2024, 4:49:23 PM
    Author     : Raja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogOut Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("login.html");
        %>
        
    </body>
</html>
