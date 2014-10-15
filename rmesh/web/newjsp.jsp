<%-- 
    Document   : newjsp
    Created on : Oct 15, 2014, 9:45:26 AM
    Author     : Administrator
--%>

<%@page import="dao.VitalDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%

            String patientNRIC = (String) request.getParameter("patientNRIC");
            String oralType = (String) (request.getParameter("intragastricType"));
            String oralAmount = (String) (request.getParameter("intragastricAmount"));
            String intravenousType = (String) (request.getParameter("intravenousType"));
            String intravenousAmount = (String) (request.getParameter("intravenousAmount"));
            String output = (String) (request.getParameter("output"));
            
            if(oralType == null || oralType.equals(" ")){
                oralType = "-";
            }
            if(oralAmount == null || oralAmount.equals(" ")){
                oralAmount = "-";
            }
            if(oralAmount == null || oralAmount.equals(" ")){
                oralAmount = "-";
            }
            if(intravenousType == null || intravenousType.equals(" ") ){
                intravenousType = "-";
            }
            if(intravenousAmount == null || intravenousAmount.equals(" ")){
                intravenousAmount = "-";
            }
            if(output == null || oralType.equals(" ")){
                output = "-";
            }

            try {
                double temperature = Double.parseDouble(request.getParameter("temperature"));
                int RR = Integer.parseInt(request.getParameter("RR"));
                int BPsystolic = Integer.parseInt(request.getParameter("BPsystolic"));
                int BPdiastolic = Integer.parseInt(request.getParameter("BPdiastolic"));
                int HR = Integer.parseInt(request.getParameter("HR"));
                int SPO = Integer.parseInt(request.getParameter("SPO"));
                out.println(RR);
                out.println(BPsystolic);
                out.println(BPdiastolic);
                out.println(temperature);
                out.println(HR);
                out.println(SPO);
                VitalDAO.updateVital("S7843522B", temperature, RR, BPsystolic, BPdiastolic, HR, SPO, output, oralType, oralAmount, intravenousType, intravenousAmount);
                //VitalDAO.updateVital("S7843522B", temperature, RR, 55, 55, HR, SPO, intake, output);
//            HttpSession session = request.getSession(false);
//            session.setAttribute("active", "vitals");
//            session.setAttribute("successMessageUpdateVitals", "Vital signs have been updated!");
//            response.sendRedirect("./viewPatientInformation.jsp");
            } catch (NumberFormatException e) {
                //there's error with parsing because it is empty " ", so intialise it to 0 when its empty
                String temperatureString = (String)(request.getParameter("temperature"));
                String RRString = (String)(request.getParameter("RR"));
                String BPsystolicString = (String)(request.getParameter("BPsystolic"));
                String BPdiastolicString = (String)(request.getParameter("BPdiastolic"));
                String HRString = (String)(request.getParameter("HR"));
                String SPOString = (String)(request.getParameter("SPO"));
                
                double temperature = 0.0; 
                int RR = 0;
                int BPsystolic = 0; 
                int BPdiastolic = 0; 
                int HR = 0;
                int SPO = 0;
                
                out.println(RR);
                out.println(BPsystolic);
                out.println(BPdiastolic);
                out.println(temperature);
                out.println(HR);
                out.println(SPO);
                
                if(temperatureString.equals(" ")){
                    temperature = 0.0;
                }
                
                if(RRString.equals(" ")){
                    RR = 0;
                }
                
                if(BPsystolicString.equals(" ")){
                    BPsystolic = 0;
                }
                
                if(BPdiastolicString.equals(" ")){
                    BPdiastolic = 0;
                }
                
                if(HRString.equals(" ")){
                    HR = 0;
                }
                
                if(SPOString.equals(" ")){
                    SPO = 0;
                }
                
                VitalDAO.updateVital("S7843522B", temperature, RR, BPsystolic, BPdiastolic, HR, SPO, output, oralType, oralAmount, intravenousType, intravenousAmount);
                //VitalDAO.updateVital("S7843522B", 0, 0, 0, 0, 0, 0, "asdasd", oralType, oralType, intravenousType, intravenousAmount);
            }


        %>
    </body>
</html>
