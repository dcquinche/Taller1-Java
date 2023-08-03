import java.util.Scanner;

public class Punto_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        int numeroEntero = scanner.nextInt();
        scanner.close();

        int suma = 0;

        for (int i = 1; i < numeroEntero; i++){
            if(numeroEntero % i == 0){
                suma += i;
            }
        }

        if(numeroEntero == suma){
            System.out.println("El número es perfecto");
        } else {
            System.out.println("El número no es perfecto");
        }


    }
}
