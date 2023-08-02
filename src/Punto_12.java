import java.util.Scanner;

public class Punto_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();
        scanner.close();

        boolean esPrimo = true;

        if(numeroEntero < 2){
            esPrimo = false;
        }

        for(int i = 2; i < numeroEntero; i++){
            if(numeroEntero % i == 0){
                esPrimo = false;
            }
        }

        if(esPrimo){
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}
