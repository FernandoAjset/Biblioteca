package test;

import aritmetica.Aritmetica;

/**
 *
 * @author ferna
 */
public class TestExcepciones {

    public static void main(String[] args) {
        int resultado=0;
        try {
            resultado = Aritmetica.division(5, 0);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: ");
            e.printStackTrace(System.out); //muestra todas las excepciones, en forma de pila
            System.out.println(e.getMessage()); //muestra mensaje sin la pila de excepciones
        }
        System.out.println("resultado = " + resultado);
    }
}
