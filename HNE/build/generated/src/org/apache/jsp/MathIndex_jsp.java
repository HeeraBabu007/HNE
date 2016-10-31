package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MathIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("    <div class=\"main_body\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"info\">\n");
      out.write("                   <div class=\"font\">\n");
      out.write("                       <ul>\n");
      out.write("                           <li>The Complete Solution of NCERT from Class VIII. to Class XII. </li>\n");
      out.write("                           <li>Pre-Engineering Mathematics Solution for IIT, Olmpiad and JEE Advanced</li>\n");
      out.write("                           <li>Higher Engineering Mathematics Solution</li>\n");
      out.write("                           <li>Software use in solution are:\n");
      out.write("                               Maple software , MATLAB software and TI-83 graphical calculator.                           \n");
      out.write("                           </li>\n");
      out.write("                       </ul>\n");
      out.write("                   </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"index\">\n");
      out.write("                <div class=\"index_elementry\">\n");
      out.write("                    <div class=\"elementry\">\n");
      out.write("                        <div  class=\"font_index\">Mathematics for Pre-standard</div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"elementry_body\">\n");
      out.write("                        <ul>\n");
      out.write("                           <li><a href=\"numberSystem.jsp\">Number System</a></li>\n");
      out.write("                           <li>Data Handling</li>\n");
      out.write("                           <li>Mensuration</li>\n");
      out.write("                           <li>Algebra</li>\n");
      out.write("                           <li>Rational & proportion</li>\n");
      out.write("                           <li>Equations</li>\n");
      out.write("                           <li>Geometry</li>\n");
      out.write("                       </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"index_elementry\">\n");
      out.write("                    <div class=\"elementry\">\n");
      out.write("                        <div  class=\"font_index\">Mathematics for Secondary</div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"elementry_body\">\n");
      out.write("                        <ul>\n");
      out.write("                           <li>Linear equations</li>\n");
      out.write("                           <li>Roots</li>\n");
      out.write("                           <li>Progression</li>\n");
      out.write("                           <li>Algebraic expressions</li>\n");
      out.write("                           <li>Probability</li>\n");
      out.write("                           <li>factorisation</li>\n");
      out.write("                           <li>Graph</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"index_elementry\">\n");
      out.write("                    <div class=\"elementry\">\n");
      out.write("                        <div  class=\"font_index\">Math for Higher Secondary</div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"elementry_body\">\n");
      out.write("                        <ul>\n");
      out.write("                           <li>Blood Relation</li>\n");
      out.write("                           <li>Coding & Decoding</li>\n");
      out.write("                           <li>Cubes and Dices</li>\n");
      out.write("                           <li>Direct Sense Test</li>\n");
      out.write("                           <li>Puzzles</li>\n");
      out.write("                           <li>Logical Venn Diagram</li>\n");
      out.write("                           <li>Analytical Reasoning</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"index_elementry\">\n");
      out.write("                    <div class=\"elementry\">\n");
      out.write("                        <div  class=\"font_index\">Engineering Mathematics</div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"elementry_body\">\n");
      out.write("                        <ul>\n");
      out.write("                           <li>Graph</li>\n");
      out.write("                           <li>Table</li>\n");
      out.write("                           <li>Bar Diagram</li>\n");
      out.write("                           <li>Pie-chart</li>\n");
      out.write("                           <li>Line Graph</li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"index_elementry\">\n");
      out.write("                    <div class=\"elementry\">\n");
      out.write("                        <div  class=\"font_index\">Previous year papers</div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"elementry_body\">\n");
      out.write("                        <ul>\n");
      out.write("                           <li>C Programming</li>\n");
      out.write("                           <li>C++ Programming</li>\n");
      out.write("                           <li><a href=\"CoreJava.html\">Core Java Programming</a></li>\n");
      out.write("                           <li>Advanced Programming</li>\n");
      out.write("                           <li>PHP Programming</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"index_elementry\">\n");
      out.write("                    <div class=\"elementry\">\n");
      out.write("                        <div  class=\"font_index\">Mathematics Quiz</div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"elementry_body\">\n");
      out.write("                        <ul>\n");
      out.write("                           <li>HTML5</li>\n");
      out.write("                           <li>jQuery</li>\n");
      out.write("                           <li>JavaScript</li>\n");
      out.write("                           <li>CSS 3</li>\n");
      out.write("                           <li>WordPress</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
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
