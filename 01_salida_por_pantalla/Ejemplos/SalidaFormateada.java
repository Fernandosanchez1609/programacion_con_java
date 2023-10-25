/**
* este es para tener salida formateada utilizando enteros, decimales y decimales con precision
*
*@author Fernando Sanchez
*/
public class SalidaFormateada {
  public static void main(String[] args) {
    System.out.printf("el numero %d no tiene decimales. \n", 21);
    System.out.printf("el numero %f sale con decimales. \n", 21.0);
    System.out.printf("el %.3f sale con exactamente %d decimales. \n", 50.0, 3);
    System.out.printf("la letra: %c. \n", 69);

    //para ver el orden
    System.out.printf("mostramos el segundo argumento: %2$d \n y despues el primero: %1$.2f", 3.0, 56);
  }
}
