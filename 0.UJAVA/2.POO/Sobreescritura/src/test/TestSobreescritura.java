
package test;

import domain.Empleado;
import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
       Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
         empleado = new Gerente("Karla",10000,"IT");
//        System.out.println("gerente = " + gerente.obtenerDetalles());

        imprimir(empleado);
    }
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
}
