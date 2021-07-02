/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Ajset
 */
public class Matrices {
        
    int matriz[][] = new int[3][3];
    
    public void ingresar(int dato, int i, int j)
    {
        matriz[i][j]=dato;
    }
    
     public String DarMatriz()
     {
         String contenido = new String();
         int aux[][]=matriz;
         for (int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[x].length; y++){
                contenido+=String.valueOf(aux[x][y]+"    ");
            }
            contenido+=("\n");
         }
         return contenido;
     }
    
        public static void main(String args[]){
        int matriz[][] = new int[3][3];
        
        matriz[0][0] = 1; //esquina superior izquierda
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;//esquina inferior derecha 
        
        int matriz2[][] = {{1,2,3},{4,5,6},{7,8,9}};       
        System.out.println("Recorriendo matriz 1");
        for (int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[x].length; y++){
                System.out.print(matriz[x][y]);
            }
        }
        System.out.println("Recorriendo matriz 2");
        for (int x=0; x<matriz2.length; x++){
            for(int y=0; y<matriz2[x].length; y++){
                System.out.println(matriz2[x][y]);
            }
        }       
    }    
}
   