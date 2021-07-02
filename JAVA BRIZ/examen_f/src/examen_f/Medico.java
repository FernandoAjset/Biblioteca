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
public class Medico extends Profesiones{
    String Especialidad;
    String hospital;
    
Medico(){
    super();
    Especialidad="";
    hospital="";
}
public void sanar(){
    System.out.println("Le gusta decirle a sus pacientes Sana, sana colita de rana");
}

}
