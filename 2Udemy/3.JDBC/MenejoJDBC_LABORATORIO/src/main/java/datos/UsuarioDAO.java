package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferajset
 */
public class UsuarioDAO {

    public List<Usuario> seleccionar() {
        List<Usuario> usuarios = new ArrayList();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            while (res.next()) {
                int idUsuario = res.getInt("id_usuario");
                String nombre = res.getString("usuario");
                String password = res.getString("password");
                Usuario usuario = new Usuario(idUsuario, nombre, password);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(res);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    public int Insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        Integer registros = null;
        String SQL_INSERT = "INSERT INTO usuario(usuario,password)VALUES(?,?)";
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int Actualizar(Usuario usuario) {
        int registros = 0;
        Connection con = null;
        PreparedStatement stmt = null;
        String SQL_UPDATE = "UPDATE usuario SET usuario=?,password=? WHERE id_usuario=? LIMIT 1";
        try {
            con = Conexion.getConnection();
            stmt=con.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int Eliminar(Usuario usuario){
        int registros=0;
        Connection con = null;
        PreparedStatement stmt=null;
        String SQL_DELETE ="DELETE FROM usuario WHERE id_usuario=? LIMIT 1";
        try {
            con = Conexion.getConnection();
            stmt=con.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsuario());
            registros=stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
