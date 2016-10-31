package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class numberSystem1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Number system page 2</title>\n");
      out.write("        <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">  \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"main_body\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("       <!-- <div class=\"question\">\n");
      out.write("           <!-- <div class=\"formula\">Remindable</div>\n");
      out.write("        </div>-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <!-- <div class=\"menu\">Menu</div> -->\n");
      out.write("                <div class=\"material\">\n");
      out.write("                    <ul>\n");
      out.write("                        <div class=\"text_border\"> <li>Important Formulae</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Types of Numbers</li></div> \n");
      out.write("                        <div class=\"text_border\"><li>Test of Divisibility</li></div> \n");
      out.write("                        <div class=\"text_border\"> <li>HCF and LCM of Numbers</li></div> \n");
      out.write("                        <div class=\"text_border\">  <li>Factors of Composite Number</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Counting Number of Zeros</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Cyclicity</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Remainder Theorem</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Polynomial Theorem</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>More Cases for remainders</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Squares of Numbers</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Some obervations</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Some Techniques of Multiplication</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Examples</li></div>\n");
      out.write("                        <div class=\"text_border\"> <li>Exercise</li></div>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"double_big_space\">\n");
      out.write("                    <div class=\"menu_one\">\n");
      out.write("                        <div class=\"hnt\">Types of Number System</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"whole\">\n");
      out.write("                        <div class=\"button_border\">\n");
      out.write("                        <div class=\"menu\">Rational Numbers</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"part_p1\">\n");
      out.write("                            <div class=\"material_one\">\n");
      out.write("                            <p>Those numbers in the p/q form,Where p and q are integers and <br> \n");
      out.write("                            q is not equal to 0 are known as rational numbers.<br>\n");
      out.write("                            For instance 2/3 , -4/9 , 5/7 etc.\n");
      out.write("                            </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"whole\">\n");
      out.write("                        <div class=\"button_border\">\n");
      out.write("                            <div class=\"menu\">Irrational Numbers</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"part_p1\">\n");
      out.write("                            <div class=\"material_one\">\n");
      out.write("                            <p>Which numbers expressed by Decimal form are neither terminating nor repeating<br>\n");
      out.write("                               decimals ,are called as irreational numbers.<br>\n");
      out.write("                               Where Exact value of PIE is not 22/7 .<br>\n");
      out.write("                                22/7 is rational number While PIE is an irreational number.\n");
      out.write("                            </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"whole\">\n");
      out.write("                        <div class=\"button_border\">\n");
      out.write("                            <div class=\"menu\">Real Numbers</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"material_one\">\n");
      out.write("                            <p> The Rational and Irreational numbers combined are known as Real numbers.\n");
      out.write("                                <br>\n");
      out.write("                                E.g 12/9 are Real numbers.\n");
      out.write("                                Real  numbers are denoted by R. \n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"whole\">\n");
      out.write("                        <div class=\"button_border\">\n");
      out.write("                            <div class=\"menu\">Complex Number</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"material_one\">\n");
      out.write("                            <p>Complex numbers in the form of a+ib.<br>\n");
      out.write("                                Where a and b are Real numbers and<br>\n");
      out.write("                                i=root-1.\n");
      out.write("                                e.g 3+2i , 4+2i , 9+6i these are complex numbers.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button_border\">\n");
      out.write("                        <a class=\"next\" href=\"numberSysTwo.html\">Next-></a>\n");
      out.write("                        <a class=\"next\" href=\"Number System.html\"> </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom_border\"></div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
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
