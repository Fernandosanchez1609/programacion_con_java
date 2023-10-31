/**
* pedir la base y la altura de un rectangulo y calcular su area
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Determine la base del rectangulo: ");
    int base = sc.nextInt();
    System.out.print("Determine la altura del rectangulo: ");
    int altura = sc.nextInt();

    System.out.println("El area de un rectangulo de base "+base+" y altura "+altura+" es: "+(base*altura));
    sc.close();
  }
}
