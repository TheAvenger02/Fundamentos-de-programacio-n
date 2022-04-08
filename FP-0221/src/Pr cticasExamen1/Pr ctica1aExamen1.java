package PrácticasExamen1;

import java.util.Scanner;

public class Práctica1aExamen1 {

    public static void main(String[] args) {
        System.out.println("Escribe una palabra para identificar si es palíndromo o no: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String strp = str;
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        if (strp.equals(str)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}

/*
1a.  Escriba un programa que reciba como entrada una palabra e indique si es palíndromo o no. 
Para simplificar, suponga que la palabra no tiene acentos y todas sus letras son minúsculas.
Por ejemplo, «reconocer», «Neuquén» y «acurruca» son palíndromos.
Nota, los palíndromos son aquellas palabras que dicen lo mismo al derecho y al revés.
 */
