package datos;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author ferajset
 */
public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "F0011244";
    private static BasicDataSource ds;

    public static DataSource getDataSource(){
        if(ds==null){
        ds=new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASS);
        //definir tamaño del pool de conexiones
        ds.setInitialSize(10);
        }
        return ds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
       smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
