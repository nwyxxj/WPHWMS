/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "ProcessAddScenario", urlPatterns = {"/ProcessAddScenario"})
public class ProcessAddScenario extends HttpServlet {

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
        
             //Retrieve case information
            String scenarioName = request.getParameter("scenarioName");
            String scenarioDescription = request.getParameter("scenarioDescription");
            String status = request.getParameter("status");
            String admissionInfo = request.getParameter("admissionInfo");
            String scenarioID = "SC" + (ScenarioDAO.retrieveAll().size() + 1);

            //Retrieve patient's information
            String patientNRIC = request.getParameter("patientNRIC");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String gender = request.getParameter("gender");
            String dob = request.getParameter("DOB");
            String maritalStatus = request.getParameter("maritalStatus");
            String weightString = request.getParameter("weight");
            double weight = Double.parseDouble(weightString);

            String heightString = request.getParameter("height");
            double height = Double.parseDouble(heightString);

            String occupation = request.getParameter("occupation");
            String race = request.getParameter("race");
            String religion = request.getParameter("religion");
            String nationality = request.getParameter("nationality");

            //Retrieve patient's default state
            String stateID0 = "ST0";
            String RR0 = request.getParameter("RR0");
            String BP0 = request.getParameter("BP0");
            String HR0 = request.getParameter("HR0");
            String SPO0 = request.getParameter("SPO0");
            String intake0 = request.getParameter("intake0");
            String output0 = request.getParameter("output0");
            String temperatureString0 = request.getParameter("temperature0");
            double temperature0 = Double.parseDouble(temperatureString0);
            String stateDescription0 = ""; //empty for the default state only

            String totalNumberOfStatesString = request.getParameter("totalNumberOfStates");
            //int totalNumberOfStates = Integer.parseInt(totalNumberOfStatesString);

            //Adding Scenario, Patient, State, etc into the database, don't need to send them to the next page
            PatientDAO.add(patientNRIC, "a", "1", "2", dob, maritalStatus, weight, height, occupation, race, religion, nationality, 1);
            ScenarioDAO.add(scenarioID, scenarioName, scenarioDescription, status, admissionInfo);
            StateDAO.add(stateID0, scenarioID, RR0, BP0, HR0, SPO0, intake0, output0, temperature0, stateDescription0, patientNRIC);
            
            
            request.setAttribute("totalNumberOfStates", totalNumberOfStatesString);
            request.setAttribute("scenarioID", scenarioID);
            request.setAttribute("patientNRIC", patientNRIC);
            RequestDispatcher rd = request.getRequestDispatcher("createState.jsp");
            rd.forward(request, response);
        
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
