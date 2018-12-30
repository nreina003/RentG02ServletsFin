package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class responsableO_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Responsable</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"description\" content=\"Este es un documento HTML5\">\n");
      out.write("        <meta name=\"keywords\" content=\"HTML, CSS, JavaScript\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"img/favicon.png\" />\n");
      out.write("        <script src=\"js/responsableO.js\"></script>\n");
      out.write("        <script src=\"js/indexedDB.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"cabeceralogo\">\n");
      out.write("            <div>\n");
      out.write("                <h1>RENTG02</h1>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <nav id=\"menuprincipal\">\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"consultarReservasO.jsp\">Consultar Reservas</a></li>\n");
      out.write("                    <li><a href=\"contactoLog.jsp\">Contacto</a></li>\n");
      out.write("                     <li>\n");
      out.write("                        <form action=\"SvrLogoff\" method=\"post\">   \n");
      out.write("                            <button type=\"submit\" id=\"logoff\">Cerrar Sesión</button>\n");
      out.write("                        </form>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <main>\n");
      out.write("            <div>\n");
      out.write("                <section id=\"articulosprincipales\">\n");
      out.write("                    <article>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <h1>RentG</h1>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <section id=\"saludo\" >\n");
      out.write("                                    </section>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </article>\n");
      out.write("                </section>\n");
      out.write("                <aside id=\"infoadicional\">\n");
      out.write("                    <h1>Nuestras oficinas</h1>\n");
      out.write("                    <p>Vitoria</p>\n");
      out.write("                    <p>Donostia</p>\n");
      out.write("                    <p>Bilbo</p>\n");
      out.write("                     <div id=\"logo\">\n");
      out.write("                        <img src=\"img/favicon.png\" alt=\"Logo\" />\n");
      out.write("                    </div>\n");
      out.write("                </aside>\n");
      out.write("                <div class=\"recuperar\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("        <footer id=\"pielogo\">\n");
      out.write("            <div>\n");
      out.write("                <section class=\"seccionpie\">\n");
      out.write("                    <h1>Sitio Web</h1>\n");
      out.write("                    <p><a href=\"index.jsp\">Principal</a></p>\n");
      out.write("                    <p><a href=\"fotos.jsp\">Fotos</a></p>\n");
      out.write("                    <p><a href=\"videos.jsp\">Videos</a></p>\n");
      out.write("                </section>\n");
      out.write("                <section class=\"seccionpie\">\n");
      out.write("                    <h1>Ayuda</h1>\n");
      out.write("                    <p><a href=\"contacto.jsp\">Contacto</a></p>\n");
      out.write("                </section>\n");
      out.write("                <section class=\"seccionpie\">\n");
      out.write("                    <address>Vitoria, País Vasco</address>\n");
      out.write("                    <small>&copy; Derechos Reservados 2018</small>\n");
      out.write("                </section>\n");
      out.write("                <div class=\"recuperar\"></div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
