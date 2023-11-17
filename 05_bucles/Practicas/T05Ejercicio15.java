/**
* Escribe un programa que dados dos números, uno real (base) y un entero
* positivo (exponente), saque por pantalla todas las potencias con base el
* numero dado y exponentes entre uno y el exponente introducido
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escriba la base: ");
    int base = sc.nextInt();
    System.out.print("Escriba el exponente: ");
    int exponente = sc.nextInt();
    int base2 = 1;

    for (int i = 0; i < exponente; i++) {
      System.out.print(base*base2+" ");
      base2 = base*base2;
    }
    sc.close();
 
  }
}
