package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class numberSystem2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Number system page 1</title>\n");
      out.write("        <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">  \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("    <div class=\"main_body\">\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("      <!--  <div class=\"question\">\n");
      out.write("            <div class=\"formula\">Remindable</div>\n");
      out.write("        </div>-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"left_box\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Maths_menu.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"double_big_space\">\n");
      out.write("                <div class=\"menu_one\">\n");
      out.write("                    <div class=\"hnt\">\n");
      out.write("                        Types of Number System\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <div class=\"whole\">\n");
      out.write("                <div class=\"button_border\">\n");
      out.write("                    <div class=\"menu\">Even Numbers</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"part_p1\">\n");
      out.write("                    <div class=\"material_one\">\n");
      out.write("                        <p>Those numbers which are exactly divisible by 2 are known as Even numbers.\n");
      out.write("                        <br>\n");
      out.write("                        e.g 2,4,6,8,10, ....,16,..... etc..\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("b                                     \n");
      out.write("            <div class=\"whole\">\n");
      out.write("                <div class=\"button_border\">\n");
      out.write("                    <div class=\"menu\">Odd Numbers</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"part_p1\">\n");
      out.write("                    <div class=\"material_one\">\n");
      out.write("                        <p>All those numbers which are not exactly divisible by<br>\n");
      out.write("                            2 are called Odd numbers.\n");
      out.write("                            e.g 1, 3 ,5 ,7,9 etc.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"whole\">\n");
      out.write("                <div class=\"button_border\">\n");
      out.write("                    <div class=\"menu\">Prime Numbers</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"part_p1\">\n");
      out.write("                    <div class=\"material_one\">\n");
      out.write("                        <p>Those numbers which are divisible by 1 and itself but not divisible<br>\n");
      out.write("                            by any other numbers are called Prime numbers.<br>\n");
      out.write("                            like 2,3,5,7etc.<br>\n");
      out.write("                            Where 2 is the only Even number which is also a prime number<br>\n");
      out.write("                            All rest are odd prime numbers.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"whole\">\n");
      out.write("                <div class=\"button_border\">\n");
      out.write("                    <div class=\"menu\">Composite Numbers</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"material_one\">\n");
      out.write("                    <p> Natural numbers which is greater than 1 are not prime numbers are called comosite\n");
      out.write("                        numbers.<br>\n");
      out.write("                        e.g 4,6,9,15 ect.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"whole\">\n");
      out.write("                <div class=\"button_border\">\n");
      out.write("                    <div class=\"menu\">Co prime Number</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"material_one\">\n");
      out.write("                    <p>Two numbers which have only 1 as the common factor are called<br>\n");
      out.write("                       coprime numbers or relatively prime to each other numbers.<br>\n");
      out.write("                       e.g (3,7) (8,9)(36,25).\n");
      out.write("                       Here 8 and 9 are not prime numbers but it have one common factor i.e 1.<br>\n");
      out.write("                       so,they are coprime numbers.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"button_border\">\n");
      out.write("                <a class=\"next\" href=\"numberSysThree.html\">Next-></a>\n");
      out.write("                <a class=\"next\" href=\"numberSysOne.html\">Prev </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("            <div class=\"bottom_border\"></div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
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
