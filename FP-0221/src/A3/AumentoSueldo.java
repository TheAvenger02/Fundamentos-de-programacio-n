package A3;
import java.util.Scanner;
public class AumentoSueldo {
    public static void main(String[] args) {
        /* Diagrama que solicite N cantidad de sueldos y años laborados, y se deberá desplegar el incremento de sueldo que se tendrá de acuerdo a la cantidad de años laborados ingresado.
           Si el sueldo es inferior a $1000, aumento 3% por cada año laborado.
           Si el sueldo es mayor o igual a $1000, aumento 2% por cada año laborado.
           Si el sueldo es mayor o igual a $5000, aumento 1% por cada año laborado. */
        int n = 0, s = 0, a = 0; // número, sueldo, año
        double aum = 0, aums = 0; // aumento, aumentosueldo
        System.err.println("Ingrese el número de sueldos a evaluar:");
        Scanner nu = new Scanner(System.in);
        n = nu.nextInt();
        for (int i = 0; i < n; i++) {
            System.err.println("Ingrese la cantidad de su sueldo:");
            Scanner num = new Scanner(System.in);
            s = num.nextInt();
            System.err.println("Ingrese la cantidad de años laborados:");
            Scanner nume = new Scanner(System.in);
            a = nume.nextInt();
            if(s<1000){
               aum = s*0.03;
               aums = a*aum;
            }
            else if(s>=1000 && s<5000){
              aum = s*0.02;
              aums = a*aum;
            }
            else if(s>=5000){
              aum = s*0.01;
              aums = a*aum;
            }
            System.err.println("Su sueldo incrementará $" + aums);
            System.err.println("Su nuevo sueldo es $:" + (s+aums));
        }
    }
}