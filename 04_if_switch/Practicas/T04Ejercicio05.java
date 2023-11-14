/**
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Introduzca el valor de a: ");
    double a = sc.nextDouble();
    System.out.print("Introduzca el valor de b: ");
    double b = sc.nextDouble();
    double x = -b/a;

    if (a==0) {
      System.out.println("Esa ecuasion no tiene solucion real");
    }else{
      System.out.println("x = "+x);
    }
    sc.close();
  }
}