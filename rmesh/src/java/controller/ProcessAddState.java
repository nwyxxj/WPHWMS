/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.StateDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "ProcessAddState", urlPatterns = {"/ProcessAddState"})
public class ProcessAddState extends HttpServlet {

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

        String scenarioID = request.getParameter("scenarioID");
        String patientNRIC = request.getParameter("patientNRIC");
        String totalNumberOfStatesString = request.getParameter("totalNumberOfStates");
        int totalNumberOfStates = Integer.parseInt(totalNumberOfStatesString);

        for (int i = 0; i < totalNumberOfStates; i++) {
            String stateID = "ST" + (i + 1);
            String stateDescriptionRetrieve = "stateDescription" + (i + 1);
            String RRNameRetrieve = "RR" + (i + 1);
            String BPNameRetrieve = "BP" + (i + 1);
            String HRNameRetrieve = "HR" + (i + 1);
            String SPONameRetrieve = "SPO" + (i + 1);
            String intakeNameRetrieve = "intake" + (i + 1);
            String outputNameRetrieve = "output" + (i + 1);
            String temperatureNameRetrieve = "temperature" + (i + 1);

            String stateDescription = request.getParameter(stateDescriptionRetrieve);
            String RR = request.getParameter(RRNameRetrieve);
            String BP = request.getParameter(BPNameRetrieve);
            String HR = request.getParameter(HRNameRetrieve);
            String SPO = request.getParameter(SPONameRetrieve);
            String intake = request.getParameter(intakeNameRetrieve);
            String output = request.getParameter(outputNameRetrieve);
            String temperatureString = request.getParameter(temperatureNameRetrieve);
            double temperature = Double.parseDouble(temperatureString);

            StateDAO.add(stateID, scenarioID, RR, BP, HR, SPO, intake, output, temperature, stateDescription, patientNRIC);
            HttpSession session = request.getSession(false);
            session.setAttribute("successMessageCreateScenario","New case has been created successfully!");          
            response.sendRedirect("viewScenarioAdmin.jsp");
            return;
        

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
