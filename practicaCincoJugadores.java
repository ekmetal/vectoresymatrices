// Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 3 partidos que jugaron, 
// donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo. 
// Se necesita un programa que sea capaz de permitir la carga de los goles, calcular el promedio de goles realizado por cada jugador y 
// almacenar el resultado en un vector de 5 posiciones, donde cada posición representará a un jugador. 
//Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:

// Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.

import java.util.Scanner;

public class practicaCincoJugadores {
    public static void main(String[] args) {
        Double jugadores[][] = new Double[5][3];
        Double promedio[] = new Double[5];                

        try (// CARGA POR TECLADO JUGADOR A JUGADOR
        Scanner teclado = new Scanner(System.in)) {
            {
                // JUGADOR 1
                for (int a = 0; a < 1; a++) {
                    for (int c = 0; c < 3; c++) {
                        System.out.println("Ingrese Nº goles jugador 1: ");
                        jugadores[0][c] = teclado.nextDouble();
                    }
                }

                // JUGADOR 2
                for (int a = 0; a < 1; a++) {
                    for (int c = 0; c < 3; c++) {
                        System.out.println("Ingrese Nº goles jugador 2: ");
                        jugadores[1][c] = teclado.nextDouble();
                    }
                }

                // JUGADR 3
                for (int d = 0; d < 1; d++) {
                    for (int c = 0; c < 3; c++) {
                        System.out.println("Ingrese Nº goles jugador 3: ");
                        jugadores[2][c] = teclado.nextDouble();
                    }
                }

                // JUGADOR 4
                for (int e = 0; e < 1; e++) {
                    for (int c = 0; c < 3; c++) {
                        System.out.println("Ingrese Nº goles jugador 4: ");
                        jugadores[3][c] = teclado.nextDouble();
                    }
                }

                // JUGADOR 5
                for (int f = 0; f < 1; f++) {
                    for (int c = 0; c < 3; c++) {
                        System.out.println("Ingrese Nº goles jugador 5: ");
                        jugadores[4][c] = teclado.nextDouble();
                    }
                }
            }
        }
        
        // CALCULO DE PROMEDIOS
        promedio[0] = (jugadores[0][0] + jugadores[0][1] + jugadores[0][2]) / 3;
        promedio[1] = (jugadores[1][0] + jugadores[1][1] + jugadores[1][2]) / 3;
        promedio[2] = (jugadores[2][0] + jugadores[2][1] + jugadores[2][2]) / 3;
        promedio[3] = (jugadores[3][0] + jugadores[3][1] + jugadores[3][2]) / 3;
        promedio[4] = (jugadores[4][0] + jugadores[4][1] + jugadores[4][2]) / 3;

        // IMPRESIÓN
        System.out.println("|---------------------------------------------------------|");
        System.out.println("Promedio jugador 1 => " + promedio[0] + " goles por partido.");
        System.out.println("Promedio jugador 2 => " + promedio[1] + " goles por partido.");
        System.out.println("Promedio jugador 3 => " + promedio[2] + " goles por partido.");
        System.out.println("Promedio jugador 4 => " + promedio[3] + " goles por partido.");
        System.out.println("Promedio jugador 5 => " + promedio[4] + " goles por partido.");
        System.out.println("|---------------------------------------------------------|");
    }
}
