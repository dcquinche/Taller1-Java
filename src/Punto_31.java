import java.util.Arrays;

public class Punto_31 {
    public static void main(String[] args) {
        int[] numerosEnteros = {6, 3, 29, 2, 18, 3, 9, 11, 53, 7};

        // Método Burbuja
        for(int j = 0; j < numerosEnteros.length; j++){
            for (int i = 0; i < numerosEnteros.length -1; i++){
                int numeroActual = numerosEnteros[i];
                int numeroSiguiente = numerosEnteros[i+1];

                if(numeroActual > numeroSiguiente){
                    numerosEnteros[i] = numeroSiguiente;
                    numerosEnteros[i+1] = numeroActual;
                }
            }
        }

        for (int numero: numerosEnteros){
            System.out.println(numero);
        }
    }
}
