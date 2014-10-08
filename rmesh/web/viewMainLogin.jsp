<%-- 
    Document   : mainLogin
    Created on : Aug 4, 2014, 1:33:29 PM
    Author     : weiyi.ngow.2012
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/foundation.css" />

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospital Ward Management System for NP Health Sciences</title>
    </head>
    <body style="background-image:url(img/Rate.png)"></body>
    <body>
        <div class="row" style="padding-top: 10px;">

            <div class="large-centered large-5 columns" style = "padding-top:30px;">
                <img src="img/Home.png" width="11771" height="4841" alt="Home"/>
                <%
                    String userid = "";
                    String error = (String) request.getAttribute("error");
                    if (error != null) {
                        userid = request.getParameter("userid");
                %>
                <div data-alert class="alert-box alert round">
                    <%=error%>
                    <a href="viewMainLogin.jsp" class="close">&times;</a>
                </div>
                <%
                    }
                %> 
                <div class="panel" style="background-color: white">
                    <form action = "ProcessLogin" method = "post">
                        <label>User ID:
                            <input type = "text" id = "userid" placeholder = "User ID" name = "userid" value = <%= userid%> > </label>
                        <label>Password:   
                            <input type = "password" class = "password" placeholder = "Password" name = "password"></label> 
                        <label>Role: 
                            <select name = "userType">
                                <option value="student">NPSTUDENT</option>
                                <option value="lecturer">NPSTAFF</option>
                                <option value="admin">ADMIN</option>
                            </select></label> 
                        <br/>
                        <div class="large-centered large-5 columns" style = "padding-top:10px;">
                            <input type = "submit" class="button hms normal" value = "Login">
                            </<div>
                                </form>
                            </div>
                        </div>

                        </body>
                </div>
            </div>
</html>

