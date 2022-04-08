package Unidad3;

import java.io.BufferedReader; // Lee texto de un flujo de entrada de caracteres, almacenando caracteres en búfer para proporcionar una lectura eficiente de caracteres, matrices y líneas.
import java.io.IOException; // Señala que se ha producido una excepción de E / S de algún tipo. Esta clase es la clase general de excepciones producidas por operaciones de E / S fallidas o interrumpidas.
import java.io.InputStreamReader; // Es un puente entre los flujos de bytes y los flujos de caracteres: lee bytes y los decodifica en caracteres usando un archivo especificado charset. El juego de caracteres que utiliza se puede especificar por nombre o se puede dar explícitamente, o se puede aceptar el juego de caracteres predeterminado de la plataforma.

public class Actividad5 {

    public static char[][] gato = new char[3][3];

    public static void imprimirPosiciones() {
        int pos = 1;
        System.out.println("selecciona una posición en el tablero: ");
        System.out.println("Las casillas marcadas con X u O ya están ocupadas");
        for (int i = 0; i < gato.length; i++) {
            for (int j = 0; j < gato.length; j++) {
                if (gato[i][j] == 'X' || gato[i][j] == 'O') {
                    System.out.print(" " + gato[i][j]);
                } else {
                    System.out.print(" " + pos);
                }
                pos++;
            }
            System.out.println();
        }
    }

    public static boolean casillaNoOcupada(int posicion) {
        switch (posicion) {
            case 1:
                return gato[0][0] != ' ';
            case 2:
                return gato[0][1] != ' ';
            case 3:
                return gato[0][2] != ' ';
            case 4:
                return gato[1][0] != ' ';
            case 5:
                return gato[1][1] != ' ';
            case 6:
                return gato[1][2] != ' ';
            case 7:
                return gato[2][0] != ' ';
            case 8:
                return gato[2][1] != ' ';
            case 9:
                return gato[2][2] != ' ';
            default:
                return false;
        }
    }

    public static void registrarJugada(char caracter) throws IOException {
        boolean salir = false;
        String entrada;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        int posicion;
        do {
            imprimirPosiciones();
            System.out.println("Escriba el número de casilla en donde desea tirar: ");
            entrada = bufer.readLine();
            posicion = Integer.parseInt(entrada);
            if (casillaNoOcupada(posicion)) {
                switch (posicion) {
                    case 1:
                        gato[0][0] = caracter;
                        break;
                    case 2:
                        gato[0][1] = caracter;
                        break;
                    case 3:
                        gato[0][2] = caracter;
                        break;
                    case 4:
                        gato[1][0] = caracter;
                        break;
                    case 5:
                        gato[1][1] = caracter;
                        break;
                    case 6:
                        gato[1][2] = caracter;
                        break;
                    case 7:
                        gato[2][0] = caracter;
                        break;
                    case 8:
                        gato[2][1] = caracter;
                        break;
                    case 9:
                        gato[2][2] = caracter;
                        break;
                }
                salir = true;
            } else {
                System.out.println("Casilla no válida, escriba una posición valida");
            }
        } while (!salir);
    }

    public static void imprimirGato() {
        System.out.println("El gato hasta el momento: ");
        for (char[] gato1 : gato) {
            for (int j = 0; j < gato.length; j++) {
                System.out.print("    " + gato1[j]);
            }
            System.out.println();
        }

    }

    public static boolean ganaPorFila(char caracter) {

        for (char[] gato1 : gato) {
            if (gato1[0] == caracter && gato1[1] == caracter && gato1[2] == caracter) {
                return true;
            }
        }
        return false;
    }

    public static boolean ganaPorColumna(char caracter) {

        for (int i = 0; i < gato.length; i++) {
            if (gato[0][i] == caracter && gato[1][i] == caracter && gato[2][i] == caracter) {
                return true;
            }
        }
        return false;
    }

    public static boolean ganaPorDiagonal(char caracter) {
        // Busca ganador en la columna de izquierda a derecha
        if (gato[0][0] == caracter && gato[1][1] == caracter && gato[2][2] == caracter) {
            return true;
        }
        if (gato[0][2] == caracter && gato[1][1] == caracter && gato[2][0] == caracter) {
            return true;
        }

        return false;
    }

    public static boolean hayGanador(char caracter) {
        if (ganaPorFila(caracter)) {
            return true;
        }
        if (ganaPorColumna(caracter)) {
            return true;
        }
        if (ganaPorDiagonal(caracter)) {
            return true;
        }
        return false;
    }

    public static boolean hayEspacio() {
        for (char[] gato1 : gato) {
            for (int j = 0; j < gato.length; j++) {
                if (gato1[j] == '-') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void inicializarTablero() {
        for (int i = 0; i < gato.length; i++) {
            for (int j = 0; j < gato.length; j++) {
                gato[i][j] = '-';
            }
        }
    }

    public static void main(String[] args) throws IOException {
        char jugadorActual = 'X';
        //boolean terminar = false;
        boolean reiniciar = true;
        int puntosX = 0, puntosO = 0;

        do {
            boolean terminar = false;
            inicializarTablero();
            System.out.println("¡Bienvenido al juego del gato!");
            System.out.println("");
            do {
                System.out.print("Es tu turno jugador " + jugadorActual + " ");
                registrarJugada(jugadorActual);
                imprimirGato();
                if (hayGanador(jugadorActual)) {
                    System.out.println("¡Felicidades jugador " + jugadorActual + " has ganado el juego!");
                    if (jugadorActual == 'X') {
                        puntosX++;
                        System.out.println("Tus puntos son: " + puntosX);
                    } else {
                        puntosO++;
                        System.out.println("Tus puntos son: " + puntosO);
                    }
                    terminar = true;
                } else {
                    if (!hayEspacio()) {
                        // Ya no hay casillas disponibles, el juego se empató
                        System.out.println("El juego termina en empate.");
                        terminar = true;
                    } else if (jugadorActual == 'X') {
                        jugadorActual = 'O';
                    } else {
                        jugadorActual = 'X';
                    }
                }
            } while (!terminar);

            boolean salir = false;
            do {
                System.out.println("¿Desea volver a jugar? Escriba: 0 - No o 1 - Sí ");
                BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
                String entrada = bufer.readLine();
                int respuesta = Integer.parseInt(entrada);
                switch (respuesta) {
                    case 0:
                        // Se termina por completo
                        reiniciar = false;
                        System.out.println("Los resultados finales fueron: " + "\n Jugador X: " + puntosX + "\n Jugador O: " + puntosO);
                        if (puntosX == puntosO) {
                            System.out.println("¡Esto ha quedado igualado!");
                        } else if (puntosX > puntosO) {
                            System.out.println("Jugador X, ¡Has ganado definitivamente!");
                        } else {
                            System.out.println("Jugador O, ¡Has ganado definitivamente!");
                        }
                        salir = true;
                        break;
                    case 1:
                        // Se vuelve a reiniciar el juego
                        reiniciar = true;
                        salir = true;
                        break;

                    default:
                        System.out.println("Ingrese una respuesta válida ");
                }
            } while (!salir);

        } while (reiniciar);

    }

}

/*
Utilizando arreglos bidimensionales y métodos, desarrollar el juego del gato (en consola).

El cuál debe constar de un tablero de 9 posiciones y 2 jugadores, X y O. El juego termina cuándo uno de los 2 consigue alinear 3 símbolos, ya sea horizontal, vertical o diagonal.
Permitir a los usuarios jugar de nuevo, y con ello llevar un registro de victorias por jugador.
Los empates se generan cuándo los 9 espacios de tablero se llenan de símbolos.

Ejemplo de consola:
  |   | X 
X |   | 
O | X | O

Fuente de apoyo y consulta: https://dcodingames.com/juego-del-gato-en-java/
 */
