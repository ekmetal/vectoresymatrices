// Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
// Realizar un programa que permita la carga por teclado de los 10 números solicitados.

import java.util.Scanner;

public class practicaVector1 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int vector[] = new int [10];
            // Cargar vector por teclado
            for(int i=0; i<vector.length; i++){
                System.out.println("Ingrese su Nº ");
                vector[i] = teclado.nextInt();
            }

            // Imprimir
            for(int i=0; i<vector.length; i++){
                System.out.println("El indice es " + i);
                System.out.println("El Nº guardado es el " + vector[i]);
                System.out.println("----------------------------");
            }
        }
    }
}
