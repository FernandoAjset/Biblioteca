/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class PrimerosPasos {

    public static void main(String[] args) {
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b"+nombre);
        System.out.println("Comilla simple: \'"+nombre+"\'");
        System.out.println("Comilla doble: \""+nombre+"\"");
        System.out.println("Escribe nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario=consola.nextLine();
        System.out.println("usuario = " + usuario);
    }
}
