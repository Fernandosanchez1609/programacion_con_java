/**
* Realiza un programa que pida la temperatura media que ha hecho en cada mes
* de un determinado año y que muestre a continuación un diagrama de barras
* horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
* de asteriscos o cualquier otro carácter.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T07Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] meses= new int[12];
    int mes=1;

    //pedir la temperatura de cada mes
    for (int i = 0; i < meses.length; i++) {
      System.out.print("Escriba la temperatura hubo en el mes "+mes+" :");
      meses[i]=sc.nextInt();
      mes++;
    }

    //pintar el diagrama
    for (int i = 0; i < meses.length; i++) {
      System.out.printf("%-6s|","mes "+(i+1));
      for (int j = 0; j < meses[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
