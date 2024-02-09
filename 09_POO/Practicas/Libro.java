public class Libro extends Publicacion implements Prestable {
  //////// Atributos
  boolean prestado;

  //////// Constructores
  public Libro(String isbn, String titulo, int fechaPublicacion) {
    super(isbn, titulo, fechaPublicacion);
    prestado = false;
  }

  /////// Metodos
  @Override
  public void presta() {
    if (prestado) {
      System.out.println("Lo siento, ese libro ya esta prestado");
    } else {
      this.prestado = true;
      System.out.println("El libro esta prestado");
    }

  }

  @Override
  public void devuelve() {
    if (prestado == false) {
      System.out.println("Este libro no ha sido prestado");
    } else {
      this.prestado = false;
      System.out.println("El libro fue devuelto");
    }

  }

  @Override
  public boolean estaPrestado() {
    return prestado;
  }

  @Override
  public String toString() {
    if (prestado) {
      return super.toString() + " (prestado)";
    } else {
      return super.toString() + " (no prestado)";
    }

  }

}
