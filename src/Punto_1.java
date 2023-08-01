import java.util.Scanner;

public class Punto_1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroEntero1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese otro número entero: ");
        int numeroEntero2 = scanner2.nextInt();
        scanner1.close();
        scanner2.close();

        int suma = numeroEntero1 + numeroEntero2;
        int resta = numeroEntero1 - numeroEntero2;
        int mult = numeroEntero1 * numeroEntero2;
        int div = numeroEntero1 / numeroEntero2;

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + mult);
        System.out.println("La división de los números es: " + div);
    }
}
