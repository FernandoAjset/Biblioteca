package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.*;

/**
 *
 * @author ferajset
 */
public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });
//
//      usuarioDao.Insertar(new Usuario("system", "umg2021"));
        usuarioDao.Actualizar(new Usuario(5, "root", "123456"));
//      usuarioDao.Eliminar(new Usuario(4));

////        
        System.out.println("\nTabla actualizada");
        usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });

    }
}
