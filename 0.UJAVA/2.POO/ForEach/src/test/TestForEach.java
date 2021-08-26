
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[]= {5,6,8,9,4};
        
        for(int edad: edades){ //Usando ForEach
            System.out.println("edad = " +edad);   
        }
        
        Persona personas[]= {new Persona("Juan"),new Persona("Mario"),new Persona("Karla")};
        
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
