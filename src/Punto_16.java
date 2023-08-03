import java.util.Scanner;

public class Punto_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numeroLimite = scanner.nextInt();
        scanner.close();

        int suma = 1;
        int numero1 = 0;
        int numero2 = 1;

        System.out.println(0);

        do {
            System.out.println(suma);
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
        } while (suma < numeroLimite);
    }
}
