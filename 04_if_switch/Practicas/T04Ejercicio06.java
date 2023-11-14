/**
* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T04Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Desde que altura cae el objeto: ");
    double h = sc.nextDouble();
    double g = 9.81;
    double t = Math.sqrt(2*h/g);
    System.out.println("El objeto tarda "+t+" segundos en caer");
    
    sc.close();
    }
}
