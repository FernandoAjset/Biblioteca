package conexiones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ferajset
 */
public class ConexionOracleSql_I implements ConexionBD{
    
    boolean conexion=false;
    private static final String URL_JDBC="jdbc:oracle:thin:@localhost:1521:XE";

    @Override
    public Connection getConnection(String user, String pass) {
        try {
            Connection conn=DriverManager.getConnection(URL_JDBC, user, pass);
            conexion=true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No Se pudo conectar con la BD " + ex.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionOracleSql_I.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionOracleSql_I.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionOracleSql_I.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @Override
    public boolean status() {
        return this.conexion;
    }
}
