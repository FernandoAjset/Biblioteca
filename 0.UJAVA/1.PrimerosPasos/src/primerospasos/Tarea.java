/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Scanner;

/**
 *
 * @author Brizeth
 */
public class Tarea {
    public static void main(String args[])
    {
       Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el titulo: ");
        var titulo=consola.nextLine();
        System.out.println("Proporciona el autor");
        var autor=consola.nextLine();
        System.out.println(titulo+" fue escrito por " + autor);
    }
}
