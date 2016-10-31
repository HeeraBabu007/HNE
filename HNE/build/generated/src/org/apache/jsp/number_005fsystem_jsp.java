package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class number_005fsystem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Number System</title>\n");
      out.write("        <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"double_big_space\">\n");
      out.write("                            <div class=\"menu_one\">\n");
      out.write("                                <div class=\"hnt\">Types of Number System\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"whole\">\n");
      out.write("                                <div class=\"button_border\">\n");
      out.write("                                    <div class=\"menu\">Natural Numbers</div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"part_p1\">\n");
      out.write("                                    <div class=\"material_one\"><p> Natural numbers are counting numbers 1,2,3,4,5............. .<br>\n");
      out.write("                                        Counting numbers or natural numbers are represented by N={1,2,3,4,5,6.......}<br>\n");
      out.write("                                        little different from whole numbers.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"whole\">\n");
      out.write("                                <div class=\"button_border\">\n");
      out.write("                                    <div class=\"menu\">Whole Numbers</div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"part_p1\">\n");
      out.write("                                    <div class=\"material_one\"><p>All natural numbers are whole number but 0 is not a natural number.\n");
      out.write("                                         0 is a whole number. if we inclue 0 with every natural number than it become whole number.\n");
      out.write("                                        like 0,1,2,3,4,5..... are whole numbers.\n");
      out.write("                                        it represented by W={0,1,2,3,4,5,6.....}<br>\n");
      out.write("                                        for Whole number we include 0 among the Natural numbers.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"whole\">\n");
      out.write("                                <div class=\"button_border\">\n");
      out.write("                                    <div class=\"menu\">Integers</div>\n");
      out.write("                                </div>\n");
      out.write("                                    <div class=\"material_one\">\n");
      out.write("                                        <p>All whole numbers and negative counting numbers are known as Integers.<br>\n");
      out.write("                                            The Integers are represented by..<br>\n");
      out.write("                                            I={.....,-5,-4,-3,-2,-1,0,1,2,3,4,5....}\n");
      out.write("                                            <br>\n");
      out.write("                                            There are two types of Integers.\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li>Positive Integers.</li>\n");
      out.write("                                            <li>Negative Integers.</li>  \n");
      out.write("                                        </ul>\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"whole\">\n");
      out.write("                                <div class=\"button_border\">\n");
      out.write("                                    <div class=\"menu\">Positive Integers</div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"material_one\">\n");
      out.write("                                        <p>All Natural numbers are called Positive Integers.\n");
      out.write("                                            e.g {1,2,,3,4,5....}<br>\n");
      out.write("                                            Natural number is synonyms of Positive Integers.\n");
      out.write("                                        </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"whole\">\n");
      out.write("                                <div class=\"button_border\">\n");
      out.write("                                    <div class=\"menu\">Negative Integers</div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"part_p1\">\n");
      out.write("                                    <div class=\"material_one\"><p>All negative numbers are called Negative Integers.\n");
      out.write("                                            e.g {-1,-2,-3,-4,-5....}<br>\n");
      out.write("                                            0 is neither Positive nor Negative.<br><br>\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"button_border\">\n");
      out.write("                                <a class=\"next\" href=\"numberSysOne.html\">Next-></a>\n");
      out.write("                                <a class=\"next\" href=\"numberSysOne.html\"></Prev> </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        \n");
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
