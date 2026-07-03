
package Control.DAO;

import Control.Conexion.ConexionBD;
import Modelo.UsuariosVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDAO {
    
    private Connection conexion=null;
    private Statement sentencia=null;
    private ResultSet resultado=null;
    
    
    public LoginDAO() throws ClassNotFoundException{
        
        try {
            /*se obtiene la conexión a la base de datos*/
            conexion = ConexionBD.getConexion();
        } catch (SQLException ex) {
            System.out.println("Sin conexion a la base de datos, ver error:"+ex.getMessage());
        }
        
        
    }
    
    /*método utilizado para consultar los usuarios registrados en la base de datos de la tabla usuarios
    y guardarlos y retornarlos en una lista
    */
    
    public ArrayList<UsuariosVO> DatosUsuario(){
        
        ArrayList<UsuariosVO> listaUsuarios = new ArrayList<UsuariosVO>();
        
        try {
            String consulta = "SELECT * FROM usuarios";
            
            sentencia = conexion.createStatement();
            
            resultado = sentencia.executeQuery(consulta);
            
            
            /* si hay registros crea un objeto de tipo UsuariosVO llamado usuariovo y coloca el nombre de usuario y contraeña 
               obenido de la consulta en la base de datos en este objeto y se adiciona a la lista*/
            while(resultado.next()){
                
               UsuariosVO usuariovo = new UsuariosVO();
                
               usuariovo.setUsuario(resultado.getString("usuario"));
               usuariovo.setContrasena(resultado.getString("contrasena"));
               listaUsuarios.add(usuariovo);
            }
            
            /*cierra la conexión*/
            sentencia.close();
            ConexionBD.desconectar();
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HoroscopoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaUsuarios;
        
    }
    
    
}
