/**
* este programa es un conversor de euros a pesetas y pide los euros por teclado
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("cuantos euros quiere convertir?: ");
    Double euros = sc.nextDouble();
    double pesetas = euros*166.386;
    System.out.println(euros+" euros a pesetas son: "+ (int)pesetas);

    sc.close();
  }
}
