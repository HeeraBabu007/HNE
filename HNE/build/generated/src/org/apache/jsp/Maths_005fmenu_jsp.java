package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Maths_005fmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Left side bar Page</title>\n");
      out.write("        <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu\">Menu</div> \n");
      out.write("            <div class=\"material\">\n");
      out.write("                <div class=\"scroll\">\n");
      out.write("            <ul>\n");
      out.write("                <div class=\"text_border\"><li><a href=\".jsp\">Important Formulae</a></li></div>\n");
      out.write("                <div class=\"text_border\"><li><a href=\"numberSystem2.jsp\">Types of Numbers</a></li></div> \n");
      out.write("                <div class=\"text_border\"><li>Test of Divisibility</li></div> \n");
      out.write("                <div class=\"text_border\"><li>HCF and LCM of Numbers</li></div> \n");
      out.write("                <div class=\"text_border\"><li>Factors of Composite Number</li></div>\n");
      out.write("                <div class=\"text_border\"><li>Counting Number of Zeros</li></div>\n");
      out.write("                <div class=\"text_border\"><li>Cyclicity</li></div>\n");
      out.write("                <div class=\"text_border\"><li>Remainder Theorem</li></div>\n");
      out.write("                <div class=\"text_border\"><li>Polynomial Theorem</li></div>\n");
      out.write("                <div class=\"text_border\"><li>More Cases for remainders</li></div>\n");
      out.write("                <div class=\"text_border\"><li>Squares of Numbers</li></div>\n");
      out.write("                <div class=\"text_border\"><li>Some obervations</li></div>\n");
      out.write("                <div class=\"text_border\"><li>Some Techniques of Multiplication</li></div>\n");
      out.write("                <div class=\"text_border\"><li>Examples</li></div>\n");
      out.write("                <div class=\"text_border\"><li>Exercise</li></div>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
