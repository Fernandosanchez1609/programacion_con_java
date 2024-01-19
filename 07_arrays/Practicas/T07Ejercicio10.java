/**
* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
* y que los almacene en un array. El programa debe ser capaz de pasar todos
* los números pares a las primeras posiciones del array (del 0 en adelante) y
* todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
* necesario.
*
*@author Fernando Sanchez
*/
public class T07Ejercicio10 {
  public static void main(String[] args) {
    int[] numeros = new int[20];
    int[] pares= new int[20];
    int paresContador=0;
    int[] impares = new int[20];
    int imparesContador=0;
    int contador =0;

    for (int i = 0; i < numeros.length; i++) {
      numeros[i]=(int)(Math.random()*101);
    }
    
    for (int i : numeros) {
      if (i%2==0) {
        pares[paresContador]=i;
        paresContador++;
      } else {
        impares[imparesContador]=i;
        imparesContador++;
      }
    }

    
    for (int j = 0; j < paresContador; j++) {
      numeros[j]=pares[j];
    }

    for (int i = 0+paresContador; i < 20; i++) {
      numeros[i]=impares[contador];
      contador++;
    }

    for (int i : numeros) {
      System.out.print(i+" ");
    }
  }
}
