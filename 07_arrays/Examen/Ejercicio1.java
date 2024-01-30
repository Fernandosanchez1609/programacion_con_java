public class Ejercicio1 {
  public static void main(String[] args) {
    int num1;
    int num2;
    int numia1;
    int numia2;
    int numAdivina;
    int intentos = 0;
    int respuesta = 0;
    boolean salir = false;
    int opcion = 0;

    System.out.println("-D-I-V-I-N-A-R-E-M-");
    System.out.println("Divinarem pensará un número entre los valores que tu decidas");
    System.out.print("Introduzca el valor mínimo del intervalo: ");
    num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor máximo del intervalo: ");
    num2 = Integer.parseInt(System.console().readLine());

    do {
      System.out.println("-D-I-V-I-N-A-R-E-M-");
      do {
        numia1 = (int) ((Math.random() * num2 + 1) + num1);
        numia2 = (int) ((Math.random() * num2 + 1) + num1);
      } while (numia1 == numia2);

      if (numia1 < numia2) {
        System.out.println("Estoy pensando en un numero entre " + numia1 + " y " + numia2);
        do {
          numAdivina = (int) ((Math.random() * numia2 + 1) + numia1);
        } while (numAdivina > numia2);
        intentos = (int) (Math.log(numia2 - numia1 + 1) / Math.log(2));
      } else {
        System.out.println("Estoy pensando en un numero entre " + numia2 + " y " + numia1);
        do {
          numAdivina = (int) ((Math.random() * numia1 + 1) + numia2);
        } while (numAdivina > numia1);
        intentos = (int) (Math.log(numia1 - numia2 + 1) / Math.log(2));
      }
      System.out.println("Tienes " + intentos + " intentos");

      do {
        System.out.print("Escriba un numero: ");
        respuesta = Integer.parseInt(System.console().readLine());

        if (respuesta == numAdivina) {
          System.out.println("Efectivamente el numero era " + numAdivina);
          salir = true;
        } else if (respuesta < numAdivina) {
          System.out.println("Te has queado corto");
        } else if (respuesta > numAdivina) {
          System.out.println("Te has pasado");
        }
        intentos--;
        if (intentos < 1) {
          System.out.println("Te has quedado sin intentos lo siento");
          System.out.println("El numero que habia pensado era " + numAdivina);
          salir = true;
        }
      } while (salir == false);

      System.out.println("1. volver a jugar");
      System.out.println("2. salir");
      System.out.print("opcion: ");
      opcion = Integer.parseInt(System.console().readLine());
    } while (opcion == 1);

    System.out.println("Gracias por jugar a -D-I-V-I-N-A-R-E-M-");

  }
}
