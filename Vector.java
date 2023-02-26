import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        int vector [] = new int [15];
        try (Scanner teclado = new Scanner(System.in)) {
            
            // Cargar nuestro vector (POR TECLADO)
            for(int i = 0; i<15; i++){
                System.out.println("Ingrese un número para el vector ");
                vector[i] = teclado.nextInt();
            }
        }

        // Recorrer y contar cuantos números 3 hay.
        int cont = 0;
        for(int i = 0; i<15; i++){
            if(vector[i] == 3){
                cont = cont +1;
            }
        }

        System.out.println("En el vector hay: " + cont + " número/s 3");
    }
}
