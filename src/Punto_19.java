import javax.swing.*;

public class Punto_19 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Ingrese su nombre: ");

        String mayusculas = str.toUpperCase();
        String minusculas = str.toLowerCase();

        System.out.println("Nombre en mayúsculas = " + mayusculas);
        System.out.println("Nombre en minúsculas = " + minusculas);
    }
}
