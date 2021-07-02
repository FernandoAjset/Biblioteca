package arbol;

public class ListaArbol {
    
  NodoArbol inicio; 

   

  public void IngresarInicio(String pDato){

    if (inicio==null){

      inicio = new NodoArbol(pDato); 

    }

    else{

      NodoArbol nuevo = new NodoArbol(pDato); 

      nuevo.SetSig(inicio);

      inicio = nuevo;                  

    }

  }   

  public void IngresarFinal(String pDato){

    if(inicio == null){

      inicio = new NodoArbol(pDato);       

    }

    else {

      NodoArbol nuevo = new NodoArbol(pDato); 

      DarUltimo().SetSig(nuevo);

    }//fin if

  }

  public NodoArbol DarUltimo(){

    NodoArbol aux = inicio; 

    while(aux.DarSig()!= null){

      aux = aux.DarSig(); 

    }

    return aux; 

  }

  public void Recorrer(){

    NodoArbol aux = inicio; 

    while(aux!=null){

      System.out.println(aux.DarDato()); 

      aux = aux.DarSig();       

    }

  }

  public static void main(String args[]){

    ListaArbol l1 = new ListaArbol(); 

    l1.IngresarFinal("Biblia");
    l1.IngresarFinal("Jesus");
    l1.IngresarFinal("Apostol"); 
    l1.IngresarFinal("Maria"); 
   // System.out.println("Eliminado: " + 11.EliminarInicio().DarDato());
    l1.Recorrer();

  }   
    
}
