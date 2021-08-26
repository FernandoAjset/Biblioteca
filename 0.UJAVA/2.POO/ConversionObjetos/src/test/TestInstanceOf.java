package test;

import domain.Empleado;
import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "IT");
        determinarTipo(empleado);

    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es te dipo Gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }

}
