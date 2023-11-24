/**
* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
* pedir por teclado. El carácter con el que se pinta la pirámide también se debe
* pedir por teclado.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int altura;
    String caracter;

    System.out.print("Escriba la altura de la piramide: ");
    altura = sc.nextInt();
    System.out.print("Escriba el caracter con el  que se hace la piramide: ");
    caracter = sc.next();

    for (int i = 0; i < altura; i++) {
      for (int j = 1; j < altura-i; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < i*2+1; j++) {
        System.out.print(caracter);
      }
      System.out.println("");
    }
    sc.close();
  }
}
