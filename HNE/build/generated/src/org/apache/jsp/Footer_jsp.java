package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Myfooterpage</title>\n");
      out.write("        <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"feet_border\">\n");
      out.write("                <div class=\"footer_part\">\n");
      out.write("                    <div class=\"foot_part_top\">Interview Que.</div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>PHP</li>\n");
      out.write("                        <li>Java</li>\n");
      out.write("                        <li>Servelts</li>\n");
      out.write("                        <li>My Sql</li>\n");
      out.write("                        <li>JSP</li>\n");
      out.write("                        <li>Hibernate</li>\n");
      out.write("                        <li>Spring</li>\n");
      out.write("                        <li>Android</li>\n");
      out.write("                        <li>PL/SQL</li>\n");
      out.write("                        <li>Oracle</li>\n");
      out.write("                        <li>Sql Server</li>\n");
      out.write("                        <li>DataBase</li>\n");
      out.write("                        <li>Cloude</li>\n");
      out.write("                    </ul>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer_part\">\n");
      out.write("                    <div class=\"foot_part_top\">Toutarials</div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>PHP </li>\n");
      out.write("                        <li>Core Java</li>\n");
      out.write("                        <li>Servelts</li>\n");
      out.write("                        <li>JSP</li> \n");
      out.write("                        <li>Spring</li>\n");
      out.write("                        <li>Struts</li>\n");
      out.write("                        <li>Java Script</li>\n");
      out.write("                        <li>Ajax</li>\n");
      out.write("                        <li>JAXB</li>\n");
      out.write("                        <li>Hibernate</li>\n");
      out.write("                        <li>Android</li>\n");
      out.write("                        <li>C </li>\n");
      out.write("                        <li>Design Pattern</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer_part\">\n");
      out.write("                    <div class=\"foot_part_top\">Quizzesss</div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>PHP </li>\n");
      out.write("                        <li>Core Java</li>\n");
      out.write("                        <li>Servelts</li>\n");
      out.write("                        <li>JSP</li> \n");
      out.write("                        <li>Spring</li>\n");
      out.write("                        <li>Struts</li>\n");
      out.write("                        <li>Java Script</li>\n");
      out.write("                        <li>Ajax</li>\n");
      out.write("                        <li>JAXB</li>\n");
      out.write("                        <li>Hibernate</li>\n");
      out.write("                        <li>Android</li>\n");
      out.write("                        <li>C </li>\n");
      out.write("                        <li>Design Pattern</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer_part\">\n");
      out.write("                    <div class=\"foot_part_top\">Fourm</div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>PHP Forum</li>\n");
      out.write("                        <li>Core Java</li>\n");
      out.write("                        <li>Servelts</li>\n");
      out.write("                        <li>Struts</li>\n");
      out.write("                        <li>Android</li>\n");
      out.write("                        <li>Hibernate</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"bottom_border\">Projects</div>\n");
      out.write("                    <div class=\"bottom_border\">HNE PVT.LTD.</div>\n");
      out.write("                    <div class=\"bottom_border\">Consultancy</div>\n");
      out.write("                    <div class=\"bottom_border\">Traning</div>\n");
      out.write("                </div>\n");
      out.write("            </div>               \n");
      out.write("          \n");
      out.write("        </footer>\n");
      out.write("        <div class=\"bottom_border\"></div>\n");
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
