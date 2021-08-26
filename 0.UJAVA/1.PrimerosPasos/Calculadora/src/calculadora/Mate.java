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
public class Mate {
    public static double PI=3.1416;
    public static double e=2.202;
    
    public static int absoluto(int a)
    {
        if (a<0)
        {
            a=a-a;
        }
        
        return a;
    }
    
    public static double suma(double a, double b)
    {
        double r=a+b;
        return r;
    }
    
}
