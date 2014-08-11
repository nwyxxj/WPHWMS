<%@page import="java.util.List"%>
<%@page import="entity.Baby"%>
<%@page import="dao.BabyDAO"%>
<%
    
    String idStr = request.getParameter("id");
    int id = Integer.parseInt(idStr);
    String name = "";
    String father = "";
    String mother="";
    String weight = "";
    String height ="";
            
    BabyDAO babyDAO = new BabyDAO();
    List<Baby> babies = babyDAO.retrieveBabies();
    
    for(Baby baby: babies) {
        if(baby.getBabyId()==id){
            name = baby.getBabyName();
            father = baby.getFatherName();
            mother = baby.getMotherName();
            weight = String.valueOf(baby.getWeight());
            height = String.valueOf(baby.getHeight());
        }
    }
    
%>
<form action="index.jsp" method="POST">
    Baby ID:
    <input type="text" name="id" value=<%=idStr %>><br/>
    Baby Name:
    <input type="text" name="name" value=<%=name %>><br/>
    Father Name:
    <input type="text" name="father" value=<%=father %>><br/>
    Mother Name:
    <input type="text" name="mother" value=<%=mother %>><br/>
    Weight:
    <input type="text" name="weight" value=<%=weight %>><br/>
    Height:
    <input type="text" name="height" value=<%=height %>><br/>
    <input type="submit" value="Update"/><br/>
</form>