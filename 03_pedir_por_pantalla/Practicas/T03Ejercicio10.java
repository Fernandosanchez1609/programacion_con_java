/**
* conversor de MB a KB
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Indique cuantos MB quieres convertir: ");
    float mb = sc.nextFloat();

    System.out.println(mb+" MB son "+(mb*1024)+" KB");
    sc.close();
  }
}
