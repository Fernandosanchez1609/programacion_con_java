/**
* Define un array de 12 números enteros con nombre num y asigna los valores
* según la tabla que se muestra a continuación. Muestra el contenido de todos
* los elementos del array
*
*@author Fernando Sanchez
*/
public class T07Ejercicio01 {
  public static void main(String[] args) {
    int[] numeros = new int[12];
    numeros[0]=39;
    numeros[1]=-2;
    numeros[4]=0;
    numeros[6]=14;
    numeros[8]=5;
    numeros[9]=120;

    for (int i : numeros) {
      System.out.print(i+" ");
    }
  }
}
