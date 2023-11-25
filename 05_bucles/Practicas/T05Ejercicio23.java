/**
* Escribe un programa que permita ir introduciendo una serie indeterminada
* de números mientras su suma no supere el valor 10000. Cuando esto último
* ocurra, se debe mostrar el total acumulado, el contador de los números
* introducidos y la media.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int suma=0;
    int num=0;
    int contador=0;
    double media;

    do {
      System.out.print("Escriba un numero: ");
      num=sc.nextInt();
      suma+=num;
      contador++;

    } while (suma<10000);
    media = suma/contador;

    System.out.println("La suma de esos numeros es: "+suma);
    System.out.println("Has introducido "+contador+" numeros");
    System.out.println("La media de esos numeros es "+media);
    
    sc.close();
  }
}
