/**
* Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
* y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
* cuadrado se deben almacenar los cuadrados de los valores que hay en el array
* numero. En el array cubo se deben almacenar los cubos de los valores que hay en
* numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
* columnas
*
*@author Fernando Sanchez
*/
public class T07Ejercicio04 {
  public static void main(String[] args) {
  int[] numero= new int[20];
  int[] cuadrado= new int[20];
  int[] cubo= new int[20];
  
  //rellenar con numeros aleatorios el primer array
  for (int i = 0; i < numero.length; i++) {
    numero[i]=(int)(Math.random()*101);
  }

  //rellenar el array cuadrado con el cuadrado de los numeros en el array numero
  for (int i = 0; i < cuadrado.length; i++) {
    cuadrado[i]=numero[i]*numero[i];
  }

  //rellenar el array cubo con el cubo de cada numero en el array numero
  for (int i = 0; i < cubo.length; i++) {
    cubo[i]=numero[i]*numero[i]*numero[i];
  }

  //escribir la tabla de los arrays

  System.out.println("Numero|cuadrado|cubo \n");
  for (int i = 0; i < numero.length; i++) {
    System.out.printf("%-6s|%-8s|%-7s\n",numero[i],cuadrado[i],cubo[i]);
  }
  }
}
