package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Entidades.Usuario;
import java.util.*;
import java.text.*;

public final class UsuariosRegistrados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Fecha.jsp");
    _jspx_dependants.add("/Copyright.html");
  }

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

//Obtener el arreglo de estudiantes enviado en la solicitud
    ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("usuarios");
    int cont = 0;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Bienvenido</title>\n");
      out.write("        <link rel='shorcut icon' href='http://www.unac.edu.co/favicon.ico' type='image/x-icon'>\n");
      out.write("        <link rel='stylesheet' type='text/css' href='css/Style2.css' media='screen' />\n");
      out.write("        <link rel='stylesheet' type='text/css' href='css/Style1.css' media='screen' />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bluedream.css\" type=\"text/css\" >  \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jMenu.jquery.css\" media=\"screen\" />\n");
      out.write("        <script src=\"lib/jquery-1.8.0.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"lib/jquery-ui.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"lib/jMenu.jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body background='#CDCDCD' style='padding-top:1%' >\n");
      out.write("        <div id=\"encabezado\" style=\"width: 90% \">\n");
      out.write("            <div id=\"imagen\">\n");
      out.write("                <img style='margin-left:auto;' id='UNAC' src='Images/Logo.gif' height='150px' width='150px' alt='Encabezado'/>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"titulo\">\n");
      out.write("                <p id=\"title\">CORPORACIÓN<br>UNIVERSITARIA <br>ADVENTISTA</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"login2\" style=\"float:right; font-family:Times New Roman; font-size: 20px; text-shadow:2px 2px 2px #969696;\">\n");
      out.write("                <br/>\n");
      out.write("                Lista de Usuarios Registrados\n");
      out.write("                <br/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"t\" style=\"font-family:Times New Roman; font-size: 20px; top:5px; bottom:5px; width:90%; margin:auto\">CORPORACION UNIVERSITARIA ADVENTISTA - UNAC </div>\n");
      out.write("        <div style=\"width: 90%; font-size: 15px; position: relative; left:5% \" >\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function(){\n");
      out.write("                    $(\"#jMenu\").jMenu({\n");
      out.write("                        openClick : false,\n");
      out.write("                        ulWidth : 'auto',\n");
      out.write("                        effects : {\n");
      out.write("                            effectSpeedOpen : 200,\n");
      out.write("                            effectSpeedClose : 200,\n");
      out.write("                            effectTypeOpen : 'slide',\n");
      out.write("                            effectTypeClose : 'fade',\n");
      out.write("                            effectOpen : 'linear',\n");
      out.write("                            effectClose : 'linear'\n");
      out.write("                        },\n");
      out.write("                        TimeBeforeOpening : 100,\n");
      out.write("                        TimeBeforeClosing : 100,\n");
      out.write("                        animatedText : false,\n");
      out.write("                        paddingLeft: 1\n");
      out.write("                    });\n");
      out.write("                })\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MenuAdmin.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class='t' id='fondo' style=\"font-size:20px; width: 90%; height: 100%\" >\n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("            <table align=\"center\">            \n");
      out.write("                <caption>Usuarios Registrados</caption>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">Login</th>\n");
      out.write("                        <th scope=\"col\">Nombre</th>\n");
      out.write("                        <th scope=\"col\">Apellido</th>\n");
      out.write("                        <th scope=\"col\">Teléfono</th>\n");
      out.write("                        <th scope=\"col\">Género</th>\n");
      out.write("                        <th scope=\"col\">Perfil</th>\n");
      out.write("                        <th scope=\"col\">Estado</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    if (usuarios != null && usuarios.size() > 0) {
                        for (Iterator i = usuarios.iterator(); i.hasNext();) {
                            Usuario user = (Usuario) i.next();
                            cont++;
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        if (cont % 2 == 0) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                    <tr class=\"odd\">                               \n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( user.getEmail());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( user.getNombre());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( user.getApellido());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( user.getTelefono());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( user.getGenero());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( user.getPerfil());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( user.getEstado());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"Controlar?accion=Eliminar&ID=");
      out.print(user.getEmail());
      out.write("\">Eliminar</a>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"Controlar?accion=Editar&ID=");
      out.print(user.getEmail());
      out.write("\">Editar</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <br/>\n");
      out.write("            <hr/>\n");
      out.write("            <br/>CORPORACION UNIVERSITARIA ADVENTISTA - UNAC\n");
      out.write("            <br/>");
/* 
    Document   : Fecha
    Created on : 14/09/2012, 01:11:29 AM
    Author     : Mely
*/
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    Date fecha = new Date();

      out.write("\r\n");
      out.write("<b>");
      out.print(fecha);
      out.write("</b>");
      out.write("\n");
      out.write("            <a style='color:#004040; cursor:pointer' href='/PortalUNACv6'><br/>Back Home</a></div>\n");
      out.write("        <br/>");
      out.write("<!--\r\n");
      out.write("To change this template, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<center>DERECHOS RESERVADOS 2012 </center>");
      out.write("\n");
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
