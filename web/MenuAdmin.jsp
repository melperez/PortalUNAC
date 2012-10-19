
<%--Opciones de Menu del Administrador --%>
<%
String login2 = (String) request.getAttribute("login");
%>
<ul id="jMenu">
    <li><a class="fNiv">ADMINISTRACIÓN</a>
        <ul>
            <li class="arrow"></li>
            <li><a href="Controlar?accion=Habilitar" style="font-size: 15px; text-decoration: none">Habilitar Usuarios</a></li>
            <li><a href="Controlar?accion=Consultar" style="font-size: 15px; text-decoration: none">Administrar Usuarios</a><input type="hidden" name="id" value="<%=login2%>"/></li>
            
            <li><a style="font-size: 15px; text-decoration: none">Asociar Estudiantes</a></li>
        </ul>
    </li>
    <li><a class="fNiv">INFORMES</a>
        <ul> 
            <li class="arrow"></li> 
            <li><a style="font-size: 15px; text-decoration: none">Consultar Ingreso de Usuarios</a></li>                     
        </ul>	
    </li>

</ul>
