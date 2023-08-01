import java.util.Scanner;

public class Punto_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        float radio = scanner.nextFloat();
        scanner.close();

        double area = 3.1416F * Math.pow(radio, 2);
        float perimetro = 2 * 3.1416F * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

    }
}
