package test;
import domain.*;
/**
 *
 * @author ferna
 */
public class TestJavaBeans {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println("persona = " + persona);
        System.out.println("persona nombre = " + persona.getNombre());
        System.out.println("persona apellido = " + persona.getApellido());
    }
}
