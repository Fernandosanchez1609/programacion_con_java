public class Ejercicio3 {
  public static void main(String[] args) {
    int num;
    int[][] apuesta = new int[3][15];
    int[][] resultado = new int[3][15];
    int contador = 0;
    int contador2 =0;
    int apuestaLocal;
    int apuestaVisitante;
    int aciertos =0;

    //Apuesta
    System.out.println("Apuesta");
    for (int i = 0; i < 14; i++) {
      System.out.printf("%3s. |",(i+1));

      /////Primera apuesta
      num = (int)(Math.random()*3);
      apuesta [contador2][contador] = num;
      if (num == 1) {
        System.out.print(num+"  ");
      }else if (num == 2) {
        System.out.print("  "+num);
      }else {
        System.out.print(" X ");
      }
      System.out.print("|");
      contador2++;
      
      //Segunda apuesta
      num = (int)(Math.random()*3);
      apuesta [contador2][contador] = num;
      if (num == 1) {
        System.out.print(num+"  ");
      }else if (num == 2) {
        System.out.print("  "+num);
      }else {
        System.out.print(" X ");
      }
      System.out.print("|");
      contador2++;

      //Tercera apuesta
      num = (int)(Math.random()*3);
      apuesta [contador2][contador] = num;
      if (num == 1) {
        System.out.print(num+"  ");
      }else if (num == 2) {
        System.out.print("  "+num);
      }else {
        System.out.print(" X ");
      }
      System.out.print("|");
      contador++;
      contador2=0;

      System.out.println();
    }
    System.out.println("------------------");

    //Fila 15
    apuestaLocal= (int)(Math.random()*4);
    apuestaVisitante= (int)(Math.random()*4);
    apuesta[0][14] = apuestaLocal;
    apuesta[1][14] = apuestaVisitante;

    if (apuestaLocal == 3 && apuestaVisitante <3) {
      System.out.print("15. | Local M Visitante "+apuestaVisitante);
    } else if (apuestaVisitante == 3 && apuestaLocal <3) {
      System.out.print("15. | Local "+apuestaLocal+" Visitante M");
    }else if (apuestaLocal == 3 && apuestaVisitante == 3) {
      System.out.print("15. | Local M Visitante M");
    }else {
      System.out.print("15. | Local "+apuestaLocal+" Visitante "+apuestaVisitante);
    }
    
    //Resultado
    contador=0;
    System.out.println("\n Resultado: ");
    for (int i = 0; i < 14; i++) {
      System.out.printf("%3s. |",(i+1));

      /////Primera apuesta
      num = (int)(Math.random()*3);
      resultado [contador2][contador] = num;
      if (num == 1) {
        System.out.print(num+"  ");
      }else if (num == 2) {
        System.out.print("  "+num);
      }else {
        System.out.print(" X ");
      }
      System.out.print("|");
      contador2++;
      
      //Segunda apuesta
      num = (int)(Math.random()*3);
      resultado [contador2][contador] = num;
      if (num == 1) {
        System.out.print(num+"  ");
      }else if (num == 2) {
        System.out.print("  "+num);
      }else {
        System.out.print(" X ");
      }
      System.out.print("|");
      contador2++;

      //Tercera apuesta
      num = (int)(Math.random()*3);
      resultado [contador2][contador] = num;
      if (num == 1) {
        System.out.print(num+"  ");
      }else if (num == 2) {
        System.out.print("  "+num);
      }else {
        System.out.print(" X ");
      }
      System.out.print("|");
      contador++;
      contador2=0;

      System.out.println();
    }
    System.out.println("------------------");

    //Fila 15
    apuestaLocal= (int)(Math.random()*4);
    apuestaVisitante= (int)(Math.random()*4);
    resultado[0][14] = apuestaLocal;
    resultado[1][14] = apuestaVisitante;

    if (apuestaLocal == 3 && apuestaVisitante <3) {
      System.out.println("15. | Local M Visitante "+apuestaVisitante);
    } else if (apuestaVisitante == 3 && apuestaLocal <3) {
      System.out.println("15. | Local "+apuestaLocal+" Visitante M");
    }else if (apuestaLocal == 3 && apuestaVisitante == 3) {
      System.out.println("15. | Local M Visitante M");
    }else {
      System.out.println("15. | Local "+apuestaLocal+" Visitante "+apuestaVisitante);
    }


    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 14; j++) {
        if (apuesta[i][j]==resultado[i][j]) {
          aciertos++;
        }
      }
      System.out.println("columna "+(i+1)+" tiene "+aciertos+" aciertos");
      if (aciertos>=10) {
        System.out.println("columna "+(i+1)+" Premiada");
      }

      aciertos=0;
    }

    if (apuesta[0][14]==resultado[0][14] && apuesta[1][14]==resultado[1][14]  ) {
      System.out.println("Pleno Premiado!");
    }
  }
}
