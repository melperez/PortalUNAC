/* 
    Document   : MyScrit
    Created on : 5/09/2012
    Author     : Mely
 */

$(document).ready(function(){
    $.fx.speeds._default = 300;
    var user="admin@unac.edu.co";
    var pass="admin";
    var i = 0;
    $(function(){
        //Animaciones usando JQuery UI
        $("#UNAC").show("puff",2000).show("fade",2000).hide("explode",2000).show("fade",2000);
        $("#title").show("puff",2000).show("fade",2000).hide("explode",2000).show("fade",2000);
        i++;
		
        $("#registro").hide().show("clip",1000);
        
        
		
        //Efecto Dialogo de Olvido de Contraseña						
        $("#forgot").dialog({
            autoOpen: false,
            width: 400,	
            show: "blind",
            hide: "explode",					
            buttons: {
                "Ok": function() {
                    $(this).dialog("close");
                },
                "Cancel": function() {
                    $(this).dialog("close");
                }
            }
								
								
        });	
        			
       
        $("#dialog_link").click(function() {
            if($("#email1").val() == user && $("#password1").val() == pass){
                $("#formingreso").submit();
								
            }else{
                $("#formingreso").submit();
            }
        });
        
        
			
        //Abre el mensaje de Olvido de Contraseña
        $("#login").click(function(){
            $("#forgot").dialog("open");
            return false;
			
        });
			
        //Pestañas usando JQuery UI
        $('#tabs').tabs();
        // Acordeón usando JQuery UI
        $("#accordion").accordion({
            header: "h3"
        }).show("clip",1000);
    });
});
   
   




