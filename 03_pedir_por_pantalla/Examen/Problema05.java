/**
* 
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Problema05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("\033[1;30mVOLUMEN DE UN TRONCO DE CONO\033[0m\n");
    System.out.println("========================================");
    System.out.print("Introduzca el radio de la base mayor R (cm): ");
    double R = sc.nextDouble();
    System.out.print("Introduzca el radio de la base menor r (cm): ");
    double r = sc.nextDouble();
    System.out.print("Introduzca la altura h (cm): ");
    double h = sc.nextDouble();
    final double Pi = Math.PI;
    double v = (Pi*h)*(R*R+r*r+R*r)/3;
    System.out.printf("El volumen del toroide es de "+"\033[0;31m%.4f"+" cm\u00B3\033[0m",v);

    sc.close();
  }
}
