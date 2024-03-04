package clases;
/**
*
*@author Fernando Sanchez
*/
public class Gato extends Mascota {
  //////Atributos
  static int totalGatos=0;
  String pelaje;

  //////Constructores
  public Gato(String chip){
    super();
    this.chip = chip;
    totalGatos++;
    totalMascotas++;
  }
  public Gato(String chip, String nombre){
    super();
    this.chip = chip;
    this.nombre = nombre;
    totalGatos++;
    totalMascotas++;
  }

  /////Metodos
  public String maulla(){
    return "¡Miaaaaauuuuuu! Brrrrr.....";
  }

  public void bufar(){
    System.out.println("Fuuuuu....");
  }

  @Override
  public String pasear() {
    if (!vacunada) {
      return this.nombre+" no puede pasear hasta no estar vacunado/a";
    } else {
      return this.nombre+" esta pasiando mira que feliz se ve :D \n"+this.maulla();
    }
  }
  
  public void vacunar(){
    if (vacunada) {
      System.out.println(this.nombre+" se encuentra vacunado/a");
    }else{
      super.vacunar();
      System.out.println(this.nombre+" ha sido vacunado ");
      this.bufar();
    }
  }
  


  ///////Getters
  public String getPelaje() {
    return pelaje;
  }
  
  public static int getTotalGatos() {
    return totalGatos;
  }
  
  //////Setters
  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }
 

}
