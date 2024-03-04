package clases;
/**
*
*@author Fernando Sanchez
*/
public abstract class Mascota implements MascotaInterface{
  ////Atributos
  String chip;
  String nombre;
  int edad;
  boolean vacunada;
  static int totalMascotas=0;
  
  ////Constructor
  Mascota() {
    this.vacunada = false;
  }

  //////Metodos
  public void vacunar(){
    this.vacunada=true;
  }

  @Override
  public String toString() {
    return "["+chip+"]: " + " " + nombre + ", " + edad+" años";
  }

  //////Getters
  public static int getTotalMascotas() {
    return totalMascotas;
  }

  public String getChip() {
    return chip;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }
 

  //////Setters
  
 

  public void setEdad(int edad) {
    this.edad = edad;
  }
  
}
