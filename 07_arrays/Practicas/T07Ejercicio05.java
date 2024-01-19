/**
* Escribe un programa que pida 10 números por teclado y que luego muestre los
* números introducidos junto con las palabras “máximo” y “mínimo” al lado del
* máximo y del mínimo respectivamente.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T07Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int[] numero = new int[10];
    int faltan = 10;
    for (int i = 0; i < numero.length; i++) {
      System.out.print("Escriba un numero quedan por escribir "+faltan+" numeros: ");
      numero[i]=sc.nextInt();
      faltan --;

      if (numero[i]<minimo) {
        minimo=numero[i];
      }
      if (numero[i]>maximo) {
        maximo=numero[i];
      }
    }

    for (int i : numero) {
      if (i==minimo) {
        System.out.println(i+" Minimo");
      }else if (i==maximo) {
        System.out.println(i+" Maximo");
      }else{
        System.out.println(i);
      }
      
    }
    sc.close();
  }
}
