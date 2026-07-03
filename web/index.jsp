<%-- 
    Document   : index
    Created on : 22 mar. 2022, 12:47:37
    Author     : Yeison
--%>


<!DOCTYPE html>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Horoscopo</title>
        <link href="estilos.css" rel="stylesheet">
    </head>
    <body>
        <header class="header">
            <div class="container">
                <h3>Horóscopo</h3>
                <%-- enlace para acceder al login --%>
                <a href="vistas/login.jsp">Iniciar Sesión</a>
                
            </div>
        </header>
        
        <%-- muestra un recuadro con las imágenes de los signos zodiacales, 

        se puede hacer clic sobre la imagen: 
        
        cambia el color de fondo por cada signo zodiacal de la página con la función de javascript fondo(num)
        envía una petición al ServletIndex para que responda con la predicción del día del signo zodiacal seleccionado y diseñe la página
        
        --%>
        <div class="div-zodiac-signs">
            <center>
            <table>
                <tr>
                    <td>
                        <center>
                            <form action="ServletIndex" method="get">
                            <input type="hidden" value="aries" name="signo">   
                            <input type="image" src="Imagenes/aries.png" onclick="fondo('1')" alt="Submit" title="Aries">
                            </form>
                        </center>
                    </td>
                    <td>
                        <center>
                            <form action="ServletIndex" method="get">
                            <input type="hidden" value="tauro" name="signo">    
                            <input type="image" src="Imagenes/tauro.png" onclick="fondo('2')" alt="Submit" title="Tauro">
                            </form>
                        </center>
                    </td>
                    <td>
                        <center>
                            <form action="ServletIndex" method="get">
                            <input type="hidden" value="geminis" name="signo">    
                            <input type="image" src="Imagenes/geminis.png" onclick="fondo('3')" alt="Submit" title="Geminis">
                            </form>
                        </center>
                    </td>
                    <td>
                        <center>
                            <form action="ServletIndex" method="get">
                            <input type="hidden" value="cancer" name="signo">  
                            <input type="image" src="Imagenes/cancer.png" onclick="fondo('4')" alt="Submit" title="Cancer">
                            </form>
                        </center>
                    </td>
                </tr>
                <tr>
                    <td>
                    <center>
                            <form action="ServletIndex" method="get">
                            <input type="hidden" value="leo" name="signo">    
                            <input type="image" src="Imagenes/leo.png" onclick="fondo('5')" alt="Submit" title="Leo">
                            </form>
                    </center>   
                    </td>
                    <td>
                    <center>
                            <form action="ServletIndex" method="get">
                            <input type="hidden" value="virgo" name="signo">   
                            <input type="image" src="Imagenes/virgo.png" onclick="fondo('6')" alt="Submit" title="Virgo">
                            </form>
                    </center>
                    </td>
                    <td>
                    <center>
                            <form action="ServletIndex" method="get">
                            <input type="hidden" value="libra" name="signo">   
                            <input type="image" src="Imagenes/libra.png" onclick="fondo('7')" alt="Submit" title="Libra">
                            </form>
                    </center>
                    </td>
                    <td>
                    <center>
                        <form action="ServletIndex" method="get">
                        <input type="hidden" value="escorpion" name="signo">   
                        <input type="image" src="Imagenes/escorpion.png" onclick="fondo('8')" alt="Submit" title="Escorpion">
                        </form>
                    </center>
                    </td>
                </tr>
                <tr>
                    <td>
                    <center>
                        <form action="ServletIndex" method="get">
                        <input type="hidden" value="sagitario" name="signo">   
                        <input type="image" src="Imagenes/sagitario.png" onclick="fondo('9')" alt="Submit" title="Sagitario">
                        </form>
                    </center>
                    </td>
                    <td>
                    <center>
                        <form action="ServletIndex" method="get">
                        <input type="hidden" value="capricornio" name="signo">   
                        <input type="image" src="Imagenes/capricornio.png" onclick="fondo('10')" alt="Submit" title="Capricornio">
                        </form>
                    </center>
                    </td>
                    <td>
                    <center>
                        <form action="ServletIndex" method="get">
                        <input type="hidden" value="acuario" name="signo">   
                        <input type="image" src="Imagenes/acuario.png" onclick="fondo('11')" alt="Submit" title="Acuario">
                        </form>
                    </center>
                    </td>
                    <td>
                    <center>
                        <form action="ServletIndex" method="get">
                        <input type="hidden" value="piscis" name="signo">   
                        <input type="image" src="Imagenes/piscis.png" onclick="fondo('12')" alt="Submit" title="Piscis">
                        </form>
                    </center>
                    </td>
                </tr>
            </table>
            </center>
        </div>
        <script>
        
        <%--
        
        función para cambiar el color de fondo por cada signo zodiacal de la página con la función de javascript fondo(num)
        
        --%>
            function fondo(num){
                   if(num==='1')
                   document.body.style.background="green";
                   if(num==='2')
                   document.body.style.background="goldenrod";
                   if(num==='3')
                   document.body.style.background="darkblue";
                   if(num==='4')
                   document.body.style.background="tomato";
                   if(num==='5')
                   document.body.style.background="orange";
                   if(num==='6')
                   document.body.style.background="purple";
                   if(num==='7')
                   document.body.style.background="darkseagreen";
                   if(num==='8')
                   document.body.style.background="darkcyan";
                   if(num==='9')
                   document.body.style.background="royalblue";
                   if(num==='10')
                   document.body.style.background="red";
                   if(num==='11')
                   document.body.style.background="darkviolet";
                   if(num==='12')
                   document.body.style.background="darkorange";
               
            }
        </script>
        <div class="prediction-div">
            <div class="zodiac-properties" id="zodiac-img2">
                <img src="Imagenes/horoscopo.jpg">
            </div>
            
            <div id="zodiac-information">
                <center>
                <h2>¿Sabes que te depara el futuro para hoy?</h2>
                <p>Descúbrelo dando click a la imagen que represente tu signo zodiacal</p>
                </center>
            </div>
        </div>
    </body>
</html>
