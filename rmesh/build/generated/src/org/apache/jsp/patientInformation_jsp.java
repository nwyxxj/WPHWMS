package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Patient Information</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foundation.css\" />\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"top-bar\" data-topbar>\n");
      out.write("            <ul class=\"title-area\">\n");
      out.write("                <li class=\"name\">\n");
      out.write("                    <h1><a href=\"#\">Health Lab <img src=\"img/healthlablogo.jpg\" height = \"40\"></a></h1>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <!-- Remove the class \"menu-icon\" to get rid of menu icon. Take out \"Menu\" to just have icon alone -->\n");
      out.write("                <li class=\"toggle-topbar menu-icon\"><a href=\"#\"><span>Menu</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <secion class=\"top-bar-section\">\n");
      out.write("                <!-- Right Nav Section -->\n");
      out.write("\n");
      out.write("                 <ul class=\"right\">\n");
      out.write("                    <li><a href=\"#\">Patient Management</a></li>\n");
      out.write("                    <li><a href=\"#\">Ward Management</a></li>\n");
      out.write("                    <li><a href=\"#\">Medical Management</a></li>\n");
      out.write("                  </ul>\n");
      out.write("            </secion>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <dl class=\"tabs\" data-tab>\n");
      out.write("            <dd class=\"active\"><a href=\"#panel1\">Admission Notes</a></dd>\n");
      out.write("            <dd><a href=\"#panel2\">Multidisciplinary Notes</a></dd>\n");
      out.write("            <dd><a href=\"#panel3\">Investigations</a></dd>\n");
      out.write("            <dd><a href=\"#panel4\">Medication</a></dd>\n");
      out.write("            <dd><a href=\"#panel5\">Clinical Chart</a></dd>\n");
      out.write("        </dl>\n");
      out.write("        <div class=\"tabs-content\">\n");
      out.write("            <div class=\"content active\" id=\"panel1\">\n");
      out.write("                <p>This is the first panel of the basic tab example. This is the first panel of the basic tab example.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\" id=\"panel2\">\n");
      out.write("                <p>This is the second panel of the basic tab example. This is the second panel of the basic tab example.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\" id=\"panel3\">\n");
      out.write("                <p>This is the third panel of the basic tab example. This is the third panel of the basic tab example.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\" id=\"panel4\">\n");
      out.write("                <p>This is the fourth panel of the basic tab example. This is the fourth panel of the basic tab example.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/vendor/jquery.js\"></script>\n");
      out.write("        <script src=\"js/foundation.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).foundation();\n");
      out.write("        </script>\n");
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
