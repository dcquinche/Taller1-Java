import javax.swing.*;

public class Punto_21 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Ingrese una cadena de texto: ");
        int contador = 0;

        for (int i = 0; i < str.length(); i++){
            if('a' == str.charAt(i) || 'A' == str.charAt(i)){
                ++contador;
            }
        }

        System.out.println("La letra A aparece " + contador + " veces en la cadena");
    }
}
