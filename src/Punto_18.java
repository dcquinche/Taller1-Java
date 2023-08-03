public class Punto_18 {

    public static String randomNumero(){
        int numeroAleatorio = (int)(Math.random()*10);
        String numeroStr = String.valueOf(numeroAleatorio);
        return numeroStr;
    }
    public static String randomLetra() {
        char letraAleatoria = (char) ((int)(Math.random()*26) + 'a');
        String letraStr = String.valueOf(letraAleatoria);
        return letraStr;
    }
    public static void main(String[] args) {
        String password = randomLetra().toUpperCase() + randomLetra() + randomNumero() + randomNumero() + randomLetra().toUpperCase() + randomLetra() + randomLetra() + randomNumero();
        System.out.println("La contraseña generada es: " + password);
    }
}
