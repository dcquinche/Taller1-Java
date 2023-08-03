public class Punto_35 {
  public static void main(String[] args) {
    int [][] tablaMult = new int[10][10];

    for(int i = 0; i < 10; i++){
      System.out.println("Tabla del " + (i + 1));
      for(int j = 0; j < 10; j++){
        tablaMult[i][j] = (i + 1) * (j + 1);
        System.out.println((i + 1) + "x" + (j + 1) + "=" + tablaMult[i][j]);
      }
    }
  }
}
