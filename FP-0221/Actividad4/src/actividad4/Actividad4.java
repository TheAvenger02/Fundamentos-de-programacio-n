package actividad4;

import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {
        /* Crea una aplicación que permita adivinar un número. 
        La aplicación genera un número aleatorio del 1 al 100. 
        A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido, a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). 
El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al límite de intentos te muestra el número que había generado. */

        Scanner sc = new Scanner(System.in);

        int númeroaleatorio = (int) ((Math.random() * 100) + 1); // Un número aleatorio del 1 al 100.
        int númerointroducido; // El número introducido por el usuario.
        int c = 0;
        System.out.println("Adivina adivinador, este juego consiste en que adivines el número en el que estoy pensando.");

        System.out.print("Tienes 10 intentos. Escribe un número entre 1 y 100: ");
        númerointroducido = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            // Se evalúa si el número aleatorio es el mismo número que el introducido.
            if (númeroaleatorio == númerointroducido) {
                System.out.println("Has acertado en " + (c + 1) + " intento(s).");
                break;
            } // Luego da la partida por perdida si ya has gastado 10 intentos.     
            else if (i == 10) {
                System.out.println("Lo siento: ¡has perdido!. El número era el: " + númeroaleatorio);
                break;
            } // Si no es ninguno de los casos anteriores, comparamos números.
            else if (númeroaleatorio > númerointroducido) {
                c++;
                System.out.println("El número es MAYOR que " + númerointroducido + " te quedan " + (10 - c) + " intento(s).");
            } else if (númeroaleatorio < númerointroducido) {
                c++;
                System.out.println("El número es MENOR que " + númerointroducido + " te quedan " + (10 - c) + " intento(s).");
            }
            // Por último un bucle if que sirve para decirte que introduzcas otro número, así como avisarte del último intento.

            if (i <= 8) {
                System.out.print("Introduce otro número: ");
                númerointroducido = sc.nextInt();
            } else if (i == 9) {
                System.out.print("Oh, oh... ÚLTIMO intento: ");
                númerointroducido = sc.nextInt();
            }
        }
    }
}
