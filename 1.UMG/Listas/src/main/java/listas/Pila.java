/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Fernando Ajset
 */
public class Pila extends Lista {

    public void Apilar(int pDato) {
        IngresarFinal(pDato);
    }

    public Nodo retirar() {
            
        if (Inicio != null) {
            Nodo aux = Inicio;
            while(aux.DarSig()!=null){
                Inicio = aux.DarSig();

            }
            return Inicio;
            }
        else{
            return null;
        }
    }

    public Nodo Cima() {
        Nodo aux = Inicio;
        if (aux != null) {
            while (aux.DarSig() != null) {
                aux = aux.DarSig();
            }
            return aux;
        } else {
            return null;
        }
    }

//    public void Cima(){
//        if (Inicio !=null){
//            System.out.println(Inicio.DarDato()); 
//        }
//        else{
//            System.out.println("Pila vacía"); 
//        }              
//    }
//    
    public static void main(String args[]) {
        Pila p1 = new Pila();
        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(8);
        p1.Apilar(4);
        p1.Apilar(20);

        System.out.println("Se desapilo: "+p1.retirar().DarDato());
        System.out.println("Se desapilo: "+p1.retirar().DarDato());
        if (p1.Cima() != null) {
            System.out.println("\nCima de la pila " + p1.Cima().DarDato());
        } else {
            System.out.println("\nPila Vacia");
        }
    }
}
