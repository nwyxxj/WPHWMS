<%-- 
    Document   : viewScenarioLecturer
    Created on : Sep 19, 2014, 8:41:03 PM
    Author     : hpkhoo.2012
--%>

<%@page import="entity.Scenario"%>
<%@page import="dao.ScenarioDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="protect.jsp" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Scenario</title>
        <link rel="stylesheet" href="css/foundation.css" />
        <script src="js/vendor/modernizr.js"></script>
        <script>
            $(document).ready(function() {
                $(document).foundation();
            });
        </script>
        <style>
            #color {
                background-color: grey;
                float: left;
            }#opacity    {
                opacity : 0.4;
                filter: alpha(opacity=40); 
            }
        </style>

    </head>
    <body>
        <%            String successMsg = (String) request.getAttribute("successMsg");

            if (successMsg != null) {
                out.println("<center>" + successMsg + "</center>");
                out.println("<br><br>");
            } %>
        <div align ="center">
            <%

                String imgName = "";
                String scenarioID = "";

                List<Scenario> scenarioList = ScenarioDAO.retrieveAll();

                for (int i = 0; i < scenarioList.size(); i++) {
                    Scenario scenario = scenarioList.get(i);
            %>

            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <span class="label"><%= scenario.getStatus()%></span>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <%
                }
            %>
        </div>

        <div class="large-centered large-6 columns">
            <ul id="featured1" data-orbit>

                <%
                    int sizeOfList = scenarioList.size();
                    int numOfPage = sizeOfList / 3;
                    int counter = 0;   
                    
                    for (int i = 0; i <= numOfPage; i++) {
                        
                %>
                  <li>
                     
                    <%   
                        Scenario scenario = null;
                        for (int j = 0; j < 3; j++) {
//                            out.println(counter + "counter");
                            scenario = scenarioList.get(j); //supposed to get Counter, but somehow arrayindexoutofbounds when i put counter.
                            scenarioID = scenario.getScenarioID();
                            counter++;
                            imgName = "img/0" + counter + ".jpg";
                    %>
                    <a href="#" data-reveal-id="<%=scenarioID%>">

                        <% if (scenario.getStatus().equals("activated")) {%>
                        <img class="opaque" src="<%=imgName%>" style="float:left; padding-right:5px;"/></a>

                    <% } else {%>
                    <div id="color">
                        <div id="opacity">
                            <img class="opaque" src="<%=imgName%>" style="float:left; padding-right:5px;"/></a>
                        </div>
                    </div>

                    <%
                            }
                        }
                    %>

                </li>

                <%
                    }

                %>

            </ul>

        </div>

        <%            for (int i = 0; i < scenarioList.size(); i++) {
                Scenario scenario = scenarioList.get(i);
                String status = scenario.getStatus();
        %>

        <div id="<%=scenario.getScenarioID()%>" class="reveal-modal" data-reveal>

            <form action = "ProcessActivateScenario" method = "POST">   
                <h2>Case Information</h2> 
                <%
                    if (status.equals("activated")) {
                %>
                Case is currently activated. 
                <input type ="hidden" id= "status" name = "status" value = "deactivated">
                <input type ="submit" class="button tiny" value = "Deactivate Case">

                <% } else { %>

                Case is deactivated. 
                <input type ="hidden" id= "status" name = "status" value = "activated">               
                <input type ="submit" class="button tiny" value = "Activate Case">
                <%  }%>

                <p class="lead"><b>Case Number:</b> <%=scenario.getScenarioID()%> </p>
                <p class="lead"><b>Case Name:</b> <%=scenario.getScenarioName()%> </p>
                <p class="lead"><b>Case Description:</b> <%=scenario.getScenarioDescription()%> </p>
                <p class="lead"><b>Admission Info:</b> <%=scenario.getAdmissionInfo()%> </p>

                <input type ="hidden" id= "scenarioID" name = "scenarioID" value = "<%=scenario.getScenarioID()%>">


            </form>
            <a class="close-reveal-modal">&#215;</a>
        </div>

        <% }%>
        
        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script> 
    </body>
</html>