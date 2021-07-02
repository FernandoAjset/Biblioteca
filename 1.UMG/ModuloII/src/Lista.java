/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 187506-EDGARFERNANDO
 */
public class Lista {
    
  Nodo inicio; 

   

  public void IngresarInicio(int pDato){

    if (inicio==null){

      inicio = new Nodo(pDato); 

    }

    else{

      Nodo nuevo = new Nodo(pDato); 

      nuevo.SetSig(inicio);

      inicio = nuevo;                  

    }

  }   

  public void IngresarFinal(int pDato){

    if(inicio == null){

      inicio = new Nodo(pDato);       

    }

    else {

      Nodo nuevo = new Nodo(pDato); 

      DarUltimo().SetSig(nuevo);

    }//fin if

  }

   



  public Nodo DarUltimo(){

    Nodo aux = inicio; 

    while(aux.DarSig()!= null){

      aux = aux.DarSig(); 

    }

    return aux; 

  }

      

  public void Recorrer(){

    Nodo aux = inicio; 

    while(aux!=null){

      System.out.println(aux.DarDato()); 

      aux = aux.DarSig();       

    }

  }   

  public static void main(String args[]){

    Lista l1 = new Lista(); 

    l1.IngresarFinal(3);

    l1.IngresarFinal(2);

    l1.IngresarFinal(1); 
   // System.out.println("Eliminado: " + 11.EliminarInicio().DarDato());
    l1.Recorrer();

  }   
    
}
