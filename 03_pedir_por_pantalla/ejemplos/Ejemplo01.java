/**
* ejemplo para ver el funcionamiente de pedir datos por pantalla
*
*@author Fernando Sanchez
*/
public class Ejemplo01 {
  public static void main(String[] args) {
    String nombre;
    System.out.print("como te llamas: ");
    nombre = System.console().readLine();
    

    System.out.println("Hola "+nombre);
  }
}
