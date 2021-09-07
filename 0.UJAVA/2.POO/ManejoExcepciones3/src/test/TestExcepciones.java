package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

/**
 *
 * @author ferna
 */
public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = Aritmetica.division(5, 0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception: ");
            e.printStackTrace(System.out); //muestra todas las excepciones, en forma de pila
            System.out.println(e.getMessage()); //muestra mensaje sin la pila de excepciones
        } finally { //siempre se va a ejecutar, aunque ocurra una excepcion 
            System.out.println("se realizo la division entre cero");
        }
    }
}
