/**
* sumar restar multiplicar y dividir dos numeros pedidos por pantalla
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba el primer numero: ");
    Float num1 = sc.nextFloat();
    System.out.println("Escriba el segundo numero: ");
    Float num2 = sc.nextFloat();

    System.out.println("La suma de "+num1+"+"+num2+" es igual a: "+(num1+num2));
    System.out.println("La resta de "+num1+"-"+num2+" es igual a: "+(num1-num2));
    System.out.println("La divicion de "+num1+"/"+num2+" es igual a: "+(num1/num2));
    System.out.println("La multiplicacion de "+num1+"X"+num2+" es igual a: "+(num1*num2));

    sc.close();
  }
}
