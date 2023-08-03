import javax.swing.*;

public class Punto_24 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Ingrese una cadena de texto: ");
        String strReemplazo = str.toLowerCase().replace("a", "e");

        System.out.println("Cadena reemplazando las a por e: " + strReemplazo);
    }
}
