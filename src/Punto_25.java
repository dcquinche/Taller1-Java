import javax.swing.*;

public class Punto_25 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Ingrese una frase: ");
        String[] palabras = str.split(" ");

        for(String palabra: palabras){
            System.out.println(palabra);
        }
    }
}
