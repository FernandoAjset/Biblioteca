/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
public class probar {
    public static void main(String[] args) {
        String cadena = new String();
        
        cadena="HOLA MUNDO ESTO ES UNA PRUEBA";
        String result = cadena.replaceAll("\\s+","");
        
        System.out.println("result = " + result);
        
    }
}
