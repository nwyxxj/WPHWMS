<%-- 
    Document   : viewPatientInformation
    Created on : Sep 10, 2014, 2:37:16 PM
    Author     : Administrator
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="javax.swing.JLabel"%>
<%@page import="javax.swing.ImageIcon"%>
<%@page import="java.awt.Image"%>
<%@page import="java.util.List"%>
<%@page import="entity.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.*"%>
<%@include file="protect.jsp" %>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="css/foundation.css" />
        <script src="js/vendor/modernizr.js"></script>
        <title>Patient Information</title>
        <%@include file="/topbar/topbar.jsp" %> 
    </head>
    <body>

        <%            //retrieve all successfulmessages
            String successMessageUpdateVitals = (String) session.getAttribute("successMessageUpdateVitals");
            String successMessageSavedNotes = (String) session.getAttribute("successMessageSavedNotes");

            Patient patient = PatientDAO.retrieve("S7843522B");
            State stateRetrieved = StateDAO.retrieve("ST1", "SC1");
            Scenario scenarioRetrieved = ScenarioDAO.retrieve("SC1");

            //retrieve case's information
            String admissionNotes = scenarioRetrieved.getAdmissionInfo();

            //retrieve note's information
            List<Note> notesListRetrieved = NoteDAO.retrieveAll();

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
            String stateID = stateRetrieved.getStateID();
            String scenarioID = scenarioRetrieved.getScenarioID();

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
                <%
                    //printing of all the success message
                    if (successMessageSavedNotes != null) {%>
                <div data-alert class="alert-box success radius"><%=successMessageSavedNotes%><a href="#" class="close">&times;</a></div>
                <%
                        session.removeAttribute("successMessageSavedNotes");
                    }
                    if (successMessageUpdateVitals != null) {%>
                <div data-alert class="alert-box success radius"><%=successMessageUpdateVitals%><a href="#" class="close">&times;</a></div>
                <% session.removeAttribute("successMessageUpdateVitals");
                    }
                %>
                <div class="tabs-content">
                    <dl class="tabs" data-tab>
                        <dd class="active"><a href="#panel1">Admission Notes</a></dd>
                        <dd><a href="#panel2">Investigations</a></dd>
                        <dd><a href="#panel3">Medication</a></dd>
                        <dd><a href="#panel4">Clinical Chart</a></dd>
                        <dd><a href="#panel5">Multidisciplinary Notes</a></dd>
                    </dl>

                    <div class="content active" id="panel1">
                        <p><%=admissionNotes%></p>
                    </div>

                    <div class="content" id="panel2">

                        <%
                            List<Report> reports = ReportDAO.retrieveAll();

                            if (reports == null || reports.size() <= 0) {
                                out.println("");
                            } else {
                                int reportsToDisplay = 0;
                        %>
                        <form  action = "ProcessReport" method = "POST"> 
                            <%
                                String currentScenarioID = (String) session.getAttribute("currentScenarioID");

                                for (Report report : reports) {

                                    if (report.getScenarioID().equals(currentScenarioID) && report.getStateID().equals("ST1")) {
                                        reportsToDisplay++;
                            %>

                            <input  type = "checkbox" name = "report" value ="<%=report.getReportName()%>" /><%=report.getReportName()%><br>
                            <input type="hidden" name="location" value="<%=report.getReportFile()%>"/><br>
                            <%
                                    }

                                }
                                if (reportsToDisplay != 0) {
                            %>

                            <input type="submit" value="Retrieve Report"/>   

                            <%
                                    } else {

                                        out.println("");
                                    }
                                }
                            %>                            
                        </form>

                        <%
                            List<Report> reportsRetrieved = (List<Report>) session.getAttribute("reports");
                            if (reportsRetrieved != null && reportsRetrieved.size() > 0) {
                        %>
                        <h1>Existing Report</h1>
                        <table>
                            <tr>
                                <td>Report Name</td>
                                <td>Report Retrieved On</td>
                            </tr>
                            <%
                                for (Report reportRetrieved : reportsRetrieved) {
                                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                                    Date date = new Date();
                                    String path = "reports/" + reportRetrieved.getReportFile();
                            %>
                            <tr>
                                <td><a href="<%=path%>"><%=reportRetrieved.getReportName()%></a></td>
                                <td><%=dateFormat.format(date)%></td>
                            </tr>
                            <%
                                    }

                                } else {
                                    out.println("No existing reports yet.");
                                }
                            %>
                        </table>

                    </div>



                    <div class="content" id="panel3">
                        <p>This is the fourth panel of the basic tab example. This is the fourth panel of the basic tab example.</p>
                    </div>
                    <div class="content" id="panel4">
                        <p>
                        <table border = "0">   
                            <tr><td></td>

                                <%
                                    DateFormat dateFormat = new SimpleDateFormat("h:mm a");
                                    Date date = new Date();
                                    String dateString = dateFormat.format(date);
                                %> 
                                <td><b>Last Updated</b></td>
                                <td><b>Current as of <%=dateString%></b></td>
                            </tr>
                            <form action="ProcessUpdateState" method="POST">
                                <tr><td><b>Temperature (ºC)</b></td>
                                    <td><%=temperature%></td>
                                    <td><input type="text" name ="temperature" style="width:250px" required/></td></tr>
                                <tr><td><b>Respiratory Rate</b></td>
                                    <td><%=RR%></td>
                                    <td><input type="text" name = "RR" style="width:250px" required/></td></tr>
                                <tr><td><b>Blood Pressure</b></td>
                                    <td><%=BP%></td>
                                    <td><input type="text" name ="BP" style="width:250px" required/></td></tr>
                                <tr><td><b>Heart Rate</b></td>
                                    <td><%=HR%></td>
                                    <td><input type="text" name ="HR" style="width:250px" required/></td></tr>
                                <tr><td><b>SPO (%)</b></td>
                                    <td><%=SPO%></td>
                                    <td><input type="text" name ="SPO" style="width:250px" required/></td></tr>
                                <tr><td><b>Intake</b></td>
                                    <td><%=intake%></td>
                                    <td><input type="text" name ="intake" style="width:250px" required/></td></tr>
                                <tr><td><b>Output</b></td>
                                    <td><%=output%></td>
                                    <td><input type="text" name ="output" style="width:250px" required/></td></tr>

                                <input type="hidden" name ="stateID" value = "<%=stateID%>"/>
                                <input type="hidden" name ="scenarioID" value = "<%=scenarioID%>"/>


                        </table>
                        <input type="Submit" value="Update Vitals" class="button"> 
                        </form>

                        </p>
                    </div>
                    <div class="content" id="panel5">
                        <p>

                        <form action="ProcessAddNote" method="POST">
                            <dl class="accordion" data-accordion>
                                <dd class="accordion-navigation">
                                    <a href="#pastNotes">View Past groups notes</a>
                                    <div id="pastNotes" class="content">
                                        <div class="row">
                                            <div class="small-8">
                                                <div class="row">
                                                    <div class="small-3 columns">
                                                        <%
                                                            if (notesListRetrieved == null || notesListRetrieved.size() == 0) {%>
                                                        <label for="right-label" class="right inline">No groups have enter their notes yet.</label>
                                                        <% } else {
                                                                Note notes = null;
                                                                for (int i = 0; i < notesListRetrieved.size(); i++) {
                                                                    notes = notesListRetrieved.get(i);
                                                                    out.print("<label for='right-label' class='right inline'>Tutorial Group: </label>" + notes.getTutorialGroup());
                                                                    out.print("<label for='right-label' class='right inline'>Group Member Names: </label>" + notes.getGrpMemberName());
                                                                    out.print("<label for='right-label' class='right inline'>Multidisciplinary Note</label>" + notes.getMultidisciplinaryNote());
                                                                }

                                                            }//end of else
                                                        %>


                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </dd>

                                <%
                                    String tutorialGrp = (String) request.getAttribute("tutorialGrp");
                                    String grpNames = (String) request.getAttribute("grpNames");
                                    String notes = (String) request.getAttribute("notes");

                                %>                           
                                <dd class="accordion-navigation">
                                    <a href="#newNotes">Enter new notes</a>
                                    <div id="newNotes" class="content">
                                        <div class="row">
                                            <div class="small-8">
                                                <div class="row">
                                                    <div class="small-3 columns">
                                                        <label for="right-label" class="right inline">Tutorial Group</label>
                                                        <label for="right-label" class="right inline">Group Member Names</label>
                                                        <label for="right-label" class="right inline">Multidisciplinary Note</label>
                                                    </div>
                                                    <div class="small-9 columns">
                                                        <input type ="text" id= "tutorialGrp" name="tutorialGrp" value="<% if (tutorialGrp == null) {
                                                                out.print("");
                                                            } else {
                                                                out.print(tutorialGrp);
                                                            }%>" required>
                                                        <input type ="text" id= "grpNames" name="grpNames" value="<% if (grpNames == null) {
                                                                out.print("");
                                                            } else {
                                                                out.print(grpNames);
                                                            }%>" required>
                                                        <textarea name="notes" rows="7" cols="10" required><% if (notes == null) {
                                                                out.print("");
                                                            } else {
                                                                out.print(notes);
                                                            }%></textarea>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div>
                                            </dd>


                                            <input type="submit" name="buttonChoosen" value="Save" class="button"> 
                                            <input type="submit" name="buttonChoosen" value="Submit" class="button"> 
                                            <input type="button" value="Cancel" class="button" onClick="window.location = 'viewPatientInformation.jsp'"/>
                                            </form>
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
