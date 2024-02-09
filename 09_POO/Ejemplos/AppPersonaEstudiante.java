/**
* metodo mein para el ejemplo de herencias de persona y estudiente
*
*@author Fernando Sanchez
*/
public class AppPersonaEstudiante {
  public static void main(String[] args) {
    
    Persona p = new Persona("Pepe Rodriguez", 30, "123456789A");
    Estudiante e = new Estudiante("Paula Gomez", 21, "6536356213S");
    Profesor prof = new Profesor("Sergio Sanchez", 34, "0987766B", "Informatica", 99999);

    System.out.println(p.toString());
    System.out.println(p);
    System.out.println(e.toString());
    System.out.println(e);
    System.out.println(prof.toString());
    System.out.println(prof);
  }
}
