package PrácticasExamen1;

import java.util.Scanner;

public class Práctica2Examen1 {

    public static void main(String[] args) {
        int valor = 0, sm = 0;
        System.out.println("Elija producto: ");
        Scanner sc = new Scanner(System.in);
        String tipo = sc.next();
        switch (tipo) {
            case "A":
                valor = 270;
                break;

            case "B":
                valor = 340;
                break;

            case "C":
                valor = 390;
                break;
        }

        System.out.println("Ingrese monedas: ");
        while (sm < valor) {
            int moneda = sc.nextInt();
            sm += moneda;

            if (sm >= valor) {
                int vuelto = sm - valor;
                System.out.println("Su vuelto: ");
                while (vuelto != 0) {
                    if (vuelto >= 100) {
                        System.out.println(100);
                        vuelto -= 100;
                    }
                    if (vuelto >= 50) {
                        System.out.println(50);
                        vuelto -= 50;
                    }
                    if (vuelto >= 10) {
                        System.out.println(10);
                        vuelto -= 10;
                    }
                }
            }
        }
    }
}

/*
Una máquina de alimentos tiene productos de tres tipos, A, B y C, 
que valen respectivamente $270, $340 y $390. 
La máquina acepta y da de cambio monedas de $10, $50 y $100.
 */
