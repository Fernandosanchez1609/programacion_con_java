/**
* Define un array de 10 caracteres con nombre simbolo y asigna valores a los
* elementos según la tabla que se muestra a continuación. Muestra el contenido
* de todos los elementos del array
*
*@author Fernando Sanchez
*/
public class T07Ejercicio02 {
  public static void main(String[] args) {
    String[] letras = new String[10];
    letras[0]="a";
    letras[1]="x";
    letras[4]="@";
    letras[6]="``";
    letras[7]="+";
    letras[8]="Q";

    for (String i :  letras) {
      System.out.print(i+" ");
    }
  }
}
