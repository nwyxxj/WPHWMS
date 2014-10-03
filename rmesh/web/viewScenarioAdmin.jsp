<%-- 
    Document   : viewCaseAdmin
    Created on : Sep 19, 2014, 3:56:39 PM
    Author     : Administrator
--%>

<%@page import="entity.Scenario"%>
<%@page import="java.util.List"%>
<%@page import="dao.ScenarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Foundation | Welcome</title>
        <link rel="stylesheet" href="css/foundation.css" />
        <script src="js/vendor/modernizr.js"></script>
        <%@include file="/topbar/topbarAdmin.jsp" %>
        <title>JSP Page</title>
    </head>
    <body>

    <center>
        <h1>Case Management</h1>
        <div class ="large-11">
            <%if (session.getAttribute("successMessageCreateScenario") != null) {%>
            <div data-alert class="alert-box success radius">
                The case has been created successfully! 
                <a href="#" class="close">&times;</a>
            </div>
            <%}%>



        </div>

        <%List<Scenario> scenarioList = ScenarioDAO.retrieveAll();%>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Status</th>
                    <th>Description</th>
                    <th>Admission Information</th>
                    <th>Edit</th>
                    <th>Activate/Deactivate</th>
                </tr>
            </thead>
            <tbody>
                <% for (Scenario scenario : scenarioList) {
                        String scenarioID = scenario.getScenarioID();
                        String scenarioName = scenario.getScenarioName();
                        String scenarioDescription = scenario.getScenarioDescription();
                        String status = scenario.getStatus();
                        String admissionInfo = scenario.getAdmissionInfo();%>
                <tr>
                    <td><%=scenarioID%></td>
                    <td><%=scenarioName%></td>
                    <td><%=status%>
                    </td>
                    <td><%=scenarioDescription%></td>
                    <td><%=admissionInfo%></td>
                    <td> <form action ="editScenario.jsp" method ="POST">
                            <input type="hidden" name="scenarioID" value="<%=scenarioID%>">
                            <input type = "submit" class="button tinytable" value="edit">
                        </form></td>
                    <td><form action ="ProcessActivateScenarioAdmin" method ="POST">
                            <input type="hidden" name="scenarioID" value="<%=scenarioID%>">
                            <% if (status.equals("activated")) {%>
                            <input type ="submit" class="button tiny" value = "Deactivate">
                            <input type="hidden" name="status" value="deactivated">
                            <%} else {%>
                            <input type ="submit" class="button tiny" value = "Activate">
                            <%}%></td>
                            <input type="hidden" name="status" value="activated">
                        </form>
                </tr>
            </tbody>
            <%}%>
        </table>

    </center>

    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation.min.js"></script>
    <script>
        $(document).foundation();
    </script>


</body>
</html>
