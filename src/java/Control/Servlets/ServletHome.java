/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Control.Servlets;

import Control.DAO.HoroscopoDAO;
import Modelo.HoroscopoVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yeison
 */
@WebServlet(name = "ServletHome", urlPatterns = {"/ServletHome"})
public class ServletHome extends HttpServlet {

    private HoroscopoDAO horoscopodao;
    private HoroscopoVO mensaje, mensajeMensual, mensajeAnual;
    
    public ServletHome() throws SQLException, ClassNotFoundException{
        
        //se crea un objeto de tipo HoroscopoDAO para gestionar consultas del horóscopo en la base de datos
        horoscopodao = new HoroscopoDAO();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            //se obtiene valores del signo zodiacal, el mes y el año a través del método GET
            String signo = request.getParameter("signo");
            String mes = request.getParameter("mes");
            String year = request.getParameter("year");
            
            //se obtiene las predicciones del día, del mes y del año (si están disponibles) utilizando como argumento los valores obtenidos anteriormente
          
            mensaje = horoscopodao.mostrarMensajeDiario(signo);
            mensajeMensual = horoscopodao.mostrarMensajeMensual(signo, mes);
            mensajeAnual = horoscopodao.mostrarMensajeAnual(signo, year);
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Horoscopo</title>"); 
            out.println("<link href=\"vistas/estiloshome.css\" rel=\"stylesheet\">");
            out.println("</head>");
            
            //dependiendo del signo seleccionado cambia el color del fondo de la´página
            if(signo.equals("aries"))
            {out.println("<body style=\"background: green;\">");}
            if(signo.equals("tauro"))
            {out.println("<body style=\"background: goldenrod;\">");}
            if(signo.equals("geminis"))
            {out.println("<body style=\"background: darkblue;\">");}
            if(signo.equals("cancer"))
            {out.println("<body style=\"background: tomato;\">");}
            if(signo.equals("leo"))
            {out.println("<body style=\"background: orange;\">");}
            if(signo.equals("virgo"))
            {out.println("<body style=\"background: purple;\">");}
            if(signo.equals("libra"))
            {out.println("<body style=\"background: darkseagreen;\">");}
            if(signo.equals("escorpion"))
            {out.println("<body style=\"background: darkcyan;\">");}
            if(signo.equals("sagitario"))
            {out.println("<body style=\"background: royalblue;\">");}
            if(signo.equals("capricornio"))
            {out.println("<body style=\"background: red;\">");}
            if(signo.equals("acuario"))
            {out.println("<body style=\"background: darkviolet;\">");}
            if(signo.equals("piscis"))
            {out.println("<body style=\"background: darkorange;\">");}
            
            //header que muestra el titulo y un enlace para salir del home (de la sesión)
            out.println("<header class=\"header\">");
            out.println("<div class=\"container\">");
            out.println("<h3>Horóscopo</h3>");
            out.println("<a href=\"index.jsp\">Salir</a>");
            out.println("</div>");
            out.println("</header>");
            
            /*muestra un recuadro con las imágenes de los signos zodiacales, 

            se puede hacer clic sobre la imagen: 

            cambia el color de fondo por cada signo zodiacal de la página con la función de javascript fondo(num)

            envía una petición al ServletHome para que responda con la predicción del día, del mes y del año (si está disponible)
            del signo zodiacal seleccionado y diseñe la página
        
            */
            out.println("<div class=\"div-zodiac-signs\">");
            out.println("<div id=\"titulo-signos\">");
            out.println("<h1>Signos Zodiacales</h1>");
            out.println("</div>");
            out.println("<center>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"aries\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/aries.png\" onclick=<\"fondo('1')\" alt=\"Submit\" title=\"Aries\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"tauro\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/tauro.png\" onclick=\"fondo('2')\" alt=\"Submit\" title=\"Tauro\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"geminis\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/geminis.png\" onclick=\"fondo('3')\" alt=\"Submit\" title=\"Geminis\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"cancer\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/cancer.png\" onclick=\"fondo('4')\" alt=\"Submit\" title=\"Cancer\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"leo\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/leo.png\" onclick=\"fondo('5')\" alt=\"Submit\" title=\"Leo\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"virgo\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/virgo.png\" onclick=\"fondo('6')\" alt=\"Submit\" title=\"Virgo\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"libra\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/libra.png\" onclick=\"fondo('7')\" alt=\"Submit\" title=\"Libra\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"escorpion\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/escorpion.png\" onclick=\"fondo('8')\" alt=\"Submit\" title=\"Escorpion\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"sagitario\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/sagitario.png\" onclick=\"fondo('9')\" alt=\"Submit\" title=\"Sagitario\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"capricornio\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/capricornio.png\" onclick=\"fondo('10')\" alt=\"Submit\" title=\"Capricornio\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"acuario\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/acuario.png\" onclick=\"fondo('11')\" alt=\"Submit\" title=\"Acuario\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<input type=\"hidden\" value=\"piscis\" name=\"signo\">");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<input type=\"image\" src=\"Imagenes/piscis.png\" onclick=\"fondo('12')\" alt=\"Submit\" title=\"Piscis\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</center>");
            out.println("</div>");
            
            //funcion para cambiar el color de fondo de la página dependiendo del signo zodiacal
            out.println("<script>");
            out.println("function fondo(num){");
            out.println("if(num==='1')");
            out.println("document.body.style.background=\"green\";");
            out.println("if(num==='2')");
            out.println("document.body.style.background=\"goldenrod\";");
            out.println("if(num==='3')");
            out.println("document.body.style.background=\"darkblue\";");
            out.println("if(num==='4')");
            out.println("document.body.style.background=\"tomato\";");
            out.println("if(num==='5')");
            out.println("document.body.style.background=\"orange\";");
            out.println("if(num==='6')");
            out.println("document.body.style.background=\"purple\";");
            out.println("if(num==='7')");
            out.println("document.body.style.background=\"darkseagreen\";");
            out.println("if(num==='8')");
            out.println("document.body.style.background=\"darkcyan\";");
            out.println("if(num==='9')");
            out.println("document.body.style.background=\"royalblue\";");
            out.println("if(num==='10')");
            out.println("document.body.style.background=\"red\";");
            out.println("if(num==='11')");
            out.println("document.body.style.background=\"darkviolet\";");
            out.println("if(num==='12')");
            out.println("document.body.style.background=\"darkorange\";");
            out.println("}");
            out.println("</script>");
            
            
            out.println("<div class=\"prediction-div\">");
            
            /* en esta sección muestra la predicción del día cuando se haga clic en la imagen del signo zodiacal seleccionado 
            
               también muestra por defecto la predicción del mes de enero y del año 2022 del signo zodiacal seleccionado
            */
            out.println("<div class=\"caja\">");
            out.println("<div class=\"titulo\" id=\"predic-dia\">");
            out.println("<h2>Predicción del Día</h2>");
            out.println("</div>"); 
            //para mostrar la imagen del signo zodiacal seleccionado en esta sección
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-izq\">");
            if(signo.equals("aries"))
            {out.println("<img src=\"Imagenes/aries.png\">");}
            if(signo.equals("tauro"))
            {out.println("<img src=\"Imagenes/tauro.png\">");}
            if(signo.equals("geminis"))
            {out.println("<img src=\"Imagenes/geminis.png\">");}
            if(signo.equals("cancer"))
            {out.println("<img src=\"Imagenes/cancer.png\">");}
            if(signo.equals("leo"))
            {out.println("<img src=\"Imagenes/leo.png\">");}
            if(signo.equals("virgo"))
            {out.println("<img src=\"Imagenes/virgo.png\">");}
            if(signo.equals("libra"))
            {out.println("<img src=\"Imagenes/libra.png\">");}
            if(signo.equals("escorpion"))
            {out.println("<img src=\"Imagenes/escorpion.png\">");}
            if(signo.equals("sagitario"))
            {out.println("<img src=\"Imagenes/sagitario.png\">");}
            if(signo.equals("capricornio"))
            {out.println("<img src=\"Imagenes/capricornio.png\">");}
            if(signo.equals("acuario"))
            {out.println("<img src=\"Imagenes/acuario.png\">");}
            if(signo.equals("piscis"))
            {out.println("<img src=\"Imagenes/piscis.png\">");}
            out.println("</div>");
            //para mostrar el nombre del signo zodiacal seleccionado en esta sección
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-der\">");
            if(signo.equals("aries"))
            {out.println("<h1>Aries</h1>");}
            if(signo.equals("tauro"))
            {out.println("<h1>Tauro</h1>");}
            if(signo.equals("geminis"))
            {out.println("<h1>Geminis</h1>");}
            if(signo.equals("cancer"))
            {out.println("<h1>Cancer</h1>");}
            if(signo.equals("leo"))
            {out.println("<h1>Leo</h1>");}
            if(signo.equals("virgo"))
            {out.println("<h1>Virgo</h1>");}
            if(signo.equals("libra"))
            {out.println("<h1>Libra</h1>");}
            if(signo.equals("escorpion"))
            {out.println("<h1>Escorpion</h1>");}
            if(signo.equals("sagitario"))
            {out.println("<h1>Sagitario</h1>");}
            if(signo.equals("capricornio"))
            {out.println("<h1>Capricornio</h1>");}
            if(signo.equals("acuario"))
            {out.println("<h1>Acuario</h1>");}
            if(signo.equals("piscis"))
            {out.println("<h1>Piscis</h1>");}
            out.println("</div>");
            out.println("<div id=\"zodiac-information\">");
            //muestra el día actual y el mes actual
            out.println("<h3>Predicción del día:"+obtenerDia()+"/"+obtenerMes()+"</h3>");
            
            /*si hay resultado en la base de datos, muestra la predicción del día, sino, 
            si es nulo, muestra un mensaje informando que no hay predicciones para mostrar*/
            
            if(mensaje != null)
                out.println("<p>"+mensaje.getMensajeDiario()+"</p>");
            else
                out.println("<p>No hay predicciones del día de hoy para mostrar</p>");
            
            out.println("</div>");
            out.println("</div>");
            
            /*en esta sección muestra la predicción del mes (sí está disponible) cuando se haga clic en la imagen del signo zodiacal seleccionado
            por defecto muestra la predicción del mes de enero
            
            muestra la predicción deseada seleccionando el signo de la lista desplegable y el mes de la lista desplegable 
            */
            out.println("<div class=\"caja\">");
            out.println("<div class=\"titulo\" id=\"predic-mes\">");
            out.println("<h2>Predicción del Mes</h2>");
            out.println("</div>");
           
            //para mostrar la imagen del signo zodiacal seleccionado en esta sección
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-izq\">");
            if(signo.equals("aries"))
            {out.println("<img src=\"Imagenes/aries.png\">");}
            if(signo.equals("tauro"))
            {out.println("<img src=\"Imagenes/tauro.png\">");}
            if(signo.equals("geminis"))
            {out.println("<img src=\"Imagenes/geminis.png\">");}
            if(signo.equals("cancer"))
            {out.println("<img src=\"Imagenes/cancer.png\">");}
            if(signo.equals("leo"))
            {out.println("<img src=\"Imagenes/leo.png\">");}
            if(signo.equals("virgo"))
            {out.println("<img src=\"Imagenes/virgo.png\">");}
            if(signo.equals("libra"))
            {out.println("<img src=\"Imagenes/libra.png\">");}
            if(signo.equals("escorpion"))
            {out.println("<img src=\"Imagenes/escorpion.png\">");}
            if(signo.equals("sagitario"))
            {out.println("<img src=\"Imagenes/sagitario.png\">");}
            if(signo.equals("capricornio"))
            {out.println("<img src=\"Imagenes/capricornio.png\">");}
            if(signo.equals("acuario"))
            {out.println("<img src=\"Imagenes/acuario.png\">");}
            if(signo.equals("piscis"))
            {out.println("<img src=\"Imagenes/piscis.png\">");}
            out.println("</div>");
            
            //para mostrar el nombre del signo zodiacal seleccionado en esta sección
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-der\">");
            if(signo.equals("aries"))
            {out.println("<h1>Aries</h1>");}
            if(signo.equals("tauro"))
            {out.println("<h1>Tauro</h1>");}
            if(signo.equals("geminis"))
            {out.println("<h1>Geminis</h1>");}
            if(signo.equals("cancer"))
            {out.println("<h1>Cancer</h1>");}
            if(signo.equals("leo"))
            {out.println("<h1>Leo</h1>");}
            if(signo.equals("virgo"))
            {out.println("<h1>Virgo</h1>");}
            if(signo.equals("libra"))
            {out.println("<h1>Libra</h1>");}
            if(signo.equals("escorpion"))
            {out.println("<h1>Escorpion</h1>");}
            if(signo.equals("sagitario"))
            {out.println("<h1>Sagitario</h1>");}
            if(signo.equals("capricornio"))
            {out.println("<h1>Capricornio</h1>");}
            if(signo.equals("acuario"))
            {out.println("<h1>Acuario</h1>");}
            if(signo.equals("piscis"))
            {out.println("<h1>Piscis</h1>");}
            out.println("</div>");
            out.println("<div id=\"zodiac-information\">");
            
            /*
            aquí se realiza la petición para que responda con la predicción del mes seleccionado
            cuando se eliga el signo y el mes

            también por defecto muestra la predicción del día del signo seleccionado y del año 2022
            
            */
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-izq\">");
            out.println("<p><label for=\"signo\">Signo:</label>");
            out.println("<select id=\"signo\" name=\"signo\" required=\"\">");
            out.println("<option value=\"aries\">aries</option>");
            out.println("<option value=\"tauro\">tauro</option>");
            out.println("<option value=\"geminis\">geminis</option>");
            out.println("<option value=\"cancer\">cancer</option>");
            out.println("<option value=\"leo\">leo</option>");
            out.println("<option value=\"virgo\">virgo</option>");
            out.println("<option value=\"libra\">libra</option>");
            out.println("<option value=\"escorpion\">escorpion</option>");
            out.println("<option value=\"sagitario\">sagitario</option>");
            out.println("<option value=\"capricornio\">capricornio</option>");
            out.println("<option value=\"acuario\">acuario</option>");
            out.println("<option value=\"piscis\">piscis</option>");
            out.println("</select>");
            out.println("</p>");
            out.println("</div>");
            out.println("<input type=\"hidden\" value=\"year2022\" name=\"year\">");
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-der\">");
            out.println("<p><label for=\"mes\">Mes:</label>");
            out.println("<select id=\"mes\" name=\"mes\" required=\"\">");
            out.println("<option value=\"enero\">enero</option>");
            out.println("<option value=\"febrero\">febrero</option>");
            out.println("<option value=\"marzo\">marzo</option>");
            out.println("<option value=\"abril\">abril</option>");
            out.println("<option value=\"mayo\">mayo</option>");
            out.println("<option value=\"junio\">junio</option>");
            out.println("<option value=\"julio\">julio</option>");
            out.println("<option value=\"agosto\">agosto</option>");
            out.println("<option value=\"septiembre\">septiembre</option>");
            out.println("<option value=\"octubre\">octubre</option>");
            out.println("<option value=\"noviembre\">noviembre</option>");
            out.println("<option value=\"diciembre\">diciembre</option>");
            out.println("</select>");
            out.println("</p>");
            out.println("</div>");
            
            out.println("<div id=\"zodiac-information\">");
            out.println("<center>");
            out.println("<input type=\"submit\" value=\"consultar\">");
            out.println("</center>");
            out.println("</div>");
            out.println("<div id=\"zodiac-information\">");
            
            out.println("<h3>Prediccion para el mes: "+mes+"</h3>");
            
            /*si hay resultado en la base de datos, muestra la predicción del mes, sino, 
            si es nulo, muestra un mensaje informando que no hay predicciones para mostrar*/
            if(mensajeMensual != null)
                out.println("<p>"+mensajeMensual.getMensajeMensual()+"</p>");
            else
                out.println("<p>No hay predicciones del mes para mostrar</p>");
            
            out.println("</div>");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");

            out.println("<div class=\"div-der\">");
            
            /*en esta sección muestra la predicción del año (sí está disponible) cuando se haga clic en la imagen del signo zodiacal seleccionado
            por defecto muestra la predicción del año 2022
            
            muestra la predicción deseada seleccionando el signo de la lista desplegable y el año de la lista desplegable 
            */
            
            out.println("<div class=\"caja\">");
            out.println("<div class=\"titulo\" id=\"predic-year\">");
            out.println("<h2>Predicción del Año</h2>");
            out.println("</div>");
            
            //para mostrar la imagen del signo zodiacal seleccionado en esta sección
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-izq\">");
            if(signo.equals("aries"))
            {out.println("<img src=\"Imagenes/aries.png\">");}
            if(signo.equals("tauro"))
            {out.println("<img src=\"Imagenes/tauro.png\">");}
            if(signo.equals("geminis"))
            {out.println("<img src=\"Imagenes/geminis.png\">");}
            if(signo.equals("cancer"))
            {out.println("<img src=\"Imagenes/cancer.png\">");}
            if(signo.equals("leo"))
            {out.println("<img src=\"Imagenes/leo.png\">");}
            if(signo.equals("virgo"))
            {out.println("<img src=\"Imagenes/virgo.png\">");}
            if(signo.equals("libra"))
            {out.println("<img src=\"Imagenes/libra.png\">");}
            if(signo.equals("escorpion"))
            {out.println("<img src=\"Imagenes/escorpion.png\">");}
            if(signo.equals("sagitario"))
            {out.println("<img src=\"Imagenes/sagitario.png\">");}
            if(signo.equals("capricornio"))
            {out.println("<img src=\"Imagenes/capricornio.png\">");}
            if(signo.equals("acuario"))
            {out.println("<img src=\"Imagenes/acuario.png\">");}
            if(signo.equals("piscis"))
            {out.println("<img src=\"Imagenes/piscis.png\">");}
            
            out.println("</div>");
            
            //para mostrar el nombre del signo zodiacal seleccionado en esta sección
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-der\">"); 
            if(signo.equals("aries"))
            {out.println("<h1>Aries</h1>");}
            if(signo.equals("tauro"))
            {out.println("<h1>Tauro</h1>");}
            if(signo.equals("geminis"))
            {out.println("<h1>Geminis</h1>");}
            if(signo.equals("cancer"))
            {out.println("<h1>Cancer</h1>");}
            if(signo.equals("leo"))
            {out.println("<h1>Leo</h1>");}
            if(signo.equals("virgo"))
            {out.println("<h1>Virgo</h1>");}
            if(signo.equals("libra"))
            {out.println("<h1>Libra</h1>");}
            if(signo.equals("escorpion"))
            {out.println("<h1>Escorpion</h1>");}
            if(signo.equals("sagitario"))
            {out.println("<h1>Sagitario</h1>");}
            if(signo.equals("capricornio"))
            {out.println("<h1>Capricornio</h1>");}
            if(signo.equals("acuario"))
            {out.println("<h1>Acuario</h1>");}
            if(signo.equals("piscis"))
            {out.println("<h1>Piscis</h1>");}
            out.println("</div>");
            out.println("<div id=\"zodiac-information\">");
            
            /*
            aquí se realiza la petición para que responda con la predicción del año seleccionado
            cuando se eliga el signo y el año

            también por defecto muestra la predicción del día del signo seleccionado y del mes de enero
            
            */
            out.println("<form action=\"ServletHome\" method=\"get\">");
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-izq\">");
            out.println("<p><label for=\"signo\">Signo:</label>");
            out.println("<select id=\"signo\" name=\"signo\" required=\"\">");
            out.println("<option value=\"aries\">aries</option>");
            out.println("<option value=\"tauro\">tauro</option>");
            out.println("<option value=\"geminis\">geminis</option>");
            out.println("<option value=\"cancer\">cancer</option>");
            out.println("<option value=\"leo\">leo</option>");
            out.println("<option value=\"virgo\">virgo</option>");
            out.println("<option value=\"libra\">libra</option>");
            out.println("<option value=\"escorpion\">escorpion</option>");
            out.println("<option value=\"sagitario\">sagitario</option>");
            out.println("<option value=\"capricornio\">capricornio</option>");
            out.println("<option value=\"acuario\">acuario</option>");
            out.println("<option value=\"piscis\">piscis</option>");
            out.println("</select>");
            out.println("</p>");
            out.println("</div>");
            out.println("<input type=\"hidden\" value=\"enero\" name=\"mes\">");
            out.println("<div class=\"zodiac-properties\" id=\"zodiac-der\">");
            out.println("<p><label for=\"year\">Año:</label>");
            out.println("<select id=\"year\" name=\"year\" required=\"\">");
            out.println("<option value=\"year2022\">2022</option>");
            out.println("<option value=\"year2023\">2023</option>");
            out.println("<option value=\"year2024\">2024</option>");
            out.println("<option value=\"year2025\">2025</option>");
            out.println("</select>");
            out.println("</p>");
            out.println("</div>");
            out.println("<div id=\"zodiac-information\">");
            out.println("<center>");
            out.println("<input type=\"submit\" value=\"consultar\">");
            out.println("</center>");
            out.println("</div>");
            out.println("<div id=\"zodiac-information\">");
            out.println("<h3>Prediccion para el año: "+year.substring(4)+"</h3>");
            
            /*si hay resultado en la base de datos, muestra la predicción del año, sino, 
            si es nulo, muestra un mensaje informando que no hay predicciones para mostrar*/
            if(mensajeAnual != null)
                out.println("<p>"+mensajeAnual.getMensajeAnual()+"</p>");
            else
                out.println("<p>No hay predicciones del año para mostrar</p>");
            out.println("</div>");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");
            
            /*
            esta sección es utilizada para reservar una lectura de carta astral, al hacer clic en la imagen, 
            dirige al usuario a otra página para registrar sus datos, la hora y la fecha para la lectura
            
            esta funcionalidad aún no esta implementada
            */

            out.println("<div class=\"caja\">");
            out.println("<div class=\"titulo\" id=\"predic-carta-astral\">");
            out.println("<h2>Lectura Carta Astral</h2>");
            out.println("</div>");
            out.println("<div id=\"div-carta-astral\">");
            out.println("<center>");
            out.println("<form action=\"vistas/form_reserva.jsp\" method=\"\">");
            out.println("<input type=\"image\" src=\"Imagenes/carta-astral.jpg\" alt=\"Submit\" title=\"Cliquea aqui\">");
            out.println("</form>");
            out.println("</center>");
            out.println("</div>");
            out.println("<div class=\"titulo\" id=\"div-reservar-cita\">");
            out.println("<h2>Reserva tu cita</h2>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    
    //método para obtener el día de la fecha actual
    private int obtenerDia(){
        
        Calendar now = Calendar.getInstance();
        
        int dia = now.get(Calendar.DAY_OF_MONTH);
        
        return dia;
             
    }
    
    //método para obtener el mes de la fecha actual
    private int obtenerMes(){
        
        Calendar now = Calendar.getInstance();
        
        int mes = now.get(Calendar.MONTH);  
        
        return mes+1;
             
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
