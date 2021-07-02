/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
si vacio
    inicio=nuevo
sino
nuevo=nuevo(x)
nuevo siguiente=inicio
inicio =nuevo
fin si.
*/

package lista;


import lista.Nodo;
import java.util.Scanner;

public class Clista {
    //atributos
  protected Nodo Inicio;  
  
  //metodos
 //constructor
  Clista(){
      Inicio=null;
  }
  

  public void Recorrer (){
      
    Nodo aux = Inicio;
    while(aux!=null){
        System.out.println(aux.DarDato());
        aux=aux.DarSig();
    }
  }
  
  public Nodo ultimonodo (){
      
    Nodo aux = Inicio;
    Nodo aux2 = null;
    while(aux!=null){
       aux2=aux;
        aux=aux.DarSig();
    }
    return aux2;
  }
   
  public void lineal (int num){
      
    Nodo aux = Inicio;
    int contador=1;
    boolean encontrar=false;
    
    while(aux!=null){
       if (aux.DarDato()==num){
           
          System.out.println("El dato se encuentra en la posición: "+contador);
          encontrar=true;
       }
        aux=aux.DarSig();
        contador++;
    }
    if (encontrar==false)
    {
        System.out.println("No se encontro ninguna coincidencia");
    }
  }
  
 

  
  public void IngresoFin(int pDato)
     {
         if(Inicio==null)
         {
             Inicio= new Nodo(pDato);
         }
         else
         {
             Nodo tem=Inicio;
             while(tem.sigue())
             {
                tem=tem.DarSig();
             }
             tem.setSig(new Nodo(pDato));
         }
     }
  
   
   public Nodo  EliminarInicio(){
        if (Inicio!=null){
            Nodo aux = Inicio; 
            Inicio = Inicio.DarSig();            
            return aux;
        }
        else {
            return null;
        }
    }

   
}