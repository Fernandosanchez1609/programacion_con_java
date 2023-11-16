/**
* Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n;
    long numeroIntroducido;
    int digitos = 1;
    System.out.print("Introduzca un numero entero: ");
    n = sc.nextLong();
    numeroIntroducido=n;
    while (n>9) {
      n= n/10;
      digitos++;
    }
    System.out.println("El numero "+numeroIntroducido+" tiene "+digitos+" digito/s");
    sc.close();
  }
}
