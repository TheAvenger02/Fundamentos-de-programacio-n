package ExamenFP;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        String sOperador = "";
        double dN1 = 0, dN2 = 0, dResultado = 0, dNuevoResultado = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar Número: ");
        dN1 = sc.nextDouble();

        System.out.println("Ingresar Operador: ");
        sOperador = sc.next();

        System.out.println("Ingresar Número: ");
        dN2 = sc.nextDouble();

        switch (sOperador) {
            case "+" -> dResultado = dN1 + dN2;
            case "-" -> dResultado = dN1 - dN2;
            case "*" -> dResultado = dN1 * dN2;
            case "/" -> dResultado = dN1 / dN2;
            default -> {
            }
        }

        System.out.println("Resultado = " + dResultado);
        
     do {

        System.out.println("Ingresar Operador: ");
        sOperador = sc.next();

        if(!sOperador.equals("C")){
        System.out.println("Ingresar Número: ");
        dN2 = sc.nextDouble();
        
        switch (sOperador) {
            case "+" -> dNuevoResultado = dResultado + dN2;
            case "-" -> dNuevoResultado = dResultado - dN2;
            case "*" -> dNuevoResultado = dResultado * dN2;
            case "/" -> dNuevoResultado = dResultado / dN2;
            case "C" -> dNuevoResultado = 0;
            default -> {
            }
        }
        System.out.println("Resultado = " + dNuevoResultado);
        dResultado = dNuevoResultado;
        }else{
            System.out.println("Ingresar Número: ");
        dN1 = sc.nextDouble();

        System.out.println("Ingresar Operador: ");
        sOperador = sc.next();

        System.out.println("Ingresar Número: ");
        dN2 = sc.nextDouble();

        switch (sOperador) {
            case "+" -> dResultado = dN1 + dN2;
            case "-" -> dResultado = dN1 - dN2;
            case "*" -> dResultado = dN1 * dN2;
            case "/" -> dResultado = dN1 / dN2;
            default -> {
            }
        }

        System.out.println("Resultado = " + dResultado);
        }
    } while (!sOperador.equals("C"));

    }
}
/* Escriba un programa que simule una calculadora básica, este puede realizar operación de suma, resta, multiplicación y división.
El programa debe recibir como entrada 2 números reales y un operador, que puede ser +, -, * o /.
El total de cada operación se debe ir almacenando para utilizarse en la siguiente o permitir una opción que sería limpiar ese total.
*/
