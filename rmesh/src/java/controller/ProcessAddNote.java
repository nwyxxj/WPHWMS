/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.NoteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hpkhoo.2012
 */
@WebServlet(name = "ProcessAddNote", urlPatterns = {"/ProcessAddNote"})
public class ProcessAddNote extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        try {
            /* TODO output your page here. You may use following sample code. */

            String resultOfButton = request.getParameter("buttonChoosen");

            if (resultOfButton.equals("Submit")) {
                String notes = (String) request.getParameter("notes");
                String tutorialGrp = (String) request.getParameter("tutorialGrp");
                String grpNames = (String) request.getParameter("grpNames");

                String userLoggedIn = (String) request.getSession().getAttribute("user");

                NoteDAO.insertNote(notes, tutorialGrp, grpNames, userLoggedIn);

                HttpSession session = request.getSession(false);
                session.setAttribute("successMessageSavedNotes", "You have successfully submitted the multidisciplinary notes!");
                response.sendRedirect("./viewPatientInformation.jsp");
            } else {

                String notes = (String) request.getParameter("notes");
                String tutorialGrp = (String) request.getParameter("tutorialGrp");
                String grpNames = (String) request.getParameter("grpNames");

                request.setAttribute("notes", notes);
                request.setAttribute("tutorialGrp", tutorialGrp);
                request.setAttribute("grpNames", grpNames);
                
                HttpSession session = request.getSession(false);
                session.setAttribute("successMessageSavedNotes", "You have successfully saved the multidisciplinary notes!");
                response.sendRedirect("./viewPatientInformation.jsp");
               
            }

        } finally {
            out.close();
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
