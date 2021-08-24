/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

/**
 *
 * @author fernando
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Conexion {
    
    static Connection contacto = null;
    public static boolean status = false;
    static String usuario;
    static String password;
    
    public static Connection getConexion(){
        status = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establece la conexion... revisar Driver" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        try{
            contacto = DriverManager.getConnection("jdbc:mysql://localhost:3306/bodega",Conexion.usuario, Conexion.password);
            status = true;
        }catch (SQLException e){
             JOptionPane.showMessageDialog(null, "No Se pudo conectar con la BD " + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    }

    public static void setcuenta(String usuario, String password)
    {
        Conexion.usuario=usuario;
        Conexion.password=password;
    }
    
    public static boolean getstatus()
    {
        return status;
    }
    
    public static ResultSet Consulta(String consulta)
    {
        Connection con= getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta=declara.executeQuery(consulta);
            return respuesta;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}