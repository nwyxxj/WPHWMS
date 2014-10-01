<%-- 
    Document   : createScenario
    Created on : Sep 27, 2014, 10:29:56 PM
    Author     : Administrator
--%>

<%@page import="dao.ScenarioDAO"%>
<%@page import="entity.State"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/foundation.css" />
        <link rel="stylesheet" href="responsive-tables.css">
        <script src="responsive-tables.js"></script>
        <%@include file="/topbar/topbarAdmin.jsp" %>

        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">

        <title>Create Scenario</title>
    </head>
    <body>

    <center><h1>Case Set Up</h1>

        <form action ="ProcessAddScenario.jsp" method ="POST">
            <div class="row">
                <div class="small-8">
                    <div class="row">
                        <div class="small-3 columns">
                            <label for="right-label" class="right inline">Scenario Name</label>
                        </div>
                        <div class="small-9 columns">
                            <input type="text" id="password" name="scenarioName">
                        </div>
                    </div>
                </div>
            </div>

    </center>    
    <dl class="accordion" data-accordion>
        <dd class="accordion-navigation">
            <a href="#panel1">Case Information</a>

            <div id="panel1" class="content">
                <center>
                    <div class="large-9">
                        <label>Case Description</label>
                        <textarea name="scenarioDescription" rows="2" cols="10"></textarea>

                        <label>Admission Information</label>
                        <textarea name="admissionInfo" rows="2" cols="10"></textarea>
                    </div>

                    <div class="row">
                        <div class="large-4 columns">
                            <label>Status</label>
                            <label><input type="radio" value="activated" name = "status">Activated</label>
                            <label><input type="radio" value="deactivated" name = "status">Deactivated</label>
                        </div>
                    </div>
                </center>   
            </div>

        </dd>
        <dd class="accordion-navigation">
            <a href="#panel2">Patient's Information</a>
            <div id="panel2" class="content">
                <!--New row 1-->
                <div class="row">
                    <div class="large-4 columns">
                        <label>Patient's NRIC
                            <input type="text" name ="patientNRIC" />
                        </label>
                    </div>
                    <div class="large-4 columns">
                        <label>First Name
                            <input type="text" name ="firstName" />
                        </label>
                    </div>
                    <div class="large-4 columns">
                        <label>Last Name
                            <input type="text" name ="lastName" />
                        </label>
                    </div>
                </div>
                <!--New Row 2-->
                <div class="row">
                    <div class="large-4 columns">
                        <label>Gender</label>
                        <label><input type="radio" value="Male" name = "gender">Male</label>
                        <label><input type="radio" value="Female" name = "gender">Female</label>
                    </div>
                    <div class="large-4 columns">
                        <label>Date of Birth</label>
                        <input type="text" id="datepicker" name = "DOB">
                    </div>
                    <div class="large-4 columns">
                        <label>Marital Status</label>
                        <select name="maritalStatus">
                            <option>Single</option>
                            <option>Married</option>
                            <option>Divorced</option>
                            <option>Separated</option>
                            <option>Widowed</option>
                            <option>NA</option>
                        </select>
                    </div>
                </div>
                <!--New Row 3-->
                <div class="row">
                    <div class="large-4 columns">
                        <label>Weight</label>
                        <input type="text" name="weight" value = "1">
                    </div>
                    <div class="large-4 columns">
                        <label>Height</label>
                        <input type="text" name="height" value ="1">
                    </div>
                    <div class="large-4 columns">
                        <label>Occupation</label>
                        <input type="text" name="occupation">
                    </div>
                    <div class="large-4 columns">
                        <label>Race</label>
                        <input type="text" name="race">
                    </div>
                    <div class="large-4 columns">
                        <label>Religion</label>
                        <input type="text" name="religion">
                    </div>
                    <div class="large-4 columns">
                        <label>Nationality</label>
                        <input type="text" name="nationality">
                    </div>
                </div>
            </div>
        </dd>
        <dd class="accordion-navigation">
            <a href="#panel3">Default Vital Signs</a>
            <div id="panel3" class="content">
                Leave empty if not applicable.
                <div class="row">
                    <div class="large-4 columns">
                        <label>Respiratory Rate</label>
                        <input type="text" name="RR">
                    </div>
                    <div class="large-4 columns">
                        <label>Blood Pressure</label>
                        <input type="text" name="BP">
                    </div>
                    <div class="large-4 columns">
                        <label>Heart Rate</label>
                        <input type="text" name="HR">
                    </div>
                    <div class="large-4 columns">
                        <label>SPO</label>
                        <input type="text" name="SPO">
                    </div>
                    <div class="large-4 columns">
                        <label>Intake</label>
                        <input type="text" name="intake">
                    </div>
                    <div class="large-4 columns">
                        <label>Output</label>
                        <input type="text" name="output">
                    </div>

                    <div class="large-4 columns">
                        <label>Temperature</label>
                        <input type="text" name="temperature">
                    </div>
                </div>
            </div>
        </dd>
        <dd class="accordion-navigation">
            <a href="#panel4">Define State(s)</a>
            <div id="panel4" class="content">
                State 1
                
                <%ArrayList<State> stateList = new ArrayList<State>(); %>
                
                <center><div class="large-9">
                        <label>State Description</label>
                        <textarea style = "resize:vertical" name="stateDescription" rows="2" cols="10"></textarea>
                    </div></center>

                <div class="row">
                    <div class="large-4 columns">
                        <label>Respiratory Rate</label>
                        <input type="text" name="RR">
                    </div>
                    <div class="large-4 columns">
                        <label>Blood Pressure</label>
                        <input type="text" name="BP">
                    </div>
                    <div class="large-4 columns">
                        <label>Heart Rate</label>
                        <input type="text" name="HR">
                    </div>
                    <div class="large-4 columns">
                        <label>SPO</label>
                        <input type="text" name="SPO">
                    </div>
                    <div class="large-4 columns">
                        <label>Intake</label>
                        <input type="text" name="intake">
                    </div>
                    <div class="large-4 columns">
                        <label>Output</label>
                        <input type="text" name="output">
                    </div>
                    
                    <div class="large-4 columns">
                        <label>Temperature</label>
                        <input type="text" name="temperatureString">
                    </div>
                    
                    <%
                    String stateID = "ST1";
                    String RR = request.getParameter("RR");
                    String BP = request.getParameter("BP");
                    String HR = request.getParameter("HR");
                    String SPO = request.getParameter("SPO");
                    String intake = request.getParameter("intake");
                    String output = request.getParameter("output");
                    //String temperatureString = request.getParameter("temperatureString");
                    //double temperature = Double.parseDouble(temperatureString);
                    String stateDescription = request.getParameter("stateDescription");
                    String patientNRIC = request.getParameter("patientNRIC");
                    String scenarioID = "SC" + (ScenarioDAO.retrieveAll().size()+1);

//                    State newState = new State(stateID, scenarioID, RR, BP, HR, SPO, intake, output, temperature, stateDescription,patientNRIC); %>
                </div>
                <!--Add more states-->
                <div class="input_fields_wrap">
                    <button class="add_field_button">Add More States</button>
                    <!--<div><input type="text" name="mytext[]"></div>-->
                </div>
                <!--End of add more states-->
            </div>
            </div
        </dd>
    </dl>
    <center><input type ="submit" class ="button" value ="Add New Scenario"></center>

</form>


    <script>
        $(document).ready(function() {
            var max_fields = 10; //maximum input boxes allowed
            var wrapper = $(".input_fields_wrap"); //Fields wrapper
            var add_button = $(".add_field_button"); //Add button ID

            var x = 1; //initlal text box count
            $(add_button).click(function(e) { //on add input button click
                e.preventDefault();
                if (x < max_fields) { //max input box allowed
                    x++; //text box increment
                    $(wrapper).append('<div><br>State X <center><div class = "large-9"><label>State Description</label><textarea name = "stateDescription" rows = "2" cols = "10"></textarea></div></center><div class = "row">\n\
                               <div class ="large-4 columns"><label>Respiratory Rate</label><input type="text" name="RR"/></div>\n\
                               <div class ="large-4 columns"><label>Blood Pressure</label><input type="text" name="BP"/></div>\n\
                               <div class ="large-4 columns"><label>Heart Rate</label><input type="text" name="HR"/></div>\n\
                               <div class ="large-4 columns"><label>SPO</label><input type="text" name="SPO"/></div>\n\
                               <div class ="large-4 columns"><label>Intake</label><input type="text" name="intake"/></div>\n\
                               <div class ="large-4 columns"><label>Output</label><input type="text" name="output"/></div>\n\
                               <div class ="large-4 columns"><label>Temperature</label><input type="text" name="temperature"/></div>\n\
                               </div>\n\
                               <a href = "#" class = "remove_field">Remove State</a></div>'); //add input box
                }
            });

            $(wrapper).on("click", ".remove_field", function(e) { //user click on remove text
                e.preventDefault();
                $(this).parent('div').remove();
                x--;
            })
        });
        </script>

        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>

        <script>
            $(document).foundation();
        </script>
        <script>
            $(function() {
                $("#datepicker").datepicker();
            });
        </script>
    </body>
</html>
