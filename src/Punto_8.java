import java.util.Scanner;

public class Punto_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero entre en 1 y 100: ");
        int numero = scanner.nextInt();
        scanner.close();

        int numeroAleatorio = (int)(Math.random()*100+1);

        if(numero == numeroAleatorio){
            System.out.println("Has adivinado el número");
        } else if(numero > numeroAleatorio){
            System.out.println("El número ingresado es mayor al número a adivinar");
        } else {
            System.out.println("El número ingresado es menor al número a adivinar");
        }
    }
}
