import java.util.Scanner;

public class Scaner2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce tu nombre y tu edad (separados con un espacio): ");
    String nombre= sc.next();
    int edad = sc.nextInt();

    System.out.println("Tu nombre es: "+nombre+" y tu edad es: "+edad);
    sc.close();
  }
}
