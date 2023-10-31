/**
* calcular el area de un triangulo pidiendo altura y base
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Determine la base del triangulo: ");
    double base = sc.nextInt();
    System.out.print("Determine la altura del triangulo: ");
    double altura = sc.nextInt();

    System.out.println("El area de un triangulo de base "+base+" y altura "+altura+" es: "+(base*altura/2));
    sc.close();
  }
}
