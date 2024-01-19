/**
* prueba de las clases
*
*@author Fernando Sanchez
*/
public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Franck Thilliez";
    lib.numeroPaginas = 490;
    System.out.println("Titulo: "+lib.titulo);
    System.out.println("Autor: "+lib.autor);
    System.out.println("Numero de paginas: "+lib.numeroPaginas);
    System.out.println("Numero de edicion: "+lib.edicion);
  }
}
