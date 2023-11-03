import java.util.Scanner;

/**
* Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
*
*@author Fernando Sanchez
*/
public class T04Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escribe un numero (1-7): ");
    int dia = sc.nextInt();

    switch (dia) {
      case 1:
        System.out.println("Es lunes");
        break;
    
      case 2:
        System.out.println("Es martes");
        break;

      case 3:
        System.out.println("Es miercoles");
        break;

      case 4:
        System.out.println("Es jueves");
        break;

      case 5:
        System.out.println("Es viernes");
        break;

      case 6:
        System.out.println("Es sabado");
        break;

      case 7:
        System.out.println("Es domingo");
        break;

      default:
        System.out.println("error dia no vlido");
    }
    sc.close();
  }
}
