package conexiones;

import java.sql.*;

/**
 *
 * @author ferajset
 */
public interface ConexionBD {
    
//    String user = new String();
//    String pass = new String();
    
    public Connection getConnection(String user, String pass);
    
    public void close(PreparedStatement stmt);
    
    public void close(ResultSet rs);
    
    public void close(Connection conn);
    
}
