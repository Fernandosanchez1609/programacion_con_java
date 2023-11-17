/**
* Escribe un programa que pida una base y un exponente (entero positivo) y que
* calcule la potencia.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escriba la base: ");
    int base = sc.nextInt();
    System.out.print("Esciba el exponente: ");
    int exponente = sc.nextInt();
    int numbase = base;

    for (int i = 1; i < exponente; i++) {
      base = base * numbase;
    }
    if (exponente==0) {
      System.out.println("El exponente con base "+numbase+" y exponente "+exponente+" es "+1);
    } else {
      System.out.println("El exponente con base "+numbase+" y exponente "+exponente+" es "+base);
    }
      sc.close();
  }
}
