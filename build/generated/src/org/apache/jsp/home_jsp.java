package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home • PrepBIX</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"homeStyle.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@mdi/font@7.4.47/css/materialdesignicons.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <aside class=\"sidebar-nav\" id=\"sidebar-nav\">\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">×</a>\n");
      out.write("            <nav class=\"sidebar\">\n");
      out.write("                <div class=\"nav-logo\">\n");
      out.write("                    <center><h2>PrepBIX</h2></center>\n");
      out.write("                </div>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <ul id=\"ul\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"home.jsp\">\n");
      out.write("                            <span class=\"icon\"><i class=\"mdi mdi-home\"></i></span><span class=\"text\">Home</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"icon\"><i class=\"mdi mdi-math-integral-box\"></i></span>\n");
      out.write("                            <span class=\"text\">Arithmetic Aptitude</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"icon\"><i class=\"mdi mdi-chart-box\"></i></span>\n");
      out.write("                            <span class=\"text\">Data Interpretation</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"icon\"><i class=\"mdi mdi-text-box-check\"></i></span>\n");
      out.write("                            <span class=\"text\">Verbal Ability</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"icon\"><i class=\"mdi mdi-chart-arc\"></i></span>\n");
      out.write("                            <span class=\"text\">Logical Reasoning</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"icon\"><i class=\"mdi mdi-alphabetical-variant\"></i></span>\n");
      out.write("                            <span class=\"text\">Verbal Reasoning</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"icon\"><i class=\"mdi mdi-collage\"></i></span>\n");
      out.write("                            <span class=\"text\">Non-Verbal Reasoning</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"icon\"><i class=\"mdi mdi-clock-outline\"></i></span>\n");
      out.write("                            <span class=\"text\">Online Tests</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </aside>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <main class=\"main-wrapper\" id=\"main-wrapper\" color=\"cyan\">\n");
      out.write("        <header>\n");
      out.write("                \n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <div class=\"nav1\" style=\"display: flex;\" >\n");
      out.write("                    <button class=\"openbtn\" onclick=\"openNav()\">☰</button>\n");
      out.write("                    <div class=\"logo\">PrepBIX</div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"nav2\">\n");
      out.write("                <ul id=\"nav2-ul\">\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <form action=\"https://www.google.com/search\" method=\"GET\" target=\"_blank\">\n");
      out.write("                        <input type=\"text\" name=\"q\" placeholder=\"Search...\">\n");
      out.write("                        <button class=\"search-btn\" type=\"submit\">\n");
      out.write("                          <i class=\"mdi mdi-magnify mdi-24px\"></i>\n");
      out.write("                        </button>\n");
      out.write("                      </form>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav2-btn\">\n");
      out.write("                        <span class=\"theme-toggle\" id=\"theme-btn\">\n");
      out.write("                          <i class=\"mdi mdi-theme-light-dark mdi-rotate-315\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav2-btn\">\n");
      out.write("                       <span class=\"logout-btn\">\n");
      out.write("                            <a href=\"logout.jsp\">\n");
      out.write("                                <i class=\"mdi mdi-logout\"></i>\n");
      out.write("                            </a> \n");
      out.write("                        </span> \n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("            <script>\n");
      out.write("                function openNav() {\n");
      out.write("                  document.getElementById(\"sidebar-nav\").style.width = \"270px\";\n");
      out.write("                  document.getElementById(\"main-wrapper\").style.marginLeft = \"270px\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function closeNav() {\n");
      out.write("                  document.getElementById(\"sidebar-nav\").style.width = \"0\";\n");
      out.write("                  document.getElementById(\"main-wrapper\").style.marginLeft= \"0\";\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("            <script>\n");
      out.write("                // Example JavaScript for toggling the theme\n");
      out.write("                const themeBtn = document.getElementById('theme-btn');\n");
      out.write("                themeBtn.addEventListener('click', () => {\n");
      out.write("                  document.body.classList.toggle('dark-theme');\n");
      out.write("                });\n");
      out.write("            </script>    \n");
      out.write("        </header>    \n");
      out.write("            \n");
      out.write("\n");
      out.write("            ");
String username=(String)session.getAttribute("username");
            if(username==null)
            {
                response.sendRedirect("login.html");
            }
            
      out.write("\n");
      out.write("            <h1>Hello ");
      out.print(username);
      out.write("....!</h1>\n");
      out.write("            <h3>Login Successful......:)</h3>\n");
      out.write("            <section>\n");
      out.write("            <h2>General Aptitude</h2>\n");
      out.write("            <iframe width=\"33%\" src=\"https://www.youtube.com/embed/S-Ji7aayH3A?si=mfnEu0k1rTdbKIln\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen>\n");
      out.write("                \n");
      out.write("            </iframe>\n");
      out.write("            \n");
      out.write("            </section>\n");
      out.write("          \n");
      out.write("            <a href=\"logout.jsp\">Sign Out</a>\n");
      out.write("        </main>\n");
      out.write("        <footer>\n");
      out.write("            <div >\n");
      out.write("                <p>&copy; 2025 Placement Preparation. All rights reserved.</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
