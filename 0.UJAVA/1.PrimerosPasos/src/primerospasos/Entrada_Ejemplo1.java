/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;
import java.util.*;

/**
 *
 * @author fernando
 */
public class Entrada_Ejemplo1 {
    
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre=entrada.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad=entrada.nextInt();
       
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
}
