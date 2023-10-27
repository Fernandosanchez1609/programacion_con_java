public class Ejemplo02 {
  public static void main(String[] args) {
    String num1;
    String num2;

    System.out.println("introduce un numero: ");
    num1 = System.console().readLine();

    System.out.println("introduce otro numero: ");
    num2 = System.console().readLine();

    System.out.println("el resultado es= "+ num1+ num2);
  }
}
