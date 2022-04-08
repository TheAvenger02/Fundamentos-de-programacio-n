package ExamenFP;

public class SumaDeCubos {

    public static void main(String[] args) {

        int iNúmeroInicial = 150, iNúmeroFinal = 410; // Parámetro

        System.out.println("Tus números son: ");

        for (int i = iNúmeroInicial; i <= iNúmeroFinal; i++) { // Vamos recorriendo cada número desde 150 hasta 410

            String number = String.valueOf(i); // Guardamos en un String cada número

            int iNum1 = Integer.parseInt(String.valueOf(number.charAt(0))); // Agarramos la posición del primer String con el charAt y la convertimos en String que seguidamente lo convertimos en Entero con Integer.parseInt.
            int iNum2 = Integer.parseInt(String.valueOf(number.charAt(1))); // Agarramos la posición del segundo String con el charAt y la convertimos en String que seguidamente lo convertimos en Entero con Integer.parseInt.
            int iNum3 = Integer.parseInt(String.valueOf(number.charAt(2))); // Agarramos la posición del tercer String con el charAt y la convertimos en String que seguidamente lo convertimos en Entero con Integer.parseInt.

            int iCuadrado1 = iNum1 * iNum1 * iNum1; // Sacamos el cubo del primer número
            int iCuadrado2 = iNum2 * iNum2 * iNum2; // Sacamos el cubo del segundo número
            int iCuadrado3 = iNum3 * iNum3 * iNum3; // Sacamos el cubo del tercer número

            int iSuma = iCuadrado1 + iCuadrado2 + iCuadrado3; // Hacemos la suma de los cubos
            String sSuma = String.valueOf(iSuma); // Convertimos la suma de los cubos en un String
            if (sSuma.equals(number)) { // Evaluamos si la suma de los cubos es igual al número e imprime el número que necesitamos
                System.out.println(sSuma);
            }
        }
    }
}
/* Entre todos los enteros mayores a 1 hay solamente cuatro que pueden ser representados por la suma de los cubos de sus dígitos.
Uno de esos números es 153 pues: 13 + 53 + 33 = 1 + 125 + 27 = 153
Desarrolle un programa para poder determinar los otros tres números.
Tenga en cuenta que los números se encuentran entre 150 y 410.
*/
