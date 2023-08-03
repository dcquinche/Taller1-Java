import java.util.Scanner;

public class Punto_17 {

    public static boolean esPrimo(int numero){
        boolean esPrimo = true;

        if(numero < 2){
            esPrimo = false;
        }

        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                esPrimo = false;
            }
        }
        return esPrimo;
    }
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroEntero1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese otro número entero: ");
        int numeroEntero2 = scanner2.nextInt();
        scanner1.close();
        scanner2.close();

        for(int i = numeroEntero1; i <= numeroEntero2; i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    }
}
