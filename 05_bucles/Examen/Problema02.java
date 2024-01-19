/**
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Problema02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int puntaje1=0;
    int puntaje2=0;
    String jugada1;
    String jugada2;
    int ancho1;
    int ancho2;
    boolean correcto =true;
    int ganador=0;

    System.out.print("introduzca el nombre del primer jugador: ");
    String nombre1 = sc.nextLine();
    ancho1 =nombre1.length();
    System.out.print("introduzca el nombre del segundo jugador: ");
    String nombre2 = sc.nextLine();
    ancho2 = nombre2.length();

    do {
      do {
        System.out.print(nombre1+" introduzca su jugada: (piedra,papel,tijeras): ");
        jugada1=sc.nextLine();
        switch (jugada1) {
          case "piedra","papel","tijeras":
            correcto=true;
            break;
        
          default:
            correcto=false;
            break;
        }

      } while (correcto=false);

      System.out.print("\033[H\033[2J"); 
      System.out.flush();

      do {
        System.out.print(nombre2+" introduzca su jugada: (piedra,papel,tijeras): ");
        jugada2=sc.nextLine();
        switch (jugada2) {
          case "piedra","papel","tijeras":
            correcto=true;
            break;
        
          default:
            correcto=false;
            break;
        }

      } while (correcto=false);

      if (jugada1.equals(jugada2)) {
        ganador=2;
      } else if (jugada1.equals("piedra") && jugada2.equals("papel") ){
        ganador=1;
      } else if (jugada1.equals("papel") && jugada2.equals("tijeras") ){
        ganador=1;
      } else if (jugada1.equals("tijera") && jugada2.equals("piedra") ){
        ganador=1;
      } else if (jugada2.equals("piedra") && jugada1.equals("papel") ){
        ganador=0;
      } else if (jugada2.equals("papel") && jugada1.equals("tijeras") ){
        ganador=0;
      } else if (jugada2.equals("tijera") && jugada1.equals("piedra") ){
        ganador=0;
      }

      switch (ganador) {
        case 0:
          System.out.println("Gana "+nombre1);
          puntaje1++;
          break;
        case 1:
          System.out.println("Gana "+nombre2);
          puntaje2++;
        case 2:
          System.out.println("Empate");
        default:
          break;
      }

      if (ancho1>=ancho2) {
        System.out.print(" ");
        for (int i = 0; i < ancho1+4; i++) {
          System.out.print("-");
        }
        System.out.print(" ");
        for (int i = 0; i < 2; i++) {
          System.out.print("-- ");
        }
        for (int i = 0; i < ancho1+4; i++) {
          System.out.print("-");
        }
        System.out.println();

        System.out.print("|");
        for (int i = 0; i < (ancho1+2)-ancho1; i++) {
          System.out.print(" ");
        }
        System.out.print(nombre1+"  | "+puntaje1+" | "+puntaje2+" |");
        for (int i = 0; i < (ancho1+2)-ancho2; i++) {
          System.out.print(" ");
        }
        System.out.print(nombre2+"  |");
        System.out.println();

        System.out.print(" ");
        for (int i = 0; i < ancho1+4; i++) {
          System.out.print("-");
        }
        System.out.print(" ");
        for (int i = 0; i < 2; i++) {
          System.out.print("-- ");
        }
        for (int i = 0; i < ancho1+4; i++) {
          System.out.print("-");
        }
        System.out.println();

      } else {
         System.out.print(" ");
        for (int i = 0; i < ancho2+4; i++) {
          System.out.print("-");
        }
        System.out.print(" ");
        for (int i = 0; i < 2; i++) {
          System.out.print("- ");
        }
        for (int i = 0; i < ancho2+4; i++) {
          System.out.print("-");
        }
        System.out.println();

        System.out.print("|");
        for (int i = 0; i < (ancho2+2)-ancho1; i++) {
          System.out.print(" ");
        }
        System.out.print(nombre1+"  | "+puntaje1+" | "+puntaje2+" |");
        for (int i = 0; i < (ancho2+2)-ancho2; i++) {
          System.out.print(" ");
        }
        System.out.print(nombre2+"  |");

        System.out.print(" ");
        for (int i = 0; i < ancho2+4; i++) {
          System.out.print("-");
        }
        System.out.print(" ");
        for (int i = 0; i < 2; i++) {
          System.out.print("- ");
        }
        for (int i = 0; i < ancho2+4; i++) {
          System.out.print("-");
        }
        System.out.println();
      }

    } while (puntaje1<3 && puntaje2<3);
    sc.close();
  }
}
