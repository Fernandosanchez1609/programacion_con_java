public class PruebaGato {
  public static void main(String[] args) {
    // Gato garfield = new Gato("Garfield");
    // System.out.println(garfield.nombre);
    // Gato botas = new Gato("Botas", "Negro", "Egipcio", "Macho", 5, 4.2);
    // System.out.println(botas.nombre);
    // System.out.println(botas.color);
    // System.out.println(botas.raza);
    // System.out.println(botas.sexo);
    // System.out.println(botas.edad);
    // System.out.println(botas.peso);
    // // Gato missi = new Gato();
    // // missi.sexo = "hembra";

    // // garfield.come("Pescado");
    // // garfield.maulla();
    // // garfield.ronroneo();
    // // garfield.peleaCon(botas);
    // // botas.peleaCon(missi);
    System.out.println("Cuanros gatos quieres crear: ");
    int num = Integer.parseInt(System.console().readLine());

    Gato[] gatico = new Gato[num];
    String[] nombre = {"Garfield", "Botas", "Willy", "Pancho", "Misifu"};
    String[] colores = {"Marron","Negro","Prdo"};

    for (int i = 0; i < num; i++) {
      int nombreAleatorio = (int)(Math.random()*5);
      int colorAleatorio = (int)(Math.random()*3);
      System.out.println("Introduzca la raza del gato");
      String raza = System.console().readLine();
      gatico[i] = new Gato(nombre[nombreAleatorio], colores[colorAleatorio], raza, "Macho", 0, 0);
    }

    for (int i = 0; i < gatico.length; i++) {
      System.out.println(gatico[i].nombre);
      System.out.println(gatico[i].color);
    }
  }
}
