package A3;
import java.util.Scanner;
public class NewClass3 {
    public static void main(String[] args) {
        int cp = 0, cn = 0, c0 = 0, n = 0, nums = 0;
        double sp = 0, sn = 0;
        System.err.println("Ingrese los números a evaluar");
        Scanner nu = new Scanner(System.in);
        n = nu.nextInt();
        for (int i = 0; i < n; i++) {
            Scanner num = new Scanner(System.in);
            nums = num.nextInt();
            if(nums > 0){
               cp++;
               sp = (sp+nums);
            }
            else if(nums < 0){
                cn++;
                sn = (sn+nums);
            }
            else if(nums == 0){
                c0++;
            }
        }
        System.err.println("La media de los números positivos es: " + (sp/cp));
        System.err.println("La media de los números negativos es: " + (sn/cn));
        System.err.println("La cantidad de ceros es: " + c0);
    }
}
