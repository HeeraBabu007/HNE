package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class whatJava_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>What is java</title>\n");
      out.write("<link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("</head>\n");
      out.write("<body>      \n");
      out.write("    <div class=\"main_body_two\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CoreJava_menu.jsp", out, false);
      out.write("                     \n");
      out.write("    <div class=\"parts\">\n");
      out.write("        <div class=\"whole\">\n");
      out.write("            <div class=\"button_border\">\n");
      out.write("                <div class=\"menu_one\">About Java</div>\n");
      out.write("            </div>\n");
      out.write("                       \n");
      out.write("            <div class=\"part_first\">\n");
      out.write("                <div class=\"material_one\"> \n");
      out.write("                    <p>We use Java mostly for Roboust technology.\n");
      out.write("                    we will go through from different kinds of basic questions,\n");
      out.write("                    like about Java ,why we use Java,where we use Java ,types of applications created in Java.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>              \n");
      out.write("            <div class=\"part_second\">\n");
      out.write("                <div class=\"material_one\">\n");
      out.write("                    <ul>\n");
      out.write("                    <li>Applications of Java?</li>\n");
      out.write("                    <li>What is Java?</li>\n");
      out.write("                    <li>Where Java is used?</li>\n");
      out.write("                    <li> Why Java?</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                             \n");
      out.write("        <div class=\"whole\">\n");
      out.write("            <div class=\"button_border\">\n");
      out.write("                <div class=\"menu_one\">What is Java?</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"part_p1\"> \n");
      out.write("                <div class=\"material_one\"> \n");
      out.write("                    <p>Java is related to Object Oriented Language(oops).<br><br>\n");
      out.write("                       It is a high level ,Secured Programming language.<br>\n");
      out.write("                       It is also a plateform that can run on any Hardware or software environment.\n");
      out.write("                       well Java has its own run time environment i.e JRE and API i.e application programming interface.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                             \n");
      out.write("        <div class=\"whole\">\n");
      out.write("            <div class=\"button_border\">\n");
      out.write("                <div class=\"menu_one\">Example</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"part_p1\">\n");
      out.write("                <div class=\"part_p2\">\n");
      out.write("                    <div class=\"material_one\">\n");
      out.write("                        <span>class</span>\n");
      out.write("                        <span>first{\n");
      out.write("                        </span>\n");
      out.write("                        <span>public static void  main(string args[]){</span>\n");
      out.write("                         System.out.println(\"hello java\");<br>\n");
      out.write("                         }\n");
      out.write("                        }\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"next\"><input type=\"submit\" name=\"next\" value=\"Run\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                             \n");
      out.write("        <div class=\"whole\">\n");
      out.write("            <div class=\"button_border\">\n");
      out.write("                <div class=\"menu_one\">Where Java is use?</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"part_p1\">\n");
      out.write("                <div class=\"material_one\">\n");
      out.write("                    <ul>\n");
      out.write("                    <li>Games</li>\n");
      out.write("                    <li>Smart card</li>\n");
      out.write("                    <li>In Embedded System</li>                                        \n");
      out.write("                    <li>Robotic</li>\n");
      out.write("                    <li>In Mobile</li>\n");
      out.write("                    <li>In Media Player etc.</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                             \n");
      out.write("        <div class=\"whole\">\n");
      out.write("            <div class=\"button_border\">\n");
      out.write("                <div class=\"menu_one\">Applications of Java</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"material_one\">\n");
      out.write("                <div class=\"button_border\">There are 4 different Types of Java applications</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu\">Web Application</div>\n");
      out.write("            <div class=\"material_one\">  \n");
      out.write("                <p>It is used for create the Dynamic pages it is run on server side.In Java these pages\n");
      out.write("                   are being created in jsp,struts,servlet and jsf etc.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        <div class=\"whole\">\n");
      out.write("            <div class=\"button_border\">\n");
      out.write("                <div class=\"menu\">Standalone Application</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"material_one\">\n");
      out.write("                <p>It is system-based application or desktop application.Such as\n");
      out.write("                   Antivirus, PDF reader, Word reader and system softwares.It provides\n");
      out.write("                   real time and off line, user custom installation and creation.</p>\n");
      out.write("            </div>     \n");
      out.write("        </div>\n");
      out.write("                             \n");
      out.write("        <div class=\"whole\">\n");
      out.write("            <div class=\"button_border\">\n");
      out.write("                <div class=\"menu\">Mobile Application</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"material_one\">\n");
      out.write("                <p>It is very popular application these days and having wide range of applications\n");
      out.write("                   in daily use of mobiles.Such as for smart phones and mobile devices uses Android\n");
      out.write("                   which is based on totally Java.\n");
      out.write("                </p>\n");
      out.write("            </div>     \n");
      out.write("        </div>\n");
      out.write("                             \n");
      out.write("        <div class=\"whole\">\n");
      out.write("            <div class=\"button_border\">\n");
      out.write("                <div class=\"menu\">Enterprise Application</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"material_one\">\n");
      out.write("                <p>It is enterprise edition based on EJB(enterprise Java Beans).\n");
      out.write("                   This is used for distributed system where high level security is required, such as\n");
      out.write("                   banking system and next generation transaction system(railways registration system and online transaction system).\n");
      out.write("                </p>\n");
      out.write("            </div>     \n");
      out.write("        </div>\n");
      out.write("        <div class=\"button_border\">\n");
      out.write("            <a class=\"next\" href=\"\">Next-></a>\n");
      out.write("            <a class=\"next\" href=\"\">Prev</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <div class=\"bottom_border\"></div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("</div> \n");
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
