<%-- 
    Document   : viewCaseStudent
    Created on : Sep 19, 2014, 7:37:45 PM
    Author     : hpkhoo.2012
--%>

<%@page import="entity.Scenario"%>
<%@page import="java.util.*"%>
<%@page import="dao.ScenarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Case Information</title>
        <link rel="stylesheet" href="css/foundation.css" />
        <%@include file="/topbar/topbar.jsp" %>
    </head>
    <body>
        <br>
        <h2><b>Case Information</b></h2>
        <br>
        
       <% 
        //retrieve the list of scenario that has all activated status
         List<Scenario> scenarioActivatedList= ScenarioDAO.retrieveActivatedStatus();
       %>
        <form action = "viewPatientInformation.jsp" method = "GET">
       
        <%
         if(scenarioActivatedList.size()!= 0) {
                //get the most recently activated scenario
                Scenario retrieveLastScenario= scenarioActivatedList.get(scenarioActivatedList.size()-1);
                session.setAttribute("currentScenarioID", retrieveLastScenario.getScenarioID());
                %>
                <h3><b>Case Number:</b> <%=retrieveLastScenario.getScenarioID()%></h3><br>
                <h3><b>Case Name: </b><%=retrieveLastScenario.getScenarioName()%></h3><br>
                <h3><b>Case Description: </b><%=retrieveLastScenario.getScenarioDescription()%></h3><br>
                
                <input type ="submit" class="button tiny" value = "Proceed">
                    
        <%
                
         }else {
             
             out.println("No case has been activated by your lecturer yet.");
         }
         
         
       %> 
    </form> 
    
    </body>
</html>
