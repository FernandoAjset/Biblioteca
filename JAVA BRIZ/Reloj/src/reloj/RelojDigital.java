package reloj;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class RelojDigital extends Reloj{
    
    private String fecha; 
    public RelojDigital(){
        super(); 
        fecha = "25/07/2020";
    }
    
    public RelojDigital(String pHora, String pFecha){
        super(pHora);
        fecha = pFecha; 
    }
    
    public String DarFecha(){
        return fecha; 
    }
    
    public void SetFecha(String pFecha){
        fecha = pFecha; 
    }
        
    public static void main(String args[]){
        RelojDigital rd1 = new RelojDigital(); 
        System.out.println("Reloj digital hora: " + rd1.DarHora()+" y fecha: " + rd1.DarFecha()); 
        System.out.println("Reloj normal: " + ((Reloj)rd1).DarHora());         
    }
    
}
