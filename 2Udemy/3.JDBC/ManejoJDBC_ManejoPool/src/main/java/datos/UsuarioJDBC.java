package datos;

import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferajset
 */
public class UsuarioJDBC implements UsuarioDAO{

    private Connection conexion;

    public UsuarioJDBC() {

    }

    public UsuarioJDBC(Connection conexion) {
        this.conexion = conexion;
    }

    public List<UsuarioDTO> select() throws SQLException {
        List<UsuarioDTO> usuarios = new ArrayList();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConnection();
            String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            while (res.next()) {
                int idUsuario = res.getInt("id_usuario");
                String nombre = res.getString("usuario");
                String password = res.getString("password");
                UsuarioDTO usuario = new UsuarioDTO(idUsuario, nombre, password);
                usuarios.add(usuario);
            }
        } finally {
            try {
                Conexion.close(res);
                Conexion.close(stmt);
                if (this.conexion == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    public int insert(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        Integer registros = null;
        String SQL_INSERT = "INSERT INTO usuario(usuario,password)VALUES(?,?)";
        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();
        } finally {
            try {
                stmt.close();
                if (conexion == null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int update(UsuarioDTO usuario) throws SQLException {
        int registros = 0;
        Connection con = null;
        PreparedStatement stmt = null;
        String SQL_UPDATE = "UPDATE usuario SET usuario=?,password=? WHERE id_usuario=? LIMIT 1";
        try {
            con = this.conexion != null ? this.conexion : Conexion.getConnection();
            stmt = con.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } finally {
            try {
                stmt.close();
                if (conexion == null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int delete(UsuarioDTO usuario) throws SQLException {
        int registros = 0;
        Connection con = null;
        PreparedStatement stmt = null;
        String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=? LIMIT 1";
        try {
            con = this.conexion != null ? this.conexion : Conexion.getConnection();
            stmt = con.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } finally {
            try {
                stmt.close();
                if (conexion == null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
