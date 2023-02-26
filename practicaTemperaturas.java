// En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias argentinas en el último mes. 
// A partir de esta información, un noticiero desea determinar el top 5 de las temperaturas más altas para poder mostrar en la pantalla de su programa, 
// para ello se necesita un programa que sea capaz de recorrer el vector de temperaturas, determinar las 5 más altas y copiarlas en un nuevo vector de 5 posiciones

public class practicaTemperaturas {
    public static void main(String[] args) {
        int temperaturas[] = new int[23];
        int masAltas[] = new int[5];

        // Vectores para las mas altas
        masAltas[0] = 0;
        masAltas[1] = 0;
        masAltas[2] = 0;
        masAltas[3] = 0;
        masAltas[4] = 0;

        // Carga manual
        temperaturas[0] = 25;
        temperaturas[1] = 26;
        temperaturas[2] = 21;
        temperaturas[3] = 24;
        temperaturas[4] = 25;
        temperaturas[5] = 28;
        temperaturas[6] = 30;
        temperaturas[7] = 32;
        temperaturas[8] = 35;
        temperaturas[9] = 38;
        temperaturas[10] = 24;
        temperaturas[11] = 18;
        temperaturas[12] = 15;
        temperaturas[13] = 8;
        temperaturas[14] = 13;
        temperaturas[15] = 40;
        temperaturas[16] = 19;
        temperaturas[17] = 17;
        temperaturas[18] = 28;
        temperaturas[19] = 20;
        temperaturas[20] = 25;
        temperaturas[21] = 23;
        temperaturas[22] = 14;

        // Primera mas alta
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > masAltas[0]) {
                masAltas[0] = temperaturas[i];
            }

        }

        // Primera mas alta
        for (int a = 0; a < temperaturas.length; a++) {
            if (temperaturas[a] < masAltas[0] && temperaturas[a] > masAltas[1]) {
                masAltas[1] = temperaturas[a];
            }
        }

        // Segunda mas alta
        for (int b = 0; b < temperaturas.length; b++) {
            if (temperaturas[b] < masAltas[1] && temperaturas[b] > masAltas[2]) {
                masAltas[2] = temperaturas[b];
            }
        }

        // Tercera mas alta
        for (int c = 0; c < temperaturas.length; c++) {
            if (temperaturas[c] < masAltas[2] && temperaturas[c] > masAltas[3]) {
                masAltas[3] = temperaturas[c];
            }
        }

        // Cuarta mas alta
        for (int d = 0; d < temperaturas.length; d++) {
            if (temperaturas[d] < masAltas[3] && temperaturas[d] > masAltas[4]) {
                masAltas[4] = temperaturas[d];
            }
        }

        // Imprimir
        System.out.println("TOP DE TEMPERATURAS MAS ALTAS");
        System.out.println(masAltas[0] + "º Celcius");
        System.out.println(masAltas[1] + "º Celcius");
        System.out.println(masAltas[2] + "º Celcius");
        System.out.println(masAltas[3] + "º Celcius");
        System.out.println(masAltas[4] + "º Celcius");
    }
}
