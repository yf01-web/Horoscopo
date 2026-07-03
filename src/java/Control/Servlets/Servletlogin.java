
package Control.Servlets;

import Control.DAO.LoginDAO;
import Modelo.UsuariosVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yeison
 */
@WebServlet(name = "Servletlogin", urlPatterns = {"/Servletlogin"})
public class Servletlogin extends HttpServlet {

    private LoginDAO logindao;
    private UsuariosVO usuariovo;
    private ArrayList<UsuariosVO> lista;
    private String usuario, contrasena;
    private ServletHome servHome;
    
    public Servletlogin() throws SQLException, ClassNotFoundException{
        
        //se crea un objeto de tipo LoginDAO para gestionar consultas de usaurios registrados en la base de datos
        logindao = new LoginDAO();
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
        try (PrintWriter out = response.getWriter()) {
            
            /*se obtiene el nombre de usuario y contraseña del login a través del método POST del formulario
            para no mostrarlos en la URL
            */
            
            usuario = request.getParameter("usuario");
            
            contrasena = request.getParameter("contrasena"); 
            
            //se obtiene la lista de usuarios registrados
            lista = logindao.DatosUsuario();
              
                /*se valida si los datos ingresados son  incorrectos o la lista está vacía*/
                if(!ValidarUsuario() || lista==null){
                    
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Iniciar Sesión</title>");
                    out.println("<link href=\"vistas/estiloslogin.css\" rel=\"stylesheet\">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<div class=\"contact-form\">");
                    out.println("<img alt=\"\" class=\"logo\" src=\"./Imagenes/user.png\">");
                    out.println("<h2>Iniciar Sesión</h2>");
                    out.println("<form action=\"Servletlogin\" method=\"post\">");
                    out.println("<p>Usuario</p><input placeholder=\"Usuario\" type=\"text\" name=\"usuario\">");
                    out.println("<p>Contraseña</p><input placeholder=\"Contraseña\" type=\"password\" name=\"contrasena\">");
                    out.println("<input type=\"submit\" value=\"Ingresar\">");
                    //se muestra un mensaje al usuario que los datos ingresados son incorrectos
                    out.println("<center><p>El usuario o contraseña son incorrectos, intente nuevamente</p></center>");
                    out.println("</form>");
                    out.println("</div>");
                    out.println("</body>");
                    out.println("</html>"); 
                
                }
                
                else{
                    //en caso de que los datos son correctos y asumiendo que la lista tiene usuarios se regirige el usaurio al home
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Iniciar Sesión</title>");
                    out.println("<meta http-equiv=\"Refresh\" content=\"3;url=vistas/home.jsp\">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("</body>");
                    out.println("</html>"); 
                }
                
                
            }
            
            /* TODO output your page here. You may use following sample code. */
            
       
    }
    
    //método para validar los datos ingresados por el usuario
    private boolean ValidarUsuario(){
        
        boolean validacion = false;
        
        for(int i=0; i<lista.size();i++){
            
            usuariovo = lista.get(i);
            
            if(usuariovo.getUsuario().equals(usuario) && usuariovo.getContrasena().equals(contrasena))
                
                validacion = true;   
        }
        
        return validacion;
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
