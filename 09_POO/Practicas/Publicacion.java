public abstract class Publicacion {
  String isbn;
  String titulo;
  int fechaPublicacion;

  ////////Constructores
  public Publicacion(String isbn, String titulo, int fechaPublicacion){
    this.isbn = isbn;
    this.titulo = titulo;
    this.fechaPublicacion = fechaPublicacion;
  }

  @Override
  public String toString() {
    return "ISBN= " + isbn + ", Titulo= " + titulo + ", Fecha de publicacion=" + fechaPublicacion;
  }

  
}
