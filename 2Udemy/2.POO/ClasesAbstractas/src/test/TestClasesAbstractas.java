/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

/**
 *
 * @author ferajset
 */
public class TestClasesAbstractas {

    public static void main(String[] args) {

        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
