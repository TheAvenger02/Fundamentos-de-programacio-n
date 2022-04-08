package PrácticasExamen2;

import java.util.Scanner;

public class EvaluadorDeAjedrez {

    public static void main(String[] args) {

        System.out.println("Elija el número de una de las siguientes tres piezas: 1. Caballo, 2. Alfil o 3. Torre.");
        Scanner sc = new Scanner(System.in);
        int sPieza = sc.nextInt();
        System.out.println("Tu cordenada inicial es 1,1");
        int iFilaActual = 1, iColumnaActual = 1;
        System.out.println("Ingrese la coordenada x a evaluar: ");
        int iCoordenadaX = sc.nextInt();
        System.out.println("Ingrese la coordenada y a evaluar: ");
        int iCoordenadaY = sc.nextInt();
        
        switch (sPieza) {
            case 1 -> {
                /* El desplazamiento de un caballo supone un salto de dos casillas en horizontal y una en vertical,
                o bien un salto de dos casillas en vertical y una en horizontal.
                Utilizamos los cuadrados del número de casillas recorridas tanto en horizontal como en vertical para poder librarnos del signo del desplazamiento y obtenemos:
                (f1-f2)*(f1-f2) +(c1-c2)*(c1-c2) == 5 */
                if(iCoordenadaX >= 1 && iCoordenadaX <=8 && iCoordenadaY >= 1 && iCoordenadaY <= 8){
                    
                    if ((iFilaActual - iCoordenadaY) * (iFilaActual - iCoordenadaY) + (iColumnaActual - iCoordenadaX) * (iColumnaActual - iCoordenadaX) == 5) {
                        System.out.println("Movimiento válido");
                        System.out.println("¿Quiére ingresar otra coordenada? Escriba 1 para SÍ y 0 para NO");
                                            int iRespuesta = sc.nextInt();
                        iFilaActual = iCoordenadaY; iColumnaActual = iCoordenadaX;
                        
                        while(iRespuesta != 0){
                            System.out.println("Tus cordenadas actuales son " + iColumnaActual + "," + iFilaActual);
                            System.out.println("Ingrese la coordenada x a evaluar: ");
                            iCoordenadaX = sc.nextInt();
                            System.out.println("Ingrese la coordenada y a evaluar: ");
                            iCoordenadaY = sc.nextInt();
                               if ((iFilaActual - iCoordenadaY) * (iFilaActual - iCoordenadaY) + (iColumnaActual - iCoordenadaX) * (iColumnaActual - iCoordenadaX) == 5) {
                                    System.out.println("Movimiento válido");
                                    System.out.println("¿Quiére ingresar otra coordenada? Escriba 1 para SÍ y 0 para NO");
                                                        iRespuesta = sc.nextInt();
                                    iFilaActual = iCoordenadaY; iColumnaActual = iCoordenadaX;
                                }
                        }
                    }else
                    System.out.println("Movimiento inválido");
                }else {
                    System.out.println("Movimiento inválido");
                }
            }
            case 2 -> {
                /* Será necesario que ambas casillas se encuentren en la misma diagonal.
                Dos casillas están en la misma diagonal de izquierda a derecha si c1 – f1 == c2 – f2
                y en la misma diagonal de derecha a izquierda si c1 + f1 == c2 + f2;
                la expresión buscada será la disyunción entre las dos anteriores, que se puede abreviar:
                Math.abs(f1 – f2) == Math.abs(c1 – c2) */
                if(iCoordenadaX >= 1 && iCoordenadaX <=8 && iCoordenadaY >= 1 && iCoordenadaY <= 8){
                    if (Math.abs(iFilaActual - iCoordenadaY) == Math.abs(iColumnaActual - iCoordenadaX)) {
                    System.out.println("Movimiento válido");
                System.out.println("¿Quiére ingresar otra coordenada? Escriba 1 para SÍ y 0 para NO");
                                            int iRespuesta = sc.nextInt();
                        iFilaActual = iCoordenadaY; iColumnaActual = iCoordenadaX;
                        
                        while(iRespuesta != 0){
                            System.out.println("Tus cordenadas actuales son " + iColumnaActual + "," + iFilaActual);
                            System.out.println("Ingrese la coordenada x a evaluar: ");
                            iCoordenadaX = sc.nextInt();
                            System.out.println("Ingrese la coordenada y a evaluar: ");
                            iCoordenadaY = sc.nextInt();
                               if (Math.abs(iFilaActual - iCoordenadaY) == Math.abs(iColumnaActual - iCoordenadaX)) {
                                    System.out.println("Movimiento válido");
                                    System.out.println("¿Quiére ingresar otra coordenada? Escriba 1 para SÍ y 0 para NO");
                                                        iRespuesta = sc.nextInt();
                                    iFilaActual = iCoordenadaY; iColumnaActual = iCoordenadaX;
                                }
                        }
                    }else
                    System.out.println("Movimiento inválido");
                }else {
                    System.out.println("Movimiento inválido");
                }
            }
            case 3 -> {
                /* El desplazamiento de una torre entre dos casillas será posible si: (f1==f2) || (c1==c2),
                es decir, si están en la misma horizontal (fila) o vertical (columna) */
                if(iCoordenadaX >= 1 && iCoordenadaX <=8 && iCoordenadaY >= 1 && iCoordenadaY <= 8){
                    if (iFilaActual == iCoordenadaY || iColumnaActual == iCoordenadaX) {
                    System.out.println("Movimiento válido");
                System.out.println("¿Quiére ingresar otra coordenada? Escriba 1 para SÍ y 0 para NO");
                                            int iRespuesta = sc.nextInt();
                        iFilaActual = iCoordenadaY; iColumnaActual = iCoordenadaX;
                        
                        while(iRespuesta != 0){
                            System.out.println("Tus cordenadas actuales son " + iColumnaActual + "," + iFilaActual);
                            System.out.println("Ingrese la coordenada x a evaluar: ");
                            iCoordenadaX = sc.nextInt();
                            System.out.println("Ingrese la coordenada y a evaluar: ");
                            iCoordenadaY = sc.nextInt();
                               if (iFilaActual == iCoordenadaY || iColumnaActual == iCoordenadaX) {
                                    System.out.println("Movimiento válido");
                                    System.out.println("¿Quiére ingresar otra coordenada? Escriba 1 para SÍ y 0 para NO");
                                                        iRespuesta = sc.nextInt();
                                    iFilaActual = iCoordenadaY; iColumnaActual = iCoordenadaX;
                                }
                        }
                    }else
                    System.out.println("Movimiento inválido");
                }else {
                    System.out.println("Movimiento inválido");
                }
            }
            default -> System.out.println("Elija 1. Caballo, 2. Alfil o 3. Torre.");
        }
    }
}
/* Permitir al usuario elegir entre 3 piezas de ajedrez (caballo, alfíl y torre).
Una vez seleccionada la pieza, preguntar un par de coordenadas (x, y).
Iniciando desde 1, 1, evaluar si el par de coordenadas serán un movimiento válido en base a la pieza elegida.
Si el movimiento es válido, registrar estas coordenadas cómo "punto inicial" y preguntar otro par de coordenadas para volver a evaluar la validez del movimiento.
 */