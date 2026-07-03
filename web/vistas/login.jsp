
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estiloslogin.css" rel="stylesheet">
        <title>Iniciar Sesión</title>
    </head>
    <body>
	<div class="contact-form">
		<img alt="" class="logo" src="../Imagenes/user.png">
		<h2>Iniciar Sesión</h2>
                <%-- formulario que recupera los datos y los envía a ServletLogin a través del método posts--%>
                <form action="../Servletlogin" method="post">
			<p>Usuario</p><input placeholder="Usuario" type="text" name="usuario">
                        <p>Contraseña</p><input placeholder="Contraseña" type="password" name="contrasena"> 
                        <input type="submit" value="Ingresar">
		</form>
                
	</div>
        
    </body>
</html>
