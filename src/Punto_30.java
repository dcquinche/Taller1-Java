import java.util.Arrays;

public class Punto_30 {
    public static void main(String[] args) {
        int[] numeros = {6, 3, 7, 7, 2, 3, 9, 2, 6, 7};
        int[] numerosSinDuplicados = Arrays.stream(numeros).distinct().toArray();

        for(int numero: numerosSinDuplicados){
            System.out.println(numero);
        }
    }
}
