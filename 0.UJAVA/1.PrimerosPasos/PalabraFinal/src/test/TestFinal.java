
package test;

import domain.Persona;

public class TestFinal {
      
    public static void main(String[] args) {
        final int miVariable=10;
        System.out.println("miVariable = " + miVariable);
        
        System.out.println("Constante: " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();
        
        persona1.setNombre("Fernando");
        System.out.println("persona1 nombre= " + persona1.getNombre());
        
        persona1.setNombre("Edgar");
        System.out.println("persona1 nombre= " + persona1.getNombre());
    }
}
