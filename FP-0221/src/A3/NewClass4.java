
package A3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewClass4 {
    public static void main(String[] args) {
        String palabras = "Hola mundo";
        palabras.charAt(0); // Caracter específico
        palabras.toCharArray(); // Arreglo de carácteres 
       // System.err.println(palabras.replace("mundo", "Profe")); // Cambiar una letra o palabra por otra (reemplazar)
        for (int i = 0; i < 10; i++) {
         //   System.err.println(palabras.charAt(i)); // Imprimir caracter por caracter
        }
        int [] arreglo = new int [50];
        int [] arreglo2 = {1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
          //  System.err.println(arreglo2[i]);
        }
        arreglo[0] = 45;
        arreglo[1] = 69;
        arreglo[15]= 70;
        // System.err.println(Arrays.toString(arreglo));
        
        /* String[] arr = new String[10];
        char[] arr2 = new char[25];
        arr[0] = "hola";
        arr2[0] = 'a'; */
        
       /* Scanner sc = new Scanner(System.in); Envolver excepciones
        int a;
        try{
        int a = sc.nextInt();
        }catch(InputMismatchException e){
            System.err.println("Ingresaste un dato invalido");
            a = 4;
        } */
       
       
       
    }
}
