<%-- 
    Document   : adminAccountsView
    Created on : Sep 10, 2014, 5:43:50 PM
    Author     : weiyi.ngow.2012
--%>

<%@page import="entity.Nurse"%>
<%@page import="entity.Lecturer"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="entity.Admin"%>
<%@page import="dao.NurseDAO"%>
<%@page import="dao.LecturerDAO"%>
<%@page import="dao.AdminDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/foundation.css" />
        <link rel="stylesheet" href="responsive-tables.css">
        <script src="responsive-tables.js"></script>
        <%@include file="/topbar/topbarAdmin.jsp" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accounts Management</title>
    </head>
    <body>
        <%
            AdminDAO adminDAO = new AdminDAO();
            LecturerDAO lecturerDAO = new LecturerDAO();
            NurseDAO nurseDAO = new NurseDAO();
            List<Admin> adminList = adminDAO.retrieveAll();
            List<Lecturer> lecturerList = lecturerDAO.retrieveAll();
            List<Nurse> nurseList = nurseDAO.retrieveAll();
        %>

        <div class="row" style="padding-top: 30px;">
            <div class="large-centered large-12 columns">
                <center>
                    <h1>Administrator Accounts Management</h1>

                    <table class="responsive" id="cssTable">
                        <col width="40%">
                        <col width="40%">
                        <col width="10%">
                        <col width="10%">
                        <tr>
                            <td>User Id</td>
                            <td>Password</td>
                            <td colspan="2" align="center" valign="middle">Actions</td>
                        </tr>
                        <%
                            for (Admin a : adminList) {
                        %>
                        <tr>
                            <td> <%= a.getAdminID()%> </td>
                            <td> <%= a.getAdminPassword()%> </td>
                            <td> 
                                <form action = "ProcessLogin" method = "post">
                                    <input type="hidden" name="adminID" value="<%= a.getAdminID()%>">
                                    <input type="hidden" name="adminPassword" value="<%= a.getAdminPassword()%>">
                                    <input type = "submit" value="edit">
                                </form>
                            </td><td>   
                                <form action = "ProcessLogin" method = "post">
                                    <input type="hidden" name="adminID" value="<%= a.getAdminID()%>">
                                    <input type="hidden" name="adminPassword" value="<%= a.getAdminPassword()%>">
                                    <input type = "submit" value="delete">
                                </form>
                            
                            
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </table>
                </center>
            </div>
        </div>
    </body>
</html>
