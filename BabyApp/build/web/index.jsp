<%@page import="java.util.List"%>
<%@page import="entity.Baby"%>
<%@page import="dao.BabyDAO"%>
<%
    BabyDAO babyDAO = new BabyDAO();
    List<Baby> babies = babyDAO.retrieveBabies();
    
    if(request.getParameter("id")!=null){
        
    }
%>
<table border="1">
    <tr> 
        <th>Baby ID:</th>
        <th>Baby Name:</th>
        <th>Father Name:</th>
        <th>Mother Name:</th>
        <th>Weight:</th>
        <th>Height:</th>
        <th>Delete</th>
        <th>Fix</th>
    </tr>

<%
    for (Baby baby : babies) {
%>
<tr>
    <td> <%=baby.getBabyId() %></td>
    <td> <%=baby.getBabyName() %></td>
    <td> <%=baby.getFatherName() %></td>
    <td> <%=baby.getMotherName()%> </td>
    <td> <%=baby.getWeight() %> </td>
    <td> <%=baby.getHeight()%> </td>
    <td><a href="delete.jsp?id=<%=baby.getBabyId() %>" ><button>Delete</button></a></td>
    <td><a href="edit.jsp?id=<%=baby.getBabyId() %>" ><button>Fix</button></a></td>

</tr>
<%
    }
%>
</table>