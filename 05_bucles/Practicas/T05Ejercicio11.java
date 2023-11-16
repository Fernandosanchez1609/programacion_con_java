/**
* programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números 
* enteros a partir de uno que se introduce por teclado.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escriba un numero: ");
    int numIntroducido = sc.nextInt();

    for (int i = numIntroducido+4; i>=numIntroducido; i--) {
      System.out.printf("%10d %10d %10d"+"\n",i,i*i,i*i*i);
    }
    sc.close();
  }
}
