/**
* un juego donde hay una mina y un tesoro
*
*@author Fernando Sanchez
*/
public class TesoroMina {
  public static void main(String[] args) {
    //constantes que representan las casillas 
    final int VACIA = 0;
    final int TESORO = 1;
    final int MINA = 2;
    final int JUGADA = 3;
    int fila;
    int columna;

    //tablero de 4x5
    int[][] tablero = new int[4][5];

    //inicializamos el tablero con casillas VACIA
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = VACIA;
      }
    }

    //se coloca una casilla de tesoro de manera aleatorea en el tablero
    int tesoroFila = (int)(Math.random()*4);     
    int tesoroColumna = (int)(Math.random()*5);
    tablero[tesoroFila][tesoroColumna] = TESORO;


    //se coloca una casilla de mina que no puede ser el mismo del tesoro
    int minaFila;
    int minaColumna;

    do {
      minaFila = (int)(Math.random()*4);
      minaColumna = (int)(Math.random()*4);
    } while ((tesoroFila == minaFila) && (tesoroColumna == minaColumna));
    tablero[minaFila][minaColumna] = MINA;

    //inicia el juego
    System.out.println("JUEGO DEL TESORO ");
    boolean salida = false;
    do {
      //pintar tablero
      for (int i = tablero.length-1; i >= 0; i--) {
        System.out.print(i+ " |");
        for (int j = 0; j < tablero[i].length; j++) {
          if (tablero[i][j]== JUGADA) {
            System.out.printf("%2s","X");
          } else {
            System.out.printf("%2s"," ");
          }
        }
        System.out.println(); //saltamos lineas para pintar la fila siguiente
      }
      System.out.print("   ");
      for (int i = 0; i < (3*tablero.length); i++) {
        System.out.print("_");
      }
      System.out.print("\n   ");
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.printf("%2d", j);
      }
      System.out.println();
      
      //pido las coordenadas
      System.out.print("Introduce fila: ");
      fila = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce columna: ");
      columna = Integer.parseInt(System.console().readLine());

      //comprobar jugada
      switch (tablero[fila][columna]) {
        case VACIA:
          tablero[fila][columna] = JUGADA;
          break;
        case MINA:
          System.out.println("Has perdido");
          salida = true;
          break;
        case TESORO:
          System.out.println("Has ganado");
          salida =true;
          break;
        default:
      }

    } while (!salida); //si salimos del bucle es porque tocamos mina o tesoro

    //pintamso tablerofinal
    String c = "";
    for (int i = tablero.length - 1; i >= 0; i--) {
      System.out.print(i + " |");
      for (int j = 0; j < tablero[i].length; j++) {
        switch (tablero[i][j]) {
          case VACIA:
            c = " ";
            break;
          case MINA:
            c = "*";
            break;
          case TESORO:
            c = "$";
            break;
          case JUGADA:
            c = "X";
            break;
          default:
        }
        System.out.printf("%2s", c);
      }
      System.out.println();
    }
    System.out.print("   ");
    for (int i = 0; i < (3*tablero[0].length); i++) {
      System.out.print("-");
    }
    System.out.print("\n   ");
    for (int j = 0; j < tablero[0].length; j++) {
      System.out.printf("%2d", j);
    }
  }
}
