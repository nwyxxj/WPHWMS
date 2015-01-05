<%-- 
    Document   : createScenario
    Created on : Sep 27, 2014, 10:29:56 PM
    Author     : Administrator
--%>

<%@page import="dao.ScenarioDAO"%>
<%@page import="entity.State"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="protectPage/protectAdmin.jsp" %>
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
        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>

        <title>Case Setup - Create </title>
    </head>
    <body>

    <center><h1>Case Set Up</h1>
    <h2>Step 1: Create case</h2>
       
    <form data-abide action ="ProcessAddScenario" method ="POST">
            <div class="row">
                <div class="small-8">
                    <div class="row">
                        <div class="small-3 columns">
                            <label for="right-label" class="right inline">Scenario Name</label>
                        </div>
                        <div class="small-9 columns">
                            <input type="text" id="password" name="scenarioName" value = "For E.g: ECS Analphylactic Reaction">
                        </div>
                    </div>
                </div>
            </div>

      
    <dl class="accordion" data-accordion>
        <dd class="accordion-navigation">
            <a href="#panel1">Case Information</a>

            <div id="panel1" class="content">
                <center>
                    <div class="large-9">
                        <label>Case Description</label>
                        <textarea style = "resize:vertical"  name="scenarioDescription" rows="2" cols="10" required></textarea>

                        <label>Admission Information</label>
                        <textarea style = "resize:vertical"  name="admissionInfo" rows="2" cols="10" required></textarea>
                    </div>
                </center>
            </div>
        </dd>
        
        <dd class="accordion-navigation">
            <a href="#panel2">Patient's Information</a>
            <div id="panel2" class="content">
                <!--New row 1-->
                <div class="row">

                <div class="row">
                    <div class="large-4 columns">
                        <label>Patient's NRIC
                            <input type="text" maxlength="9" name ="patientNRIC" value = "S7843522A" required pattern ="^[SFTG]\d{7}[A-Z]$"/>
                            <small class="error">Please enter a valid NRIC according to Singapore's standard.</small>
                        </label>
                        
                    </div>
                    <div class="large-4 columns">
                        <label>First Name
                            <input type="text" name ="firstName" value = "Bella" required pattern ="^[a-zA-Z]+$"/>
                            <small class="error">Only alphabets accepted.</small>
                        </label>
                    </div>
                    <div class="large-4 columns">
                        <label>Last Name
                            <input type="text" name ="lastName" value = "Cullen" required pattern ="^[a-zA-Z]+$"/>
                            <small class="error">Only alphabets accepted.</small>
                        </label>
                    </div>
                </div>
                    
                <!--New Row 2-->
                <div class="row">
                    <div class="large-4 columns">
                        <label>Date of Birth</label>
                        <input type="text" id="datepicker" name = "DOB" value = "19/11/1992" required pattern = "^(((0[1-9]|[12]\d|3[01])\/(0[13578]|1[02])\/((19|[2-9]\d)\d{2}))|((0[1-9]|[12]\d|30)\/(0[13456789]|1[012])\/((19|[2-9]\d)\d{2}))|((0[1-9]|1\d|2[0-8])\/02\/((19|[2-9]\d)\d{2}))|(29\/02\/((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$">
                        <small class="error">Please enter in DD/MM/YYYY.</small>
                    </div>
                    <div class="large-4 columns">
                        <label>Allergy</label>
                        <input type="text" name ="allergy" value = "No Allergy" required pattern ="^[a-zA-Z ]+$"/>
                        <small class="error">Only alphabets accepted.</small>
                    </div>
                </div>
                <!--New Row 3-->
                <div class="row">
                    <div class="large-4 columns">
                        <label>Gender</label>
                        <input type="radio" value="Male" name = "gender" required> Male <br/>
                        <input type="radio" value="Female" name = "gender"> Female
                    </div>
                    <div class="large-4 columns">
                        <label>Ward Selection</label>
                        <select name="ward">
                            <option>ward 1</option>
                            <option>ward 2</option>
                            <option>ward 3</option>
                            <option>ward 4</option>
                        </select>
                    </div>       
                </div>
            </div>
        </dd>
        <dd class="accordion-navigation">
            <a href="#panel3">Default Vital Signs</a>
            <!--State 0-->
            <div id="panel3" class="content">
                <div style="margin-left:100px;"> Leave empty if not applicable.</div><br/>
                <div class="row">
                    <div class="large-4 columns">
                        <label>Temperature</label>
                        <input type="text" name="temperature0" maxlength="4" value = "17" pattern ="[0-9]+(\.[0-9][0-9]?)?">
                        <small class="error">Must be numeric, cannot contain alphabets. E.g: 37.3 or 37</small>
                    </div>
                    <div class="large-4 columns">
                        <label>Respiratory Rate</label>
                        <input type="text" name="RR0" value = "11" maxlength = "2" pattern ="integer">
                        <small class="error">RR must be 2 digits.</small>
                    </div>
                    <div class="large-4 columns">
                        <label>Heart Rate</label>
                        <input type="text" name="HR0" value = "13" pattern ="^([0-9]|[1-9][0-9]|[1][0-9][0-9]|20[0-0])$">
                        <small class="error">HR must be between 0 - 200.</small>
                    </div>
                    <div class="large-4 columns">
                        <label>Blood Pressure Systolic</label>
                        <input type="text" name="BPS" maxlength ="3" value = "12" pattern = "integer">
                        <small class="error">BP systolic must be numeric and between 2 to 3 digits.</small>
                    </div> 
                    <div class="large-4 columns">
                        <label>Blood Pressure Diastolic</label>
                        <input type="text" name="BPD" maxlength ="3" value = "12" pattern = "integer">
                        <small class="error">BP diastolic must be numeric and between 2 to 3 digits.</small>
                    </div>
                    <div class="large-4 columns">
                        <label>SPO</label>
                        <input type="text" name="SPO0" maxlength = "3" value = "14" pattern ="^[0-9][0-9]?$|^100$">
                        <small class="error">SPO must be numeric and between 0 - 100%.</small>
                    </div>
                   
                    <div class="large-4 columns"></div>
                    <div class="large-4 columns"></div>
                </div>
            </div>
        </dd>
        <dd class="accordion-navigation">
            <a href="#panel4">Define State(s)</a>
            <div id="panel4" class="content">
                <center>

                    <div class ="rows">
                        <div class ="large-9">
                            <label>Enter Total Number of States (E.g: 3)</label>
                            <input type="text" name="totalNumberOfStates" value = "2">
                        </div>
                    </div>
                </center>

            </div>
           
        </dd>
    </dl>
    <br/>
    <center><input type ="submit" class ="button" value ="Continue"></center>
</form>


    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation.min.js"></script>

    <script>
                $(document).foundation();
    </script>
</body>
</html>
