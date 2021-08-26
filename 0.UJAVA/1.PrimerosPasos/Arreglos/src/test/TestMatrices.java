package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;

//        for (int ren = 0; ren < edades.length; ren++) {
//            for (int columnas = 0; columnas < edades[ren].length; columnas++) {
//                System.out.println("edades [" + ren + "]" + "[" + columnas + "] = " + edades[ren][columnas]);
//            }
//        }

    String frutas[][]={{"Naranja","Limon"},{"Fresa","Zarzamora"},{"Mora"}};
//    
//          for (int ren = 0; ren < frutas.length; ren++) {
//            for (int columnas = 0; columnas < frutas[ren].length; columnas++) {
//                System.out.println("frutas [" + ren + "]" + "[" + columnas + "] = " + frutas[ren][columnas]);
//            }
//        }
    
    Persona personas[][]= new Persona[2][3];
    personas[0][0]=new Persona("Juan");
    personas[0][1]=new Persona("Karla"); 
    
    imprimir(frutas);
    imprimir(personas);
    
    
    }
    
    public static void imprimir(Object matriz[][]){ //METODO QUE IMPRIME VALORES DE CUALQUIER MATRIZ SIN IMPORTAR TIPO
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int columnas = 0; columnas < matriz[ren].length; columnas++) {
                System.out.println("matriz [" + ren + "]" + "[" + columnas + "] = " + matriz[ren][columnas]);
            }
        }
        
        
    }
    
}
