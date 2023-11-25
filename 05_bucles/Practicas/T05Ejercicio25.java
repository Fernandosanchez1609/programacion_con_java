/**
* Realiza un programa que pida un número por teclado y que luego muestre ese
* número al revés
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T05Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOrg;;
    int num=0;
    int digito=0;
    int invertido=0;
   
    System.out.print("Escriba un numero para ponerlo al revez: ");
    numOrg=sc.nextInt();
    num=numOrg;

    while (num>0) {
      digito=num%10;
      invertido= invertido*10+digito;
      num/=10;
    }
   System.out.println("El numero "+numOrg+" al revez es "+invertido);
   sc.close();
  }
}
