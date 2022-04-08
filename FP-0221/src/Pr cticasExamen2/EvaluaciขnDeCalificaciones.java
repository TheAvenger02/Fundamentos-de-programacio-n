package PrácticasExamen2;

import java.util.Scanner;

public class EvaluaciónDeCalificaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        if (n1 < 2 && n2 < 2) {
            System.out.println("Estás automáticamente reprobado.");
        } else if (n1 > 9 && n2 > 9) {
            System.out.println("Estás automáticamente aprobado.");
        } else {
            float n3 = sc.nextFloat();
            float p = (n1 + n2 + n3) / 3;

            if (p < 3) {
                System.out.println("Reprobaste la materia.");
            } else if (p >= 7) {
                System.out.println("Aprobaste la materia.");
            } else {
                System.out.println("Vas a examen, ¿Cuánto sacaste?");
                float n4 = sc.nextFloat();
                if (n4 >= 5) {
                    System.out.println("Aprobaste la materia.");
                } else {
                    System.out.println("Reprobaste la materia.");
                }
            }
        }
    }
}
/* 3. Evaluación de calificaciones. 
Las notas van entre 0 y 10, con un decimal. 
Después de tres evaluaciones, 
los alumnos con promedio menor de 3 reprueban la materia 
y los que cuenten con un promedio mayor o igual a 7 aprueban. 
El resto va al examen, en el que deben sacarse por lo menos un 5 para aprobar. 
Además, se decidió que los alumnos que se sacan menos de un 2 en las dos primeras evaluaciones están automáticamente reprobados. 
A su vez, los que obtienen más de un 9 en las dos primeras evaluaciones están automáticamente aprobados. 
En ambos casos, no se debe realizar la tercera evaluación.
 */