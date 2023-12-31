/**
* calcular factura segun la base imponible
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escriba la base imponible: ");
    float baseImponible = sc.nextFloat();

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total %8.2f\n", (baseImponible * 1.21));

    sc.close();
  }  
}
