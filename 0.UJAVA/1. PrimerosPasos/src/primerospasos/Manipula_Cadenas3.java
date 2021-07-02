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
public class Manipula_Cadenas3 {
    public static void main(String args[])
    {
        String alumno1, alumno2;
        alumno1="Fernando";
        alumno2="fernando";
        
        //compara las cadenas
        System.out.println(alumno1.equals(alumno2));
        //compara las cadenas sin importar mayusculas
        //y minusculas
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
        //ejemplo para validar datos con if
        if(alumno1.equalsIgnoreCase(alumno2)==true)
        {
            System.out.println("El nombre es igual");
        }
        
    }
}
