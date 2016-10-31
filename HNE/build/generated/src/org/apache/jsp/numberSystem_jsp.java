package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class numberSystem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\" async\n");
      out.write("  src=\"https://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-MML-AM_CHTML\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("        <script src='http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML' type='text/javascript'>\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Number system</title>\n");
      out.write("        <link rel=\"StyleSheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"main_body\">\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"question\">\n");
      out.write("            <div class=\"formula\">To remind</div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Maths_menu.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"big_space\">\n");
      out.write("                            <div class=\"long_box\">\n");
      out.write("                                <div class=\"short_box\">1.</div>\n");
      out.write("                                <div class=\"short_box\">2.</div>\n");
      out.write("                                <div class=\"short_box\">3.</div>\n");
      out.write("                                <div class=\"short_box\">4.</div>\n");
      out.write("                                <div class=\"short_box\">5.</div>\n");
      out.write("                                <div class=\"short_box\">6.</div>\n");
      out.write("                                <div class=\"short_box\">7.</div>\n");
      out.write("                                <div class=\"short_box\">8.</div>\n");
      out.write("                                <div class=\"short_box\">9.</div>\n");
      out.write("                                <div class=\"short_box\">10.</div>\n");
      out.write("                                <div class=\"short_box\">11.</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"double_box\">\n");
      out.write("                                <div class=\"double_field\" >\n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                        \\({\\left( {a + b} \\right)^2} = {a^2} + {b^2} + 2ab\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"double_field\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                        \\({\\left( {a - b} \\right)^2} = {a^2} + {b^2} - 2ab\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"double_field\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                       \\({\\left( {a + b} \\right)^3} = {a^3} + {b^3} + 3{a^2}b + 3a{b^2}\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"double_field\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                    \\({\\left( {a - b} \\right)^3} = {a^3} - {b^3} - 3{a^2}b + 3a{b^2}\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"double_field\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                   \\(\\left( {a - b} \\right)\\left( {a + b} \\right) = {a^2} - {b^2}\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"double_field\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                    \\({\\left( {a + b} \\right)^2} + {\\left( {a - b} \\right)^2} = 2\\left( {{a^2} + {b^2}} \\right)\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"double_field\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                    \\({\\left( {a + b} \\right)^2} - {\\left( {a - b} \\right)^2} = 4ab\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"double_field\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                    \\(\\frac{{{a^3} + {b^3} + {c^3} - 3abc}}{{{a^2} + {b^2} + {c^2} - ab - bc - ca}} = \\left( {a + b + c} \\right)\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"double_field\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                    \\({a^3} + {b^3} = \\left( {a + b} \\right)\\left( {{a^2} - ab + {b^2}} \\right)\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"double_field\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                    \\({a^3} - {b^3} = \\left( {a - b} \\right)\\left( {{a^2} + ab + {b^2}} \\right)\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"double_field_one\" > \n");
      out.write("                                    <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n");
      out.write("                                    \\(\\begin{array}{c}{a^4} - {b^4} = {\\left( {{a^2}} \\right)^2} - {\\left( {{b^2}} \\right)^2}\\\\ = \\left( {{a^2} + {b^2}} \\right)\\left( {{a^2} - {b^2}} \\right)\\\\ = \\left( {{a^2} + {b^2}} \\right)\\left( {a + b} \\right)\\left( {a - b} \\right)\\end{array}\\)\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>  \n");
      out.write("                        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            <div class=\"bottom_border\"></div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("</div>\n");
      out.write("             \n");
      out.write(" \n");
      out.write("            \n");
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
