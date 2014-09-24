<%-- 
    Document   : createScenario
    Created on : Sep 23, 2014, 8:43:40 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/foundation.css" />
        <link rel="stylesheet" href="responsive-tables.css">
        <script src="responsive-tables.js"></script>
        <%@include file="/topbar/topbarAdmin.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--For Date Picker-->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script>
            $(function() {
                $("#datepicker").datepicker();
            });
        </script>
        <!--End of  Date Picker-->
        <title>Create Case</title>
    </head>
    <body>
    <center><h1>Case Set Up</h1>
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
        <h2>Patient's Information</h2>
        <!--New row 1-->
        <div class="row">
            <div class="large-4 columns">
                <label>Patient's NRIC
                    <input type="text" name ="patientNRIC" />
                </label>
            </div>
            <div class="large-4 columns">
                <label>First Name
                    <input type="text" name ='firstName' />
                </label>
            </div>
            <div class="large-4 columns">
                <label>Last Name
                    <input type="text" name ='lastName' />
                </label>
            </div>
        </div>
        <!--New Row 2-->
        <div class="row">
            <div class="large-4 columns">
                <label>Gender</label>
                <input type="radio" value="Male"><label>Male</label>
                <input type="radio" value="Female"><label>Female</label>
            </div>
            <div class="large-4 columns">
                <label>Date of Birth</label>
                <input type="text" id="datepicker">
            </div>
            <div class="large-4 columns">
                <label>Marital Status
                    <select>
                        <option>Single</option>
                        <option>Married</option>
                        <option>Divorced</option>
                        <option>Separated</option>
                        <option>Widowed</option>
                        <option>NA</option>
                    </select>
                </label>
            </div>
        </div>
        <!--New Row 3-->
        <div class="row">
            <div class="large-4 columns">
                <label>Weight</label>
                <input type="text" name="weight">
            </div>
            <div class="large-4 columns">
                <label>Height</label>
                <input type="text" name="height">
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

        <h2>Default Vital Signs</h2>

        <!--New Row 1-->
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

    </form>
</center>

</body>
</html>
