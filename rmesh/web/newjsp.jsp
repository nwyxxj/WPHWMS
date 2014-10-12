<%-- 
    Document   : newjsp
    Created on : Oct 13, 2014, 2:09:31 AM
    Author     : Administrator
--%>

<%@page import="dao.NoteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            //NoteDAO.addNote(6, "asd", 1, "asd123", "1/1/2012", "asd123");
            NoteDAO.insertNote(6, "asd", 1, "asd123", "1/1/2012", "P01");
        
        %>
    </body>
</html>
