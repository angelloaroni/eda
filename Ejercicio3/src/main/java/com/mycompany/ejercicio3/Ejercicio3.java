/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author N04637
 */
import tda_array.TDA_arreglo;
public class Ejercicio3 {

    public static void main(String[] args) {
        TDA_arreglo arregloA = new TDA_arreglo();
        TDA_arreglo arregloB = arregloA;
        arregloA.agregar(4);
        arregloA.agregar(23);
        arregloA.agregar(67);
        arregloA.agregar(12);
        
        arregloB.agregar(-1);
        arregloB.agregar(-2);
        arregloB.agregar(-3);
        arregloB.agregar(-4);
        
        //esto da como resutlado 1
        System.out.println("Comparando arreglos: " + arregloA.comparar(arregloB));
    }
}
