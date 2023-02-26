// Se necesita un vector que permita cargar por teclado el nombre de 10 animales. 
// A partir de esta carga, se desea otro vector que copie los mismos nombres pero en el orden inverso, es decir, si los nombres son: 
// perro, gato, lagartija, el nuevo vector debe contener: lagartija, gato, perro. Una vez realizado el cambio, mostrar por pantalla ambos vectores para compararlos.

import java.util.Scanner;

public class practicaDiezAnimales {
    public static void main(String[] args) {
        String animales[] = new String[10];
        String inverso[] = new String[10];

        

        // CARGA
        try (Scanner teclado = new Scanner(System.in)) {
            // DNI
            for (int i = 0; i < animales.length; i++) {
                System.out.println("Ingrese nombre del animal: ");
                animales[i] = teclado.next();             
            }
        }

        // Impresión para ordenar
        System.out.println("------------------------");
        System.out.println("Los animales son:");          

        // Mostrar
        for (int a = 0; a < animales.length; a++) {
            System.out.println(animales[a]);          
        }

        // Impresión para ordenar
        System.out.println("------------------------");
        System.out.println("Los animales en orden inverso.");

        // Invertir vectores
        inverso[0] = animales[9];
        inverso[1] = animales[8];
        inverso[2] = animales[7];
        inverso[3] = animales[6];
        inverso[4] = animales[5];
        inverso[5] = animales[4];
        inverso[6] = animales[3];
        inverso[7] = animales[2];
        inverso[8] = animales[1];
        inverso[9] = animales[0];

        // Mostrar vectores invertidos
        for (int b = 0; b < animales.length; b++) {
            System.out.println(inverso[b]);          
        }
    }
}