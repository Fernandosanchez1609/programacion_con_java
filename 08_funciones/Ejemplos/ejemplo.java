/**
* ejemplo de funciones
*
*@author Fernando Sanchez
*/
public class ejemplo {
  public static void main(String[] args) {
    System.out.println("Introduzca un numero entero positivo: ");
    int n = Integer.parseInt(System.console().readLine());
    boolean primo=true;

    for (int i = 2; i < n; i++) {
      if (n%i==0) {
        primo=false;
      }
    }

    if (primo) {
      System.out.println(n+" es primo");
    } else {
      System.out.println(n+" no es primo");
    }
  }

  
}
