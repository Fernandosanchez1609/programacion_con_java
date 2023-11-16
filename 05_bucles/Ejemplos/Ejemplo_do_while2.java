/**
* ejemplo do-while pedir numeros hasta que no sea par
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Ejemplo_do_while2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    do {
      System.out.print("Introduce un numero par: ");
      numero = sc.nextInt();
      if (numero%2==0) {
        System.out.println("El numero es par :)");
      } else {
        System.out.println("EL numero no es par >:(");
      }
    } while (numero % 2 == 0);
    sc.close();
  }
}
