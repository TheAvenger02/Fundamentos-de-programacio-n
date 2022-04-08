package PrácticasExamen2;

import java.util.Scanner;

public class DosDados {

    public static void main(String[] args) {
        System.out.println("Ingrese su puntaje: ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if (p == 12 || p == 2) {
            System.out.println("Tu puntaje de " + p + " se logra con la siguiente combinación: ");
        } else if (p == 11 || p == 10 || p == 9 || p == 8 || p == 7 || p == 6 || p == 5 || p == 4 || p == 3) {
            System.out.println("Tu puntaje de " + p + " se logra con las siguientes combinaciones: ");
        }
        switch (p) {
            case 12 ->
                System.out.println("6+6");
            case 11 ->
                System.out.println("6+5 y 5+6");
            case 10 ->
                System.out.println("6+4, 5+5 y 4+6");
            case 9 ->
                System.out.println("6+3, 5+4, 4+5 y 3+6");
            case 8 ->
                System.out.println("6+2, 5+3, 4+4, 3+5 y 2+6");
            case 7 ->
                System.out.println("6+1, 5+2, 4+3, 3+4, 2+5 y 1+6");
            case 6 ->
                System.out.println("5+1, 4+2, 3+3, 2+4 y 1+5");
            case 5 ->
                System.out.println("4+1, 3+2, 2+3 y 1+4");
            case 4 ->
                System.out.println("3+1, 2+2 y 1+3");
            case 3 ->
                System.out.println("2+1 y 1+2");
            case 2 ->
                System.out.println("1+1");
            default ->
                System.out.println("Puntaje incorrecto.");
        }
    }
}
/* 2. Un jugador debe lanzar dos dados numerados de 1 a 6, 
y su puntaje es la suma de los valores obtenidos. 
Un puntaje dado puede ser obtenido con varias combinaciones posibles. 
Por ejemplo, el puntaje 4 se logra con las siguientes tres combinaciones: 
1+3, 2+2 y 3+1. 
Desplegar las combinaciones necesarias para obtener el puntaje ingresado.
 */