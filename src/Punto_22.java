import javax.swing.*;

public class Punto_22 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Ingrese una frase: ");

        StringBuilder strBuilder = new StringBuilder(str);
        String strReverso = strBuilder.reverse().toString();
        
        if(str.equals(strReverso)){
            System.out.println("La frase es un palíndromo");
        } else {
            System.out.println("La frase no es un palíndromo");
        }
    }
}
