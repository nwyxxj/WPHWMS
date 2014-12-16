<%-- 
    Document   : viewCaseInformation
    Created on : Oct 31, 2014, 10:51:50 PM
    Author     : weiyi.ngow.2012
--%>

<%@page import="entity.Scenario"%>
<%@page import="dao.ScenarioDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="protectPage/protectNurse.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/foundation.css" />
        <title>NP Health Sciences | Case Information</title>
        <%@include file="/topbar/topbar.jsp" %> 
    </head>
    <body>
    <center>
        <br/><br/><br/>
        <h1>Case Information</h1><br/><br/>
        <div class="large-centered large-8 columns">
            <% Scenario scenarioActivated = ScenarioDAO.retrieveActivatedScenario();
        if (scenarioActivated != null) {%>
            <form action ="viewPatientInformation.jsp" method="post">
                <table>
                    <col width="30%">
                    <col width="70%">

                    <tr>
                        <td>
                            <b>Scenario Name</b>
                        </td>

                        <td> 
                            <%=ScenarioDAO.retrieveActivatedScenario().getScenarioName()%>
                        </td>
                    </tr>
                    <!--<tr>
                        <td>
                            <b>Ward</b>
                        </td>
                        <td> 
                            B
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>Bed</b>
                        </td>
                        <td>
                            B3
                        </td>
                    </tr>-->
                    <tr>
                        <td>
                            <b>Scenario Description </b>
                        </td>

                        <td>
                            <%=ScenarioDAO.retrieveActivatedScenario().getScenarioDescription()%>
                        </td>
                    </tr>

                </table><br/><br/><br/>
                <input type="submit" class="button" value="Proceed">
            </form>
            <%
                    } else { %>
            <p><font size="6">NO CASE ACTIVATED</font><br>
                Please contact administrator/lecturer for case activation.</p>
                <%
                    }
                %>
        </div>
    </center>


</body>
</html>
