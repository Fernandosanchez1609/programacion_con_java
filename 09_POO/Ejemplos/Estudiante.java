/**
* clase que hereda de persona
*
*@author Fernando Sanchez
*/
public class Estudiante extends Persona {
  ////////Atributos
  private int creditos;

  ////////Constructores
  public Estudiante(String nombre, int edad, String dni){
    super(nombre, edad, dni);
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos){
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  ////////Getters
  public int getCreditos() {
    return creditos;
  }

  @Override
  public String toString() {
    return super.toString() + "[Estudiante] Creditos: "+ creditos;
  }

  ////////Metodos
//   public void mostrarDatos(){
//     super.mostrarDatos(); //llamo a mostrar datos de la super clase osea persona
//     System.out.println("Estudiante matriculadol de  "+creditos+ "\tCreditos: ");
//   }

  
}
