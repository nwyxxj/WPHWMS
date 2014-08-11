<%@page import="dao.BabyDAO"%>
<%

    String idStr = request.getParameter("id");
    int id = Integer.parseInt(idStr);
    BabyDAO babyDAO = new BabyDAO();
    babyDAO.deleteBaby(id);
    response.sendRedirect("index.jsp");
%>