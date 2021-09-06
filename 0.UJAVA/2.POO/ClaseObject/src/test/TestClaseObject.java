/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Empleado;

/**
 *
 * @author ferajset
 */
public class TestClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if (empleado1 == empleado2) {
            System.out.println("Los objetos tiene la misma referencia");
        } else {
            System.out.println("Los objetos tienen distinta referencia en memoria");
        }

        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido, Comparado con Equals");
        } else {
            System.out.println("Los objetos son distintos en contenido, Comparado con Equals");
        }
        
        if(empleado1.hashCode()==empleado2.hashCode()){
            System.out.println("El HashCode es el mismo");
        }
        else{
            System.out.println("El HashCode es distinto");
        }
    }
}
