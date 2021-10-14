/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

/**
 *
 * @author fernando
 */
public class Manipula_Cadenas {
    
    public static void main(String args[])
    {
    String nombre="Fernando";
    
    
    System.out.println("Nombre: "+nombre);
    
    //muestra cantidad de caracteres
    System.out.println("Mi nombre tiene "+nombre.length()+" letras");
    
    //Devuelve el caracter indicado en la posicion
    System.out.println("La primera letra de mi nombre es: "+nombre.charAt(0));
    
    //Nos dice la ultima letra
    int ultima;
    ultima=nombre.length();
    System.out.println("Y la ultima letra de mi nombre es: "+nombre.charAt(ultima-1));

    }    
}
