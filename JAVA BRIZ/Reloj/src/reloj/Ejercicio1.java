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
public class Ejercicio1 {
  private int x;
private int y;
protected Ejercicio1(int px, int py){
x=px;
y=py;
}
public int getx(){
return x;
}
public int gety(){
return y;
}
public void setx(int px){
x=px;
}
public void sety(int py){
x=py;
}
public int resultado(){
int cuadrante=0;
if((x>0)&&(y>0)){
return 1;
}
else if((x>0)&&(y<0))
{
return 4;
}
if((x<0)&&(y>0)){
return 2;
}
else if((x<0)&&(y<0))
{
return 3;}
return cuadrante;
}
public static void main(String args[]){
Ejercicio1 punto1= new Ejercicio1(-3,1);
if(punto1.resultado()==0){
System.out.println("El punto esta sobre un eje.");
}
else{
System.out.println("El punto 1 se encuentra sobre el cuadrante "+punto1.resultado());
}
}  
}
