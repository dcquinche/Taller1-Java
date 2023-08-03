import java.util.Arrays;

public class Punto_34 {
  public static int[] rotarArreglo(int[] elementos){
    int primerElemento = elementos[0];

    int i;
    for(i = 0; i < elementos.length -1; i++){
      elementos[i] = elementos[i + 1];
    }
    elementos[i] = primerElemento;

    return elementos;
  }
  public static void main(String[] args) {
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int cantidadPosiciones = 4;

    for(int i = 0; i < cantidadPosiciones; i++){
      rotarArreglo(numeros);
    }

    System.out.println(Arrays.toString(numeros));
  }
}
