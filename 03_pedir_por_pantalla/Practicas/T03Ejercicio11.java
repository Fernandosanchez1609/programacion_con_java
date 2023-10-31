/**
* conversor de kb a mb 
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Indique cuantos KB quiere convertir: ");
    float kb = sc.nextFloat();

    System.out.println(kb+" KB son "+(kb/1024)+" MB");
    sc.close();
  }
}
