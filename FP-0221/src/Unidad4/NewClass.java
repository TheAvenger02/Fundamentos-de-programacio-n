package Unidad4;

import java.util.Arrays;

public class NewClass {

    public static void main(String[] args) {
        int[] arreglo = new int[20];
        // int[] arreglo2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // arreglo[0] = 25;
        /* for(int i = 0; i < arreglo2.length; i++){
            System.out.println(arreglo2[i]);
        } */
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 50) + 50;
        }
        System.out.println(Arrays.toString(arreglo));

        int min = 110, max = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }
        // System.out.println("Max: "+max);
        // System.out.println("Mín: "+min);
        
        

        // System.out.println(Arrays.toString(arreglo2));
    }
}
