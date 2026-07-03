<%-- 
    Document   : home
    Created on : 27 mar. 2022, 13:02:56
    Author     : Yeison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Home</title>
        <link href="estiloshome.css" rel="stylesheet">
    </head>
    <body>
        <header class="header">
            <div class="container">
                <h3>Horóscopo</h3>
                <%-- enlace para salir del home --%>
                <a href="../index.jsp">Salir</a>
                
            </div>
        </header>
        <%-- muestra un recuadro con las imágenes de los signos zodiacales, 

        se puede hacer clic sobre la imagen: 
        
        cambia el color de fondo por cada signo zodiacal de la página con la función de javascript fondo(num)
        
        envía una petición al ServletHome para que responda con la predicción del día, del mes y del año (si está disponible)
        del signo zodiacal seleccionado y diseñe la página
        
        --%>
            <div class="div-zodiac-signs">
                <div id="titulo-signos">
                    <h1>Signos Zodiacales</h1>
                </div>
            <center>
            <table>
                <tr>
                    <td>
                        <center>
                            <form action="../ServletHome" method="get">
                            <input type="hidden" value="aries" name="signo"> 
                            <input type="hidden" value="enero" name="mes">
                            <input type="hidden" value="year2022" name="year">
                            <input type="image" src="../Imagenes/aries.png" onclick="fondo('1')" alt="Submit" title="Aries">
                            </form>
                        </center>
                    </td>
                    <td>
                        <center>
                            <form action="../ServletHome" method="get">
                            <input type="hidden" value="tauro" name="signo">  
                            <input type="hidden" value="enero" name="mes">
                            <input type="hidden" value="year2022" name="year">
                            <input type="image" src="../Imagenes/tauro.png" onclick="fondo('2')" alt="Submit" title="Tauro">
                            </form>
                        </center>
                    </td>
                    <td>
                        <center>
                            <form action="../ServletHome" method="get">
                            <input type="hidden" value="geminis" name="signo">
                            <input type="hidden" value="enero" name="mes">
                            <input type="hidden" value="year2022" name="year">
                            <input type="image" src="../Imagenes/geminis.png" onclick="fondo('3')" alt="Submit" title="Geminis">
                            </form>
                        </center>
                    </td>
                    <td>
                        <center>
                            <form action="../ServletHome" method="get">
                            <input type="hidden" value="cancer" name="signo"> 
                            <input type="hidden" value="enero" name="mes">
                            <input type="hidden" value="year2022" name="year">
                            <input type="image" src="../Imagenes/cancer.png" onclick="fondo('4')" alt="Submit" title="Cancer">
                            </form>
                        </center>
                    </td>
                </tr>
                <tr>
                    <td>
                    <center>
                            <form action="../ServletHome" method="get">
                            <input type="hidden" value="leo" name="signo">
                            <input type="hidden" value="enero" name="mes">
                            <input type="hidden" value="year2022" name="year">
                            <input type="image" src="../Imagenes/leo.png" onclick="fondo('5')" alt="Submit" title="Leo">
                            </form>
                    </center>   
                    </td>
                    <td>
                    <center>
                            <form action="../ServletHome" method="get">
                            <input type="hidden" value="virgo" name="signo">
                            <input type="hidden" value="enero" name="mes">
                            <input type="hidden" value="year2022" name="year">
                            <input type="image" src="../Imagenes/virgo.png" onclick="fondo('6')" alt="Submit" title="Virgo">
                            </form>
                    </center>
                    </td>
                    <td>
                    <center>
                            <form action="../ServletHome" method="get">
                            <input type="hidden" value="libra" name="signo">
                            <input type="hidden" value="enero" name="mes">
                            <input type="hidden" value="year2022" name="year">
                            <input type="image" src="../Imagenes/libra.png" onclick="fondo('7')" alt="Submit" title="Libra">
                            </form>
                    </center>
                    </td>
                    <td>
                    <center>
                        <form action="../ServletHome" method="get">
                        <input type="hidden" value="escorpion" name="signo">
                        <input type="hidden" value="enero" name="mes">
                        <input type="hidden" value="year2022" name="year">
                        <input type="image" src="../Imagenes/escorpion.png" onclick="fondo('8')" alt="Submit" title="Escorpion">
                        </form>
                    </center>
                    </td>
                </tr>
                <tr>
                    <td>
                    <center>
                        <form action="../ServletHome" method="get">
                        <input type="hidden" value="sagitario" name="signo">
                        <input type="hidden" value="enero" name="mes">
                        <input type="hidden" value="year2022" name="year">
                        <input type="image" src="../Imagenes/sagitario.png" onclick="fondo('9')" alt="Submit" title="Sagitario">
                        </form>
                    </center>
                    </td>
                    <td>
                    <center>
                        <form action="../ServletHome" method="get">
                        <input type="hidden" value="capricornio" name="signo">
                        <input type="hidden" value="enero" name="mes">
                        <input type="hidden" value="year2022" name="year">
                        <input type="image" src="../Imagenes/capricornio.png" onclick="fondo('10')" alt="Submit" title="Capricornio">
                        </form>
                    </center>
                    </td>
                    <td>
                    <center>
                        <form action="../ServletHome" method="get">
                        <input type="hidden" value="acuario" name="signo">
                        <input type="hidden" value="enero" name="mes">
                        <input type="hidden" value="year2022" name="year">
                        <input type="image" src="../Imagenes/acuario.png" onclick="fondo('11')" alt="Submit" title="Acuario">
                        </form>
                    </center>
                    </td>
                    <td>
                    <center>
                        <form action="../ServletHome" method="get">
                        <input type="hidden" value="piscis" name="signo">
                        <input type="hidden" value="enero" name="mes">
                        <input type="hidden" value="year2022" name="year">
                        <input type="image" src="../Imagenes/piscis.png" onclick="fondo('12')" alt="Submit" title="Piscis">
                        </form>
                    </center>
                    </td>
                </tr>
            </table>
            </center>
        </div>
        <script>
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
            <%-- 

            en esta sección muestra la predicción del día cuando se haga clic en la imagen del signo zodiacal seleccionado 
            
            también muestra por defecto la predicción del mes de enero y del año 2022 del signo zodiacal seleccionado
            
            --%>
            <div class="caja">
                <div class="titulo" id="predic-dia">
                  
                    <h2>Predicción del Día</h2>
                    
                </div>
            
                <%-- 

                en la respuesta del ServletHome el primer "div" tendrá la imagen del signo zodiacal seleccionado
                y el segundo "div" tendrá su nombre respectivo
                
                --%>
                
                <div class="zodiac-properties" id="zodiac-izq"></div>
                <div class="zodiac-properties" id="zodiac-der" ></div>

                <div id="zodiac-information">
                    <center>
                    <h3>Prediccion del dia</h3>
                    <p>Descúbrelo dando click a la imagen que represente tu signo zodiacal</p>
                    </center>
                </div>
            
            </div>
            
            <%-- 

            en esta sección muestra la predicción del mes (sí está disponible) cuando se haga clic en la imagen del signo zodiacal seleccionado
            por defecto muestra la predicción del mes de enero
            
            muestra la predicción deseada seleccionando el signo de la lista desplegable y el mes de la lista desplegable 
            
            --%>
            
            <div class="caja">
                <div class="titulo" id="predic-mes">
                    
                    <h2>Predicción del Mes</h2>
                    
                </div>
            
                
                <%-- 

                en la respuesta ServletHome el primer "div" tendrá la imagen del signo zodiacal seleccionado
                y el segundo "div" tendrá su nombre respectivo
                
                --%>
                <div class="zodiac-properties" id="zodiac-izq"></div>
                <div class="zodiac-properties" id="zodiac-der" ></div>

                <div id="zodiac-information">
                
                <%-- 
                
                aquí se envía la petición a ServletHome para que responda con la predicción del mes seleccionado
                cuando se eliga el signo y el mes

                también por defecto muestra la predicción del día del signo seleccionado y del año 2022
                
                --%>
                    <form action="../ServletHome" method="get">
                        <div class="zodiac-properties" id="zodiac-izq">
                            <p><label for="signo">Signo:</label>
                            <select id="signo" name="signo" required="">
                                <option value="aries">aries</option>
                                <option value="tauro">tauro</option>
                                <option value="geminis">geminis</option>
                                <option value="cancer">cancer</option>
                                <option value="leo">leo</option>
                                <option value="virgo">virgo</option>
                                <option value="libra">libra</option>
                                <option value="escorpion">escorpion</option>
                                <option value="sagitario">sagitario</option>
                                <option value="capricornio">capricornio</option>
                                <option value="acuario">acuario</option>
                                <option value="piscis">piscis</option>
                            </select>
                            </p>

                        </div>
                        <input type="hidden" value="2022" name="year">
                        <div class="zodiac-properties" id="zodiac-der">
                            <p><label for="mes">Mes:</label>
                            <select id="mes" name="mes" required="">
                                <option value="enero">enero</option>
                                <option value="febrero">febrero</option>
                                <option value="marzo">marzo</option>
                                <option value="abril">abril</option>
                                <option value="mayo">mayo</option>
                                <option value="junio">junio</option>
                                <option value="julio">julio</option>
                                <option value="agosto">agosto</option>
                                <option value="septiembre">agosto</option>
                                <option value="octubre">octubre</option>
                                <option value="noviembre">noviembre</option>
                                <option value="diciembre">diciembre</option>
                            </select>
                            </p>

                        </div>
                        <div id="zodiac-information">
                            <center>
                            <input type="submit" value="consultar">
                            </center>
                        </div>
                        <div id="zodiac-information">
                            <center>
                            <h3>Prediccion para el mes </h3>
                            <p>Aca estara el mensaje de la prediccion para el mes señalado</p>
                            </center>
                        </div>
                    </form>
                    
                </div>
            
            </div>
            
            
        </div>
        <div class="div-der">
            <%-- 

            en esta sección muestra la predicción del año (sí está disponible) cuando se haga clic en la imagen del signo zodiacal seleccionado
            por defecto muestra la predicción del año 2022
            
            muestra la predicción deseada seleccionando el signo de la lista desplegable y el año de la lista desplegable 
            
            --%>
            <div class="caja">
                <div class="titulo" id="predic-year">
                  
                    <h2>Predicción del Año</h2>
                    
                </div>
            
                <div class="zodiac-properties" id="zodiac-izq"></div>
                <div class="zodiac-properties" id="zodiac-der" ></div>

                <div id="zodiac-information">
                    
                <%-- 
                
                aquí se envía la petición a ServletHome para que responda con la predicción del año seleccionado
                cuando se eliga el signo y el año

                también por defecto muestra la predicción del día del signo seleccionado y del mes enero
                
                --%>
                    <form action="../ServletHome" method="get">
                        <div class="zodiac-properties" id="zodiac-izq">
                            <p><label for="signo">Signo:</label>
                            <select id="signo" name="signo" required="">
                                <option value="aries">aries</option>
                                <option value="tauro">tauro</option>
                                <option value="geminis">geminis</option>
                                <option value="cancer">cancer</option>
                                <option value="leo">leo</option>
                                <option value="virgo">virgo</option>
                                <option value="libra">libra</option>
                                <option value="escorpion">escorpion</option>
                                <option value="sagitario">sagitario</option>
                                <option value="capricornio">capricornio</option>
                                <option value="acuario">acuario</option>
                                <option value="piscis">piscis</option>
                            </select>
                            </p>

                        </div>
                        <input type="hidden" value="enero" name="mes">
                        <div class="zodiac-properties" id="zodiac-der">
                            <p><label for="year">Año:</label>
                            <select id="year" name="year" required="">
                                <option value="year2022">2022</option>
                                <option value="year2023">2023</option>
                                <option value="year2024">2024</option>
                                <option value="year2025">2025</option>

                            </select>
                            </p>

                        </div>

                        <div id="zodiac-information">
                            <center>
                            <input type="submit" value="consultar">
                            </center>
                        </div>
                        <div id="zodiac-information">
                            <center>
                            <h3>Prediccion para el año </h3>
                            <p>Aca estara el mensaje de la prediccion para el año señalado</p>
                            </center>
                        </div>
                    </form>
                    
                </div>
            
            </div>
            
            <%-- 

            esta sección es utilizada para reservar una lectura de carta astral, al hacer clic en la imagen, 
            dirige al usuario a otra página para registrar sus datos, la hora y la fecha para la lectura
            
            esta funcionalidad aún no esta implementada
            
            --%>       
            <div class="caja">
                <div class="titulo" id="predic-carta-astral">

                        <h2>Lectura Carta Astral</h2>

                </div> 
                <div id="div-carta-astral">
                    <center>
                    <form action="form_reserva.jsp" method="post">
                        
                        <input type="image" src="../Imagenes/carta-astral.jpg" alt="Submit" title="Cliquea aqui">
                        
                    </form>
                    </center>
                </div>
                <div class="titulo" id="div-reservar-cita">

                        <h2>Reserva tu cita</h2>

                </div> 
            </div>
        </div>
        
    </body>
</html>
