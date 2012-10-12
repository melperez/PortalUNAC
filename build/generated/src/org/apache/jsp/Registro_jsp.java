package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");

    String accion = "Registrar";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"dcterms.created\" content=\"Mon, 27 Aug 2012 00:41:36 GMT\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"\">\r\n");
      out.write("        <title>Registro</title>\r\n");
      out.write("        <link rel=\"shorcut icon\" href=\"http://www.unac.edu.co/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Style1.css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Style2.css\" media=\"screen\" />\r\n");
      out.write("        <script src=\"lib/jquery.js\"></script>\r\n");
      out.write("        <script src=\"lib/Validar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"lib/Registro.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"lib/jquery-ui-1.8.23.custom.min.js\"></script>\r\n");
      out.write("        <link type=\"text/css\" href=\"css/unac-style/jquery-ui-1.8.23.custom.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!--[if IE]>\r\n");
      out.write("        <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"titulo\" style=\"font-family:BonvenoCF, Arial, sans-serif; font-size:15px; width:470px; height:360px; text-shadow:none; padding-top:0px\">\r\n");
      out.write("            <div class=\"t\" id=\"b2\" style=\" padding:10%; font-family:BonvenoCF, Arial, sans-serif; font-size:15px; width:430px; height:610px; text-shadow:none; padding-top:3px\">\r\n");
      out.write("                <h3 style=\"color:#FFFFFF; text-shadow:2px 2px 2px #646464\">Registrese en Nuestro Portal</h3>\r\n");
      out.write("                <form action=\"Controlar?accion=Registrar\" method=\"POST\" id=\"signupForm\" target=\"_top\" style=\"color:#FFFFFF; text-align:justify; text-shadow:2px 2px 2px #646464\">\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"firstname\">Nombre: </label><br/>\r\n");
      out.write("                        <input id=\"firstname\" class=\"required\"  type=\"text\" name=\"firstname\" placeholder=\"Nombre\" minlength=\"2\"  style=\"width:400px;height:20px;\"/>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"lastname\">Apellidos: </label><br/>\r\n");
      out.write("                        <input id=\"lastname\" class=\"required\" type=\"text\" name=\"lastname\" placeholder=\"Apellido\" style=\"width:400px;height:20px;\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"email\">Correo Electr&oacutenico:</label><br/>\r\n");
      out.write("                        <input id=\"email\" type=\"text\" class=\"required\" title=\"mail@ejemplo.com\" name=\"email\" placeholder=\"email@dominio.com\" style=\"width:400px;height:20px;\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"password\">Contrase&ntildea: </label>\r\n");
      out.write("                        <input id=\"password\" class=\"required\" type=\"password\" name=\"password\" placeholder=\"Password\"  style=\"width:400px;height:20px;\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"confirm_password\">Repita la contrase&ntildea: </label><br/>\r\n");
      out.write("                        <input  id=\"confirm_password\" class=\"required\" type=\"password\" name=\"confirm_password\" placeholder=\"Repite Password\"  style=\"width:400px;height:20px;\"   />\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"digits\" >Tel&eacutefono: </label><br/>\r\n");
      out.write("                        <input  id=\"digits\" type=\"tel\" class=\"required\" name=\"digits\" placeholder=\"Telefono\"  style=\"width:400px;height:20px;\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"genero\">G&eacutenero:</label><br/>\r\n");
      out.write("                        <input id=\"genero\" name=\"genero\" value=\"\" class=\"requiered\" style=\"font-family:BonvenoCF, Arial, sans-serif; font-size:15px; width:400px; height:30px; border-radius:10px; border:solid; border-color:#C0C0C0\" required/>\r\n");
      out.write("                        <datalist>\r\n");
      out.write("                            <option value=\"Select\" >Selecciona un g&eacutenero</option>\r\n");
      out.write("                            <option value=\"Masculino\">Masculino</option>     \r\n");
      out.write("                            <option value=\"Femenino\">Femenino</option>\r\n");
      out.write("                        </datalist>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <input id=\"Registrar\" class=\"ui-state-default ui-corner-all\" style=\"width: 200px; height:35px; cursor: pointer\" type=\"submit\" value=\"Registrarse\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("                        <input type=\"hidden\" name=\"accion\" value=\"");
      out.print(accion);
      out.write("\" />\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\t \r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
