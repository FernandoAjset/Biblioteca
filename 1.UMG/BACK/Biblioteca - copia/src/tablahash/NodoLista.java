
package tablahash;

import arbol.ArbolBinario;

public class NodoLista {
      public String nombre;
      public ArbolBinario claves; 

   public NodoLista sig;    

   public NodoLista(String nombre, ArbolBinario claves){

     sig = null; 

     this.nombre=nombre; 
     this.claves=claves;

   }   

   public String DarNombre(){

     return nombre;
   }   
   
   public ArbolBinario DarClaves(){

     return claves;
   }

   public NodoLista DarSig(){

     return sig;     

   }   

   public void SetNombre(String nombre){

     this.nombre=nombre; 

   }   
   
    public void SetClaves(ArbolBinario claves){

     this.claves=claves;

   }
   public void SetSig(NodoLista pSig){

     sig = pSig; 

   }    
}
