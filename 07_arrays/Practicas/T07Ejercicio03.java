/**
*  programa que lea 10 números por teclado y que luego los muestre
* en orden inverso, es decir, el primero que se introduce es el último en mostrarse
* y viceversa.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T07Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] num = new int[10];
    int[] numAux = new int[10];
    int contador = 9;

    for (int i = 0; i < num.length; i++) {
      System.out.print("Escriba un numero: ");
      num[i]=sc.nextInt();
    }
  

    for (int i = 0; i < num.length; i++) {
      numAux [contador] = num[i];
      contador --;
    }

    for (int i : numAux) {
      System.out.print(i+" ");
    }

    sc.close();
  }
}
