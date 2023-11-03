/**
* calciuladora de salario semanal las primeras 40 horas valen 12 euros las demas 16
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cuantas horas trabajo durante la semana?: ");
    int horas = sc.nextInt();

    if (horas < 41) {
      System.out.println("su salario es de "+horas*12);
      } else {
       System.out.println("su salario es de "+(480+(horas-40)*16));
      }
    
    sc.close();
  }
}
