import java.util.Scanner;
import matematicas.Varias;

/**
* ejemplo para funcion que devuelve una secuencia de fibonachi
*
*@author Fernando Sanchez
*/
public class FibonachiFuncion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cuantos numeros de fibonachi quiere escribir: ");
    int numero = sc.nextInt();
    
    Varias.fibonachi(numero);
    sc.close();
  }
}
