/**
* Escribe un programa que diga si un número introducido por teclado es o no primo
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escriba un numero para comnprobar que es primo: ");
    int num = sc.nextInt();
    boolean primo = true;
    int i = 2;
    do {
      if (num%i==0) {
        primo = false;
      }
      i++;
    } while ((primo == true)&&(i<num));

    if ((primo==true)&&(num!=1)) {
      System.out.println("El numero "+num+" es primo");
    } else {
      System.out.println("El numero "+num+" no es primo");
    }
    sc.close();
  }
}
