import java.util.Scanner;

public class Punto_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        int numeroEntero = scanner.nextInt();
        scanner.close();

        int factorial = 1;

        while (numeroEntero != 0){
            factorial = factorial * numeroEntero;
            --numeroEntero;
        }
        System.out.println("El factorial del número es: " + factorial);
    }
}
