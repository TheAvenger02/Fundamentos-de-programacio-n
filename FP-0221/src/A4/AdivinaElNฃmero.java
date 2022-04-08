package A4;

import java.util.Scanner;

public class AdivinaElNúmero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de sistemas! Piensa un número entre 0 y 100, e intentaré adivinarlo");
        System.out.println("Deberás ingresar > si es mayor, < si es menor e = si lo adiviné");
        String opción = "";
        int min = 0, max = 100;
        // (Math.random() * (max-min) + 1) + min

        do {
            int número = (int) (Math.random() * (max - min) + 1) + min;
            System.out.println("Se me ocurre que es: " + número);
            opción = sc.next();
            if (opción.equals(">")) {
                min = número;
            }
            if (opción.equals("<")) {
                max = número;
            }

        } while (!opción.equals("="));
        System.out.println("¡Lo he adivinado, gracias por jugar conmigo!");
    }
}