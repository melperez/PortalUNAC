<%-- 
    Document   : Home
    Created on : 11/09/2012, 06:48:00 PM
    Author     : Mely
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bienvenido</title>
        <link rel='shorcut icon' href='http://www.unac.edu.co/favicon.ico' type='image/x-icon'>
        <link rel='stylesheet' type='text/css' href='css/Style2.css' media='screen' />
        <link rel='stylesheet' type='text/css' href='css/Style1.css' media='screen' />
        <link rel="stylesheet" type="text/css" href="css/jMenu.jquery.css" media="screen" />
        <script src="lib/jquery-1.8.0.min.js"></script>
        <script type="text/javascript" src="lib/jquery-ui.js"></script>
        <script type="text/javascript" src="lib/jMenu.jquery.min.js"></script>



    </head>
    <body background='#CDCDCD'style='padding-top:1%' >
        <div id="encabezado" style="width: 90% ">
            <div id="imagen">
                <img style="margin-left:auto;" id="UNAC" src="Images/Logo.gif" height="150px" width="150px" alt="Encabezado">
            </div>
            <div id="titulo">
                <p id="title">CORPORACIÓN<br>UNIVERSITARIA <br>ADVENTISTA</p>
            </div>
            <%-- 
              Obtener titulo
            --%>
            <%
                String titulo = (String) request.getAttribute("Titulo");

            %>
            <%-- 
           Obtener mensaje
            --%>
            <%
                String mensaje = (String) request.getAttribute("contenido");
                if (mensaje == null) {
                    mensaje = "No hay mensaje";
                }
            %>


            <div id="login2" style="float:right; font-family:Times New Roman; font-size: 20px; text-shadow:2px 2px 2px #969696;">
                <br/><%=titulo%>
                <br/><%=mensaje%>
            </div>
        </div>
        <div class="t" style="font-family:Times New Roman; font-size: 20px; top:5px; bottom:5px; width:90%; margin:auto">CORPORACION UNIVERSITARIA ADVENTISTA - UNAC </div>
        <div style="width: 90%; font-size: 15px; position: relative; left:5% " >
            <%
                String contenido = (String) request.getAttribute("link1");
                String contenido2 = (String) request.getAttribute("link2");
                String href = "#";
                if (contenido == null) {
                    contenido = "";
                }
                if (contenido2 == null) {
                    contenido2 = "Volver al Inicio";
                }
                if (contenido != "Habilitar usuarios >>" || contenido != "Consultar Notas >>") {
                    href = "index.jsp";
                }
            %>    
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

            <!-- First, write your HTML -->
            <ul id="jMenu">
                <li><a class="fNiv">OPCIONES</a><!-- Do not forget the "fNiv" class for the first level links !! -->
                    <ul>
                        <li class="arrow"></li>
                        <li><a><%=contenido%></a>
                            <ul>
                               <li><a><%=contenido%></a> 
                            </ul>
                        </li>
                        <li><a><%=contenido2%></a></li>
                        
                </li>
            </ul>
        </li>
    </ul>
</div>
<div class='t' id='fondo' style="font-size:20px; width: 90%; height: 100%" >
    <br/>
    <br/>
    <br/>
    <hr/>
    <br/>CORPORACION UNIVERSITARIA ADVENTISTA - UNAC
    <br/><%@include file="/Fecha.jsp" %>
    <a style='color:#004040; cursor:pointer' href='/PortalUNACv6'><br/>Back Home</a></div>
<br/><%@include file="/Copyright.html" %>
</body>
</html>