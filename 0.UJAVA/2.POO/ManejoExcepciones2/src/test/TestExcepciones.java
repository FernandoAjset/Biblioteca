package test;

import aritmetica.Aritmetica;

/**
 *
 * @author ferna
 */
public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        resultado = Aritmetica.division(5, 0);
        System.out.println("resultado = " + resultado);
    }
}
