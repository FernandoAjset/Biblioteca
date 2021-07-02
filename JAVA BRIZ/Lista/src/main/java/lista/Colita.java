/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Brizeth Alvarado
 */
public class Colita extends Clista {
    
Colita(){

}

public static void main(String args[]){
    Colita primera=new Colita();
    primera.IngresoFin(1);
     primera.IngresoFin(2);
      primera.IngresoFin(3);
    
    primera.Recorrer();
    System.out.println("Se eliminó de la cola:  "+primera.Inicio.DarDato());
    primera.EliminarInicio();
    primera.Recorrer();
}

}
