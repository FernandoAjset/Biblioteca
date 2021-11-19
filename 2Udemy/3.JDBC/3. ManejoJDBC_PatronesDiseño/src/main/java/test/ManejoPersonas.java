package test;

import datos.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;
/**
 *
 * @author ferajset
 */
public class ManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);        
            }
            PersonaDAO personaDao = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDao.select();
            personas.forEach(persona ->{
                System.out.println("persona DTO = " + persona);
            });
            
            conexion.commit();
            System.out.println("Transaccion realizada correctamente"); 
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
