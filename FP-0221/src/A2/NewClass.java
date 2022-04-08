/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 *
 * @author chant
 */
public class NewClass {
    public static void main(String[] args){
        int suma = 0;
        suma = suma + 4;
        suma += 4;
        
        suma = suma + 1;
        suma += 1;
        suma++;
        suma--;
        
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        int i=0;
        while(i<10){
            System.out.println(i);
           i++;
        }
        Scanner sc = new Scanner(System.in);
        int opc = -1;
        while(opc < 0 || opc > 3){
            System.out.println("Ingresa 0 para +, 1 para -, 2 para * y 3 para /");
            opc = sc.nextInt();
        }
        /* do {
            System.out.println("Ingresa 0 para +, 1 para -, 2 para * y 3 para /");
            opc = sc.nextInt();
        } while (opc < 0 || opc > 3);
        // and && or || 
        true or true = true
        true or false = true
        false or true = true
        false or false = false
        
        true and true = true
        true and false = false
        false and true = false
        false and false = false
        mod %
        = asignación
        == comparación
        != diferencia
        */
    }
}
