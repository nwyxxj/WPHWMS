package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.StateDAO;
import dao.PatientDAO;
import dao.ScenarioDAO;

public final class createStateWithReports_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/protectPage/protectAdmin.jsp");
    _jspx_dependants.add("/topbar/topbarAdmin.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

   if(session.getAttribute("admin") == null){
       response.sendRedirect("viewMainLogin.jsp");
   }
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foundation.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"responsive-tables.css\">\n");
      out.write("        <script src=\"responsive-tables.js\"></script>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html><html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/DefaultLogo-favicon.ico\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        \r\n");
      out.write("        <!--FONT-->\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        \r\n");
      out.write("        <!--ICON-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/foundation-icons/foundation-icons.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/foundation-icons/foundation-icons.svg\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("      <nav class=\"top-bar\" data-topbar>\r\n");
      out.write("            <ul class=\"title-area\">\r\n");
      out.write("                <li class=\"name\">\r\n");
      out.write("                    <h1><a href=\"viewScenarioAdmin.jsp\"><img src=\"./img/DefaultLogo.png\" width=\"30\" height=\"30\"/> EMR</a></h1>\r\n");
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- Remove the class \"menu-icon\" to get rid of menu icon. Take out \"Menu\" to just have icon alone -->\r\n");
      out.write("                <li class=\"toggle-topbar menu-icon\"><a href=\"#\"><span>Menu</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("                \r\n");
      out.write("            <section class=\"top-bar-section\">\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"left\">\r\n");
      out.write("                    <li class=\"has-dropdown\">\r\n");
      out.write("                        <a href=\"#\">Case Management</a>\r\n");
      out.write("                        <ul class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"./viewScenarioAdmin.jsp\">Manage Case</a></li>\r\n");
      out.write("                            <li><a href=\"./createScenario.jsp\">Create Case</a></li>\r\n");
      out.write("                        </ul>   \r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"has-dropdown\">\r\n");
      out.write("                        <a href=\"#\">User Management</a>\r\n");
      out.write("                        <ul class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"./viewAdminAccounts.jsp\">Admin</a></li>\r\n");
      out.write("                            <li><a href=\"./viewLecturerAccounts.jsp\">Lecturer</a></li>\r\n");
      out.write("                            <li><a href=\"./viewPracticalGroupAccounts.jsp\">Practical Group</a></li>\r\n");
      out.write("                        </ul>   \r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"right\"> \r\n");
      out.write("                    <li><a href=\"./viewAdminHomePage.jsp\">Welcome, Admin!</a></li>\r\n");
      out.write("                    <li><a href=\"ProcessLogoutAdmin\">Log Out</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </section>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <script src =\"js/vendor/jquery.js\"></script>\r\n");
      out.write("        <script src=\"js/foundation.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).foundation();\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.1/jquery-ui.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/jquery.js\"></script>\n");
      out.write("        <script src=\"js/foundation.min.js\"></script>\n");
      out.write("        <center>\n");
      out.write("        <h1>Case Setup</h1>\n");
      out.write("        <h2>Step 2: Create State(s)</h2>\n");
      out.write("        </center>\n");
      out.write("    \n");
      out.write("        ");
          
            String totalNumberOfStatesString = (String) session.getAttribute("totalNumberOfStates");
            int totalNumberOfStates = Integer.parseInt(totalNumberOfStatesString);

            String scenarioID = (String) session.getAttribute("scenarioID");
            String patientNRIC = (String) session.getAttribute("patientNRIC");
        
            for (int i = 0; i < totalNumberOfStates; i++) {
                //to differentiate different states
                String stateDescription = "stateDescription" + (i + 1);
        
      out.write("\n");
      out.write("        <form action =\"ProcessAddState\" method =\"POST\">\n");
      out.write("            <center>\n");
      out.write("            <h2>State ");
      out.print(i + 1);
      out.write("</h2>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class = \"large-12\">\n");
      out.write("                    <label>State Description</label>\n");
      out.write("                    <textarea style = \"resize:vertical\" name = \"");
      out.print(stateDescription);
      out.write("\" rows = \"2\" cols = \"10\"></textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <h3>Does State ");
      out.print(i + 1);
      out.write(" have reports? </h3>\n");
      out.write("\n");
      out.write("            <!--                    \n");
      out.write("                    <label>Is report applicable for this state? </label> \n");
      out.write("                    <input type=\"radio\" id=\"report1\" name=\"report\" value=\"yes\">Yes<br>\n");
      out.write("                    <input type=\"radio\" id=\"report2\" name=\"report\" value=\"no\" checked>No<br>\n");
      out.write("                    <select name=\"reportNumber\" id=\"reportNumber\">\n");
      out.write("                    <option value=\"1\">1</option>\n");
      out.write("                    <option value=\"2\">2</option>\n");
      out.write("                    <option value=\"3\">3</option>\n");
      out.write("                    <option value=\"4\">4</option>\n");
      out.write("                    <option value=\"5\">5</option>\n");
      out.write("                </select>-->\n");
      out.write("<!--               <div class=\"input_fields_wrap\"> \n");
      out.write("                   <p><center><button class=\"add_field_button\">Add more</button></center></p><br><br>\n");
      out.write("                </div>-->\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
   }
            
      out.write("\n");
      out.write("\n");
      out.write("            <input type =\"hidden\" name =\"totalNumberOfStates\" value =\"");
      out.print(totalNumberOfStates);
      out.write("\"/>\n");
      out.write("            <input type =\"hidden\" name =\"scenarioID\" value =\"");
      out.print(scenarioID);
      out.write("\"/>\n");
      out.write("            <input type =\"hidden\" name =\"patientNRIC\" value =\"");
      out.print(patientNRIC);
      out.write("\"/>\n");
      out.write("            <center><input type =\"submit\" class =\"button\" value =\"Create State(s)\"></center>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).foundation();\n");
      out.write("//            $('#reportNumber').hide();\n");
      out.write("//            $('#report2').change(function() {\n");
      out.write("//                if (this.checked) {\n");
      out.write("//                    $('#reportNumber').hide();\n");
      out.write("//                }\n");
      out.write("//            });\n");
      out.write("//            $('#report1').change(function() {\n");
      out.write("//                if (this.checked) {\n");
      out.write("//                    $('#reportNumber').show();\n");
      out.write("//                }\n");
      out.write("//            });\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                var max_fields = 10; //maximum input boxes allowed\n");
      out.write("                var wrapper = $(\".input_fields_wrap\"); //Fields wrapper\n");
      out.write("                var add_button = $(\".add_field_button\"); //Add button ID\n");
      out.write("\n");
      out.write("                var x = 1; //initlal text box count\n");
      out.write("                $(add_button).click(function(e) { //on add input button click\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    if (x < max_fields) { //max input box allowed\n");
      out.write("                        x++; //text box increment\n");
      out.write("//                        $(wrapper).append('<div><input type=\"text\" name=\"filename\" placeholder=\"Report name\"><a href=\"#\" class=\"remove_field\">Remove</a></div>'); //add input box\n");
      out.write("                        $(wrapper).append('<form action = \"ProcessReportUpload\" method = \"POST\" enctype = \"multipart/form-data\"> <input type =\"file\" name = \"file\" size = \"50\"/> <br> <input type =\"submit\" value = \"Upload Report\" /></form><br>'); //add input box\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(wrapper).on(\"click\", \".remove_field\", function(e) { //user click on remove text\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    $(this).parent('div').remove();\n");
      out.write("                    x--;\n");
      out.write("                })\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
