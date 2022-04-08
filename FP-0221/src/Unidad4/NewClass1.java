package Unidad4;

public class NewClass1 {

    public static void main(String[] args) {
        // 25 aleatorios [0-20] Valores repetidos en el arreglo
        int[] arreglo = new int[25];
        aleatorios(arreglo);
        mostrar(arreglo);
        repetido(arreglo);
        System.out.println("");
        System.out.println("");
        System.out.println("Los términos de tu arreglo sin repetir son los siguientes: ");
        mostrar(arreglo);
    }

    public static void aleatorios(int a[]) {
        int ter = 0;
        System.out.println("Los términos de tu arreglo son los siguientes: ");
        for (int i = 0; i < a.length; i++) {
            ter = (int) (Math.random() * 20) + 1;
            a[i] = ter;
        }
    }

    public static void mostrar(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]!= 0){
            System.out.print(a[i]+" ");
            }
        }
    }

    public static void repetido(int a[]) {
        int val = -1;
        int aux[] = new int[a.length];
        for (int i = 0; i < a.length; i++) { //copiamos los elementos de a aux.
            aux[i] = a[i];
        }
        /*Buscamos Datos Repetidos y si lo hay*/
        /*se remplaza su posición por val     */
        for (int i = 0; i < (a.length - 1); i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (aux[i] == aux[j]) {
                    aux[i] = val;
                }
            }
        }

        int j = 0;
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] != val) {
                a[j] = aux[i];
                j++;
            }
        }
        for (int K = j; K < a.length; K++) {
            a[K] = 0;
        }
    }
}