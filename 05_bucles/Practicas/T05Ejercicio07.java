/**
* Realiza el control de acceso a una caja fuerte. La combinación será un
* número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
* acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
* y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
* Tendremos cuatro oportunidades para abrir la caja fuerte.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int intentos = 4;
    boolean acierto = false;
    final int num = 1234;
    int numin = 0;
    do {
      System.out.println("Introduzca la clave secreta para abrir la caja fuerte: ");
      numin = sc.nextInt();
      intentos = intentos-1;
      if (num==numin) {
        System.out.println("Caja fuerte abierta con exito");
        acierto = true;
      } else if (intentos>0){
        System.out.println("Contraseña incorrecta intente de nuevo quedan "+intentos+" intentos");
      }
    } while (intentos>0 && acierto==false);
    sc.close();
  }
}
