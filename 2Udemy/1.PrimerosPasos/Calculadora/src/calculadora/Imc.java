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
public class Imc {
    private double p, a;
    
    protected Imc(double peso, double altura)
    {
        p=peso;
        a=altura;
    }
    
    public double cp(double p)
    {
       double  r=p/2.20462;
       return r; 
    }
    public double ca(double a)
    {
       double  r=a/3.28084;
       return r; 
    }
    
    public double respuesta(double p, double a)
    {
        double r=p/(a*a);
        return r;
    }
    
 public static void main(String Args[])
 {
     double p=162.2, a=5.4;
     Imc imc1=new Imc (p,a);
     
     p=imc1.cp(p);
     a=imc1.ca(a);
     
     System.out.println("El IMC es: "+ imc1.respuesta(p,a));
 }
    
}
