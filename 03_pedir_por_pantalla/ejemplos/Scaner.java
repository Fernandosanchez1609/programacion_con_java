import java.util.Scanner;

public class Scaner {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252");
    System.out.print("introduce tu nombre: ");
    String nombre = sc.nextLine();

    System.out.println("introduce tu edad: ");
    int edad = sc.nextInt();
    System.out.println("Tu  nombre es "+ nombre + " y tienes: "+ edad + " años");
    sc.close();
  }
}
