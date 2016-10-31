package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class java_002dtutorial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>The complete java tutorial</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <h1>Welcome You in Java Learning Zone...</h1>\n");
      out.write("        <p>Java is a high-level language that provides robust, secure and fast access environment, \n");
      out.write("            and plate form independent.\n");
      out.write("        Then, another question arrives that why these features in java only.\n");
      out.write("        </p>\n");
      out.write("        <p>Since, In 1991 of sun micro system engineers developed Java, these engineers are of green team:\n");
      out.write("            <mark>James Gosling, Mike Sheridan, and Patrick Naughton.</mark></p>\n");
      out.write("        \n");
      out.write("        <h2>What is Java</h2>\n");
      out.write("        <p>Java is a <strong>programming language</strong> and a <strong>platform</strong>.</p>\n");
      out.write("        <p>Java is a high level, robust, secured and object-oriented programming language.</p>\n");
      out.write("        <p><strong>Platform</strong>: Any hardware or software environment in which a program runs, is known as a platform. Since Java has its own runtime environment (JRE) and API, it is called platform.</p>\n");
      out.write("        <hr/>\n");
      out.write("        <h1>Java is a high-level programming language</h1>\n");
      out.write("        <p>Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. \n");
      out.write("            Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX.\n");
      out.write("            This tutorial gives a complete understanding of Java.\n");
      out.write("            This reference will take you through simple and practical approach while learning Java Programming language.\n");
      out.write("        </p>\n");
      out.write("    \n");
      out.write("        <h2>Lets See Java Example</h2>\n");
      out.write("        <p>Consider the following java programming example. The example of hello java example is provided as below.</p>\n");
      out.write("        <div class=\"codeblock\">\n");
      out.write("            <div class=\"dp-highlighter\"><textarea name=\"code\" class=\"java\">\n");
      out.write("            class SimpleJava{ \n");
      out.write("            public static void main(String args[]){\n");
      out.write("            System.out.println(\"Hello Java\");\n");
      out.write("            }}\n");
      out.write("            </textarea></div>\n");
      out.write("        </div>\n");
      out.write("        <p>save this file as SimpleJava.java</p>\n");
      out.write("        <br>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>To compile: </strong></td>\n");
      out.write("                <td><strong>javac SimpleJava.java</strong></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>To execute: </strong></td>\n");
      out.write("                <td><strong>java SimpleJava</strong></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <div class=\"codeblock3\"><pre><strong>Output: </strong>\"Hello Java\"</pre></div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"menu\"><strong>Menu:</strong><div class=\"leftmenu\" >\n");
      out.write("<a href=\"java-tutorial.html\" >What is Java? </a>\n");
      out.write("<a href=\"history-of-java.html\" >History of Java </a>\n");
      out.write("<a href=\"features-of-java.html\" >Features of Java </a>\n");
      out.write("<a href=\"simple-program-of-java.html\" >Hello Java Program</a>\n");
      out.write("<a href=\"internal-details-of-hello-java-program.html\" >Program Internal</a>\n");
      out.write("<a href=\"how-to-set-path-in-java.html\" >How to set path? </a>\n");
      out.write("<a href=\"difference-between-jdk-jre-and-jvm.html\">JDK, JRE and JVM </a>\n");
      out.write("<a href=\"internal-details-of-jvm.html\" >Internal Details of JVM </a>\n");
      out.write("<a href=\"variable-datatype.html\">Variable and Data Type</a>\n");
      out.write("<a href=\"unicode-system-in-java.html\" >Unicode System </a>\n");
      out.write("</div>\n");
      out.write("\n");
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
