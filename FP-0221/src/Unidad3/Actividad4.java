package Unidad3;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matrizAdivinarPalabra = {{'a', 'z', 'u', 'l'},
        {'a', 'm', 'a', 'r', 'i', 'l', 'l', 'o'},
        {'b', 'l', 'a', 'n', 'c', 'o'},
        {'n', 'e', 'g', 'r', 'o'},
        {'r', 'o', 'j', 'o'}};

        int iOportunidades = 4, iSeguirJugando = 0, iSabesLaPalabra = 0, iLetras = 0;
        String sPalabra = "";

        do {

            int r = (int) (Math.random() * 4);
            char[] adivina = matrizAdivinarPalabra[r];
            int iTamanio = adivina.length;
            for (int i = 0; i < iTamanio; i++) {
                System.out.print("[ ] ");
            }
            System.out.println("\n¿Sabes la palabra?: \n1.Si  0.No");
            iSabesLaPalabra = sc.nextInt();

            switch (iSabesLaPalabra) {
                case 1:
                    System.out.print("Escribe la palabra: ");
                    sPalabra = sc.next();
                    if (Arrays.equals(adivina, sPalabra.toCharArray())) {
                        System.out.println("Ganaste");
                    } else {
                        System.out.println("Perdiste");
                        break;
                    }
                    break;

                case 0:
                    char p[] = new char[iTamanio];
                    do {
                        System.out.println(Arrays.toString(p));

                        System.out.print("¿Qué letra quieres buscar?: ");
                        char cLetra = sc.next().charAt(0);

                        boolean bBandera = true;
                        for (int i = 0; i < iTamanio; i++) {
                            if (cLetra == (adivina[i])) {
                                p[i] = cLetra;
                                iLetras++;
                                bBandera = false;
                                // Hemos encontrado la letra
                            }
                        }

                        if (bBandera) {
                            // No hemos encontrado la letra
                            System.out.println("\n Esa letra no existe");
                            iOportunidades--;
                            System.out.println("Te quedan " + (iOportunidades) + " oportunidades");

                        }

                    } while (iOportunidades > 0 && iTamanio > iLetras);

                    System.out.println(Arrays.toString(adivina));

                    if (iOportunidades == 0) {
                        System.out.println("Perdiste");
                    } else {
                        System.out.println("Ganaste");
                    }
            }

            System.out.println("¿Quiéres seguir jugando? \n1.Si   0.No");
            iSeguirJugando = sc.nextInt();
        } while (iSeguirJugando > 0);
    }
}

/*
Juego del ahorcado

Descripción: 
Utilizando un arreglo bidimensional, implementar una versión en consola del juego del ahorcado.

Implementación:
Implemente una matriz, donde cada fila corresponde con una palabra, y cada columna, representa un carácter. Utilice al menos 5 palabras. Ejemplo de la matriz (con dos palabras):
[‘g’][‘a’][‘t’][‘o’]
[‘m’][‘a’][‘p’][‘a’]
De manera aleatoria, cuando el juego comience, deberá seleccionar una de sus palabras, y mostrar el usuario corchetes vacíos para cada letra que la compone.
El programa eligió la palabra “gato”, se muestra al usuario: [  ][  ][  ][  ]
El usuario tiene 4 oportunidades para adivinar la palabra, si no pierde. Se le pregunta en orden:
Si sabe la palabra (usted elige como filtrar: Si, No, 1, 0, Y, N, etc:
Si dice SI, tiene que escribirla, y el programa debe comparar con la palabra existente, si es igual, el usuario gana, si no, pierde.
Si elige NO, se le pregunta que letra quiere buscar.
Si la letra existe, mostrarías: El usuario eligió ‘a’ - > [  ][ a ][  ][  ]
Aquí no pierde ninguna oportunidad.
Si no existe, pierde una oportunidad (se le notifica que no existe, y cuantas oportunidades le quedan).
Se repite desde si quiere adivinar la palabra.
En cada repetición se vuelve a imprimir lo que el usuario lleva de avance y los turnos que le quedan disponibles.
Repetir hasta que adivine, agote los turnos, o simplemente letra por letra encuentre la palabra.
Preguntar si quiere repetir el juego.

 */
