/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author fernando
 */
public class Reloj {

    //atributo: 
    protected String hora; 
    
    //Método constructor: 
    public Reloj(){
        hora = "16:51"; 
    }
    
    //Método constructor 2: 
    public Reloj(String pHora){
        hora = pHora; 
    }
    
    //Método (función) getter
    public String DarHora(){
        return hora;        
    }
    
    //Método (procedimiento) setter
    public void SetHora(String pHora){
        hora = pHora; 
    }
    
    public static void main(String args[]){
        Reloj r1 = new Reloj(); 
        Reloj r2 = new Reloj("16:52"); 
        Reloj r3 = new Reloj("16:53");
        r1.SetHora("17:16");
        
        System.out.println(r1.DarHora()); 
        System.out.println(r2.DarHora());
        System.out.println(r3.DarHora());
    }
    
    
}
