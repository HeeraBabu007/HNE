package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CoreJava_005fmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Core java menu Page</title>\n");
      out.write("         <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>      \n");
      out.write("    \n");
      out.write("        <div class=\"menu\">Core Java Topic</div>\n");
      out.write("        <div class=\"material\">\n");
      out.write("            <div class=\"scroll\">\n");
      out.write("            <ul>\n");
      out.write("                <div class=\"text_border\"><li><a href=\"whatJava.jsp\">Java is What?</a></li></div> \n");
      out.write("                <div class=\"text_border\"><li>History of Java</li></div> \n");
      out.write("                <div class=\"text_border\"> <li>Feature of Java</li></div> \n");
      out.write("                <div class=\"text_border\"> <li>Hello Java Program</li></div>\n");
      out.write("                <div class=\"text_border\">  <li>Internality of Program</li></div>\n");
      out.write("                <div class=\"text_border\"> <li>How to Set Path?</li></div>\n");
      out.write("                <div class=\"text_border\"> <li>JDK , JRE and JVM?</li></div>\n");
      out.write("                <div class=\"text_border\"> <li>JVM is What?</li></div>\n");
      out.write("                <div class=\"text_border\"> <li>DataType and Variables</li></div>\n");
      out.write("                <div class=\"text_border\"> <li>UniCode System</li></div>\n");
      out.write("                <div class=\"text_border\"> <li>Operators</li></div>\n");
      out.write("                <div class=\"text_border\"> <li>Programs</li></div>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"menu\">Java Oops Concept</div>\n");
      out.write("            <ul>\n");
      out.write("            <div class=\"text_border\"> <li>Advantages of Oops</li></div> \n");
      out.write("            <div class=\"text_border\"><li>Class and Objects</li></div> \n");
      out.write("            <div class=\"text_border\"> <li>Overloading Method</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Overriding Method</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Overloading vs Overriding</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Static Keyword</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>This Keyword</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Super Keyword</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Final Keyword</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Constructor</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Inheritance</li></div>                           \n");
      out.write("            <div class=\"text_border\"> <li>Return Type</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Package</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Instance Initilaizer Block</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Instance of Operator</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Polymorphism</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Dynamic Binding</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Abstract Class</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Interface</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Interface vs Abstract</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Access Modifier</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Wrapper Class</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Object Class</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Object vs Class</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Encapsulation</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Call by Value</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Java Array</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Command Line Argu</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Java API</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Quiz for oops</li></div>\n");
      out.write("            <div class=\"text_border\"> <li>Quiz for Array</li></div>\n");
      out.write("        </ul>\n");
      out.write("            <div class=\"menu\">Java String</div>\n");
      out.write("            <div class=\"menu\">Java Inner Classes</div>\n");
      out.write("            <div class=\"menu\">Java Networking</div>\n");
      out.write("            <div class=\"menu\">Java I/O</div>\n");
      out.write("            <div class=\"menu\">Exception Handling</div>\n");
      out.write("            <div class=\"menu\">Java Feature</div>\n");
      out.write("            <div class=\"menu\">Java Applet</div>\n");
      out.write("            <div class=\"menu\">Java AWT</div>\n");
      out.write("            <div class=\"menu\">Java Swing</div>\n");
      out.write("            <div class=\"menu\">Java Date</div>\n");
      out.write("            <div class=\"menu\">Java Collection</div>\n");
      out.write("            <div class=\"menu\">Java Conversion </div>\n");
      out.write("            <div class=\"menu\">Java JDBC</div>\n");
      out.write("            <div class=\"menu\">Java RMI</div>\n");
      out.write("            <div class=\"menu\">Related Question</div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
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
