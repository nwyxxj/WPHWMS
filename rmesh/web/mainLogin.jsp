<%-- 
    Document   : mainLogin
    Created on : Aug 4, 2014, 1:33:29 PM
    Author     : weiyi.ngow.2012
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospital Ward Management System for NP Health Sciences</title>
    </head>
    <body>
    <center>
        <h1>HSEMR</h1>
        <h2>Enriching Lives, Enriching You</h2> 
        <div class="large-centered large-4 columns">
            
        <% 
            
            String userid = ""; 
            String error = (String) request.getAttribute("error");
            if (error != null) {
                userid = request.getParameter("userid");
                out.println(error);
            }
            
        %> 
        <div class="card">
        <form action = "ProcessLogin" method = "post">
            <table>
                <tr>
                    <td>
                        User ID: 
                    </td>
                    <td>
                        <input type = "text" name = "userid" value = <%= userid %>>
                    </td>
                </tr>
                <tr>
                    <td>
                        Password: 
                    </td>
                    <td>
                        <input type = "password" name = "password">
                    </td>
                </tr>
                <tr>    
                    <td>
                        Domain: 
                    </td>
                    <td>
                        <select name = "userType">
                            <option value="student">NPSTUDENT</option>
                            <option value="lecturer">NPSTAFF</option>
                            <option value="admin">Admin</option>
                        </select>
                    </td>
                </tr>
            </table>
            <p><input type = "submit" value = "Enter"></p>
        </form>
    </center>
    </body>
    </div>
    </div>
</html>
