package Unidad3;

import java.util.Scanner;
import java.util.Arrays;

public class Actividad3 {

    public static void main(String[] args) {
        int temporal = 0;
        int[] numeros = new int[15];
        System.out.println("Ingresa los valores de tu arreglo: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt(); // Ingresa los valores del arreglo
        }
        // Método de ordenamiento de burbuja (Bubble sort).
        // Este método revisa y arregla el orden de cada elemento del arreglo comparándolo con el siguiente.
        // El proceso se repite varias veces hasta que se hayan verificado todos los elementos, ya no sean necesarios más cambios y el arreglo se encuentre ordenado.
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 1; j < (numeros.length - i); j++) {
                if (numeros[j - 1] > numeros[j]) {
                    temporal = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = temporal;
                }
            }
        }
        System.out.println(Arrays.toString(numeros)); // Imprime el arreglo
    }
}

/*
Insertar valores en arreglo
Agregar valores a un arreglo, en el orden que les corresponde.
Generar un arreglo de tamaño 15.
Solicitar los valores al usuario desde el teclado.
Los valores deben insertarse en la posición correcta. Ejemplo:
Valor del usuario -> 5, arreglo -> [5]
Valor del usuario -> 7, arreglo -> [5] [7]
Valor del usuario -> 3, arreglo -> [3] [5] [7]
*/
