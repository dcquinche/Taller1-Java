import java.util.Scanner;

public class Punto_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();
        scanner.close();

        if(numeroEntero % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}