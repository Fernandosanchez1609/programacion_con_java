/**
* Realiza un programa que sume los 100 números siguientes a un número entero
* y positivo introducido por teclado. Se debe comprobar que el dato introducido
* es correcto (que es un número positivo).
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int suma =0;
    //bucle para controlar que el numero sea positivo
    do {
      System.out.print("Introduzca un numero positivo y entero: ");
      num=sc.nextInt();
      if (num<0) {
        System.out.println("Numero introducido incorrecto");
      }
    } while (num<0);
    //suma de los numeros
    for (int i = num+1; i < num+101; i++) {
      suma = suma + i;
    }
    System.out.println("La suma es de "+suma);
    sc.close();
  }
}
