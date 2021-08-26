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
public class Manipula_Cadenas2 {
   
    public static void main(String args[])
    {
        String frase="Hoy es un estupendo dia para aprender a programar en Java";
        String frase_resumen=frase.substring(0,29) 
                + " irnos a la chin... y "+frase.substring(29, 57);
        
        System.out.println(frase_resumen);
           
    }
}
