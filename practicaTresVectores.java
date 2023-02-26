// Se tienen tres vectores. En el primero de ellos se guarda un número de dni, en el segundo un nombre y en el tercero un apellido. 
// Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO y mostrar cada uno de estos datos por pantalla. 
// Pista: tener en cuenta que el índice de cada vector es correspondiente al índice de los demás, es decir, 
// los datos contenidos en el índice cero del vector de dni, se corresponde con el índice cero del vector de nombres y el de apellidos.

import java.util.Scanner;

public class practicaTresVectores {
    public static void main(String[] args) {
        int vectorDni[] = new int[1];
        String vectorNombre[] = new String[1];
        String vectorApellido[] = new String[1];

        // vectorDni[0] = 32563242;
        // vectorNombre[0] = "Eric";
        // vectorApellido[0] = "Knudsen";

        // Cargar vector por teclado
        try (Scanner teclado = new Scanner(System.in)) {
            // DNI
            for (int d = 0; d < vectorDni.length; d++) {
                System.out.println("Ingrese el DNI: ");
                vectorDni[d] = teclado.nextInt();
                
                //Nombre
                for (int n = 0; n < vectorNombre.length; n++) {
                    System.out.println("Ingrese el nombre ");
                    vectorNombre[n] = teclado.next();

                    // Apellido
                    for (int a = 0; a < vectorNombre.length; a++) {
                        System.out.println("Ingrese el apellido ");
                        vectorApellido[a] = teclado.next();
                    }
                }
            }
        }
        // Imprimir
        for (int i = 0; i < 1; i++) {
            System.out.println("----------------------------");
            System.out.println("Nombre: " + vectorNombre[0]);
            System.out.println("Apellido: " + vectorApellido[0]);
            System.out.println("DNI: " + vectorDni[0]);
        }
    }
}
