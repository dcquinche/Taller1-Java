public class Punto_33 {
  public static void main(String[] args) {
    int[] elementos = {6, 3, 5, 2, 5, 9, 5, 9, 7, 3};
    int [] frecuencias = new int[elementos.length];
    int ingreso = -1;

    for(int i = 0; i < elementos.length; i++){
      int contador = 1;
      for(int j = (i + 1); j < elementos.length; j++){
        if(elementos[i] == elementos[j]){
          ++contador;
          frecuencias[j] = ingreso;
        }
      }
      if(frecuencias[i] != ingreso){
        frecuencias[i] = contador;
      }
    }

    for(int i = 0; i < frecuencias.length; i++){
      if(frecuencias[i] != ingreso){
        System.out.println("El elemento " + elementos[i] + " aparece " + frecuencias[i] + " veces");
      }
    }
  }
}
