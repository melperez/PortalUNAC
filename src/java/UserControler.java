/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.Usuario;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mely
 */
@WebServlet(name = "UserControler", urlPatterns = {"/Controlar"})
public class UserControler extends HttpServlet {

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

        response.setContentType("text/html;charset=UTF-8");

        //Parámetro Acción quien define la acción que se realizará con los datos
        String accion = request.getParameter("accion");

        //Registrar Usuarios
        if (accion.equals("Registrar")) {
            registrar(request, response);
        } //Consultar Usuarios Registrados
        else if (accion.equals("Consultar")) {
            consultar(request, response);
        } //Editar Usuarios Registrados
        else if (accion.equals("Editar")) {
            editar(request, response);
        } //Eliminar Usuarios
        else if (accion.equals("Eliminar")) {
            eliminar(request, response);
        } //Habilitar Usuarios
        else if (accion.equals("Habilitar")) {
            habilitar(request, response);
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

//Registrar/Insertar Usuario Nuevo
    private void registrar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("firstname");
        String apellido = request.getParameter("lastname");
        String correo2 = request.getParameter("email");
        String password = request.getParameter("password");
        String telefono = request.getParameter("digits");
        String Gen = request.getParameter("genero");
        int perfil = 2;
        int estado = 0;
        int genero;
        if (Gen.equals("Masculino")) {
            genero = 1;
        } else {
            genero = 2;
        }

        String contenido2 = "";
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

        } catch (SQLException e2) {
            Logger.getLogger(ValidarIngreso.class.getName()).log(Level.SEVERE, null, e2);
        } finally {
            try {
                sentencia.close();
                conexion.close();
            } catch (SQLException e2) {
                Logger.getLogger(ValidarIngreso.class.getName()).log(Level.SEVERE, null, e2);
            }
        }

        request.setAttribute("contenido2", contenido2);
        request.setAttribute("error", error);
        vista = request.getRequestDispatcher("index.jsp");
        vista.forward(request, response);

    }

//Consultar/Listar Usuarios Registrados
    private void consultar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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

        sql = "select distinct login, clave, Nombre, apellidos, teléfono, nombreGénero, nombrePerfil, nombreEstado"
                + "  from usuarios, generos, estados, perfiles where genero = generos.id AND "
                + "perfil = perfiles.id AND estado = estados.id_estado";

        try {

            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            resultado = sentencia.getResultSet();

            ArrayList Usuarios = new ArrayList();
            while (resultado.next()) //si existen los datos, se guardan
            {
                Usuario e = new Usuario(resultado.getString(1), resultado.getString(2),
                        resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6),
                        resultado.getString(7), resultado.getString(8));

                Usuarios.add(e);
            }

            request.setAttribute("usuarios", Usuarios);

            request.getRequestDispatcher("UsuariosRegistrados.jsp").forward(request, response);


        } catch (SQLException e) {
            System.out.println("Error conectando DB");

        } finally {
            try {
                sentencia.close();
                conexion.close();
            } catch (SQLException a) {
                Logger.getLogger(ValidarIngreso.class.getName()).log(Level.SEVERE, null, a);
            }
        }

    }
//Editar Datos de Usuarios Registrados

    private void editar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher vista;
        String mensaje = "<img style='text-align:center; width: 40%; height: 50%' src='http://www.mat.ucm.es/catedramdeguzman/drupal//sites/default/files/en_construccion.png'/>";
        request.setAttribute("msj", mensaje);
        vista = request.getRequestDispatcher("Home.jsp");
        vista.forward(request, response);
    }

//Eliminar Usuarios    
    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("ID");

        //Datos para la conexion BD 
        String driver = "com.mysql.jdbc.Driver";
        String urlDB = "jdbc:mysql://localhost/dbportalUNAC?";
        String userDB = "PortalUNAC";
        String passDB = "ju4nc4ymeli34";

        //Objetos para la conexion con la BD
        Connection conexion = null;
        Statement sentencia = null;
        int resultado = 0;
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

        sql = "delete from usuarios where login = '" + login + "'";

        try {

            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            resultado = sentencia.executeUpdate(sql);

            request.setAttribute("msj", "El Usuario se ha eliminado exitosamente!");

        } catch (SQLException e) {
            System.out.println("Error conectando DB");

        } finally {
            try {
                sentencia.close();
                conexion.close();
            } catch (SQLException a) {
                Logger.getLogger(ValidarIngreso.class.getName()).log(Level.SEVERE, null, a);
            }
        }
        consultar(request, response);
    }

//Habilitar Usuarios    
    private void habilitar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher vista;
        String mensaje = "<img style='text-align:center; width: 40%; height: 50%' src='http://www.mat.ucm.es/catedramdeguzman/drupal//sites/default/files/en_construccion.png'/>";
        request.setAttribute("msj", mensaje);
        vista = request.getRequestDispatcher("Home.jsp");
        vista.forward(request, response);
    }
}
