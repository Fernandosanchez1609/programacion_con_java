/*
 Hacer un ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) hasta que se introduzca un número negativo. A continuación se mostrará una tabla donde en la primera columna aparecerán los números introducidos y en cada fila aparecerá repetido el carácter introducido tantas veces como indique la primera columna.
 * 
 * @author Fernando Sanchez
 */

 public class T05Historigrama {
  public static void main(String[] args) {
    int cifraIntroducida =0; //Almacena la cifra introducida
    long numeroCompleto =0; //el numero que se forma al finalizar la inclusion de todas las cifras
    long numeroVolteado =0;
    int digito =0;          //lee el digito
    int digitoMayor =0;     //almacena el digito mayor conforme lee el numero completo
    int numeroDigitos=0;    //almacena el numero total de digitos introducidos

    System.out.println("Introduzca numeros entre el 0 y el 9. introduzca un negativo si quieres parar");

    do {
      cifraIntroducida = Integer.parseInt(System.console().readLine());
      if (cifraIntroducida>=0 && cifraIntroducida <=9) {
        numeroCompleto=(numeroCompleto*10)+cifraIntroducida;
      }
    } while (cifraIntroducida>=0 );

    //le damos la vuelta al numero y ademas vamos a ver cual es el mayor
    while (numeroCompleto>0) {
      digito =(int)(numeroCompleto%10);
      if (digito>digitoMayor ) {
        digitoMayor=digito;
      }
      numeroVolteado=(numeroVolteado*10)+digito;
      numeroCompleto /=10;
      numeroDigitos++;
    }

    //empezamos a mostrar en forma de tablas
    int numeroColumnas = digitoMayor+1;
    int numeroFilas = numeroDigitos;

    //pintamos la primera hilera de guiones
    for (int i = 1; i <= numeroColumnas; i++) {
      System.out.print(" ---");
    }

    //pintar las filas
    for (int i = 1; i <= numeroFilas; i++) {
      System.out.println();
      digito =(int)numeroVolteado%10;  
      numeroVolteado/=10;   
      System.out.print("| "+digito+" |"); //pintamos la fila de los digitos

      //pintamos las columnas con asteriscos
      for (int j = 1; j <= digito; j++) {
        System.out.print(" * |");
      }

      //pintamos el resto de columnas sin asteriscos
      for (int j = 1; j <= numeroColumnas - digito - 1; j++) {
        System.out.print("   |");
      }
      System.out.println();

      for (int j = 1; j <= numeroColumnas; j++) {
        System.out.print(" ---");
      }
      
    }


  }
 }