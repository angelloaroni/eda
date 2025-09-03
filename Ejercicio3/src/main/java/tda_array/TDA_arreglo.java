/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda_array;

/**
 *
 * @author ProfO2803
 */
public class TDA_arreglo {

    private int[] array;
    private int n; //Cantidad de elementos registrados en el arreglo
    private static final int MAX = 100;

    public TDA_arreglo() {
        n = 0;
        array = new int[MAX];
    }

    public void agregar(int item) {
        if (n < MAX) {
            this.array[n] = item;
            n++;
        } else {
            System.out.println("No hay espacio para agregar el elemento.");
        }
    }

    public void insertar(int item, int pos) {
        if (n < MAX) {
            if (pos >= 0 && pos <= n) {
                for (int i = n; i > pos; i--) {
                    array[i] = array[i - 1];
                }
                array[pos] = item;
                n++;
            } else {
                System.out.println("Posicion invalida");
            }
        } else {
            System.out.println("No hay espacio para agregar el elemento.");
        }
    }
    
    public void mostrar() {
        String cadena = "[";
        for (int i = 0; i < n; i++) {
            cadena += array[i];
            if (i == n - 1) {
                cadena += "]";
            } else {
                cadena += ",";
            }
        }
        System.out.println(cadena);
    }
    
    public int obtenerElemento(int buscado){
        for (int i = 0; i<n; i++){
            if (buscado == array[i]){
                return i;   
            } 
        } 
        return -1;
    }
    
    public void eliminarElemento(int item){
        if (obtenerElemento(item) != -1){
            for (int i = obtenerElemento(item); i< n-1; i++){
                array[i] = array[i+1];
            }
            n--;
            System.out.println("El elemento solicitado fue elimiando del arreglo");
        } else {
            System.out.println("El elemento solicitado no existe en el arreglo");
        }
    }   
    
    public int eliminarPorPos(int indice) {
    if (indice >= 0 && indice < n) {
        int elementoEliminado = array[indice];
        for (int i = indice; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        n--;
        return elementoEliminado;
    } else {
        System.out.println("Índice invalido.");
        return -1;
    }
}
    public int getNumerosPares(){
        int contador = 0;
        for (int i = 0; i<n; i++){
            if (array[i] %2 == 0){
                contador++;
            }
        }
        return contador;
    }
    
    public int getNumeroMaximo(){
        int max = array[0];
        for (int i = 0; i<n; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    
    public int getNumeroMin(){
        int min = getNumeroMaximo();
        for (int i = 0; i<n; i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    
    public int comparar(TDA_arreglo arregloB){
        boolean son_iguales = true;
        boolean son_menores = true;
        boolean son_mayores = true;
        
        if (this.n == arregloB.getN()){
            for (int i = 0; i<this.n; i++){
                if (this.array[i] != arregloB.array[i]){
                    son_iguales = false;
                } 
                if (this.array[i] > arregloB.array[i]){
                    son_menores = false;
                }
                if (this.array[i] > arregloB.array[i]){
                    son_mayores = false;
                }
                
            }
            if (son_iguales){
                return 1;
            } else if (son_mayores) {
                return 2;
            } else if (son_mayores){
                return 3;
            }
        } else{
            System.out.println("Los arreglos deben ser del mismo tamaño");
                return 0;

        }
        
        return 0;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}