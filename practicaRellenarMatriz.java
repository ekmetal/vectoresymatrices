import java.util.Arrays;

// Se desea un programa que sea capaz de rellenar completamente con números 1 una matriz de 4 x 4 a excepción de su diagonal principal,
// la cual debe ser rellenada con números 0. Una vez realizada la carga, se desea mostrar la matriz de forma ordenada por pantalla.
// Tener como ejemplo la matriz que se presenta a continuación. 

public class practicaRellenarMatriz {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[f][c] = 1;
                matriz[f][f] = 0;
            }
        }

        for (int a = 0; a < 4; a++) {
            System.out.println(Arrays.toString(matriz[a]));
            // for (int b = 0; b < 4; b++) {
            //     System.out.println(matriz[a][b]);
            // }
        }
    }
}
