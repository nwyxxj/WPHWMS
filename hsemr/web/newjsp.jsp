<%-- 
    Document   : newjsp
    Created on : Jan 4, 2015, 2:22:27 AM
    Author     : Administrator
--%>

<%@page import="entity.*"%>
<%@page import="dao.*"%>
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
        
        
                    //Retrieve case information
            String scenarioName = request.getParameter("scenarioName");
            String scenarioDescription = request.getParameter("scenarioDescription");
            String admissionInfo = request.getParameter("admissionInfo");
            String scenarioID = "SC" + (ScenarioDAO.retrieveAll().size() + 1);

            //Retrieve patient's information
            String patientNRIC = request.getParameter("patientNRIC");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String gender = request.getParameter("gender");
            String dobString = request.getParameter("DOB");
            String allergy = request.getParameter("allergy");
            String wardID= (String) request.getParameter("ward");


            //Retrieve patient's default state
            String stateID0 = "ST0";
            String temperatureString0 = request.getParameter("temperature0");
            double temperature0 = Double.parseDouble(temperatureString0);
            String RRString0 = request.getParameter("RR0");
            int RR0= Integer.parseInt(RRString0);
            String HRString0 = request.getParameter("HR0");
            int HR0= Integer.parseInt(HRString0);
            String BPSString0 = request.getParameter("BPS");
            int BPS0= Integer.parseInt(BPSString0);
            String BPDString0 = request.getParameter("BPD");
            int BPD0= Integer.parseInt(BPDString0);
            String SPOString0 = request.getParameter("SPO0");
            int SPO0= Integer.parseInt(SPOString0);
 
            String stateDescription0 = "default state"; //for the default state only
            
            //to generate the number of states to fill up
            String totalNumberOfStatesString = request.getParameter("totalNumberOfStates");
            //int totalNumberOfStates = Integer.parseInt(totalNumberOfStatesString);

            //getting ward information to add new patient to a new bed
            Ward wardInfo= WardDAO.retrieve(wardID);
            int newBed= wardInfo.getBedNumber()+1;
            
            //Adding Scenario, Patient, State, etc into the database, don't need to send them to the next page
            //*ORDER OF adding into db, THIS SEQ is important. don't shift it 
            PatientDAO.add(patientNRIC, firstName, lastName, gender, dobString);
            WardDAO.add(wardID, newBed, 1); // 1 because bed is now occupied
//            PatientDAO.add(patientNRIC, firstName, lastName, gender, dob, wardID, newBed);
            
            
            out.println(patientNRIC);
            out.println(firstName);
            out.println(lastName);
            out.println(gender);
            out.println(dobString);
            
            AllergyPatientDAO.add(patientNRIC, allergy);
            ScenarioDAO.add(scenarioID, scenarioName, scenarioDescription, 0, admissionInfo, wardID, newBed);
            StateDAO.add(stateID0, scenarioID, stateDescription0, 0, patientNRIC); //1 because default state status will be activate
            VitalDAO.add(scenarioID, temperature0, RR0, BPS0, BPD0, HR0, SPO0, "", "", "", "", "");
           //StateDAO.add(stateID0, scenarioID, RR0, BP0, HR0, SPO0, intake0, output0, temperature0, stateDescription0, patientNRIC);
           
            session.setAttribute("totalNumberOfStates", totalNumberOfStatesString);
            session.setAttribute("scenarioID", scenarioID);
            session.setAttribute("patientNRIC", patientNRIC);
            //request.setAttribute("totalNumberOfStates", totalNumberOfStatesString);
            //request.setAttribute("scenarioID", scenarioID);

            //request.setAttribute("patientNRIC", patientNRIC);
            //RequestDispatcher rd = request.getRequestDispatcher("createState.jsp");
            //response.sendRedirect("createState.jsp");
//            RequestDispatcher rd = request.getRequestDispatcher("createState.jsp");
//            rd.forward(request, response);
        
        %>
    </body>
</html>
