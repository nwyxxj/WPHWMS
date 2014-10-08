<%-- 
    Document   : adminHomePage
    Created on : Aug 4, 2014, 2:00:22 PM
    Author     : weiyi.ngow.2012
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="protect.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>HS EMR - Lecturer's Portal</title>
         <%@include file="/topbar/topbarLecturer.jsp" %>
    </head>
    <body>
        <h1>Welcome, lecturer</h1>
         <br><br>
        <center><jsp:include page="viewScenarioLecturer.jsp" /></center>
    </body>
</html>
