import javax.swing.*;

public class Punto_26 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Ingrese una cadena de texto: ");
        int contador = 0;

        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                ++contador;
            }
        }

        System.out.println("La cadena tiene " + contador + " caracteres");
    }
}
