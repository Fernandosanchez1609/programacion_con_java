package clases;
/**
*
*@author Fernando Sanchez
*/
public class Perro extends Mascota {
  /////Atributos
  String raza;
  static int totalPerros=0;


  ////constructores
  public Perro(String chip){
    super();
    this.chip = chip;
    totalPerros++;
    totalMascotas++;
  }

  public Perro(String chip, String nombre){
    super();
    this.chip = chip;
    this.nombre = nombre;
    totalPerros++;
    totalMascotas++;
  }

  //////Metodos
  public String ladrad(){
    return("¡Guau! ¡Guau!");
  }

  public void grunir(){
    System.out.println("Grrrrr…");
  }

  @Override
  public String pasear() {
    if (!vacunada) {
      return this.nombre+" no puede pasear hasta no estar vacunado/a";
    } else {
      return this.nombre+" esta pasiando mira que feliz se ve :D \n"+this.ladrad();
    }
  }
  
  public void vacunar(){
    if (vacunada) {
      System.out.println(this.nombre+" se encuentra vacunado/a");
    }else{
      super.vacunar();
      System.out.println(this.nombre+" ha sido vacunado ");
      this.grunir();
    }
  }
  

  /////Getters
  public static int getTotalPerros() {
    return totalPerros;
  }

  public String getRaza() {
    return raza;
  }

  //////Setters
  public void setRaza(String raza) {
    this.raza = raza;
  }

  
  
}

