package A4;
import java.util.Scanner;

// Constructor - Es un método especial de una clase que se llama automáticamente siempre que se declara un objeto de esa clase.
public class PirámideDeAsteriscos {

// Método - Es un conjunto de instrucciones definidas dentro de una clase, que realizan una determinada tarea y a las que podemos invocar mediante un nombre.
public void pirámide(int n){

	for(int i = 1; i <= n; i++){
    for(int j = 1; j <= n-i; j++)
        // Agrega un espacio
                        System.out.print(" ");
    for(int j = 1; j <= 2*i-1; j++)
        // Es par
   		if(j % 2 == 0)
        // Va ir agregando un asterisco
     		System.out.print("*");
        // Es impar
   		else
        // Imprime un asterisco
            System.out.print("*");
            System.out.println("");
        }
        /*    *
             ***
            *****
           ******* */
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De qué altura desea su pirámide?");
        int n = sc.nextInt();
        PirámideDeAsteriscos r = new PirámideDeAsteriscos();
        r.pirámide(n);
    }       
}