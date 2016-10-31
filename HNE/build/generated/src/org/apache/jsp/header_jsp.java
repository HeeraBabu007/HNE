package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("        <title>Header</title>\n");
      out.write("    </head>\n");
      out.write("    <marquee>Published by Er. Heera Babu and Er. Navneet Kaur</marquee>\n");
      out.write("    <body>\n");
      out.write("            <header>\n");
      out.write("                <div class=\"header_inside_top\">\n");
      out.write("                    <div class=\"header_top_left\">\n");
      out.write("                        <div class=\"hnt\"> Hindustan National Education System</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header_top_right\">\n");
      out.write("                        <div class=\"header_part_right\">Contact Us</div>\n");
      out.write("                        <div class=\"header_part_right\">Query Here</div>\n");
      out.write("                        <div class=\"header_part_right\"><a href=\"login.jsp\">Login Here</a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header_bottom\">\n");
      out.write("                        <div class=\"header_bottom_left\">\n");
      out.write("                            <div class=\"h_bottom_left_Part\"><a href=\"index.html\">Home</a></div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\"><a href=\"MathIndex.jsp\">Math</a></div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">My Sql</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">C </div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">Java</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">Android</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">Php</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">Html</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">CSS</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">XML</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">Web Services</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">DataBase</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">Training</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">Interview Que</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">Project</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\">Comment</div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\"><a href=\"services.jsp\">Services</a></div>\n");
      out.write("                            <div class=\"h_bottom_left_Part\"><a href=\"MathSolution.jsp\">Quick Solution</a></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"search_box\">  \n");
      out.write("                            <div class=\"Search\">\n");
      out.write("                                <input type=\"text\" name=\"text\"  placeholder=\"fill here\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("</body>\n");
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
