/**
* mostrar la tabla de multiplicar del numero introducido
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("De que numero quieres las tablas: ");
    int num = sc.nextInt();
    for (int i = 0; i <11; i++) {
      System.out.println(num+" X "+i+" = "+(num*i));
    }
    sc.close();
  }
}
