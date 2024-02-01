public class Ejercicio2 {

  // Función para generar una tabla con números aleatorios
  public static int[][] generarTablaAleatoria(int filas, int columnas, int maxAleatorio) {
    int[][] tabla = new int[filas][columnas];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        tabla[i][j] = (int) (Math.random() * maxAleatorio + 1);
      }
    }
    return tabla;
  }

  // Función para generar una tabla introduciendp números manualmente
  public static int[][] generarTablaManual(int filas, int columnas) {
    int[][] tabla = new int[filas][columnas];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.println("Escriba el numero de la posision " + i + " " + j + " de la tabla");
        tabla[i][j] = Integer.parseInt(System.console().readLine());
      }
    }
    return tabla;
  }

  // Función para mostrar la tabla
  public static void mostrarTabla(int[][] tabla) {
    if (tabla == null) {
      System.out.println("Primero debe generar la tabla.");
      return;
    }
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[0].length; j++) {
        System.out.print(tabla[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Función para intercambiar dos filas en la tabla
  public static void intercambiarFilas(int[][] tabla, int fila1, int fila2) {
    int[] tablaAux = new int[tabla.length];

    if (tabla == null) {
      System.out.println("La tabla no puede estar vacia");
    }else {
      for (int i = 0; i < tabla[fila1].length; i++) {
        tablaAux[i] = tabla[fila2][i];
        tabla[fila2][i] = tabla[fila1][i];
        
        tabla[fila1][i] = tablaAux[i];
  
      }
      System.out.println("Las filas fueron intercambiadas use la opcion 3 para verlo");
    }

  }

  // Función para intercambiar dos columnas en la tabla
  public static void intercambiarColumnas(int[][] tabla, int col1, int col2) {
    int[] tablaAux = new int[tabla.length];

    if (tabla == null) {
      System.out.println("La tabla no puede estar vacia");
    }

    for (int i = 0; i < tabla.length; i++) {
      tablaAux[i] = tabla[i][col2];
      tabla[i][col2] = tabla[i][col1]; 
      tabla[i][col1] = tablaAux[i];

    }
    System.out.println("Las columnas fueron intercambiadas use la opcion 3 para verlo");
  }

  // Función para sumar los elementos de una fila
  public static int sumarFila(int[][] tabla, int fila) {
    int suma = 0;
    for (int i = 0; i < tabla[fila].length; i++) {
      suma = suma + tabla[fila][i];
    }
    return suma;
  }

  // Función para sumar los elementos de una columna
  public static int sumarColumna(int[][] tabla, int col) {
    int suma = 0;
    for (int i = 0; i < tabla[0].length; i++) {
      suma = suma + tabla[i][col];
    }
    return suma;
  }

  public static void main(String[] args) {
    int[][] tabla = null;
    boolean continuar = true;
    int filas;
    int columnas;
    int fila1;
    int col1;
    int fila2;
    int col2;
    int filaSuma;
    int colSuma;
    int maxAleatorio;

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
          System.out.print("Escriba cuantas filas quiere: ");
          filas = Integer.parseInt(System.console().readLine());
          System.out.print("Escriba cuantas columnas quiere: ");
          columnas = Integer.parseInt(System.console().readLine());
          System.out.print("Escriba el numero aleatorio maximo para rellenar la columna: ");
          maxAleatorio = Integer.parseInt(System.console().readLine());
          tabla = generarTablaAleatoria(filas, columnas, maxAleatorio);
          break;
        case 2:
          System.out.print("Escriba cuantas filas quiere: ");
          filas = Integer.parseInt(System.console().readLine());
          System.out.print("Escriba cuantas columnas quiere: ");
          columnas = Integer.parseInt(System.console().readLine());
          tabla = generarTablaManual(filas, columnas);
          break;
        case 3:
          mostrarTabla(tabla);
          break;
        case 4:
          System.out.print("Escriba cual fila quiere intercambiar: ");
          fila1 = Integer.parseInt(System.console().readLine());
          System.out.print("Escriba por cual fila la va a intercambiar: ");
          fila2 = Integer.parseInt(System.console().readLine());
          intercambiarFilas(tabla, fila1, fila2);
          break;
        case 5:
          System.out.print("Escriba cual fila quiere intercambiar: ");
          col1 = Integer.parseInt(System.console().readLine());
          System.out.print("Escriba por cual fila la va a intercambiar: ");
          col2 = Integer.parseInt(System.console().readLine());
          intercambiarColumnas(tabla, col1, col2);
          break;
        case 6:
          System.out.println("Que fila quieres sumar?");
          filaSuma = Integer.parseInt(System.console().readLine());
          int sumaFila = sumarFila(tabla, filaSuma);
          System.out.println("La suma es "+sumaFila);
          break;
        case 7:
          System.out.println("Que columna quieres sumar?");
          colSuma = Integer.parseInt(System.console().readLine());
          int sumaCol = sumarColumna(tabla, colSuma);
          System.out.println("La suma es "+sumaCol);
          break;
        case 8:
          System.out.println("¡Gracias!");
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}
