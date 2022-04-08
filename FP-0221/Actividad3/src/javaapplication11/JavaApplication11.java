package javaapplication11;
import java.util.Scanner;
public class JavaApplication11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Ingrese el día:");
        int d = sc.nextInt();
        System.err.println("Ingrese el mes:");
        int m = sc.nextInt();
        System.err.println("Ingrese el año:");
        int a = sc.nextInt();
        if(d >= 1 && d <= 31 && m >= 1 && m <= 12){
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10){
                if(d == 31){
                    System.err.println("La fecha siguiente es: " + 1 + "-" + (m + 1) + "-" + a);
                }
                else{
                    System.err.println("La fecha siguiente es: " + (d+1) + "-" + m + "-" + a  );
                }
            }
            if( m == 12){
                    if(d == 31){
                       System.err.println("La fecha siguiente es: " + 1 + "-" + 1 + "-" + (a+1)); 
                    }
                    else{
                        System.err.println("La fecha siguiente es: " + (d+1) + "-" + m + "-" + a);
                    }
            }
            if(m == 2){
               if(d <= 29){
                   if(d <= 27){
                     System.err.println("La fecha siguiente es: " + 1 + "-" + (m + 1) + "-" + a);
                    }
                   if(d == 28 && a % 4 == 0 && a % 100 != 0 || a % 100 == 0 && a % 400 == 0){
                       System.err.println("La fecha siguiente es: " + (d+1) + "-" + m + "-" + a);
                    }
                   if(d == 29){
                       if(a % 4 == 0 && a % 100 != 0 || a % 100 == 0 && a % 400 == 0){
                          System.err.println("La fecha siguiente es: " + 1 + "-" + (m + 1) + "-" + a); 
                        }
                        else{
                         System.err.println("¡ERROR!"); 
                       }
                   } 
                }
                else{
                    System.err.println("¡ERROR!");
                }
            }
             if(m == 4 || m == 6 || m == 9 || m == 11){
                 if(d == 30){
                     System.err.println("La fecha siguiente es: " + 1 + "-" + (m + 1) + "-" + a); 
                 }
                 if(d == 31){
                         System.err.println("¡ERROR!");
                 }
                 else{
                      System.err.println("La fecha siguiente es: " + (d+1) + "-" + m + "-" + a);
                 }
             }
        }
        else{
            System.err.println("¡ERROR!");
        }
    }
}