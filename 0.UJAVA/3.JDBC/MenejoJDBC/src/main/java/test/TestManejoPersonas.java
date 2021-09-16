package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

/**
 *
 * @author ferajset
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();    
        Persona persona1 = new Persona("Maria","Callejas",null,"65874122");
        Persona persona2 = new Persona(4,"Oscar","Martinez","osmasd@gmail.com","47852145");

        
        personaDao.insertar(persona1);
        //personaDao.actualizar(persona2);
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
        
        personaDao.eliminar(new Persona(6));
        
        System.out.println("\nTabla actualizada");
        personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
