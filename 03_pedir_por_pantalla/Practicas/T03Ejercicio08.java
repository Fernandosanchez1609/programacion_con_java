/**
* programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cuantas horas a trabajado esta semana?: ");
    float horas = sc.nextFloat();

    System.out.println("Su salario esta semana es de: "+(horas*12)+" euros");
    sc.close();
  }
}
