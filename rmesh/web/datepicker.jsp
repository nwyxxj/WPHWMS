<%-- 
    Document   : datepicker
    Created on : Sep 24, 2014, 12:04:44 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>jQuery UI Datepicker - Default functionality</title>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script>
            $(function() {
                $("#datepicker").datepicker();
            });
        </script>
    </head>
    <body>
        
        
        <form action ="newjsp.jsp" method ="POST">
            <p>Date: <input type="text" id="datepicker" name = "datePicker"></p>
            <input type ="submit" text ="submit"/>
            
        </form>

    </body>
</html>
