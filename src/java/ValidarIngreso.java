/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mely
 */
public class ValidarIngreso extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        int action = Integer.parseInt(accion);

        String titulo = "";
        String contenido = "";
        String contenido2 = "";
        String link1 = "";
        String link2 = "";
        boolean error = false;
        RequestDispatcher vista;

        //Datos para la conexion BD 
        String driver = "com.mysql.jdbc.Driver";
        String urlDB = "jdbc:mysql://localhost/dbportalUNAC?";
        String userDB = "PortalUNAC";
        String passDB = "ju4nc4ymeli34";

        //Objetos para la conexion con la BD
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado;
        String sql;

        //Cargar Driver
        try {

            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(urlDB, userDB, passDB);

        } catch (IllegalAccessException e1) {
            System.out.println("Error cargando Driver");
        } catch (InstantiationException e1) {
            System.out.println("Error cargando Driver");
        } catch (ClassNotFoundException e1) {
            System.out.println("Error cargando Driver");
        } catch (SQLException e2) {
            System.out.println("Error conectando DB");
        }

        switch (action) {
            //Ir a pagina oficial UNAC
            case 0:
                response.sendRedirect("http://www.unac.edu.co");
                break;

            //Registro    
            case 1:

                String nombre = request.getParameter("firstname");
                String apellido = request.getParameter("lastname");
                String correo2 = request.getParameter("email");
                String password = request.getParameter("password");
                String telefono = request.getParameter("digits");
                int perfil = 2;
                int estado = 0;
                String Gen = request.getParameter("genero");
                int genero;
                if (Gen.equals("Masculino")) {
                    genero = 1;
                } else {
                    genero = 2;
                }

                sql = "insert into usuarios values ( '" + correo2 + "', '"
                        + password + "', " + perfil + ", '" + nombre + "', '" + apellido + "', " + genero + ", '"
                        + telefono + "', " + estado + ")";

                try {
                    sentencia = conexion.createStatement();
                    sentencia.execute(sql);
                    resultado = sentencia.getResultSet();
                    resultado.next();

                } catch (SQLIntegrityConstraintViolationException b) {
                    contenido2 = "<p>El Usuario " + correo2 + " ya se encuentra registrado,"
                            + " por favor ingresa otro email o inicia sesión.</p>";
                    error = true;
                } catch (NullPointerException a) {

                    contenido2 = "<p>!Bienvenido " + nombre + " " + apellido + " usted se ha registrado exitosamente!<b/>"
                            + "<br/>Usuario: " + correo2 + "<br/> Contraseña: " + password + "</p>";

                } catch (SQLException ex) {
                    Logger.getLogger(ValidarIngreso.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        sentencia.close();
                        conexion.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ValidarIngreso.class.getName()).log(Level.SEVERE, null, ex);
                    }


                }

                request.setAttribute("contenido2", contenido2);
                request.setAttribute("error", error);
                vista = request.getRequestDispatcher("index.jsp");
                vista.forward(request, response);
                break;

            //Validacion de Login     
            case 2:

                String correo = request.getParameter("login");
                String pass = request.getParameter("pass");
                sql = "select nombre, estado, login, perfil from usuarios where login ='" + correo + "' AND clave = '" + pass + "'";
                try {
                    sentencia = conexion.createStatement();
                    sentencia.execute(sql);
                    resultado = sentencia.getResultSet();


                    if (resultado.next()) {
                        String name = resultado.getString("nombre");
                        String valido = resultado.getString("estado");
                        String user = resultado.getString("login");

                        if (name.equals("Administrador")) {
                            titulo = "Bienvenido";
                            contenido = "Administrador a iniciado sesión correctamente!";
                            vista = request.getRequestDispatcher("Home.jsp");
                        } else if (valido.equals("0")) {
                            contenido = "Lo sentimos, el usuario " + user + " no se encuentra activo, favor comunicarse con el administrador !";
                            vista = request.getRequestDispatcher("index.jsp");
                        } else {
                            titulo = "Bienvenido";
                            contenido = name + " a iniciado sesión correctamente!";
                            vista = request.getRequestDispatcher("Home.jsp");
                        }
                        
                    } else {

                        contenido = "Correo o contraseña incorrecta o no se encuentra registrado !";
                        vista = request.getRequestDispatcher("index.jsp");
                    }

                    request.setAttribute("perfil", resultado.getString("perfil"));
                    request.setAttribute("contenido", contenido);
                    request.setAttribute("Titulo", titulo);
                    vista.forward(request, response);

                } catch (SQLException ex) {
                    Logger.getLogger(ValidarIngreso.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        sentencia.close();
                        conexion.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ValidarIngreso.class.getName()).log(Level.SEVERE, null, ex);
                    }


                }

                break;




        }


    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
