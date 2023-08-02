public class Punto_29 {
    public static void main(String[] args) {
        int[] numerosEnteros = {6, 3, 29, 2, 18, 3, 9, 11, 53, 7};
        int max = 0;

        for(int numero: numerosEnteros){
            if(numero > max){
                max = numero;
            }
        }

        System.out.println("El número más grande del arreglo es: " + max);
    }
}
