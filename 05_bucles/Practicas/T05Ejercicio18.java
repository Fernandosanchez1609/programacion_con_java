/**
* Escribe un programa que obtenga los números enteros comprendidos entre dos
* números introducidos por teclado y validados como distintos, el programa debe
* empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1=0;
    int num2=0;

    do {
      System.out.print("Introduzca el primer numero: ");
      num1=sc.nextInt();
      System.out.print("Introduzca el segundo numero: ");
      num2=sc.nextInt();

      if (num1==num2) {
        System.out.println("Error los numero no pueden ser iguales");
      }
    } while (num1==num2);

    if (num1<num2) {
      for (int i = num1; i < num2; i=i+7) {
        System.out.print(i+" ");
      }
      
    } else {
      for (int i = num2; i < num1; i=i+7) {
        System.out.print(i+" ");
      }
    }
    sc.close();
  }
}
