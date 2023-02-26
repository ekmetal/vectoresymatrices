// Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar cada plato del menú y sus correspondientes
// ingredientes que contiene. Para ello, cada fila representa un plato principal en donde en la primera columna se especifica su nombre
// (por ejemplo: Milanesa), y en las demás los posibles acompañamientos que puede tener el plato
// (por ejemplo, puré, ensalada rusa, papas fritas, ensalada de lechuga y tomate, ensalada de zanahoria, etc).
// En caso de que tenga el plato menos de 4 tipos de acompañamiento, en la matriz se cargará la palabra Ninguno en las posiciones que queden vacías.

// Se desea un programa que sea capaz de permitir la carga de la matriz, de buscar un plato en particular que un cliente ingrese por teclado
// y mostrarle de forma automática los posibles acompañamientos del mismo. 

import java.util.Scanner;

public class practicaCasaComida {

    private static final int n_platos = 20;
    private static final int n_acompañamientos = 5;

    public static void main(String[] args) {
        String platos[][] = new String[n_platos][n_acompañamientos];

        try (
        Scanner teclado = new Scanner(System.in)) {
            {
                // CARGA PLATOS
                for (int i = 0; i < n_platos; i++) {
                    System.out.println("Ingrese plato: [" + i + "]");
                    platos[i][0] = teclado.nextLine();

                    // CARGA ACOMPAÑAMIENTOS
                    for (int a = 1; a < n_acompañamientos; a++) {
                        System.out.println();
                        System.out.println("Ingrese acompañamiento para " + platos[i][0]);
                        platos[i][a] = teclado.nextLine();
                    }

                    // COMPLETAR CON LA PALABRA "NINGUNO"
                    for(int x = n_acompañamientos - 1; x >= 1; x--){
                        if(platos[i][x].isEmpty()){
                            platos[i][x] = "Ninguno";
                        }
                    }
                }

                
                // IMPRESION BUSQUEDA
                System.out.println();
                System.out.println("¿Qué plato desea buscar? ");
                String buscar = teclado.next();

                boolean encontrado = false;

                // BUSQUEDA E IMRESION
                for (int i = 0; i < n_platos; i++) {
                    for (int j = 0; j < n_acompañamientos; j++) {
                        if (platos[i][j].toLowerCase().equals(buscar)) {
                            encontrado = true;
                            System.out.println("-----------------------------------");
                            System.out.println("Las opciones de acompañamiento son:");
                            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                            System.out.println("- " + platos[i][1]);
                            System.out.println("- " + platos[i][2]);
                            System.out.println("- " + platos[i][3]);
                            System.out.println("- " + platos[i][4]);
                            // System.out.println("El plato " + buscar + " se encuentra en la fila " + i + "
                            // y la columna " + j);
                            break;
                        }
                    }
                }

                if (!encontrado) {
                    System.out.println("El plato " + buscar + " no se encuentra en la matriz.");
                }
            } // Cierra SCANNER
        }
    } // Cierra MAIN
} // Cierra CLASS