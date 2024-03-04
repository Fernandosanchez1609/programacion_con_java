package clases;
/**
*
*@author Fernando Sanchez
*/
public class Clinica {
  /////Atributos
  Mascota[] listado = new Mascota[100];


  ////Metodos
  public boolean esVacia(){
    boolean vacio = true;
    for (int i = 0; i < listado.length; i++) {
      
      if (listado[i]==null) {
        vacio = true;
      }else{
        vacio = false;
      }
    }
    if (vacio) {
      return true;
    }else{
      return false;
    }
  }

  public boolean esLlena(){
    boolean vacio = true;
    for (int i = 0; i < listado.length; i++) {
      
      if (listado[i]==null) {
        vacio = true;
      }
    }
    
    if (vacio) {
      return false;
    } else {
      return true;
    }
  }

  public int totalPerros(){
    return Perro.getTotalPerros();
  }

  public int totalGatos(){
    return Gato.getTotalGatos();
  }

  public int totalMascotas(){
    return Gato.getTotalMascotas();
  }

  public Mascota buscarChip(String chipBuscado){
    for (Mascota mascota : listado) {
      if (chipBuscado==mascota.chip) {
        return(mascota);
        
      }
    }
    
      return null;
  }
  
  public void agregar(Mascota mascota){
    boolean agregado=false;
    for (int i = 0; i < listado.length; i++) {
      if (listado[i]==null && agregado == false) {
        listado[i]=mascota;
        agregado=true;
      }
    }

    
  }

  public void listar(){
    for (int i = 0; i < listado.length; i++) {
      if (listado[i]== null) {
        
      } else {
        System.out.println(listado[i]);
      }
      
    }

    System.console().readLine();
  }

}
