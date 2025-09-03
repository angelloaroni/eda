/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author N04637
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingresa un número: ");
        Scanner scn = new Scanner(System.in);
        
        int numero = scn.nextInt();
        int raiz = calcularRaizDigital(numero);
        System.out.println("La raiz digital es: " + raiz);
        
    }
    
    public static int calcularRaizDigital(int numero){
       while (numero >=  10){
           numero = sumarDigitos(numero);
       }
       return numero;
    }
    
    public static int sumarDigitos(int numero){
        int suma = 0;
        while(numero > 0 ){
            suma = suma + numero % 10;
            numero = numero / 10;
        }
        return suma;
    }
    
}
