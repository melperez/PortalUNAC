<%-- 
    Document   : index
    Created on : 28/09/2012, 07:39:08 AM
    Author     : Mely
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="dcterms.created" content="Fri, 17 Aug 2012 03:55:45 GMT">
        <meta name="description" content="">
        <meta name="keywords" content="">
        <title>Registro</title>
        <link rel="shorcut icon" href="http://www.unac.edu.co/favicon.ico" type="image/x-icon">
        <link rel="stylesheet" type="text/css" href="css/Style1.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="css/Style2.css" media="screen" />
        <link type="text/css" href="css/unac-style/jquery-ui-1.8.23.custom.css" rel="stylesheet" />
        <script src="lib/jquery-1.8.0.min.js"></script>
        <script src="lib/jquery-ui-1.8.23.custom.min.js"></script>
        <!--><script src="lib/MyScript.js"></script><!-->

    </head>
    <body>

        <!--Encabezado e Inicio de Sesion><!-->
        <div id="encabezado">
            <div id="imagen">
                <img style="margin-left:auto;" id="UNAC" src="Images/Logo.gif" height="150px" width="150px" alt="Encabezado">
            </div>
            <div id="titulo">
                <p id="title">CORPORACIÓN<br>UNIVERSITARIA <br>ADVENTISTA</p>
            </div>
            <form action="Ingresar?accion=1" method="POST" id="formIngreso">
                <div id="login1">
                    Correo Electrónico: <br />
                    <input id="email1" type="text" title="mail@ejemplo.com" name="login" pattern="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$" required /><br />
                    <a class="a" href="Ingresar?accion=0"><u><b>Ir a Pagina oficial UNAC</b></u></a>
                </div>	
                <div id="login2">
                    Contraseña: <br/><input  id="password1" type="password" name="pass" required />
                    <input name="btning" id="dialog_link" class="ui-state-default ui-corner-all" style="width: 120px; height:30px; cursor:pointer" type="submit" value="Entrar"/>

                    <br /><a id="login" class="a" style="cursor:pointer" ><u><b>¿Has olvidado tu contraseña?</b></u></a>
                    <div id="forgot" title="Bienvenido!">
                        <p>¡Lo sentimos en este momento no tenemos el recurso para recuperar su contraseña!</p>
                    </div>
                </div>
                <%
                    String mensaje = (String) request.getAttribute("contenido");
                    if (mensaje == null) {
                        mensaje = " ";
                    }
                %>

                <div style="position:relative;left:600px; bottom:30px; color:red; height: 20px; width: 500px "><b><%=mensaje%></b></div>
            </form>

        </div>

        <div class="t" style="font-family:Times New Roman; font-size: 20px; top:5px; bottom:5px; width:1200px; margin:auto">CORPORACION UNIVERSITARIA ADVENTISTA - UNAC </div>

        <!--Acordeon Cuerpo><!-->
        <div id="fondo" style="height:700px; margin-left:auto;" >
            <div id="titulo" style="padding:2%; font-family: BonvenoCF, Arial, sans-serif; font-size:15px; width:605px; height:600px; text-shadow:none; text-align:justify;  ">
                <div id="accordion" style="height:500px;">
                    <div>
                        <h3><a href="#">Misión</a></h3>
                        <div style=" font-size: 15px">
                            <h4>Misión</h4>
                            <p>
                                La Corporación Universitaria Adventista reconoce a Dios como Creador, Redentor y Sustentador del hombre y del universo; y en armonía con los principios filosóficos y educativos inspirados por el Espíritu Santo, evidenciados en la naturaleza, ejemplificados por Jesucristo, expuestos en las Sagradas Escrituras y tal como los profesa la iglesia Adventista del Séptimo Día, nuestra Institución declara como su misión propiciar y fomentar una significativa relación del hombre con Dios por medio del trabajo en las diferentes disciplinas del conocimiento. En consecuencia, la Corporación se define como una institución universitaria sin ánimo de lucro que desarrolla su labor educativa enmarcada en el servicio a Dios, la comunidad adventista y la sociedad en general.
                                El trabajo del conocimiento se fundamenta en tres pilares: la formación integral, la cultura investigativa y la excelencia en el servicio,en el que el hombre es el agente principal del proceso educativo que persigue el desarrollo armónico de los aspectos físicos, mentales sociales y espirituales. La misión se desarrollará en procura de los altos niveles de calidad educativa, a través de un personal calificado con un profundo sentido de compromiso, apoyado en el uso óptimo de los recursos físicos, financieros y tecnológicos.
                            </p>
                        </div>
                    </div>
                    <div>
                        <h3><a href="#">Visión</a></h3>
                        <div style=" font-size: 15px">
                            <h4>Visión</h4>
                            <p>
                                La Corporación Universitaria Adventista será una universidad completamente accesible a la Iglesia Adventista del Séptimo Día en particular, y a la comunidad en general, con el propósito de preparar ciudadanos para este mundo y para la eternidad.
                            </p>	
                        </div>
                    </div>
                    <div>
                        <h3><a href="#">Perfiles Universitarios</a></h3>
                        <!--Pestañas Perfiles Institucionales><!-->
                        <div id="tabs" style=" font-size: 15px">
                            <ul>
                                <li><a href="#tabs-1">Docentes</a></li>
                                <li><a href="#tabs-2">Institucional</a></li>
                                <li><a href="#tabs-3">Egresados</a></li>
                            </ul>
                            <!--Perfil del Docente><!-->
                            <div id="tabs-1">
                                <h4>Perfil del docente</h4>
                                <br/>La Corporación considera que su personal docente cumple un papel primordial en el logro de la misión. Por lo tanto, se esfuerza en seleccionar personas que se identifiquen plenamente con su filosofía y la vivencia en su acción diario.

                                <br/>Los Estatutos Generales y el Estatuto Docente definen que los administradores, profesores y empleados son el personal docente de la Institución, cuya responsabilidad es propugnar la formación armónica de los discentes por medio de su ejemplo y aportaciones, desde los diferentes escenarios en que interactúan.

                                <br/><br/><b>El perfil docente se concreta en cuatro características principales:</b>

                                <br/><br/>
                                <div class="ui-tabsconten">
                                    <b>Componente Cristiano</b>
                                    El docente debe reflejar el carácter de Cristo por medio de un compromiso personal con la vivencia de principios y valores cristianos, y el desarrollo de un estilo de vida a fin.
                                </div >
                                <br/>
                                <div class="ui-tabsconten">
                                    <b>Componente Institucional</b>
                                    Compromiso con la filosofía educativa adventista; la misión, los objetivos institucionales y el programa integral de la Institución.
                                </div>
                                <br/>
                                <div class="ui-tabsconten">
                                    <b>Componente Profesional</b>
                                    El docente debe ser un experto en su área, mantenerse actualizado, integrar teoría y práctica; investigar e interactuar con otras comunidades científicas.
                                </div>
                                <br/>
                                <div class="ui-tabsconten">
                                    <b>Componente Pedagógico</b>
                                    El docente debe manifestar habilidades para enseñar; practicar la enseñanza por modelamiento; integrar la fe en la enseñanza; poseer una actitud investigativa; aplicar estrategias de aprendizaje.</p>
                                </div>					  
                            </div>
                            <!--Perfil Institucional><!-->
                            <div id="tabs-2">
                                <h4>Perfil de la institución</h4>
                                <br/>La Corporación Universitaria Adventista combina las características que son propias de una institución de educación superior con una identidad filosófica y misional propia, que se traduce en una propuesta educativa que la distingue de las demás instituciones de educación superior.
                                <br/><br/><b>Las características fundamentales del perfil de la Corporación, como institución de educación superior son:</b>
                                <br/><br/><img src="Images/perfil_unac.jpg" class="ui-tabsconten" width="100%" height="100%">
                            </div>
                            <!--Perfil del Egresado><!-->
                            <div id="tabs-3">
                                <h4>Perfil de egresado</h4>
                                <br/>El egresado de la Corporación Universitaria Adventista es el hilo conductor de la filosofía institucional hacia la sociedad. Es un elemento vinculante del quehacer universitario con el mundo laboral y productivo de la sociedad. Por lo tanto, se espera que el egresado y las asociaciones de egresados que se conformen, mantengan la identidad con la filosofía, misión y espíritu de los fundadores de la Corporación en sus diferentes actividades.
                                <br/><br/><b>El egresado de la Corporación debe manifestar las siguientes características:</b>
                                <br/><div class="ui-tabsconten">
                                    <b>1. Una sólida formación cristiana</b> 
                                    El egresado es una persona íntegra, con altos ideales fundamentados en valores, con capacidad para servir a la sociedad utilizando los conocimientos adquiridos y aplicando los principios recibidos en su Alma Máter.
                                </div>
                                <br/>
                                <div class="ui-tabsconten">
                                    <b>2. Competencia profesional y laboral.</b> 
                                    El egresado es un profesional de excelencia. Con competencias cognitivas y laborales que le permiten desempeñarse profesionalmente en las áreas del conocimiento para las cuales fue formado. Con capacidad para crear nuevas propuestas de mejoramiento y alternativas de solución a los problemas que se presenten.
                                </div>
                                <br/>
                                <div class="ui-tabsconten">
                                    <b>3. Un compromiso con el servicio</b> 
                                    El egresado es un líder servidor. Reconoce en cada ser humano una criatura formada a imagen de Dios y alguien por quien Cristo murió. Por lo tanto, desarrolla una labor social enfocada en el servicio a los demás.
                                </div>
                                <br/>
                                <div class="ui-tabsconten">
                                    <b>4. Cuidado personal y de la salud</b> 
                                    El egresado reconoce la importancia de mantener su salud física y mental, por ende practica un estilo de vida que incluye la sana alimentación, hábitos de higiene, el ejercicio físico, la recreación y el descanso.
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!--Registro><!-->
            <iframe id="registro" name="window" src="Registro.jsp" width="540px" height="675px" scrolling="no" style="padding-top:10px" target="_top">Registro</iframe>
            <%
                
                String mensaje2 = (String) request.getAttribute("contenido2");
                if (mensaje2 == null) {
                    mensaje2 = " ";
                }
                

            %>
            <div id="dialog1" title="¡Registro Exitoso!" style="position:absolute; top:750px; left: 830px">
               <%=mensaje2%>
            </div>

        </div>
        <div class="t" style="font-size:15px; padding-top:5px; height:25px; width:1200px; margin:auto; text-align:left;">

            <%!                java.util.Date date = new java.util.Date();
                long hours = date.getHours();
                int minutes = date.getMinutes();
                String fecha = "";

            %>
            <%

                fecha = " " + hours + ":" + minutes + " ";
                if (minutes < 10) {
                    fecha = " " + hours + ": 0" + minutes + " ";
                }
                if (hours > 11) {
                    fecha = fecha + "PM ";
                } else {
                    fecha = fecha + "AM ";
                }
            %>
            <marquee> 
                <%=fecha%>
            </marquee>
        </div>

    </body>
</html>