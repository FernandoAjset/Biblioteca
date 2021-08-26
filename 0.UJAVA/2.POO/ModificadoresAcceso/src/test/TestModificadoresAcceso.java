
package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("publico");
//        System.out.println("clase1 = " + clase1.atributopublico);
//        clase1.metodoPublico();
        ClaseHija claseHija = new ClaseHija();
        System.out.println("ClaseHija = "+claseHija);
    }
}
