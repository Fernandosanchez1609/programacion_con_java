/**
* Escribe un programa que lea un número n e imprima una pirámide de números
* con n filas
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int altura;
    long num=1;

    System.out.print("Introduce la altura de la piramide: ");
    altura = sc.nextInt();

    for (int i = 0; i < altura; i++) {
      
      for (int j = 0; j < altura-i; j++) {
        System.out.print(" ");
      }
      System.out.println(num*num);
      num=num*10+1;
    }

    sc.close();
  }
}
