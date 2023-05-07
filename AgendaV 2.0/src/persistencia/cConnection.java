package persistencia;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class cConnection {
    Connection conectar = null; //variable "conectar", para conectar
    Statement sentencia = null; //variable "sentencia", para administrar nuestra sentencia sql
    ResultSet resultado = null; //variable "resultado", para mostrar el resultado
    
    public cConnection(){ //para poder conectar nuestra base de datos
        try{
            //Esta url se tiene que cambiar, excepto el nombre del archivo
            String rutaDB = "Datos.accdb"; //ruta del archivo
            String url = "jdbc:ucanaccess://"+rutaDB; //Conexion puente JDBC y Access
            conectar = DriverManager.getConnection(url); //Conectar con nuestra base de datos
            sentencia = conectar.createStatement(); //ayuda a utilizar la sentencia sql
            
            //si quieres probar que esta conectado, pero lo quite xq aparecen muchas notificaciones    
            //JOptionPane.showMessageDialog(null, "Conectado a la Base de Datos");//Mensaje de conexion
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar la Base de Datos - " + e); //Meensaje de error, nos dice el error que tenemos
            System.exit(0); //para finalizar de forma correcta
        }
    }
    
    public Connection getConnection(){ //para llamar nuestra conexion
        return conectar;
    }
    
    public boolean closeConecction() {// Cerrar la conexión.
       try{ 
           conectar.close(); 
        } 
        catch(SQLException sqle){ 
           System.out.println("No se cerro la conexión"); 
            return false; 
        } 
        System.out.println("Conexión cerrada con éxito "); 
        return true; 
    } 
}
