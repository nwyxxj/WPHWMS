/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.NoteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
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
            //to determine if user selects submit or save button
            String resultOfButton = request.getParameter("buttonChoosen");

            if (resultOfButton.equals("Submit")) {
                
                String notes = (String) request.getParameter("notes");
                String grpNames = (String) request.getParameter("grpNames");
                String scenarioID= (String) request.getParameter("scenarioID");

                String practicalGrpLoggedIn = (String) request.getSession().getAttribute("nurse");
                Date dateTime = new Date();
                
                HttpSession session = request.getSession(false);
                
                if(notes.trim().equals("") && grpNames.trim().equals("")){
                     session.removeAttribute("notes");
                      session.removeAttribute("grpNames");
                    session.setAttribute("active", "multidisciplinary");
                    session.setAttribute("error", "Please fill in both fields before submitting.");
                    response.sendRedirect("./viewPatientInformation.jsp");
                }else if(notes.trim().equals("")){
                    session.setAttribute("active", "multidisciplinary");
                    session.setAttribute("grpNames", grpNames);
                    session.removeAttribute("notes");
                   
                    session.setAttribute("error", "Please fill in Multidisciplinary Notes before submitting.");
                    response.sendRedirect("./viewPatientInformation.jsp");
                 
                }else if(grpNames.trim().equals("") ) {
                    session.setAttribute("active", "multidisciplinary");
                    session.setAttribute("notes", notes);
                    session.removeAttribute("grpNames");
                    
                    session.setAttribute("error", "Please fill in Group Names before submitting.");
                    response.sendRedirect("./viewPatientInformation.jsp");
                }else{
                    NoteDAO.insertNote(notes, grpNames, dateTime , practicalGrpLoggedIn, scenarioID );
                    session.removeAttribute("grpNames");
                    session.removeAttribute("notes");
                    session.setAttribute("active", "multidisciplinary");
                    session.setAttribute("success", "You have successfully submitted the multidisciplinary notes!");
                    response.sendRedirect("./viewPatientInformation.jsp");
                }
                
            } else {

                String notes = (String) request.getParameter("notes");
                String grpNames = (String) request.getParameter("grpNames");

                //request.setAttribute("notes", notes);
                //request.setAttribute("grpNames", grpNames);
                
                HttpSession session = request.getSession(false);
                
                session.setAttribute("notes", notes);
                session.setAttribute("grpNames", grpNames);
                
                session.setAttribute("active", "multidisciplinary");
                session.setAttribute("success", "You have successfully saved the multidisciplinary notes!");
                 response.sendRedirect("./viewPatientInformation.jsp");
                //MUST BE Request dispatcher if not saved won't work
               // RequestDispatcher rd = request.getRequestDispatcher("/viewPatientInformation.jsp");
               // rd.forward(request, response); 
               
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
