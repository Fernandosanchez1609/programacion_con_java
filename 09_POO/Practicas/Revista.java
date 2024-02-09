public class Revista extends Publicacion {
  ///////Atributos
  int numero;

  ///////Constructores
  public Revista(String isbn, String titulo, int fechaPublicacion, int numero) {
    super(isbn, titulo, fechaPublicacion);
    this.numero = numero;
  }

  //////Metodos
  @Override
  public String toString() {
    return super.toString();
  }
}
