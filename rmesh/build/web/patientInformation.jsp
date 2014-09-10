<%-- 
    Document   : patientInformation
    Created on : Sep 10, 2014, 2:37:16 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Information</title>
        <link rel="stylesheet" href="css/foundation.css" />
        <%@include file="/topbar/topbar.jsp" %> 
    </head>
    <body>
        <dl class="tabs" data-tab>
            <dd class="active"><a href="#panel1">Admission Notes</a></dd>
            <dd><a href="#panel2">Multidisciplinary Notes</a></dd>
            <dd><a href="#panel3">Investigations</a></dd>
            <dd><a href="#panel4">Medication</a></dd>
            <dd><a href="#panel5">Clinical Chart</a></dd>
        </dl>
        <div class="tabs-content">
            <div class="content active" id="panel1">
                <p>This is the first panel of the basic tab example. This is the first panel of the basic tab example.</p>
            </div>
            <div class="content" id="panel2">
                <p>This is the second panel of the basic tab example. This is the second panel of the basic tab example.</p>
            </div>
            <div class="content" id="panel3">
                <p>This is the third panel of the basic tab example. This is the third panel of the basic tab example.</p>
            </div>
            <div class="content" id="panel4">
                <p>This is the fourth panel of the basic tab example. This is the fourth panel of the basic tab example.</p>
            </div>
        </div>
        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
