/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Ajset
 */
public class Matriz 
{
     int matriz[][] = new int[3][3];
     public void pedir(int dat,int x, int y)
     {
         matriz[x][y]=dat;
     }
     
    public String mostrar(){
        
        String cadena = new String();
         int aux[][]=matriz;
         for (int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[x].length; y++){
                cadena+=String.valueOf(aux[x][y]+"  ");
            }
            cadena+=("\n");
         }
         return cadena;
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
        
        
        System.out.println("Recorriendo matriz 2");
        for (int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[x].length; y++){
                System.out.println(matriz[x][y]);
            }
        }       
    } 
}



