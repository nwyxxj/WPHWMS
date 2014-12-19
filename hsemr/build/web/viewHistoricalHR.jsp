<%-- 
    Document   : viewHistoricalTemp
    Created on : Dec 16, 2014, 3:27:19 PM
    Author     : weiyi.ngow.2012
--%>

<%@page import="entity.Vital"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="dao.VitalDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Load c3.css -->
        <link href="css/c3.css" rel="stylesheet" type="text/css">

        <!-- Load d3.js and c3.js -->
        <script src="js/d3.min.js" charset="utf-8"></script>
        <script src="js/c3/c3.min.js"></script>
    </head>
    <body>
        
        <% 
           //retrieve list of respiratory rate based on scenario
           String scenarioID= (String) session.getAttribute("scenarioID");
           List<Integer> hrList= VitalDAO.retrieveHR(scenarioID); 
           
           //retrieve vitals related to current case
           List<Vital> vitals = VitalDAO.retrieveAllVitalByScenarioID(scenarioID);
           
           //get dates of all vitals
           List<Date> vitalsDateTime = VitalDAO.retrieveVitalTime(vitals);           
           
           //format date to be printed in string format
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           //a string to store all dates in format to be used in javascript 
           //e.g. new Date ('2012-01-02 22:25:15'), new Date ('2012-02-02 22:25:17'), new Date ('2012-02-02 22:25:20'),new Date ('2012-02-02 22:25:23') 
           String vitalsDate = ""; 
           if (vitalsDateTime.size() > 0) { 
                for (int i = 0; i < vitalsDateTime.size(); i++ ) {
                    if (i != vitalsDateTime.size()-1) {
                        vitalsDate += "new Date ('" + df.format(vitalsDateTime.get(i)) + "'), ";
                    } else { 
                        vitalsDate += "new Date ('" + df.format(vitalsDateTime.get(i)) + "')";
                    }
                }
           }

                     
           //converting rrlist to string for mainpulation
           String hrStringArr= hrList.toString();
           String withoutbracket = hrStringArr.replace("[", ""); 
           String dataOfHR= withoutbracket.replace("]", "") ;
          
        %>
        <div id="chart"></div>
 
            <script type="text/javascript">
            var chart = c3.generate({
                bindto: '#chart',
                size: {
                    height: 300,
                    width: 650
                },
                data: {
                x: 'x',
                xFormat: '%Y',
                columns: [
                 //['x', '2012-12-31', '2013-01-01', '2013-01-02', '2013-01-03', '2013-01-04', '2013-01-05'],
                 //['x', new Date ('2012-01-02 22:25:15'), new Date ('2012-02-02 22:25:17'), new Date ('2012-02-02 22:25:20'),new Date ('2012-02-02 22:25:23')], 
                 ['x', <% out.println(vitalsDate); %>],
                    
                 // e.g. ['data1', 30, 20, 50, 40, 50],
                 ['Heart Rate Data', <% out.println(dataOfHR); %>]
                ],
                labels: true
            },
            
            axis: {
                x: {
                    type: 'timeseries',
                    // if true, treat x value as localtime (Default)
                    // if false, convert to UTC internally
                    localtime: true,
                     
                    tick: {
                        
                        format: '%Y-%m-%d %H:%M:%S',
                        rotate: 45,
                        multiline: false
                    },
                    height: 100
                }
            }
        });
        </script>  
    </body>
</html>
