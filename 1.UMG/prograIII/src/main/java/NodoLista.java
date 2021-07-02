/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
public class NodoLista {
     String dato; 
     NodoLista sig;      
     public NodoLista(String pDato){
         sig = null; 
         dato = pDato;          
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
