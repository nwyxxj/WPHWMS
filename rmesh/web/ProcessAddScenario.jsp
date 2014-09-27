
<%@page import="dao.PatientDAO"%>
<%@page import="dao.ScenarioDAO"%>
<html>
    <head>

    </head>
    <body>
        <%

            String scenarioName = request.getParameter("scenarioName");
            String scenarioDescription = request.getParameter("scenarioDescription");
            String status = request.getParameter("status");
            String admissionInfo = request.getParameter("admissionInfo");
            String scenarioID = "SC" + (ScenarioDAO.retrieveAll().size()+1);

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

            //Adding Scenario, Patient, etc into the database
            ScenarioDAO.add(scenarioID, scenarioName, scenarioDescription, status, admissionInfo);
            PatientDAO.add(patientNRIC, firstName, lastName, gender, dob, maritalStatus, weight, height, occupation, race, religion, nationality, 1);


        %>
    </body>
</html>
