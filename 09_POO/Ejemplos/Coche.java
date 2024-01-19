/**
* clase de ejemplo coche
*
*@author Fernando Sanchez
*/
public class Coche {
  
  //Atributos!!! !!(destacado)!!
  String matricula;
  String marca;
  String modelo;
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {
    Coche miCoche = new Coche();  //este es el primer coche coche 1
    Coche tuCoche = new Coche();  //este es el segundo coche coche 2


    miCoche.matricula = "1234ABC";
    System.out.println("Matricula del coche 1: " + miCoche.matricula);
    System.out.println("Potencia del coche 1: "+ miCoche.potencia);
    System.out.println("Matricula del coche 2: " + tuCoche.matricula);
    System.out.println("Potencia del coche 2: "+ tuCoche.potencia);
  }

}
