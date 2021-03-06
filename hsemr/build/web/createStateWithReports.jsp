<%@page import="dao.StateDAO"%>
<%@page import="dao.PatientDAO"%>
<%@page import="dao.ScenarioDAO"%>
<%@include file="protectPage/protectAdmin.jsp" %>
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
        <script type="text/javascript" src="js/humane.js"></script>
        <script type="text/javascript" src="js/app.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
        
    </head>
    <body>

        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <center>
        <h1>Case Setup</h1>
        <h2>Step 2: Create State(s)</h2>
        </center>
    
        <%  
        
            String success = "";
            String error = "";
            
            if (session.getAttribute("success") != null) {

                        success = (String) session.getAttribute("success");
                        session.setAttribute("success", "");
            }
            
            if (session.getAttribute("error") != null) {

                        error = (String) session.getAttribute("error");
                        session.setAttribute("error", "");
            }
            
            String totalNumberOfStatesString = (String) session.getAttribute("totalNumberOfStates");
            int totalNumberOfStates = Integer.parseInt(totalNumberOfStatesString);

            String scenarioID = (String) session.getAttribute("scenarioID");
            String patientNRIC = (String) session.getAttribute("patientNRIC");
        
            for (int i = 0; i < totalNumberOfStates; i++) {
                //to differentiate different states
                String stateDescription = "stateDescription" + (i + 1);
                String stateID = "ST" + (i+1);
        %>
        <!--<form action ="ProcessAddState" method ="POST">-->
            <center>
            <h2>State <%=i + 1%></h2>
            
            
            <div class="row">
                <div class = "large-12">
                    <label>State Description</label>
                    <textarea style = "resize:vertical" name = "<%=stateDescription%>" rows = "2" cols = "10"></textarea>
                </div>
            </div>
                
            <h3>Upload Reports</h3>
            
            <a href="#" data-reveal-id="myModal">Upload Reports</a>

            <div id="myModal" class="reveal-modal" data-reveal>
              <h2>Upload Report</h2>
              Please upload ONE at a time. <br>
              
              <form action = "ProcessReportUpload" method = "POST" enctype = "multipart/form-data"> 
                  Please ensure that your file is named to what you want it to be shown.
                  <input type ="file" name = "file"/><br>
                  <input type ="hidden" name ="scenarioID" value ="<%=scenarioID%>"/>
                  <input type ="hidden" name ="stateID" value ="<%=stateID%>"/>
                  
                  <input type ="submit" class ="button" value ="Upload Report">
                  
              </form><br>   
              <a class="close-reveal-modal">&#215;</a>
            </div>
            </center>


            <%   }
            %>

            <input type ="hidden" name ="totalNumberOfStates" value ="<%=totalNumberOfStates%>"/>
            <input type ="hidden" name ="scenarioID" value ="<%=scenarioID%>"/>
            <input type ="hidden" name ="patientNRIC" value ="<%=patientNRIC%>"/>
            <center><input type ="submit" class ="button" value ="Create State(s)"></center>

        <!--</form>-->


        <script>
            $(document).foundation();
//            $('#reportNumber').hide();
//            $('#report2').change(function() {
//                if (this.checked) {
//                    $('#reportNumber').hide();
//                }
//            });
//            $('#report1').change(function() {
//                if (this.checked) {
//                    $('#reportNumber').show();
//                }
//            });
            $(document).ready(function() {
                var max_fields = 10; //maximum input boxes allowed
                var wrapper = $(".input_fields_wrap"); //Fields wrapper
                var add_button = $(".add_field_button"); //Add button ID

                var x = 1; //initlal text box count
                $(add_button).click(function(e) { //on add input button click
                    e.preventDefault();
                    if (x < max_fields) { //max input box allowed
                        x++; //text box increment
//                        $(wrapper).append('<div><input type="text" name="filename" placeholder="Report name"><a href="#" class="remove_field">Remove</a></div>'); //add input box
                        $(wrapper).append('<form action = "ProcessReportUpload" method = "POST" enctype = "multipart/form-data"> <input type ="file" name = "file" size = "50"/> <br> <input type ="submit" value = "Upload Report" /></form><br>'); //add input box
                    }
                });

                $(wrapper).on("click", ".remove_field", function(e) { //user click on remove text
                    e.preventDefault();
                    $(this).parent('div').remove();
                    x--;
                })
            });
        </script>
        
        <script>

            $(document).ready(function() {
                $(document).foundation();
                var humaneSuccess = humane.create({baseCls: 'humane-original', addnCls: 'humane-original-success', timeout: 8000, clickToClose: true})
                var humaneError = humane.create({baseCls: 'humane-original', addnCls: 'humane-original-error', timeout: 8000, clickToClose: true})

                var success1 = "<%=success%>";
                var error1 = "<%=error%>";
                if (success1 !== "") {
                    humaneSuccess.log(success1);
                } else if (error1 !== "") {
                    humaneError.log(error1);
                }

            });
        </script>
        <script type="text/javascript" src="js/humane.js"></script>

    </body>
</html>
