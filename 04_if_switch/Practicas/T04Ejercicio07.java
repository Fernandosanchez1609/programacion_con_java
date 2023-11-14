/**
* calcular media de 3 notas
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T04Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Diga la nota 1: ");
    double nota1 = sc.nextDouble();
    System.out.print("Diga la nota 2: ");
    double nota2 = sc.nextDouble();
    System.out.print("Diga la nota 3: ");
    double nota3 = sc.nextDouble();
    double notaf = (nota1+nota2+nota3)/3;
    System.out.println("La media es "+notaf);

    sc.close();
  }
}
