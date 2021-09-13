package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Mierrcoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

//        System.out.println("Usando for each");
//        //ciclo for each
//        for (Object elemento : miLista) {
//            System.out.println("elemento = " + elemento);
//        }
//        
//        
//        System.out.println("\n"+"Usando funcion lamda");
//        //funcion lamda o flecha
//        miLista.forEach(elemento -> {
//            
//            System.out.println("elemento = " + elemento);
//        });
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes"); // con la API "SET" no se pueden duplicar elementos

//        System.out.println("\n"+"Imprimiendo SET"); //no mantiene el orden
//        imprimir(miSet);
//        System.out.println("\n"+"Imprimir LIST"); //mantiene el orden
//        imprimir(miLista);
        Map<String, String> miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3","Carlos"); //si se duplica un valor, se sustituye y se ingresa el ultimo al mapa
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
