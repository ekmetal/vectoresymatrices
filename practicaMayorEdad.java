// En un vector de 15 posiciones se almacenan las edades de 15 alumnos.
// Se desea un programa que sea capaz de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes

public class practicaMayorEdad {
    public static void main(String[] args) {
        int vector[] = new int [15];
        int mayor = 0;
        int min = 100;

        // Carga manual
        vector[0] = 18;
        vector[1] = 21;
        vector[2] = 17;
        vector[3] = 26;
        vector[4] = 19;
        vector[5] = 23;
        vector[6] = 20;
        vector[7] = 25;
        vector[8] = 20;
        vector[9] = 24;
        vector[10] = 19;
        vector[11] = 18;
        vector[12] = 27;
        vector[13] = 26;
        vector[14] = 21;

        //MAYOR
        for(int i = 0; i<15; i++){
            if(vector[i] > mayor){
                mayor = vector[i];
            }
        }
        System.out.println("El mayor tiene: " + mayor + " años.");

        // MENOR
        for(int i = 0; i<15; i++){
            if(vector[i] < min){
                min = vector[i];
            }
        }
        System.out.println("El mayor tiene: " + min + " años.");
    }
}
