/**
* Escribe un programa que lea una lista de diez números y determine cuántos
* son positivos, y cuántos son negativos
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int positivos = 0;
    int negativos = 0;
    for (int i = 0; i < 10; i++) {
      System.out.print("Escriba un numero: ");
      num = sc.nextInt();

      if (num>0) {
        positivos++;
      } else if (num<0) {
        negativos++;
      }
    }

    System.out.println("Has introducido "+positivos+" numeros positivos y "+negativos+" numeros negativos");
    sc.close();
  }
}
