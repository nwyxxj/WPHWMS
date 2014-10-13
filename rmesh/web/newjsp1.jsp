<%-- 
    Document   : newjsp1
    Created on : Oct 13, 2014, 10:10:05 PM
    Author     : Administrator
--%>

<%@page import="dao.VitalDAO"%>
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
            String patientNRIC = "S7843522B";
            Double temperature = 22.0;
            int RR = 11; 
            int BPsystolic = 12; 
            int BPdiastolic = 14;
            int HR = 11; 
            int SPO = 21;
            String intake = "asdasd1";
            String output = "halsdoad";
                
            VitalDAO.updateVital(patientNRIC, 0, 0, 0, BPdiastolic, HR, SPO, intake, output);
        
        %>
    </body>
</html>
