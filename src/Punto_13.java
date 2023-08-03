import java.util.Scanner;

public class Punto_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número con decimales: ");
        double numeroDecimales = scanner.nextDouble();
        scanner.close();

        double redondeoDosDecimales = Math.round(numeroDecimales * 100.0) / 100.0;
        double redondeoTresDecimales = Math.round(numeroDecimales * 1000.0) / 1000.0;

        System.out.println("Número con dos decimales: " + redondeoDosDecimales);
        System.out.println("Número con tres decimales: " + redondeoTresDecimales);
    }
}
