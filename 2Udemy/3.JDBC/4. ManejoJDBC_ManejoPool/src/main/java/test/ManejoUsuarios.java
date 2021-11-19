package test;

import datos.*;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;


/**
 *
 * @author ferajset
 */
public class ManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion=null;
        
        try {
            conexion=Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioDAO usuarioDao = new UsuarioJDBC(conexion);
            
            List<UsuarioDTO> usuarios = usuarioDao.select();
            usuarios.forEach(usuario->{
                System.out.println("usuario = " + usuario);
            }
            );
            
            //usuarioDao.insert(new UsuarioDTO("sys","123"));
            //usuarioDao.update(new UsuarioDTO(12,"sys","0001"));
            //SusuarioDao.delete(new UsuarioDTO(7));
            
            conexion.commit();
            System.out.println("Transaccion realizada correctamente");
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
