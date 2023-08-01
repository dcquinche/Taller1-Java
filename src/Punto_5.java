import java.util.Scanner;

public class Punto_5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroEntero1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese otro número entero: ");
        int numeroEntero2 = scanner2.nextInt();
        scanner1.close();
        scanner2.close();

        if(numeroEntero1 > numeroEntero2){
            System.out.println("El número mayor es: " + numeroEntero1);
        } else if (numeroEntero1 == numeroEntero2) {
            System.out.println("Los números son de igual valor");
        } else {
            System.out.println("El número mayor es: " + numeroEntero2);
        }
    }
}
