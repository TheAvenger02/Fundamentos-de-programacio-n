package Unidad3;

import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[15]; // Generamos un arreglo de tamaño 15.

        int indice = 0; //Posición del arreglo en la que se va a ingresar el número 

        while (indice < arreglo.length) {
            // Pedimos un número
            System.out.print("Ingrese número: ");
            int numero = sc.nextInt();
            // Comprobar que el número no exista en las posiciones anteriores hasta la posición inicial del índice.
			 
            boolean aceptado = true; //Si el número está repetido es false
            //Comprobar si está repetido
            for (int i = 0; i < indice; i++) {
                if (arreglo[i] == numero) {
                    aceptado = false;
                    //Se informa al usuario que el valor ingresado ya existe y debe ingresar un nuevo valor.
                    System.out.println("El número ya existe");
                }
            }
            if (aceptado) { // Se aceptada el número porque NO existe.
                arreglo[indice] = numero; // Se guarda en la posición que diga el "indice"
                indice++;
            }
        }
        sc.close(); // Cerramos el Scanner y mostramos el arreglo final
        System.out.println("\nTu arreglo es:");
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
    }

}

/*
Capturar valores únicos
Capturar valores en el arreglo SIN REPETIR.
Generar un arreglo de tamaño 15.
Solicitar valores al usuario.
Si el valor ya existe, volver a solicitar un nuevo valor al usuario, hasta que se llene el arreglo.
Imprimir el arreglo: Ejemplo: [1, 2, 10, 11, 8, 5, 7, 9, 20, 6, 14, 12]
 */
