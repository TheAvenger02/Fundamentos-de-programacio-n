package A4;

public class CincoDigitos {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            // If ternario - (condición) ? acción si true : acción si false;
                            System.out.print(i != 3 ? i : "E");
                            System.out.print(j != 3 ? j : "E");
                            System.out.print(k != 3 ? k : "E");
                            System.out.print(l != 3 ? l : "E");
                            System.out.print(m != 3 ? m : "E");
                            System.out.println();
                        }

                    }
                }

            }

        }
    }

}
/*
    0 0 0 0 0
    
    9 9 9 9 9
 */
