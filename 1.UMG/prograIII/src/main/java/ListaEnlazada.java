/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
public class ListaEnlazada {
       protected NodoLista inicio; 
    
    public void IngresarInicio(String pDato){
        if (inicio==null){
            inicio = new NodoLista(pDato); 
        }
        else{
            NodoLista nuevo = new NodoLista(pDato); 
            nuevo.SetSig(inicio);
            inicio = nuevo;                                   
        }
    }    
    public void IngresarFinal(String pDato){
        if(inicio == null){
            inicio = new NodoLista(pDato);             
        }
        else {
            NodoLista nuevo = new NodoLista(pDato); 
            DarUltimo().SetSig(nuevo);
        }//fin if
    }
    
      
    public NodoLista DarUltimo(){
        NodoLista aux = inicio; 
        while(aux.DarSig()!= null){
            aux = aux.DarSig(); 
        }
        return aux; 
    }
          
    public void Recorrer(){
        NodoLista aux = inicio; 
        while(aux!=null){
            System.out.println(aux.DarDato()); 
            aux = aux.DarSig();             
        }
    }    
    
    public NodoLista EliminarInicio(){
        NodoLista aux = inicio; 
        inicio = aux.DarSig(); 
        return aux; 
    }
    
    public boolean Existe(String dato) {
        NodoLista aux = inicio;
        boolean respuesta=false;
        while (aux != null) {
            if (aux.DarDato().equalsIgnoreCase(dato)!=false) {
                respuesta=true;
            }
            aux= aux.DarSig();
        }
        return respuesta;
        }

  
     
    public static void main(String args[]){
        ListaEnlazada l1 = new ListaEnlazada(); 
        l1.IngresarFinal("Samuel");
        l1.IngresarFinal("Kevin");
        l1.IngresarFinal("Luis"); 
//        l1.Recorrer();
//        System.out.println("Eliminado: " + l1.EliminarInicio().DarDato()); 
//        l1.Recorrer();
        
        System.out.println(l1.Existe("SAmuel"));
    }  
}
