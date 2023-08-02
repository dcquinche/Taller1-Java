public class Punto_28 {
    public static void main(String[] args) {
        int[] numerosEnteros = {6, 3, 2, 2, 18, 3, 9, 11, 5, 7};
        int suma = 0;

        for(int numero: numerosEnteros){
            suma += numero;
        }

        System.out.println("La suma de los números del arreglo es: " + suma);
    }
}
