package listas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Ajset
 */
    public class Cola extends Lista {
        public void IngCola(int pDato){
            IngresarFinal(pDato); 
        }

       public Nodo SalirCola(){
            return EliminarInicio();
        }

       public static void main(String args[]){
            Cola c1 = new Cola(); 
            c1.IngCola(1);
            c1.IngCola(2);
            c1.IngCola(3);

            System.out.println("Datos en Cola: ");
            c1.Recorrer();

            System.out.println("\nSalio de la Cola: " + c1.SalirCola().DarDato());
            System.out.println("Salio de la Cola: " + c1.SalirCola().DarDato());

            System.out.println("\nDatos Restantes en Cola: ");
            c1.Recorrer();
        }
    }
