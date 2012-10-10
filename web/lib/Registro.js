

$(document).ready(function() {
    // Validacion del Formulario
    $("#signupForm").validate({
        rules: {
			
            password: {
                minlength: 5
				
            },
            confirm_password: {
                minlength: 5,
                equalTo: "#password"
				
            },
            email: {
                email: true
				
            },
            digits: {
                digits: true
            }
       },
        
        messages: {
            firstname: "<br/>Ingresa tu nombre",
            lastname: "<br/>Ingresa tu Apellido",
			
            password: {
                required: "<br/>Escribe una contrase&ntildea",
                minlength: "<br/>La contrase&ntildea debe contener al menos 5 caracteres"
            },
            confirm_password: {
                required: "<br/>Repite la contrase&ntildea",
                minlength: "<br/>La contrase&ntildea debe contener al menos 5 caracteres",
                equalTo: "<br/>Por favor ingresa la misma contrase&ntildea anterior"
				
            },
            email: "<br/>Por favor ingresa un correo electr&oacutenico v&aacutelido",
            digits: {
                required: "<br/>S&oacutelo se pueden ingresar n&uacutemeros."
            }
            
                
            
        }
        
        		
    });
                
    $("#signupForm").click(function() {
        $("#Registrar").submit();
    });
	


});


