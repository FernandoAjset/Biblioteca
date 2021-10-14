/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Calendar;

/**
 *
 * @author fernando
 */
public class Calculos_conMath {
    
    public static void main(String args[])
    {
        /*//Metodo SQRT para dar raiz
        double raiz=Math.sqrt(9);
        
        double num1=5.3555;
        //Metodo Round para redondear numero
        int resultado=(int)Math.round(num1); //Refundicion, convertir un tipo de dato a otro
        
        double base=5, exponente=3;
        int res=(int)Math.pow(base, exponente);
        System.out.println("La raiz es: "+raiz);
        System.out.println(num1+" redondeado es: "+resultado);
        System.out.println("El numero "+base+" elevado al exponente "+exponente+" es: "+res);
        
        */
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
String mes = Integer.toString(c.get(Calendar.MONTH)+1);

String annio = Integer.toString(c.get(Calendar.YEAR));
        
        System.out.println(dia+"/"+mes+"/"+annio);
    
    }
    
}
