/**
* pide dos numeros y muestra su multiplicacion 
*
*@author Fernando Sanchez
*/
import java.util.Scanner;

public class T03Ejercicio01 { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduza un numero: ");
    int num1 = sc.nextInt();
    System.out.print("Introduza otro numero: ");
    int num2 = sc.nextInt();

    System.out.println("La multiplicacion de "+ num1 + " y "+ num2 + " es igual a: "+ (num1*num2) );

    sc.close();
  }
}
