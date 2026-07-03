<<%-- 
    Document   : form_reserva
    Created on : 28 mar. 2022, 18:46:18
    Author     : Yeison
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>


<%-- vista para reservar una lectura de carta astral, solicita los datos personales y la fecha y hora para la reserva 
     
    la funcionalidad no está implementada
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Reserva</title>
        <link href="estilosformreserva.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <form action="#" method="post">
	    <center>
                <h1>Reserva tu carta astral</h1>
            </center>
	    <div class="datos-personales">
                <div class="titulo">
                    <center>
                    <h2>Datos personales</h2>
                    </center>
                </div>
                <div class="izq">
                    <label for="nombre">Nombre</label>
                    <input type="text" id="nombre" name="nombre"> 
                </div>
                <div class="izq">
                    <label for="numero">numero de telefono</label>
                    <input type="number" id="numero" name="numero"> 
                </div>
                <div class="izq">
                    <label for="fecha_cump">fecha de cumpleaños</label>
                    <input type="date" id="fecha_cump" name="fecha_cump">
                </div>
                <div class="izq">
                    <label for="hora_cump">hora de nacimiento</label>
                    <input type="time" id="hora_cump" name="hora_cump">
                </div>
            </div>
            <div class="reserva">
                <div class="titulo">
                    <center>
                    <h2>Reserva</h2>
                    </center>
                </div>
                <div class="izq">
                    <label for="fecha_reserva">selecciona el dia de reserva</label>
                    <input type="date" id="fecha_reserva" name="fecha_reserva">
                </div>
                <div class="izq">
                    <label for="hora_reserva">hora de reserva</label>
                    <input type="time" id="hora_reserva" name="hora_reserva">
                </div>
                <div class="boton">
                    <center>
                    <input type="submit" value="Reservar">
                    </center>
                </div>
            </div>
        </form>
    </body>
</html>
