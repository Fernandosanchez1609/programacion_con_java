/**
* numeros primos pero con funcion
*
*@author Fernando Sanchez
*/


public class NumeroPrimoConFuncion {
  
  //funciones definidas por el usuario
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if (x%i==0) {
        return false;
      }

    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Introduzca un numero entero positivo: ");
    int n = Integer.parseInt(System.console().readLine());
    
    if (esPrimo(n)) {
      System.out.println(n+" es primo");
    } else {
      System.out.println(n+" no es primo");
    }
  }
}
