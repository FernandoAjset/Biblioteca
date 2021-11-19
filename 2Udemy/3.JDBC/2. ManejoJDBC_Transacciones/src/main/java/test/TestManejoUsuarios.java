package test;

import datos.*;
import domain.Usuario;
import java.sql.*;


/**
 *
 * @author ferajset
 */
public class TestManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion=null;
        
        try {
            conexion=Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioDAO usuario = new UsuarioDAO(conexion);
      
           // usuario.Insertar(new Usuario("Fernando","0011244"));
            usuario.Actualizar(new Usuario(3,"administrador","nuevapass"));
            usuario.Eliminar(new Usuario(9));
            conexion.commit();
            System.out.println("Transaccion realizada");
        } catch (SQLException ex) {
            System.out.println("Haciendo Rollback");
            ex.printStackTrace(System.out);
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
