// Una escuela primaria utiliza una matriz para calcular los promedios de sus alumnos. 
// Para ello tienen una matriz de 10 filas, donde cada fila representa a un alumno y 4 columnas. 
// Las primeras 3 columnas representan las notas de cada uno de los alumnos, mientras que la 4 es el promedio de las mismas.
// Se desea un programa que sea capaz de permitir la carga por teclado de las 3 notas de cada alumno, de realizar el cálculo automático del promedio,
// de guardar el mismo en la 4 columna y luego mostrar por pantalla cada una de las notas y el promedio obtenido. Por ejemplo.

// Nota: tener en cuenta que generalmente las calificaciones y los promedios no suelen ser números enteros, sino que pueden tener decimales.

import java.util.Scanner;

public class practicaEscuelaPrimaria {
    public static void main(String[] args) {
        Double alumnos[][] = new Double[10][4];

        try (Scanner teclado = new Scanner(System.in)) {
            {
                for (int f = 0; f < alumnos.length; f++) {
                    for (int c = 0; c < 3; c++) {
                        System.out.println("Ingrese notas alumno:["+f+"]["+c+"] ");
                        alumnos[f][c] = teclado.nextDouble();
                    }
                }

                for (int a = 0; a < alumnos.length; a++) {
                    for (int b = 0; b < 3; b++) {
                        alumnos[a][3] = (alumnos[a][0] + alumnos[a][1] + alumnos[a][2]) / 3;
                    }
                }
            }
        }
        System.out.println("-------------------------");
        System.out.println("Los promedios son: ");

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 1; y++) {
                System.out.println("Alumno["+x+"]" + alumnos[x][3]);
            }
        }
    }
}