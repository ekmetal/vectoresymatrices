// Una empresa constructora desea llevar a cabo un premio para sus obreros que hayan realizado horas extras en los últimos 6 meses.
// Para ello, lleva una matriz de control de 15 filas x 6 columnas, donde cada fila corresponde a un empleado distinto y donde cada columna representa
// el total de horas trabajadas por mes. El monto de horas normal trabajado x mes es de 8 horas diarias, 5 días a la semana, 4 semanas por mes,
// es decir: 160 horas. Todo monto superior a este es considerado como horas extras.

// Se desea un programa que permita la carga de horas trabajadas por cada obrero y que sea capaz de determinar aquellos que hayan realizado horas extras.
// Para registrar las horas extras realizadas se utilizará un vector de 15 posiciones en donde se deberá calcular y almacenar la cantidad
// de horas extras de cada obrero. En caso de que no haya realizado horas extras, deberá incluirse un número 0. Tomar como ejemplo la siguiente imagen:

import java.util.Scanner;

public class practicaEmpresaConstructora {
    private static final int obreros = 15;
    private static final int horas_mes = 6;
    
    
    public static void main(String[] args) {
        int matriz[][] = new int[obreros][horas_mes];
        int vector[] = new int[obreros];

        // CARGA HORAS POR TECLADO Y CALCULO HORAS EXTRAS EN VECTOR
        try (Scanner teclado = new Scanner(System.in)) {
            for (int i = 0; i < obreros; i++) {
                for (int a = 0; a < horas_mes; a++) {
                    System.out.println("Ingrese horas obrero " + "[" + (i + 1) + "]" + " mes " + "[" + (a + 1) + "]" + ".");
                    matriz[i][a] = teclado.nextInt();
                    if (matriz[i][a] <= 160) {
                        vector[i] += 0;
                    } else {
                        vector[i] += (matriz[i][a] - 160);
                    }
                }
            }
        }
        
        // RECORRER E IMPRIMIR
        System.out.println();
        System.out.println("_______________________");
        System.out.println("HORAS EXTRAS REALIZADAS");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        for(int x = 0; x < obreros; x++){
            System.out.println("El Nº de horas extras del obrero " + (x+1) + " es: " + vector[x] + "hs");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }
             
    } // Cierra main
} // Cierra class
