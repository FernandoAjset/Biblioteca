/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_f;

/**
 *
 * @author Fernando Ajset
 */
public class Examen_f {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Ingeniero Juan=new Ingeniero();
      Arquitecto Ana=new Arquitecto();
      Medico Saul=new Medico();
    
    Juan.Colegiado=231;
    System.out.println("colegiado de Juan: "+Juan.Colegiado);
    Juan.dormir();

    Ana.proyecto="Pradera";
    System.out.println("Proyecto de Ana: "+Ana.proyecto );
    Ana.construir();
    Ana.dormir();
    
    Saul.hospital="San Genaro";
    System.out.println("Saul trabaja en el Hospital; "+Saul.hospital);
    Saul.sanar();
    Saul.dormir();
    }
    
    
}
