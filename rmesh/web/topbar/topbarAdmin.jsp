<%-- 
    Document   : topbar
    Created on : Jul 31, 2014, 11:17:54 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <nav class="top-bar" data-topbar>
            <ul class="title-area">
                <li class="name">
                    <h1><a href="./viewAdminHomePage.jsp">HSEMR<img src="img/healthlablogo.jpg" height = "40"></a></h1>

                </li>
                <!-- Remove the class "menu-icon" to get rid of menu icon. Take out "Menu" to just have icon alone -->
                <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
            </ul>
            <secion class="top-bar-section">
                <!-- Right Nav Section -->

                 <ul class="left">
                    <li class="divider"></li>
                    <li><a href="./viewScenarioAdmin.jsp">Case Management</a></li>
                    <li class="divider"></li>
                    <li class="has-dropdown">
                    <a href="#">User Management</a>
                    <ul class="dropdown">
                        <li><a href="./viewAdminAccounts.jsp">Admin</a></li>
                        <li><a href="./viewLecturerAccounts.jsp">Lecturer</a></li>
                        <li><a href="./viewNurseAccounts.jsp">Nurse</a></li>
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
