package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "/home/ferajset/Escritorio/prueba.txt";
//
////        crearArchivo(nombreArchivo);
////         escribirArchivo(nombreArchivo,"Hola desde java");
////          escribirArchivo(nombreArchivo, "Segundo mensaje desde java");
//        añadirArchivo(nombreArchivo, "Agregando segundo mensaje");

        leerArchivo(nombreArchivo);

    }
}
