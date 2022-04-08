package A4;

import java.util.Scanner;

public class PirámideDeNúmeros {

    public void pirámide(int n) {
        int altura = 1;
        int i = 0;
        int espacio = n - 1;

        while (altura <= n) {

            // Inserta espacio
            for (i = 1; i <= espacio; i++) {
                System.out.print(" ");
            }

            // Pinta la línea de números
            for (i = 1; i < altura; i++) {
                System.out.print(i);
            }

            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }

            System.out.println();

            altura++;
            espacio--;
        } // mientras
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide");
        int n = sc.nextInt();
        PirámideDeNúmeros p = new PirámideDeNúmeros();
        p.pirámide(n);
    }
}   
    /* 
    1
   121
  12321
 1234321
123454321
    */

// Dibujando una pirámide = Pirámides egipcias