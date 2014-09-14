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
<%@include file="protect.jsp" %>
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
            List<Nurse> nurseList = NurseDAO.retrieveAll();
        %>

        <div class="row" style="padding-top: 30px;">
            <div class="large-centered large-12 columns">
                <center>
                    <h1>Nurse Accounts Management</h1>

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
                        <%                            for (Nurse n : nurseList) {
                        %>
                        <tr>
                            <td> <%= n.getNurseID()%> </td>
                            <td> <%= n.getNursePassword()%> </td>
                            <td> 
                                <form action = "EditAccount.jsp" method = "post">
                                    <input type="hidden" name="userID" value="<%= n.getNurseID()%>">
                                    <input type="hidden" name="password" value="<%= n.getNursePassword()%>">
                                    <input type="hidden" name="type" value="nurse">
                                    <input type = "submit" class="button tinytable" value="edit">
                                </form>
                            </td>
                            <%
                                String userLoggedIn = (String) session.getAttribute("user");

                            %>
                            <td>
                                <form action = "ProcessDeleteAccount" method = "post">
                                    <input type="hidden" name="userID" value="<%= n.getNurseID()%>">
                                    <input type="hidden" name="password" value="<%= n.getNursePassword()%>">
                                    <input type="hidden" name="type" value="nurse">
                                    <%
                                        if (userLoggedIn != null && userLoggedIn.equals(n.getNurseID())) {
                                    %>
                                    <!--<input type = "submit" class="button tinytable" value="delete" disabled>-->
                                    Logged in
                                    <%
                                    } else {
                                    %>
                                    <input type = "submit" class="button tinytable" value="delete" >
                                    <%
                                        }
                                    %>
                                </form>
                            </td>
                            <%
                                }
                            %>
                        </tr>

                    </table>
                    <form action = "CreateAccount.jsp" method = "post">
                        <input type="hidden" name="type" value="nurse">
                        <input type = "submit" class="button tiny" value="Create New Account">
                    </form>

                </center>

            </div>
        </div>
    </body>
</html>
