/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author Fernando Ajset
 */
public class Try1 {
    public static void main(String args[]){
        int [] array=new int[20];
        int a=15;
        int b=1;
        a=a+b;
        try{
        array[a]=b;
        a=a+1;
        a=25/b;
        String s=null;
        s.equals("QQQ");
        }
        //catch(ArrayIndexOutOfBoundsException ex){
        //System.out.println("Error en indice de arreglo");    
        //}
        //catch(ArithmeticException ex){
        //System.out.println("Error aritmetico");    
        //}
        catch(Exception ex){
        System.out.println("El objeto del error es de tipo: " + ex);
        }
        System.out.println("Finalizado con exito");
        
 }
    
}
