
<%@page import="dao.StateDAO"%>
<%@page import="dao.PatientDAO"%>
<%@page import="dao.ScenarioDAO"%>
<html>
    <head>

    </head>
    <body>
        <%
            //Retrieve case information
            String scenarioName = request.getParameter("scenarioName");
            String scenarioDescription = request.getParameter("scenarioDescription");
            String status = request.getParameter("status");
            String admissionInfo = request.getParameter("admissionInfo");
            String scenarioID = "SC" + (ScenarioDAO.retrieveAll().size()+1);
            
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
            
            //Retrieve patient's state
            String stateID = "ST1";
            String RR = request.getParameter("RR");
            String BP = request.getParameter("BP");
            String HR = request.getParameter("HR");
            String SPO = request.getParameter("SPO");
            String intake = request.getParameter("intake");
            String output = request.getParameter("output");
            String temperatureString = request.getParameter("temperature");
            double temperature = Double.parseDouble(temperatureString);
            String stateDescription = request.getParameter("stateDescription");
            
            out.println(scenarioID);
            out.println(scenarioName);
            out.println(scenarioDescription);
            out.println(status);
            out.println(admissionInfo);

            out.println(patientNRIC);
            out.println(firstName);
            out.println(lastName);
            out.println(gender);
            out.println(dob);
            out.println(maritalStatus);
            out.println(weight);
            out.println(height);
            out.println(occupation);
            out.println(race);
            out.println(religion);
            out.println(nationality);
            
            out.println(RR);
            out.println(BP);
            out.println(HR);
            out.println(SPO);
            out.println(intake);
            out.println(output);
            out.println(temperature);
            out.println(stateDescription);
 
            //Adding Scenario, Patient, etc into the database
            ScenarioDAO.add(scenarioID, scenarioName, scenarioDescription, status, admissionInfo);
            PatientDAO.add(patientNRIC, firstName,lastName,gender, dob, maritalStatus, weight, height, occupation, race, religion, nationality, 1);

            StateDAO.add(stateID, scenarioID, RR, BP, HR, SPO, intake, output, temperature, stateDescription, patientNRIC);
        %>
    </body>
</html>
