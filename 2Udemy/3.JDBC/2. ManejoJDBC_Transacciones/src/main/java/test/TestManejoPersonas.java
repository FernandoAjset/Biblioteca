package test;

import datos.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
/**
 *
 * @author ferajset
 */
public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);        
            }
            PersonaDAO personaDao = new PersonaDAO(conexion);
            personaDao.actualizar(new Persona(2,"Karla Ivonne","Lara","karlara4@gmail.com","55668811"));
            personaDao.insertar(new Persona("Carlos","Ramirez",null,null));
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion"); 
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
