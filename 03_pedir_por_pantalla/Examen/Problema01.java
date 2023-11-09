/**
* 
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Problema01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("VIDA ÚTIL SSD \n");
    System.out.println("========= \n");
    System.out.print("Escriba cuanto es el factor TWB de su SSD: ");
    double twb = sc.nextDouble();
    int dias = 365*6;
    double gb = (twb/dias)*1000;
    System.out.printf("La cantidad máxima de terabytes que puedes escribir por día es: "+"%.4f"+" TB "+"("+"%.1f"+" GB)",(twb/dias),gb);
    sc.close();
  }
}