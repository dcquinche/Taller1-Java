import java.util.Scanner;

public class Punto_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();
        scanner.close();

        String str = Integer.toString(numeroEntero);

        StringBuilder strBuilder = new StringBuilder(str);
        String strReverso = strBuilder.reverse().toString();

        if(str.equals(strReverso)){
            System.out.println("Es un número capicúa");
        } else {
            System.out.println("No es un número capicúa");
        }
    }
}
