/**
* ejemplo while contar cuantos numeros positivos hay y tambein la suma de ellos
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Ejemplo_while2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int contador = 0;
    int suma = 0;
    while (i>=0) {
      System.out.print("Escriba un numero entero: ");
      i = sc.nextInt();
      if (i>0) {
        suma = suma+i;
        contador++;
      }
    }
    System.out.println("Has escrito "+contador+" numeros positivos y sus sumas es: "+suma);
    sc.close();
  }
}
