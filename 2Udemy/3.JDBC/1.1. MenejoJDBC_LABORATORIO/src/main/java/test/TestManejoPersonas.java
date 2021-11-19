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
        
        //INSERTANDO DATOS
        
//        personaDao.insertar(new Persona("Juan","Perez","jpswe@gmail.com","47851245"));
//        personaDao.insertar(new Persona("Marcos","Lopez",null,null));
//        personaDao.insertar(new Persona("Karla","Garcia","karga558@gmail.com","65412500"));
//        personaDao.insertar(new Persona("Laura","Cifuentes","llcifu@gmail.com","33654127"));

        //personaDao.actualizar(personaModificar);
        
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
        
      //personaDao.actualizar(new Persona(3,"Marcos","Lopez","mmlpqw@gmail.com","44512570"));
        personaDao.eliminar(new Persona(4));
        
        System.out.println("\nTabla actualizada");
        personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
