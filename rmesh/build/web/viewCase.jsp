<%-- 
    Document   : patientInfo
    Created on : Sep 10, 2014, 3:27:36 PM
    Author     : Jocelyn
--%>

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
        String imgName="";
        %>
         
        
        <div class="large-centered large-6 columns">
            <ul id="featured1" data-orbit>
                <%

                    for (int i = 0; i < 5; i++) {
                %>
                <li>
                    <%
                        for (int j = 1; j <= 3; j++) {
                            imgName = "img/0" + j + ".jpg";
                    %>
                    <a href="#" data-reveal-id="imgName">
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
                
        <div id="imgName" class="reveal-modal" data-reveal>
            <h2>Bed 1 Information</h2>
            <p class="lead">Your couch.  It is mine.</p>
            <a class="close-reveal-modal">&#215;</a>
         </div>
                
        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>