/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 *
 * @author chant
 */
public class NewClass {
    public static void main(String[] args){
        int a, b, c, s, r, m = 0;
        double d  = 0;
    System.out.println("Ingrese tres números: ");    
    Scanner n = new Scanner(System.in);
    a = n.nextInt();
    b = n.nextInt();
    c = n.nextInt();
    s = a + b + c;
    r = ((a - b) - c);
    m = ((a * b) * c);
    d = (double) a / b / c;
         
        System.out.println("La suma es: " + s);
        System.out.println("La resta es: " + r);
        System.out.println("La multiplicación es: " + m);
        System.out.println("La división es: " + d);
    }
}
