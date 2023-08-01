import java.util.Scanner;

public class Punto_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        int numeroEntero = scanner.nextInt();
        scanner.close();

        int numeroMult = 1;
        System.out.println("Tabla de multiplicar del número " + numeroEntero);
        while (numeroMult <= 10){
           int mult = numeroEntero * numeroMult;
            System.out.println(numeroEntero + "*" + numeroMult + "=" + mult);
            ++numeroMult;
        }
    }
}
