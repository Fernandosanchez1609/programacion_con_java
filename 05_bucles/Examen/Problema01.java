/**
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Problema01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nota1=0;
    int nota2=0;
    int nota3=0;
    int revnota1=0;
    int revnota2=0;
    int revnota3=0;
    double media=0;
    String nombre;
    int ancho =0;
    String respuesta="s";

    while (respuesta.equals("s")) {
      System.out.print("Escriba el nombre: ");
      nombre = sc.nextLine();
      ancho = nombre.length();

      do {
        System.out.print("Escribe la nota del primer trimestre: ");
        nota1 = sc.nextInt();
        System.out.print("Escribe la nota del segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.print("Escribe la nota del tercer trimestre: ");
        nota3 = sc.nextInt();

        System.out.println("Para revisar que haya introducido las notas correctas le volveremos a pedir las 3 notas");
        System.out.print("Escribe la nota del primer trimestre: ");
        revnota1 = sc.nextInt();
        System.out.print("Escribe la nota del segundo trimestre: ");
        revnota2 = sc.nextInt();
        System.out.print("Escribe la nota del tercer trimestre: ");
        revnota3 = sc.nextInt();
      
        if (nota1!=revnota1 || nota2!=revnota2 || nota3!=revnota3 ) {
          System.out.println("Has introducido una nota mal vuelva a introducir las notas");
        }
      } while (nota1!=revnota1 || nota2!=revnota2 || nota3!=revnota3 );
    
      media=((double)nota1+(double)nota2+(double)nota3)/3;

      System.out.print(" ");
      for (int i = 1; i <= ancho+2; i++) {
        System.out.print("-");
       }

      for (int i = 0; i <3; i++) {

        System.out.print(" ");
       for (int j = 0; j < 4; j++) {
        System.out.print("-");
        }
      }
   
      System.out.print(" ");
      for (int i = 0; i < 6; i++) {
        System.out.print("-");
      }

      System.out.println("");


      System.out.print("| "+nombre+" |");
      if (nota1<10) {
        System.out.print("  "+nota1+" |");
      } else {
        System.out.print(" "+nota1+" |");
      }

      if (nota2<10) {
        System.out.print("  "+nota2+" |");
      } else {
        System.out.print(" "+nota2+" |");
      }

      if (nota3<10) {
        System.out.print("  "+nota3+" |");
      } else {
        System.out.print(" "+nota3+" |");
      }

      System.out.printf(" %.2f | \n",media);

      System.out.print(" ");
      for (int i = 1; i <= ancho+2; i++) {
        System.out.print("-");
      }

      for (int i = 0; i <3; i++) {

        System.out.print(" ");
        for (int j = 0; j < 4; j++) {
        System.out.print("-");
        }
      }
   
      System.out.print(" ");
      for (int i = 0; i < 6; i++) {
        System.out.print("-");
      }

      System.out.println("");

      System.out.print("Quiere introducir otros datos? (s/n): ");
      respuesta=sc.next();
    }
    
    if ((respuesta.equals("s"))||(respuesta.equals("n"))) {
      System.out.println("Adios");
    } else{
      System.out.println("Error dato introducido incorrecto");
    }

    sc.close();
  }
}
