public class Punto_32 {
    public static void main(String[] args) {
        int[] numeros = {6, 3, 29, 2, 18, 9, 11, 53, 7, 24};
        int numeroBusqueda = 11;

        boolean existe = false;
        int indice = 0;
        
        for(int i = 0; i < numeros.length; i++){
            if(numeroBusqueda == numeros[i]){
                existe = true;
                indice = i;
            }
        }

        if(existe){
            System.out.println("El índice del número específico es: " + indice);
        } else {
            System.out.println("El número no se encuentra en el arreglo");
        }
    }
}
