import java.util.Scanner;

public class Punto_11 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese el primer lado: ");
        float lado1 = scanner1.nextFloat();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo lado: ");
        float lado2 = scanner2.nextFloat();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ingrese el tercer lado: ");
        float lado3 = scanner3.nextFloat();
        scanner1.close();
        scanner2.close();
        scanner3.close();

        float semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        System.out.println("El área del triángulo con la fórmula de Herón es: " + area);
    }
}
