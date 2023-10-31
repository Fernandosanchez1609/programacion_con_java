/**
* concersor de pesetas a euros y pide las pesetas por teclado
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("cuantas pesetas quiere convertir?: ");
    Double pesetas = sc.nextDouble();
    double euros = pesetas/166.386;
    System.out.printf(pesetas+" pesetas a euros son: "+" %.2f euros",euros);

    sc.close();
  }
}
