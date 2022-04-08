package Unidad3;

import java.util.Random;
import java.util.Scanner;

public class A4 {

    public static void main(String[] args) {
        String palabraSecreta = getPalabraSecreta();
        char[] palabraGuiones = getGuionesDePalabra(palabraSecreta);
        boolean juegoTerminado = false;
        Scanner sc = new Scanner(System.in);
        int intentos = 4;

        do {
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.println(palabraGuiones);
            System.out.println("Introduce una letra: ");
            char letra = sc.next().charAt(0);
            
            boolean algunaLetraAcertada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraGuiones[i] = letra;
                    algunaLetraAcertada = true;
                }
            }
            if (!algunaLetraAcertada) {
                System.out.println("No has acertado ninguna letra");
                --intentos;
                if (intentos == 0) {
                    System.out.println("Has perdido porque agotaste los intentos");
                    juegoTerminado = true;
                }
            } else {
                boolean juegoGanado = !hayGuiones(palabraGuiones);
                if (juegoGanado) {
                    System.out.println("Has ganado el juego");
                     juegoTerminado = true;
                }
            }
        } while (!juegoTerminado);

        sc.close();

    }

    static boolean hayGuiones(char[] array) {
        for (char l : array) {
            if (l == '_') {
                return true;
            }
        }
        return false;
    }

    static String getPalabraSecreta() {
        String[] palabras = {"gato", "perro", "elefante", "rinoceronte", "cocodrilo"};
        Random r = new Random();
        int n = r.nextInt(palabras.length);

        return palabras[n];
    }

    static char[] getGuionesDePalabra(String palabra) {
        int nLetrasPalabraSecreta = palabra.length();

        char[] palabraGuiones = new char[nLetrasPalabraSecreta];

        for (int i = 0; i < palabraGuiones.length; i++) {
            palabraGuiones[i] = '_';
        }
        return palabraGuiones;
    }
}
