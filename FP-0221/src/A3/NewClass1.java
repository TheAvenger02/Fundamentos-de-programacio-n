package A3;
import java.util.Scanner;
public class NewClass1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número a invertir");
        int numero = sc.nextInt(); // invertido = 0;
        System.out.println("Número invertido: ");
        while(numero > 0){
            int digito = numero % 10;
           // invertido = (invertido * 10) + digito;
            System.err.print(digito);
            numero = numero / 10;
        }
        // System.out.println("Número invertido: " + invertido);
        System.err.println("");
    }
}