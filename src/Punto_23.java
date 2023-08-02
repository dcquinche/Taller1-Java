import javax.swing.*;

public class Punto_23 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Ingrese una oración: ");
        int contador = 0;

        for (int i = 0; i < str.length(); i++){
            if(' ' == str.charAt(i)){
                ++contador;
            }
        }

        System.out.println("Hay " + (contador + 1) + " palabras en la oración");
    }
}
