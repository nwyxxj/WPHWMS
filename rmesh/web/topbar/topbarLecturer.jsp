<%-- 
    Document   : topbarLecturer
    Created on : Sep 24, 2014, 5:18:42 PM
    Author     : Jocelyn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html><html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <nav class="top-bar" data-topbar>
            <ul class="title-area">
                <li class="name">
                    <h1><a href="#"><img src="img/Logo.png" height="15" width="20">  HS EMR</a></h1>
                </li>
                <!-- Remove the class "menu-icon" to get rid of menu icon. Take out "Menu" to just have icon alone -->
                <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
            </ul>
            <section class="top-bar-section">

                <ul class="left">
                    <li class="has-dropdown">
                        <a href="#">Case Management</a>
                        <ul class="dropdown">
                            <li><a href="#">Manage Case</a></li>
                            <li><a href="#">Create Case</a></li>
                            <li><a href="#">State Transition</a></li>
                        </ul>   
                    </li>
                    <li class="has-dropdown">
                        <a href="#">Student's Submission</a>
                        <ul class="dropdown">
                            <li><a href="#">Multidisciplinary Notes</a></li>
                        </ul>   
                    </li>
                </ul>

                <ul class="right"> 
                    <li><a href="./viewAdminHomePage.jsp">Welcome, Admin!</a></li>
                    <li><a href="ProcessLogout">Log Out</a></li>
                </ul>

                </secion>
        </nav>

        <script src ="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
