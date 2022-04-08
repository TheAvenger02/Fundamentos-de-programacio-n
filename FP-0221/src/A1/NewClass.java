package A1;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        /* público, privado (misma clase), protected (mismo paquete),  default, (modifican la seguridad que se tiene para acceder a ese método) //
        static (generar constantes) 
        Métodos: 4 partes 
        Modificador de acceso - void [tipo de retorno que va a tener el método] (vacío)
        Nombre del método - main
        Parámetros que está recibiendo el método 
        Tipos de datos primitivos
        String compuesto / complejo*/
        String variable1 = "Hola mundo";
        int valor1 = 10;
        long v4 = 10;
        double v2 = 3.3;
        float v3 = 4.5f;
        char v5 = 's';
        boolean v6 = false;
        byte v7; // -128 to 127 //
        /* System.out.println(variable1); ln = new line
        System.out.println(valor1);
        System.out.println(v4);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v5);
        System.out.println(v6);*/
        
        /* System.out.println("Cualquier texto");
        System.out.println(4+4);
        System.out.println(valor1 + v2);
        System.out.println("Valor 1: " + valor1 + " Algo más "); // Concatenación //
        System.out.println(4+4+""+(5+5));
        System.out.println(variable1+valor1);*/
        
        Scanner sc = new Scanner(System.in); // Objeto //
        String texto =  sc.nextLine(); // next sólo lee hasta el primer espacio, nextLine toda la línea //
        System.out.println("El usuario ingresó: "+texto);
        int numero = sc.nextInt(); //hasNext saber si exite algo enseguida //
        System.out.println("El numero ingresado es: "+numero);
        // Errores = Excepciones, terminan el programa //
    }   
}