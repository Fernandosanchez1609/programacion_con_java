/**
* Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numIntroducido = 0;
    int numerosTotales = 0;
    double suma = 0;

    while (numIntroducido >=0) {
      System.out.print("Introduzca un numero: ");
      numIntroducido = sc.nextDouble();
      if (numIntroducido>0) {
        numerosTotales++;
        suma = suma+numIntroducido;
      }
    }
    System.out.println("La media de las notas introducidas es: "+(suma / numerosTotales));
    sc.close();
  }
}
