<%-- 
    Document   : patientInformation
    Created on : Sep 10, 2014, 2:37:16 PM
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page import="entity.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.*"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" c="text/html; charset=UTF-8">
        <title>Patient Information</title>
        <link rel="stylesheet" href="css/foundation.css" />
        <%@include file="/topbar/topbar.jsp" %> 
    </head>
    <body>

        <%            
            
            Patient patient = PatientDAO.retrieve("S7843522B");
            State stateRetrieved = StateDAO.retrieve("ST1", "SC1");
            Scenario scenarioRetrieved = ScenarioDAO.retrieve("SC1");
            

            //retrieve case's information
            
            String admissionNotes = scenarioRetrieved.getAdmissionInfo();

            //retrieve patient's information
            String firstName = patient.getFirstName();
            String lastName = patient.getLastName();
            String fullName = firstName + " " + lastName;
            String patientNRIC = patient.getPatientNRIC();
            String dob = patient.getDob();
            String gender = patient.getGender();

            //retrieve state's information
            String RR = stateRetrieved.getRR();
            String BP = stateRetrieved.getBP();
            String HR = stateRetrieved.getHR();
            String SPO = stateRetrieved.getSPO();
            String intake = stateRetrieved.getIntake();
            String output = stateRetrieved.getOutput();
            double temperature = stateRetrieved.getTemperature();
        %>
        <br>
        <div align ="center">
            <div class="large-centered large-10 columns">
                <div class="panel">
                    <h5>Patient's Basic Information</h5>
                    <span class="label">Name</span> <%=fullName%>&nbsp;
                    <span class="label">NRIC</span> <%=patientNRIC%>&nbsp;
                    <span class="label">DOB</span> <%=dob%>&nbsp;
                    <span class="label">Gender</span> <%=gender%>&nbsp;
            </p>
                </div></div>
            
            <div class="large-centered large-10 columns">
                <div class="tabs-content">
                    <dl class="tabs" data-tab>
                        <dd class="active"><a href="#panel1">Admission Notes</a></dd>
                        <dd><a href="#panel2">Multidisciplinary Notes</a></dd>
                        <dd><a href="#panel3">Investigations</a></dd>
                        <dd><a href="#panel4">Medication</a></dd>
                        <dd><a href="#panel5">Clinical Chart</a></dd>
                    </dl>

                    <div class="content active" id="panel1">
                       
                        <p><%=admissionNotes%></p>
                    </div>
                    <div class="content" id="panel2">
                       <p>
                            
                            <form>
                            <div class="row">
                                <div class="small-8">
                                    <div class="row">
                                        <div class="small-3 columns">
                                            <label for="right-label" class="right inline">Tutorial Group</label>
                                            <label for="right-label" class="right inline">Group Member Names</label>
                                            <label for="right-label" class="right inline">Multidisciplinary Note</label>
>

                                        </div>
                                        <div class="small-9 columns">
                                            <input type="text" id="right-label" placeholder="abc">
                                            <input type="text" id="right-label" placeholder="fg">
                                            <input type="text" id="right-label>" placeholder="eg">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>

                      <input type="button" value="Submit" class="button tiny">
                      <input type="button" value="Cancel" class="button tiny" onClick="window.location = 'patientInformation.jsp'"/>
                       
                    </p>
                    </div>
                    <div class="content" id="panel3">
                        <p>This is the third panel of the basic tab example. This is the third panel of the basic tab example.</p>
                    </div>
                    <div class="content" id="panel4">
                        <p>This is the fourth panel of the basic tab example. This is the fourth panel of the basic tab example.</p>
                    </div>
                    <div class="content" id="panel5">
                        <p>
                            <!--                        <table border = "0">   
                                                        <tr><td>Respiratory Rate</td>
                                                            <td><input type="text" value ="<%=RR%>" style="width:250px"/></td></tr>
                                                        <tr><td>Blood Pressure</td>
                                                            <td><input type="text" value ="<%=BP%>" style="width:250px"/></td></tr>
                                                        <tr><td>Heart Rate</td>
                                                            <td><input type="text" value ="<%=HR%>" style="width:250px"/></td></tr>
                                                        <tr><td>SPO</td>
                                                            <td><input type="text" value ="<%=SPO%>" style="width:250px"/></td></tr>
                                                        <tr><td>Intake</td>
                                                            <td><input type="text" value ="<%=intake%>" style="width:250px"/></td></tr>
                                                        <tr><td>Output</td>
                                                            <td><input type="text" value ="<%=output%>" style="width:250px"/></td></tr>
                                                        <tr><td>Temperature</td>
                                                            <td><input type="text" value ="<%=temperature%>" style="width:250px"/></td></tr>
                                                    </table>-->

                        <form>
                            <div class="row">
                                <div class="small-8">
                                    <div class="row">
                                        <div class="small-3 columns">
                                            <label for="right-label" class="right inline">Respiratory Rate</label>
                                            <label for="right-label" class="right inline">Blood Pressure</label>
                                            <label for="right-label" class="right inline">Heart Rate</label>
                                            <label for="right-label" class="right inline">SPO</label>
                                            <label for="right-label" class="right inline">Intake</label>
                                            <label for="right-label" class="right inline">Output</label>
                                            <label for="right-label" class="right inline">Temperature</label>
                                        </div>
                                        <div class="small-9 columns">
                                            <input type="text" id="right-label" placeholder="<%=RR%>">
                                            <input type="text" id="right-label" placeholder="<%=BP%>">
                                            <input type="text" id="right-label" placeholder="<%=HR%>">
                                            <input type="text" id="right-label" placeholder="<%=SPO%>">
                                            <input type="text" id="right-label" placeholder="<%=intake%>">
                                            <input type="text" id="right-label" placeholder="<%=output%>">
                                            <input type="text" id="right-label" placeholder="<%=temperature%>">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>

                        <a href="#" class="button">Update Vitals</a>
                        </p>
                    </div>
                </div>

            </div>

        </div>



        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
