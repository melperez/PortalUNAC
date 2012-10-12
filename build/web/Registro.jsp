<%-- 
    Document   : Registro
    Created on : 11/09/2012, 08:57:11 AM
    Author     : Mely
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="dcterms.created" content="Mon, 27 Aug 2012 00:41:36 GMT">
        <meta name="description" content="">
        <meta name="keywords" content="">
        <title>Registro</title>
        <link rel="shorcut icon" href="http://www.unac.edu.co/favicon.ico" type="image/x-icon">
        <link rel="stylesheet" type="text/css" href="css/Style1.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="css/Style2.css" media="screen" />
        <script src="lib/jquery.js"></script>
        <script src="lib/Validar.js" type="text/javascript"></script>
        <script src="lib/Registro.js" type="text/javascript"></script>
        <script type="text/javascript" src="lib/jquery-ui-1.8.23.custom.min.js"></script>
        <link type="text/css" href="css/unac-style/jquery-ui-1.8.23.custom.css" rel="stylesheet" />

        <!--[if IE]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
    </head>
    <body>
        <div id="titulo" style="font-family:BonvenoCF, Arial, sans-serif; font-size:15px; width:470px; height:360px; text-shadow:none; padding-top:0px">
            <div class="t" id="b2" style=" padding:10%; font-family:BonvenoCF, Arial, sans-serif; font-size:15px; width:430px; height:610px; text-shadow:none; padding-top:3px">
                <h3 style="color:#FFFFFF; text-shadow:2px 2px 2px #646464">Registrese en Nuestro Portal</h3>
                <form action="Controlar?accion=Registrar" method="POST" id="signupForm" target="_top" style="color:#FFFFFF; text-align:justify; text-shadow:2px 2px 2px #646464">

                    <p>
                        <label for="firstname">Nombre: </label><br/>
                        <input id="firstname" class="required"  type="text" name="firstname" placeholder="Nombre" minlength="2"  style="width:400px;height:20px;"/>
                    </p>
                    <p>
                        <label for="lastname">Apellidos: </label><br/>
                        <input id="lastname" class="required" type="text" name="lastname" placeholder="Apellido" style="width:400px;height:20px;" />
                    </p>
                    <p>
                        <label for="email">Correo Electr&oacutenico:</label><br/>
                        <input id="email" type="text" class="required" title="mail@ejemplo.com" name="email" placeholder="email@dominio.com" style="width:400px;height:20px;" />
                    </p>
                    <p>
                        <label for="password">Contrase&ntildea: </label>
                        <input id="password" class="required" type="password" name="password" placeholder="Password"  style="width:400px;height:20px;" />
                    </p>
                    <p>
                        <label for="confirm_password">Repita la contrase&ntildea: </label><br/>
                        <input  id="confirm_password" class="required" type="password" name="confirm_password" placeholder="Repite Password"  style="width:400px;height:20px;"   />
                    </p>
                    <p>
                        <label for="digits" >Tel&eacutefono: </label><br/>
                        <input  id="digits" type="tel" class="required" name="digits" placeholder="Telefono"  style="width:400px;height:20px;" />
                    </p>
                    <p>
                        <label for="genero">G&eacutenero:</label><br/>
                        <input id="genero" name="genero" class="requiered" style="font-family:BonvenoCF, Arial, sans-serif; font-size:15px; width:400px; height:30px; border-radius:10px; border:solid; border-color:#C0C0C0" required/>
                        <datalist>
                            <option value="Select">Selecciona un g&eacutenero</option>
                            <option value="Masculino">Masculino</option>     
                            <option value="Femenino">Femenino</option>
                        </datalist>
                    </p>
                    <p>
                        <input id="Registrar" class="ui-state-default ui-corner-all" style="width: 200px; height:35px; cursor: pointer" type="submit" value="Registrarse" />
                    </p>

                </form>
            </div>	 
        </div>
    </body>
</html>