/**
* calcular la nota que hace falta para la media deseada
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class T03Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe la nota del primer examen: ");
    double nota1 = sc.nextDouble();
    System.out.print("Escribe cuanta nota quieres de media: ");
    double notaFinal = sc.nextDouble();
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;

    System.out.println("Para sacar un "+notaFinal+" de media, necesitas sacar un "+nota2+" en el segundo examen");
    sc.close();
  }
}
