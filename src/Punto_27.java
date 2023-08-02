import javax.swing.*;
import java.util.Arrays;

public class Punto_27 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Ingrese una frase: ");
        String[] palabras = str.split(" ");
        Arrays.sort(palabras);

        for(String palabra: palabras){
            System.out.println(palabra);
        }
    }
}
