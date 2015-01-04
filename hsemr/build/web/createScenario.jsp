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

        <form action ="newjsp.jsp" method ="POST">
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

    </center>    
    <dl class="accordion" data-accordion>
        <dd class="accordion-navigation">
            <a href="#panel1">Case Information</a>

            <div id="panel1" class="content">
                <center>
                    <div class="large-9">
                        <label>Case Description</label>
                        <textarea style = "resize:vertical"  name="scenarioDescription" rows="2" cols="10" value = "A woman is being admitted..."></textarea>

                        <label>Admission Information</label>
                        <textarea style = "resize:vertical"  name="admissionInfo" rows="2" cols="10" value = "Her last vitals are..."></textarea>
                    </div>
                </center>
        </dd>
        <dd class="accordion-navigation">
            <a href="#panel2">Patient's Information</a>
            <div id="panel2" class="content">
                <!--New row 1-->
                <div class="row">
                    <div class="large-4 columns">
                        <label>Patient's NRIC
                            <input type="text" name ="patientNRIC" value = "S7843522A"/>
                        </label>
                    </div>
                    <div class="large-4 columns">
                        <label>First Name
                            <input type="text" name ="firstName" value = "Bella"/>
                        </label>
                    </div>
                    <div class="large-4 columns">
                        <label>Last Name
                            <input type="text" name ="lastName" value = "Cullen" />
                        </label>
                    </div>
                </div>
                <!--New Row 2-->
                <div class="row">
                    <div class="large-4 columns">
                        <label>Date of Birth</label>
                        <input type="text" id="datepicker" name = "DOB" value = "19/11/1992">
                    </div>
                    <div class="large-4 columns">
                        <label>Allergy</label>
                         <input type="text" name ="allergy" value = "No Allergy" />
                    </div>
                </div>
                <!--New Row 3-->
                <div class="row">
                    <div class="large-4 columns">
                        <label>Gender</label>
                        <input type="radio" value="Male" name = "gender"> Male <br/>
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
                        <input type="text" name="temperature0" value = "17">
                    </div>
                    <div class="large-4 columns">
                        <label>Respiratory Rate</label>
                        <input type="text" name="RR0" value = "11">
                    </div>
                    <div class="large-4 columns">
                        <label>Heart Rate</label>
                        <input type="text" name="HR0" value = "13">
                    </div>
                    <div class="large-4 columns">
                        <label>Blood Pressure Systolic</label>
                        <input type="text" name="BPS" value = "12">
                    </div>
                    <div class="large-4 columns">
                        <label>Blood Pressure Diastolic</label>
                        <input type="text" name="BPD" value = "12">
                    </div>
                    <div class="large-4 columns">
                        <label>SPO</label>
                        <input type="text" name="SPO0" value = "14">
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


                <!--                State 1
                                <center><div class="large-9">
                                        <label>State Description</label>
                                        <textarea style = "resize:vertical" name="stateDescription1" rows="2" cols="10"></textarea>
                                    </div></center>
                                <div class="row">
                                    <div class="large-4 columns">
                                        <label>Respiratory Rate</label>
                                        <input type="text" name="RR1">
                                    </div>
                                    <div class="large-4 columns">
                                        <label>Blood Pressure</label>
                                        <input type="text" name="BP1">
                                    </div>
                                    <div class="large-4 columns">
                                        <label>Heart Rate</label>
                                        <input type="text" name="HR1">
                                    </div>
                                    <div class="large-4 columns">
                                        <label>SPO</label>
                                        <input type="text" name="SPO1">
                                    </div>
                                    <div class="large-4 columns">
                                        <label>Intake</label>
                                        <input type="text" name="intake1">
                                    </div>
                                    <div class="large-4 columns">
                                        <label>Output</label>
                                        <input type="text" name="output1">
                                    </div>
                
                                    <div class="large-4 columns">
                                        <label>Temperature</label>
                                        <input type="text" name="temperature1">
                                    </div>-->

            </div>
            <!--Add more states button-->
            <!--            <div class="input_fields_wrap">
                            <button class="add_field_button">Add More States</button>
                        </div>-->
            <!--End of add more states-->
            </div>
            </div>
        </dd>
    </dl>
    <br/>
    <center><input type ="submit" class ="button" value ="Continue"></center>
</form>


<!--<script>
    $(document).ready(function() {
        var max_fields = 15; //maximum input boxes allowed
        var wrapper = $(".input_fields_wrap"); //Fields wrapper
        var add_button = $(".add_field_button"); //Add button ID

        var x = 2; //initlal text box count, first box already added above
        $(add_button).click(function(e) { //on add input button click
            e.preventDefault();
            if (x < max_fields) { //max input box allowed
                x++; //text box increment
                $(wrapper).append('<div><br>State X <center><div class = "large-9"><label>State Description</label><textarea name = "stateDescription" rows = "2" cols = "10"></textarea></div></center><div class = "row">\n\
                           <div class ="large-4 columns"><label>Respiratory Rate</label><input type="text" name="RR2"/></div>\n\
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
</script>-->

<script src="js/vendor/jquery.js"></script>
<script src="js/foundation.min.js"></script>

<script>
            $(document).foundation();
</script>
</body>
</html>
