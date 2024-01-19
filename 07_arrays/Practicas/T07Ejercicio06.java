/**
* Escribe un programa que lea 15 números por teclado y que los almacene en un
* array. Rota los elementos de ese array, es decir, el elemento de la posición 0
* debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
* la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
* del array.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T07Ejercicio06 {
  public static void main(String[] args) {
    int[] numero= new int[15];
    int faltan = 15;
    Scanner sc = new Scanner(System.in);
    int aux;


    //rellenamos el array numero con 15 numeros pedidos por pantalla
    for (int i = 0; i < numero.length; i++) {
      System.out.print("Escriba un numero quedan por escribir "+faltan+" numeros: ");
      numero[i]=sc.nextInt();
      faltan --;
    }

    //la variable aux nos ayudara a guardar el ultimo numero del array
    aux=numero[14];

    //mostramos el array original
    for (int i : numero) {
      System.out.print(i+" ");
    }
    System.out.println();

    //desplazamos las pociciones del array
    for (int i = 14; i > 0; i--) {
      numero[i]=numero[i-1];
    }
    numero[0]=aux; //el primer numero sera el ultimo el cual estaba guardado en la variable aux

    //mostramos el array desplazado
    for (int i : numero) {
      System.out.print(i+" ");
    }
    sc.close();

  }
}
