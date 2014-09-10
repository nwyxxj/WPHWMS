package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.*;
import dao.*;

public final class patientInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/topbar/topbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" c=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Patient Information</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foundation.css\" />\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"top-bar\" data-topbar>\r\n");
      out.write("            <ul class=\"title-area\">\r\n");
      out.write("                <li class=\"name\">\r\n");
      out.write("                    <h1><a href=\"#\">HSEMR <img src=\"img/healthlablogo.jpg\" height = \"40\"></a></h1>\r\n");
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- Remove the class \"menu-icon\" to get rid of menu icon. Take out \"Menu\" to just have icon alone -->\r\n");
      out.write("                <li class=\"toggle-topbar menu-icon\"><a href=\"#\"><span>Menu</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("                \r\n");
      out.write("            ");
 
                String nurseId = (String)session.getAttribute("User");
            
      out.write("\r\n");
      out.write("            <secion class=\"top-bar-section\">\r\n");
      out.write("                <!-- Right Nav Section -->\r\n");
      out.write("\r\n");
      out.write("                 <ul class=\"left\">\r\n");
      out.write("                    <li><a href=\"#\">Patient Management</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Ward Management</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Medical Management</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"right\"> \r\n");
      out.write("                        <li><a href=\"#\">Welcome, ");
      out.print( nurseId);
      out.write("!</a></li>\r\n");
      out.write("                    <li><a href=\"ProcessLogout\">Log Out</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </secion>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write(" \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
            
            Patient patient = PatientDAO.retrieve("S7843522B");
            State state = StateDAO.retrieve("S1", 1);

            //retrieve patient's information
            String firstName = patient.getFirstName();
            String lastName = patient.getLastName();
            String fullName = firstName + " " + lastName;
            String patientNRIC = patient.getPatientNRIC();
            String dob = patient.getDob();
            String gender = patient.getGender();

            //retrieve state's information
            String RR = state.getRR();
            String BP = state.getBP();
            String HR = state.getHR();
            String SPO = state.getSPO();
            String intake = state.getIntake();
            String output = state.getOutput();
            double temperature = state.getTemperature();
        
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <div align =\"center\">\r\n");
      out.write("            <ul class=\"vcard\" >\r\n");
      out.write("  <li class=\"fn\">Gaius Baltar</li>\r\n");
      out.write("  <li class=\"street-address\">123 Colonial Ave.</li>\r\n");
      out.write("  <li class=\"locality\">Caprica City</li>\r\n");
      out.write("  <li><span class=\"state\">Caprica</span>, <span class=\"zip\">12345</span></li>\r\n");
      out.write("  <li class=\"email\"><a href=\"#\">g.baltar@example.com</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"panel\">\r\n");
      out.write("  <h5>This is a regular panel.</h5>\r\n");
      out.write("  <p>It has an easy to override visual style, and is appropriately subdued.</p>\r\n");
      out.write("</div>\r\n");
      out.write("            <br><b>Name:</b> ");
      out.print(fullName);
      out.write("   <b>NRIC</b>: ");
      out.print(patientNRIC);
      out.write("   <b>DOB:</b> ");
      out.print(patientNRIC);
      out.write("  <b>Gender: </b> ");
      out.print(gender);
      out.write("\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"large-centered large-10 columns\">\r\n");
      out.write("                <div class=\"tabs-content\">\r\n");
      out.write("                    <dl class=\"tabs\" data-tab>\r\n");
      out.write("                        <dd class=\"active\"><a href=\"#panel1\">Admission Notes</a></dd>\r\n");
      out.write("                        <dd><a href=\"#panel2\">Multidisciplinary Notes</a></dd>\r\n");
      out.write("                        <dd><a href=\"#panel3\">Investigations</a></dd>\r\n");
      out.write("                        <dd><a href=\"#panel4\">Medication</a></dd>\r\n");
      out.write("                        <dd><a href=\"#panel5\">Clinical Chart</a></dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"content active\" id=\"panel1\">\r\n");
      out.write("                        <p>This is the first panel of the basic tab example. This is the first panel of the basic tab example.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"content\" id=\"panel2\">\r\n");
      out.write("                        <p>This is the second panel of the basic tab example. This is the second panel of the basic tab example.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"content\" id=\"panel3\">\r\n");
      out.write("                        <p>This is the third panel of the basic tab example. This is the third panel of the basic tab example.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"content\" id=\"panel4\">\r\n");
      out.write("                        <p>This is the fourth panel of the basic tab example. This is the fourth panel of the basic tab example.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"content\" id=\"panel5\">\r\n");
      out.write("                        <p>\r\n");
      out.write("<!--                        <table border = \"0\">   \r\n");
      out.write("                            <tr><td>Respiratory Rate</td>\r\n");
      out.write("                                <td><input type=\"text\" value =\"");
      out.print(RR);
      out.write("\" style=\"width:250px\"/></td></tr>\r\n");
      out.write("                            <tr><td>Blood Pressure</td>\r\n");
      out.write("                                <td><input type=\"text\" value =\"");
      out.print(BP);
      out.write("\" style=\"width:250px\"/></td></tr>\r\n");
      out.write("                            <tr><td>Heart Rate</td>\r\n");
      out.write("                                <td><input type=\"text\" value =\"");
      out.print(HR);
      out.write("\" style=\"width:250px\"/></td></tr>\r\n");
      out.write("                            <tr><td>SPO</td>\r\n");
      out.write("                                <td><input type=\"text\" value =\"");
      out.print(SPO);
      out.write("\" style=\"width:250px\"/></td></tr>\r\n");
      out.write("                            <tr><td>Intake</td>\r\n");
      out.write("                                <td><input type=\"text\" value =\"");
      out.print(intake);
      out.write("\" style=\"width:250px\"/></td></tr>\r\n");
      out.write("                            <tr><td>Output</td>\r\n");
      out.write("                                <td><input type=\"text\" value =\"");
      out.print(output);
      out.write("\" style=\"width:250px\"/></td></tr>\r\n");
      out.write("                            <tr><td>Temperature</td>\r\n");
      out.write("                                <td><input type=\"text\" value =\"");
      out.print(temperature);
      out.write("\" style=\"width:250px\"/></td></tr>\r\n");
      out.write("                        </table>-->\r\n");
      out.write("\r\n");
      out.write("                        <form>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"small-8\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"small-3 columns\">\r\n");
      out.write("                                            <label for=\"right-label\" class=\"right inline\">Respiratory Rate</label>\r\n");
      out.write("                                            <label for=\"right-label\" class=\"right inline\">Blood Pressure</label>\r\n");
      out.write("                                            <label for=\"right-label\" class=\"right inline\">Heart Rate</label>\r\n");
      out.write("                                            <label for=\"right-label\" class=\"right inline\">SPO</label>\r\n");
      out.write("                                            <label for=\"right-label\" class=\"right inline\">Intake</label>\r\n");
      out.write("                                            <label for=\"right-label\" class=\"right inline\">Output</label>\r\n");
      out.write("                                            <label for=\"right-label\" class=\"right inline\">Temperature</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"small-9 columns\">\r\n");
      out.write("                                            <input type=\"text\" id=\"right-label\" placeholder=\"");
      out.print(RR);
      out.write("\">\r\n");
      out.write("                                            <input type=\"text\" id=\"right-label\" placeholder=\"");
      out.print(BP);
      out.write("\">\r\n");
      out.write("                                            <input type=\"text\" id=\"right-label\" placeholder=\"");
      out.print(HR);
      out.write("\">\r\n");
      out.write("                                            <input type=\"text\" id=\"right-label\" placeholder=\"");
      out.print(SPO);
      out.write("\">\r\n");
      out.write("                                            <input type=\"text\" id=\"right-label\" placeholder=\"");
      out.print(intake);
      out.write("\">\r\n");
      out.write("                                            <input type=\"text\" id=\"right-label\" placeholder=\"");
      out.print(output);
      out.write("\">\r\n");
      out.write("                                            <input type=\"text\" id=\"right-label\" placeholder=\"");
      out.print(temperature);
      out.write("\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"#\" class=\"button\">Update Vitals</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/vendor/jquery.js\"></script>\r\n");
      out.write("        <script src=\"js/foundation.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).foundation();\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
