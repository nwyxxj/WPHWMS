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
            List<Case> caseList = CaseDAO.retrieveAll();
            out.println(caseList.get(0).getStatus());
            String imgName = "";
            String caseID = "";

        %>


        <div class="large-centered large-6 columns">
            <ul id="featured1" data-orbit>
                <%                    
                    int sizeOfList = caseList.size();
                    int numOfPage = sizeOfList / 3;
                    if (sizeOfList % 3 != 0) {
                        numOfPage = numOfPage + 1;
                    }
                    for (int i = 0; i < numOfPage; i++) {
                %>
                <li>
                    <%
                        for (int j = 0; j < caseList.size(); j++) {
                            Case c = caseList.get(j);
                            caseID = c.getCaseID();
                            int counter = j + 1;
                            imgName = "img/0" + counter + ".jpg";
                    %>
                    <a href="#" data-reveal-id="<%=caseID%>">

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
            String successMsg = (String) request.getAttribute("successMsg");      
                
            for (int i = 0; i < caseList.size(); i++) {
                Case c = caseList.get(i);
                String status = c.getStatus();
        %>
        
        <div id="<%=c.getCaseID()%>" class="reveal-modal" data-reveal>
            
            <%  
            if (successMsg != null) {
               out.println(successMsg);
            } 
            %>
            
            <form action = "ActivateCase" method = "POST">   

                <%    
                    request.setAttribute("caseID", "C1"); 
                %>
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
                <%  } %>
                    
                <p class="lead"><b>Case Number:</b> <%=c.getCaseID()%> </p>
                <p class="lead"><b>Case Name:</b> <%=c.getCaseName()%> </p>
                <p class="lead"><b>Case Description:</b> <%=c.getCaseDescription()%> </p>
                <p class="lead"><b>Admission Info:</b> <%=c.getAdmissionInfo()%> </p>
                
                <input type ="hidden" id= "caseID" name = "caseID" value = "<%=c.getCaseID()%>">
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