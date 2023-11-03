/**
* pedir que dia de la semana es y decir que clase tenemos ese dia a primera hora
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T04Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escribe que dia de la semana es (1-5): ");
    int dia = sc.nextInt();

    switch (dia) {
      case 1:
        System.out.println("Tienes FOL");
        break;
    
      case 2:
        System.out.println("Tienes Programacion");
        break;

      case 3:
        System.out.println("Tienes entorno de desarrollo");
        break;

      case 4:
        System.out.println("Tienes base de datos");
        break;

      case 5:
        System.out.println("Tienes programacion");
        break;

      default:
        System.out.println("error dia no vlido");
    }
    sc.close();
  }
}
