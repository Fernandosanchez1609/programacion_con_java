/**
* Realiza un programa que pida 8 números enteros y que luego muestre esos
* números junto con la palabra “par” o “impar” según proceda.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T07Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[8];


    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Escriba un numero: ");
      numeros[i] = sc.nextInt();
    }

    for (int i : numeros) {
      if (i%2==0) {
        System.out.println(i+" par");
      }else {
        System.out.println(i+" Impar");
      }
    }
    sc.close();
  }
}
