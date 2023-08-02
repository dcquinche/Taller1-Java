import javax.swing.*;

public class Punto_20 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Ingrese una cadena de texto: ");

        StringBuilder strBuilder = new StringBuilder(str);
        String strReverso = strBuilder.reverse().toString();

        JOptionPane.showMessageDialog(null, strReverso);
        System.out.println("Cadena reversa = " + strReverso);
    }
}
