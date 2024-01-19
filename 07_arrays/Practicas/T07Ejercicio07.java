/**
* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
* muestre por pantalla separados por espacios. El programa pedirá entonces por
* teclado dos valores y a continuación cambiará todas las ocurrencias del primer
* valor por el segundo en la lista generada anteriormente. Los números que se
* han cambiado deben aparecer entrecomillados.
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T07Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[100];
    int remplazado;
    int remplazo;

    //rellenamos el array con 100 numeros aleatoreos entre 0 al 20
    for (int i = 0; i < numeros.length; i++) {
      numeros[i]=(int)(Math.random()*21);
    }

    //mostramos el array
    for (int i : numeros) {
      System.out.print(i+" ");
    }
    System.out.println();

    //preguntamos que numero quiere reemplazar y por cual
    System.out.print("Escriba que numero quiere reemplazar: ");
    remplazado=sc.nextInt();
    System.out.print("Ahora escriba por que numero lo quieres reemplazar: ");
    remplazo=sc.nextInt();

    //mostrar el array con los cambios hechos
    for (int i : numeros) {
      if (i==remplazado) {
        System.out.print("\""+remplazo+"\""+" ");
      }else{
        System.out.print(i+" ");
      }
    }
    sc.close();
  }
}
