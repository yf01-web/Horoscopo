
package Control.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
   //esta clase gestiona la conexión entre la aplicación y la base de datos hecha por MySQL
    private static Connection cn = null;
   
    //este método estático permite conectarse a la base de datos
    //utiliza el driver JDBC proporcionado por el conector MySQL.
    public static Connection getConexion() throws SQLException, ClassNotFoundException{

        
        Class.forName("com.mysql.cj.jdbc.Driver");

        //se configura con tres parámetros para conectarse: 
        //la url donde está la base de datos con servidor, el puerto y nombre de la base de datos (en phpMyAdmin)
        //el nombre de usuario que es "root"
        //la contraseña que en este caso está en blanco
        
        
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/horoscopobd","root","");

        return cn;
    }
   
    // Libera la referencia utilizada por la aplicación para la conexión.
    // En esta versión del proyecto no se cierra explícitamente la conexión.
    public static void desconectar(){
        cn = null;    
    }
}
