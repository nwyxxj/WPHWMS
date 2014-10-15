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
        <link rel="stylesheet" href="css/foundation.css" />
        <script src="js/vendor/modernizr.js"></script>
        <%@include file="/topbar/topbarAdmin.jsp" %>
        <script type="text/javascript">

            function deleteConfirmation() {
                var deleteButton = confirm("Are you sure you want to delete? ")
                if (deleteButton) {
                    return true;
                }
                else {
                    return false;
                }
            }

        </script>
        <title>Case Management</title>
    </head>
    <body style="font-size:14px; line-height:30px;">
        <br/>
    <center><h3>Case Management</h3></center>
    <center>
        <%
        //retrieve all the success messages 
        
        String successMessageCreateScenario = (String) session.getAttribute("successMessageCreateScenario");
        String successMessageEditScenario = (String) session.getAttribute("successMessageEditScenario");
        
        %>
        
        
        <div class ="large-11">
            <%if (successMessageCreateScenario != null) {%>
            <div data-alert class="alert-box success radius">
                <%=successMessageCreateScenario%>
                <a href="#" class="close">&times;</a>
            </div>
            <%}
                session.getAttribute("successMessageCreateScenario"); %>

            <%if (successMessageEditScenario != null) {%>
            <div data-alert class="alert-box success radius">
                <%=successMessageEditScenario%>
                <a href="#" class="close">&times;</a>
            </div>
            <%}
                session.removeAttribute("successMessageEditScenario"); %>

        </div>
        <%List<Scenario> scenarioList = ScenarioDAO.retrieveAll();%>
        <table border="1" style="border-collapse: collapse; border-color: green;">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Status</th>
                    <th>Description</th>
                    <th>Admission Information</th>
                    <th>Edit</th>
                    <th>Delete</th>
                    <th>Activate/Deactivate</th>

                </tr>
            </thead>
            <tbody>

                <% for (Scenario scenario : scenarioList) {
                        String scenarioID = scenario.getScenarioID();
                        String scenarioName = scenario.getScenarioName();
                        String scenarioDescription = scenario.getScenarioDescription();
                        boolean status = scenario.isScenarioStatus();
                        String admissionInfo = scenario.getAdmissionInfo();%>
                <tr>
                    <td><%=scenarioID%></td>
                    <td><%=scenarioName%></td>
                    <td><% if (status) {%>
                        <font color= limegreen><%=status%></font>
                        <%} else {%>
                        <font color= red><%=status%></font>
                        <%}%></td>
                    <td><%=scenarioDescription%></td>
                    <td><%=admissionInfo%></td>
                    <td>
                        <form action ="editScenario.jsp" method ="POST">
                            <input type="hidden" name="scenarioID" value="<%=scenarioID%>">
                            <input type = "submit" class="button hms tiny" value="edit">
                        </form>
                    </td>

                    <td>                          
                        <form action ="ProcessDeleteScenario" method ="POST">
                            <input type="hidden" name="scenarioID" value="<%=scenarioID%>">
                            <input type = "submit" class="button hms tiny" onclick="if (!deleteConfirmation())
                                        return false" value="delete" >
                        </form>
                    </td>  

                    <td>
                        <form action ="ProcessActivateScenarioAdmin" method ="POST">    <center>
                                <input type="hidden" name="scenarioID" value="<%=scenarioID%>">
                                <% if (status) {%>
                                <input type ="submit" class="button hms tiny" value = "deactivate">
                                <input type="hidden" name="scenarioStatus" value="deactivate">
                                <%} else {%>
                                <input type ="submit" class="button hms tiny" value = "activate">
                                <%}%>
                                <input type="hidden" name="scenarioStatus" value="activate">        </center>
                        </form>

                    </td>


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
</div>  

</body>
</html>
