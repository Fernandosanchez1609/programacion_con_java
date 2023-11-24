/**
* problema 3
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Problema3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num1;
    double num2;
    String operacion;

    System.out.print("Escribe el primer operador: ");
    num1 = sc.nextDouble();
    System.out.print("Escriba el operador (+,-,*,/,^,%): ");
    operacion = sc.next();
    System.out.print("Escribe el segundo operador: ");
    num2 = sc.nextInt();

    switch (operacion) {
      case "+":
        System.out.printf("%.2f"+" + "+"%.2f"+" = "+"%.2f",num1,num2,(num1+num2));
        break;
      
      case "-":
        System.out.printf("%.2f"+" - "+"%.2f"+" = "+"%.2f",num1,num2,(num1-num2));
        break;
      
      case "*":
        System.out.printf("%.2f"+" * "+"%.2f"+" = "+"%.2f",num1,num2,(num1*num2));
        break;
      
      case "/":
        System.out.printf("%.2f"+" / "+"%.2f"+" = "+"%.2f",num1,num2,(num1/num2));
        break;
      
      case "%":
        System.out.printf("%.2f"+" % "+"%.2f"+" = "+"%.2f",num1,num2,(num1%num2));
        break;
      
      case "^":
        System.out.printf("%.2f"+" ^ "+"%.2f"+" = "+"%.2f",num1,num2,(Math.pow(num1, num2)));
        break;
    
      default:
        break;
    }
    sc.close();
  }
}
