package arbolBinario;

/**
 *
 * @author balvarado
 */
public class Lista {
    
  Nodo inicio; 


  public void IngresarFinal(String pDato){

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

   // System.out.println("Eliminado: " + 11.EliminarInicio().DarDato());
    l1.Recorrer();

  }   
    
}
