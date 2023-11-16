/**
* escribir la secuencia de fibonachi
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cuantos numeros de fibonachi quiere escribir: ");
    int numero = sc.nextInt();
    int resultado = 0;
    int anterior = 1;
    int siguiente = 0;

   
    for (int i = 0; i <numero; i++) {
      System.out.print(resultado+" ");
      resultado=siguiente+anterior;
      anterior=siguiente;
      siguiente=resultado;
    }
    sc.close();
  }
}
