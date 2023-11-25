/**
* Realiza un programa que vaya pidiendo números hasta que se introduzca un
* numero negativo y nos diga cuantos números se han introducido, la media de
* los impares y el mayor de los pares. El número negativo sólo se utiliza para
* indicar el final de la introducción de datos pero no se incluye en el cómputo
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numIntroducido=0;
    int cantidadIntroducida=0;
    double cantidadImpares=0;
    double sumaImpares=0;
    int parMayor=0;


    do {
      System.out.print("Introduzca un numero: ");
      numIntroducido=sc.nextInt();

      if (numIntroducido>0) { //contar cuantos numeros se han introducido (no se cuentan los ceros ni el negativo)
        cantidadIntroducida++;
      }
      
      if ((numIntroducido%2==0)&&(numIntroducido>parMayor)) { //si es par hacemos una cosa y si es impar hacemos otra cosa
        parMayor=numIntroducido;

      } else if ((numIntroducido%2!=0)&&(numIntroducido>0)){
        cantidadImpares++;
        sumaImpares+=numIntroducido;
      }
    } while (numIntroducido>=0);

    System.out.println("Has introducido "+cantidadIntroducida+" numeros");
    System.out.println("La media de los numeros impares es: "+(sumaImpares/cantidadImpares));
    System.out.println("El mayor de los pares es: "+parMayor);

    sc.close();
  }
}
