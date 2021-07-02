/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Brizeth Alvarado
 */
public class Cola extends Clista {
        public void Apilar(int pDato){
        IngresoFin(pDato); 
    }
    
    public Nodo Desapilar(){
        return EliminarInicio();
    }
    
public static void main(String args[]){
        Cola c1 = new Cola(); 
        c1.Apilar(1);
        c1.Apilar(2);
        c1.Apilar(3);
        c1.Apilar(10);
        c1.Apilar(15);
        
        
        System.out.println("Saliendo de Cola: " + c1.Desapilar().DarDato());
        System.out.println("Saliendo de Cola: " + c1.Desapilar().DarDato());  
        System.out.println("Saliendo de Cola: " + c1.Desapilar().DarDato()+"\n"); 
        System.out.println("Restantes en Cola:");c1.Recorrer();
        
    }
}
