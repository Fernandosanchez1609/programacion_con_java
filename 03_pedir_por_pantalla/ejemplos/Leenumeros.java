public class Leenumeros {
  public static void main(String[] args) {
    String linea;

    System.out.println("Intreduce un numero entero: ");
    linea =System.console().readLine();

    int num1;
    num1 = Integer.parseInt(linea);


    System.out.println("Intreduce un segundo numero entero: ");
    linea =System.console().readLine();

    int num2;
    num2 = Integer.parseInt(linea);

    System.out.printf("El primer numero es: %d\n",num1);
    System.out.printf("El primer numero es: %d\n",num2);
    System.out.println("el doble de "+num1+" + "+num2+ " es: "+(num1+num2));

    System.out.println("introduce un numero real: ");
    linea = System.console().readLine();
    float numReal1 = Float.parseFloat(linea);
    System.out.printf("El numero real es: %.2f",numReal1);
  }
}
