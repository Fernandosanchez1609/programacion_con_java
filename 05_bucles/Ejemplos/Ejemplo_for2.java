/**
* otro ejemplo de for imprimir tablas de multiplicar
*
*@author Fernando Sanchez
*/
public class Ejemplo_for2 {
  public static void main(String[] args) {
    for (int i = 2; i < 7; i=i+2) {
      for (int j = 0; j < 11; j++) {
        System.out.println(i+"X"+j+"= "+(i*j));
      }
    }
  }
}
