<%-- 
    Document   : EditCase
    Created on : Sep 19, 2014, 4:27:53 PM
    Author     : Administrator
--%>

<%@page import="entity.Scenario"%>
<%@page import="dao.ScenarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/foundation.css" />
        <link rel="stylesheet" href="responsive-tables.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/topbar/topbarAdmin.jsp" %>
        <title>JSP Page</title>
    </head>

    <body>
        <%            String scenarioID = request.getParameter("scenarioID");
            Scenario retrievedScenario = ScenarioDAO.retrieve(scenarioID);
        %>


        <div class="row" style="padding-top: 30px;">
            <div class="large-centered large-12 columns">
                <center>
                    <h1>Edit Case's details</h1>
                    <form action = "ProcessEditCase" method = "POST">
                        <div class="row">
                            <div class="large-8 columns">

                                <div class="small-7 columns">
                                    <label for="right-label" class="right inline">Case ID</label>
                                    <label for="right-label" class="right inline">Name</label>
                                    <label for="right-label" class="right inline">Status</label>
                                    <label for="right-label" class="right inline">Description</label>
                                    <label for="right-label" class="right inline">Admission Information</label>
                                </div>
                                
                                    <div class="small-5 columns">
                                        <input type="text" id="right-label" name="scenarioID" value="<%=retrievedScenario.getScenarioID()%>" readonly >
                                        <input type="text" id="right-label" name="scenarioName" value="<%=retrievedScenario.getScenarioName()%>" required >
                                        <br>
                                        <%
                                            if (retrievedScenario.getStatus().equals("activated")) { %>
                                        <input id="right-label" name="status" type="radio" value="activated" checked />activate
                                        <input id="right-label" name="status" type="radio" value="deactivated" /> deactivate
                                        <% } else { %>

                                        <input id="right-label" name="status" type="radio" value="activated" />activate
                                        <input id="right-label" name="status" type="radio" value="deactivated" checked/> deactivate
                                        <% }%>
                                        <br><br>
                                  
                                    
                                      <textarea id="niceTextarea" required><%=retrievedScenario.getScenarioDescription()%>  </textarea>
                                      <textarea id="niceTextarea" required><%=retrievedScenario.getAdmissionInfo()%> </textarea>
                                      
                                    <input type = "submit" class="button tiny" value="Save">  
                                    </div>
                            </div>
                                    
                                  

                        </div>
                    </form>
                </center>
            </div>
        </div>

    </body>
</html>
