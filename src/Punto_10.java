public class Punto_10 {
    public static void main(String[] args) {
        int suma = 1;
        int numero1 = 0;
        int numero2 = 1;
        int i = 0;
        System.out.println("20 Primeros número de la serie Fibonacci");
        System.out.println(0);

        do {
            System.out.println(suma);
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
            ++i;
        } while (i < 20);
    }
}
