package test;

import java.sql.*;

/**
 *
 * @author ferajset
 */
public class TestMysqlJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url,"root", "F0011244");
            Statement instruccion = conexion.createStatement();
            var sql ="SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("ID Persona: "+resultado.getInt("id_persona"));
                System.out.print(" Nombre Persona: "+resultado.getString("nombre"));
                System.out.print(" Apellido Persona: "+resultado.getString("apellido"));
                System.out.print(" E-mail Persona: "+resultado.getString("email"));
                System.out.print(" Telefono: "+resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
