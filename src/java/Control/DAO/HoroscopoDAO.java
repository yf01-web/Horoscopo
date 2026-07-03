
package Control.DAO;

import Control.Conexion.ConexionBD;
import Modelo.HoroscopoVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HoroscopoDAO {
    
    /*clase utilizada para hacer consultas SQL a la base de datos como parte del patrón DAO (Acceso a Datos)*/
    
    private Connection conexion=null;
    private Statement sentencia=null;
    private ResultSet resultado=null;
    
    
    public HoroscopoDAO() throws SQLException, ClassNotFoundException{
             
        try {
            /*se obtiene la conexión a la base de datos*/
            conexion = ConexionBD.getConexion();
            System.out.println("se pudo realizar la conexion");
        } catch (SQLException ex) {
            System.out.println("Sin conexion a la base de datos, ver error:"+ex.getMessage());
        }
        
        
    }
    
    /*hace una consulta a la base de datos para obtener la predicción del día con respecto al signo zodiacal seleccionado
    y retorna un objeto de tipo HoroscopoVO si hay resultados, sino retorna null*/
    
    public HoroscopoVO mostrarMensajeDiario(String signo){
        
        HoroscopoVO mensajeHoroscopo = null;
        
        try {
            
            boolean modoDemo = true;
            String consulta = "";
            
            /*se modificó esta parte del código para mostrar las predicciones del día que existen del mes de marzo del 2022 cuando modeDemo es true
            cuando el mododemo es false se puede mostrar la predicción del día en la fecha actual si está disponible en la base de datos*/
            
            if(modoDemo){
                Calendar fecha = Calendar.getInstance();
              
                consulta = "SELECT "+signo+" FROM pronostico_diario WHERE fecha='2022-03-"+fecha.get(Calendar.DAY_OF_MONTH)+"'";
            
            }else
                consulta = "SELECT "+signo+" FROM pronostico_diario WHERE fecha=CURRENT_DATE";
           
            
            sentencia = conexion.createStatement();
            
            resultado = sentencia.executeQuery(consulta);
            
            /*si hay resultados para la consulta SQL crea un objeto de tipo HoroscopoVO mensajeHoroscopo
            y se coloca la predicción en el objeto en el método setMensajeDiario*/
            if(resultado.next()){
                
               mensajeHoroscopo = new HoroscopoVO();
               
               /*se coloca el resultado de la columna de la base de datos del signo zodiacal seleccionado*/
               mensajeHoroscopo.setMensajeDiario(resultado.getString(signo));
            }
            
            /* se cierra la conexión*/
            sentencia.close();
            ConexionBD.desconectar();
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HoroscopoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mensajeHoroscopo;     
        
    }
    
    /*hace una consulta a la base de datos para obtener la predicción del mes (si está disponible) con respecto al signo zodiacal seleccionado
    y retorna un objeto de tipo HoroscopoVO si hay resultados, sino retorna null*/
    
    public HoroscopoVO mostrarMensajeMensual(String signo, String mes){
        
        HoroscopoVO mensajeHoroscopo = null;
        
        try {
            String consulta = "SELECT "+mes+" FROM pronostico_mensual WHERE signo='"+signo+"'";
            
            sentencia = conexion.createStatement();
            
            resultado = sentencia.executeQuery(consulta);
            
            
            /*si hay resultados para la consulta SQL crea un objeto de tipo HoroscopoVO mensajeHoroscopo
            y se coloca la predicción en el objeto en el método setMensajeMensual*/
            
            if(resultado.next()){
                
               mensajeHoroscopo = new HoroscopoVO();
               
               /*se coloca el resultado de la columna de la base de datos del mes seleccionado*/
               mensajeHoroscopo.setMensajeMensual(resultado.getString(mes));
            }
            
            /* se cierra la conexión*/
            sentencia.close();
            ConexionBD.desconectar();
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HoroscopoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mensajeHoroscopo;     
        
    }
    
    /*hace una consulta a la base de datos para obtener la predicción del año (si está disponible) con respecto al signo zodiacal seleccionado
    y retorna un objeto de tipo HoroscopoVO si hay resultados, sino retorna null*/
    
    public HoroscopoVO mostrarMensajeAnual(String signo, String ano){
        
        HoroscopoVO mensajeHoroscopo = null;
        
        try {
            String consulta = "SELECT "+ano+" FROM pronostico_anual WHERE signo='"+signo+"'";
            
            sentencia = conexion.createStatement();
            
            resultado = sentencia.executeQuery(consulta);
            
            
            /*si hay resultados para la consulta SQL crea un objeto de tipo HoroscopoVO mensajeHoroscopo
            y se coloca la predicción en el objeto en el método setMensajeAnual*/
            if(resultado.next()){
                
               mensajeHoroscopo = new HoroscopoVO();
               
               /*se coloca el resultado de la columna de la base de datos del año seleccionado*/
               mensajeHoroscopo.setMensajeAnual(resultado.getString(ano));
            }
            
            /* se cierra la conexión*/
            sentencia.close();
            ConexionBD.desconectar();
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HoroscopoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mensajeHoroscopo;     
        
    }
    
    
    
}
