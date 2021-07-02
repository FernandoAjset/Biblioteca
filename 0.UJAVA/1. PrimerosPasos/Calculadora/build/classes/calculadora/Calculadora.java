/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author fernando
 */
public class Calculadora {

    private double a, b;
    
    protected Calculadora (double n1, double n2){
       a=n1;
       b=n2;
    }
    
    public double suma(double n1,double n2){
        double r=0;
        r=a+b;
        return r;
    }
    
    public double resta(double n1,double n2){
        double r=0;
        r=a-b;
        return r;
    }
    
    public double multiplicar(double n1,double n2){
        double r=0;
        r=a*b;
        return r;
    }
    
    public double dividir(double n1,double n2){
        double r=0;
        r=a/b;
        return r;
    }
    
   
}
