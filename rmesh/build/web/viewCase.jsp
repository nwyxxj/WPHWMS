<%-- 
    Document   : patientInfo
    Created on : Sep 10, 2014, 3:27:36 PM
    Author     : Jocelyn
--%>

<%@page import="java.util.List"%>
<%@page import="dao.CaseDAO"%>
<%@page import="entity.Case"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/foundation.css" />

        <script src="js/vendor/modernizr.js"></script>
        <script>
            $(document).ready(function() {
                $(document).foundation();
            });

        </script>
    </head>
    <body>
        <%
        List<Case> caseList= CaseDAO.retrieveAll(); 
        out.print(caseList.size());
        String imgName="";
        String caseID="";
        %>
         
        
        <div class="large-centered large-6 columns">
            <ul id="featured1" data-orbit>
                <%
                    int numOfPage= caseList.size()/3 + 1;
                    for (int i = 0; i < numOfPage; i++) {
                %>
                <li>
                    <%=caseList.size()%>
                    <%
                        for (int j = 0; j < caseList.size(); j++) {
                            Case c= caseList.get(j);
                            caseID= c.getCaseID();
                            out.println(caseID);
                            imgName = "img/0" + 1 + ".jpg";
                    %>
                    <a href="#" data-reveal-id="1">
                        <img src="<%=imgName%>" style="float:left; padding-right:5px;" /></a>

                    <%
                        }
                    %>
                </li>
                <%
                    }

                %>

            </ul>
        </div>
                
         <%
        
        for(int i=0; i<caseList.size(); i++){
            Case c= caseList.get(i);
        %>
                
        <div id="1" class="reveal-modal" data-reveal>
            <h2>Case Information</h2>
            <p class="lead">Case Number: <%=c.getCaseID()%> </p>
            <p class="lead">Case Name: <%=c.getCaseName()%> </p>
            <p class="lead">Case Description: <%=c.getCaseDescription()%> </p>
            <p class="lead">Case Name: <%=c.getAdmissionInfo()%> </p>
            <a class="close-reveal-modal">&#215;</a>
         </div>
               
        <% } %>
        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>