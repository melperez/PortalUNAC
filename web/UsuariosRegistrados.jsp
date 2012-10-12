
<%-- 
    Document   : Lista de Usuarios
    Created on : 11/10/2012, 06:48:00 PM
    Author     : Mely
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*,Entidades.Usuario" %>

<%
//Obtener el arreglo de estudiantes enviado en la solicitud
    ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("usuarios");
    int cont = 0;
    String mensaje = (String) request.getAttribute("msj");

%>

<!DOCTYPE html>
<html>
    <head>
        <title>Bienvenido</title>
        <link rel='shorcut icon' href='http://www.unac.edu.co/favicon.ico' type='image/x-icon'>
        <link rel='stylesheet' type='text/css' href='css/Style2.css' media='screen' />
        <link rel='stylesheet' type='text/css' href='css/Style1.css' media='screen' />
        <link rel="stylesheet" href="css/bluedream.css" type="text/css" >  
        <link rel="stylesheet" type="text/css" href="css/jMenu.jquery.css" media="screen" />
        <script src="lib/jquery-1.8.0.min.js"></script>
        <script type="text/javascript" src="lib/jquery-ui.js"></script>
        <script type="text/javascript" src="lib/jMenu.jquery.min.js"></script>

    </head>
    <body background='#CDCDCD' style='padding-top:1%' >
        <div id="encabezado" style="width: 90% ">
            <div id="imagen">
                <img style='margin-left:auto;' id='UNAC' src='Images/Logo.gif' height='150px' width='150px' alt='Encabezado'/>
            </div>
            <div id="titulo">
                <p id="title">CORPORACIÓN<br>UNIVERSITARIA <br>ADVENTISTA</p>
            </div>


            <div id="login2" style="float:right; font-family:Times New Roman; font-size: 20px; text-shadow:2px 2px 2px #969696;">
                <br/>
                Lista de Usuarios Registrados
                <br/>
            </div>
        </div>
        <div class="t" style="font-family:Times New Roman; font-size: 20px; top:5px; bottom:5px; width:90%; margin:auto">CORPORACION UNIVERSITARIA ADVENTISTA - UNAC </div>
        <div style="width: 90%; font-size: 15px; position: relative; left:5% " >
            <script type="text/javascript">
                $(document).ready(function(){
                    $("#jMenu").jMenu({
                        openClick : false,
                        ulWidth : 'auto',
                        effects : {
                            effectSpeedOpen : 200,
                            effectSpeedClose : 200,
                            effectTypeOpen : 'slide',
                            effectTypeClose : 'fade',
                            effectOpen : 'linear',
                            effectClose : 'linear'
                        },
                        TimeBeforeOpening : 100,
                        TimeBeforeClosing : 100,
                        animatedText : false,
                        paddingLeft: 1
                    });
                })
            </script>

            <jsp:include page="MenuAdmin.jsp"/>
        </div>

        <div class='t' id='fondo' style="font-size:20px; width: 90%; height: 100%" >
            <br/>
            <br/>
            <table align="center">            
                <caption>Usuarios Registrados</caption>
                <thead>
                    <tr>
                        <th scope="col">Login</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Apellido</th>
                        <th scope="col">Teléfono</th>
                        <th scope="col">Género</th>
                        <th scope="col">Perfil</th>
                        <th scope="col">Estado</th>
                        <th scope="col">Eliminar</th>
                        <th scope="col">Editar</th>

                    </tr>
                </thead>
                <%
                    if (usuarios != null && usuarios.size() > 0) {
                        for (Iterator i = usuarios.iterator(); i.hasNext();) {
                            Usuario user = (Usuario) i.next();
                            cont++;
                %>
                <tbody>
                    <%
                        if (cont % 2 == 0) {
                    %>
                    <tr>
                        <%} else {%>
                    <tr class="odd">                               
                        <%}%>
                        <td>
                            <%= user.getEmail()%>
                        </td>
                        <td>
                            <%= user.getNombre()%>
                        </td>
                        <td>
                            <%= user.getApellido()%>
                        </td>
                        <td>
                            <%= user.getTelefono()%>
                        </td>
                        <td>
                            <%= user.getGenero()%>
                        </td>
                        <td>
                            <%= user.getPerfil()%>
                        </td>
                        <td>
                            <%= user.getEstado()%>
                        </td>
                        <td>
                            <a href="Controlar?accion=Eliminar&ID=<%=user.getEmail()%>">Eliminar</a>
                        </td>
                        <td>
                            <a href="Controlar?accion=Editar&ID=<%=user.getEmail()%>">Editar</a>
                        </td>
                    </tr>
                </tbody>
                <%
                        }
                    }
                %>

            </table>
            <%
                if (mensaje == null) {
                    mensaje = "";
                }
            %>
            <br/>
            <br/>
            <p style="color: red; font-weight: bold"><%=mensaje%></p>
            <br/>
            <hr/>
            <br/>CORPORACION UNIVERSITARIA ADVENTISTA - UNAC
            <br/><%@include file="/Fecha.jsp" %>
            <a style='color:#004040; cursor:pointer' href='/PortalUNACv6'><br/>Back Home</a></div>
        <br/><%@include file="/Copyright.html" %>
    </body>
</html>