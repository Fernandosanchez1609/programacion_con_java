/**
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Problema03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CALCULADORA DE TIEMPO");
    System.out.println("========================");
    System.out.print("Introduce la cantidad de dias: ");
    int dias = sc.nextInt();
    System.out.print(dias+" dias son ");
    int años = dias/365;
    dias=dias-(años*365);
    int meses = dias/30;
    dias=dias-(meses*30);
    System.out.printf("\033[1;37m \033[48;5;9m"+años+" años\033[0m"+", ");
    System.out.printf("\033[1;30m \033[48;5;11m"+meses+" meses\033[0m"+" y ");
    System.out.printf("\033[1;30m \033[48;5;10m"+dias+" dias\033[0m");

    sc.close();
  }
}
