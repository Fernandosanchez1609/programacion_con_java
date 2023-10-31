/**
*  calcule el volumen de un cono según la fórmula V =πr2h/3
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Determine el radio del cono: ");
    float radio = sc.nextFloat();
    System.out.print("Determine la altura del cono: ");
    float altura = sc.nextFloat();

    System.out.println("el volumen del cono de radio "+radio+" y altura "+altura+"es: "+((3.14*(radio*radio)*altura)/3));

    sc.close();
  }
}
