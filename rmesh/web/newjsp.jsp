<%-- 
    Document   : newjsp
    Created on : Sep 22, 2014, 6:17:48 PM
    Author     : Administrator
--%>

<%@page import="dao.StateDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        
        
        String RR = (String) request.getParameter("RR");
        String BP = (String) request.getParameter("BP");
        String HR = (String) request.getParameter("HR");
        String SPO = (String) request.getParameter("SPO");
        String intake = (String) request.getParameter("intake");
        String output = (String) request.getParameter("output");
        String stateID = (String) request.getParameter("stateID");
     
        String temperatureString = (String) request.getParameter("temperature");
        out.println(RR);
        out.println(BP);
        out.println(HR);
        out.println(SPO);
        out.println(intake);
        out.println(output);
        out.println("State" + stateID);
        
        double temperature = Double.parseDouble(temperatureString);
        out.println(temperature);
        
        StateDAO.updateState(stateID, RR, BP, HR, SPO, intake, output, temperature);
        %>
    </body>
</html>
