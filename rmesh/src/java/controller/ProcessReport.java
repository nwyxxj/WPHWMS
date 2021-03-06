/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ReportDAO;
import entity.Report;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author weiyi.ngow.2012
 */
@WebServlet(name = "ProcessReport", urlPatterns = {"/ProcessReport"})
public class ProcessReport extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String[] reportNames = request.getParameterValues("report");
        String currentScenario = (String) request.getSession().getAttribute("currentScenario");

        HttpSession session = request.getSession(false);
        List<Report> reportsToRetrieve = new ArrayList<Report>();
        List<Report> reportsRetrieved = (List<Report>)session.getAttribute("reports");
        if ( reportsRetrieved != null && reportsRetrieved.size() > 0 ) {
            reportsToRetrieve = reportsRetrieved;
        }
       
        if (reportNames != null && reportNames.length > 0) {
            for (String reportName : reportNames) {
                Report report = ReportDAO.retrieve(reportName);
                request.setAttribute("reportName", report.getReportName());
                reportsToRetrieve.add(report);
            }
            session.setAttribute("reports", reportsToRetrieve);
            session.setAttribute("active", "reports");
            RequestDispatcher rd = request.getRequestDispatcher("viewPatientInformation.jsp");
            rd.forward(request, response);
        } else { 
            session.setAttribute("active", "reports");
            response.sendRedirect("viewPatientInformation.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
