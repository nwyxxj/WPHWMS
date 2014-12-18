<%-- 
    Document   : viewHistoricalTemp
    Created on : Dec 16, 2014, 3:27:19 PM
    Author     : weiyi.ngow.2012
--%>

<%@page import="entity.Vital"%>
<%@page import="java.util.List"%>
<%@page import="dao.VitalDAO"%>
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
           //retrieve list of temperature based on scenario
           String scenarioID= (String) session.getAttribute("scenarioID");
           List<Double> tempList= VitalDAO.retrieveTemp(scenarioID); 
           
           //converting templist to string for mainpulation
           String tempStringArr= tempList.toString();
           String withoutbracket = tempStringArr.replace("[", ""); 
           
           String dataTemp= withoutbracket.replace("]", "") ;
           out.println(dataTemp);
        %>
            
        <div id="chart"></div>
 
            <script type="text/javascript">
                var data1 = "<%=dataTemp%>";
              
            var chart = c3.generate({
                bindto: '#chart',
                data: {
                x: 'x',
                xFormat: '%Y',
                columns: [
                 // ['x', '2012-12-31', '2013-01-01', '2013-01-02', '2013-01-03', '2013-01-04', '2013-01-05'],
                    ['x', '2010', '2011', '2012', '2013', '2014', '2015'],
                    
                 // ['data1', 30, 20, 50, 40, 50],
                    ['data1', <% out.println(dataTemp); %>],
                    ['data2', 30.5, 39, 45, 50, 60]
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
                        format: '%Y-%m-%d %H:%M:%S'
                    }
                }
            }
        });
//        chart.load({
//            columns: [
//            ['data1', 300, 100, 250, 150, 300, 150, 500],
//            ['data2', 100, 200, 150, 50, 100, 250]
//            ]
//        });
        </script>  
    </body>
</html>
