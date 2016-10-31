package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MathSolution_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("        <title>Math Solution</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>Book Solution & for Content Writing.</h1>\n");
      out.write("        <div class=\"Math_solution_home_border\">\n");
      out.write("        <div class=\"first_part\">\n");
      out.write("            <div class=\"elementry_two\">\n");
      out.write("                <div  class=\"font_index\">\n");
      out.write("                Provide Your Contact Detail\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Math_solution_part_one\">\n");
      out.write("            <div class=\"one\">Name</div>\n");
      out.write("            <div class=\"one\">Address 1</div>\n");
      out.write("            <div class=\"one\">Address 2</div>\n");
      out.write("            <div class=\"one\">Contact Number</div>\n");
      out.write("            <div class=\"one\">Company Name</div>\n");
      out.write("            <div class=\"one\">Date</div> \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"Math_solution_part_two\">\n");
      out.write("            <div class=\"two\">\n");
      out.write("                <input type=\"text\" name=\"text\" value=\"Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"two\">\n");
      out.write("                <input type=\"text\" name=\"text\" value=\"Correspondence Address\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"two\">\n");
      out.write("                <input type=\"text\" name=\"text\" value=\"Permanent Address\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"two\">\n");
      out.write("                <input type=\"text\" name=\"text\" value=\"Mobile Number\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"two\">\n");
      out.write("                <input type=\"text\" name=\"text\" value=\"Company Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"two\">\n");
      out.write("                <input type=\"date\" name=\"text\" value=\"Deadline date\">\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"sub_border\">\n");
      out.write("            <div class=\"submit\">\n");
      out.write("            <input type=\"submit\" name=\"submit\" value=\"Check\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
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
