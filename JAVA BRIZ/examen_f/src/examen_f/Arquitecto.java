/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_f;

/**
 *
 * @author ferna
 */
public class Arquitecto extends Profesiones{
    String proyecto;
    String constructora;
 
    Arquitecto(){
        super();
        proyecto="";
        constructora="";
    }
    
public void construir(){
    System.out.println("Canta todo el día: Booob contruye......");
}
    
}
