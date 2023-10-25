/**
* ejemplo de salida formateada utilizando distintos flags
*
*@author Fernando Sanchez
*/
public class SalidaFormateada2 {
  public static void main(String[] args) {
    System.out.printf("%8d\n", 100);
    System.out.printf("%08d\n", 100);
    System.out.printf("%+d\n", 100);
    System.out.printf("%+-8d\n", 100);
  }
}
