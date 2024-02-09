/**
* ejemplo para las herencias 
*
*@author Fernando Sanchez
*/
public class Persona {
  
  ////////Atributos
  private String nombre;
  private int edad;
  private String dni;
  
  ////////Constructores
  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

  //////////Getters
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getDni() {
    return dni;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + "\tEdad: " + edad + "\tDNI: " + dni;
  }

  // public void mostrarDatos(){
  //   System.out.println("nombre: "+nombre+"\tEdad: "+edad+"\tDNI: "+dni);
  // }

  
}
