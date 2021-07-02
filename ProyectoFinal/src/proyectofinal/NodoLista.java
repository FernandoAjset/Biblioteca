package proyectofinal;

import arbolBinario.Arbol;

/**
 *
 * @author balvarado
 */
public class NodoLista {
    String dato;
    Arbol palabras=new Arbol();
     NodoLista sig;      
     public NodoLista(String pDato, String palabras){
         sig = null; 
         dato = pDato;
         this.convertirArbol(palabras);
         
     }   
     
     public void convertirArbol(String palabras){
         String arregloPalabras[] = palabras.split(",");
            for (int i = 0; i < arregloPalabras.length; i++) {
                this.palabras.insertar(arregloPalabras[i]);
            } 
     }
     
     public String DarDato(){
         return dato;
     }     
     public NodoLista DarSig(){
         return sig;         
     }     
     public void SetDato(String pDato){
         dato = pDato; 
     }     
     public void SetSig(NodoLista pSig){
         sig = pSig; 
     }
    
}
