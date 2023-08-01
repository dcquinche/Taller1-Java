import java.util.Scanner;

public class Punto_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        float numero = scanner.nextFloat();
        scanner.close();

        if(numero > 0){
            System.out.println("El número es positivo");
        } else if (numero == 0) {
            System.out.println("El número es cero");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
