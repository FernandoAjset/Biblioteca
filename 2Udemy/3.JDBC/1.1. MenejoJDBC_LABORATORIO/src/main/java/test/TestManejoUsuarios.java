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
            // INSERTANDO USUARIOS
//          usuarioDao.Insertar(new Usuario("system", "umg2021"));
//          usuarioDao.Insertar(new Usuario("Admin","145215"));
//          usuarioDao.Insertar(new Usuario("Edgar", "umg2021"));
//          usuarioDao.Insertar(new Usuario("HR","0011244"));
//          usuarioDao.Insertar(new Usuario("root", "umg2021"));
//          usuarioDao.Insertar(new Usuario("Admin","145215"));


        //usuarioDao.Actualizar(new Usuario(5, "root", "12345678"));
        usuarioDao.Eliminar(new Usuario(3));

        
        System.out.println("\nTabla actualizada");
        usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });

    }
}
