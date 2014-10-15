/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "ProcessUpdateState", urlPatterns = {"/ProcessUpdateState"})
public class ProcessUpdateState extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String patientNRIC = (String) request.getParameter("patientNRIC");
        double temperature = Double.parseDouble(request.getParameter("temperature"));
        String intake = (String) (request.getParameter("intake"));
        String output = (String) (request.getParameter("output"));

        try {
            
            int RR = Integer.parseInt(request.getParameter("RR"));
            int BP = Integer.parseInt(request.getParameter("BP"));
            int HR = Integer.parseInt(request.getParameter("HR"));
            int SPO = Integer.parseInt(request.getParameter("SPO"));
       
//           
//            VitalDAO.updateVital("S7843522B", temperature, RR, 55, 55, HR, SPO, intake, output);
//            HttpSession session = request.getSession(false);
//            session.setAttribute("active", "vitals");
//            session.setAttribute("successMessageUpdateVitals", "Vital signs have been updated!");
//            response.sendRedirect("./viewPatientInformation.jsp");

        } catch (NumberFormatException e) {
            System.out.println("asdsad");
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
