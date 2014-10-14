<%-- 
    Document   : newjsp
    Created on : Oct 15, 2014, 1:33:25 AM
    Author     : Administrator
--%>

<%@page import="dao.ScenarioDAO"%>
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
        String scenarioStatus = (String) request.getParameter("scenarioStatus");
        out.println(scenarioStatus);
        boolean statusToUpdate;
        if(scenarioStatus.equals("activate")){
            statusToUpdate = true;
        }else{
            statusToUpdate = false;
        }
        out.println(statusToUpdate);
        
        
        String scenarioID = (String) request.getParameter("scenarioID");
        //call scenarioDAO to update the status of the scenario
        ScenarioDAO.updateScenarioStatus(scenarioID, statusToUpdate);

      
        
        %>
    </body>
</html>
