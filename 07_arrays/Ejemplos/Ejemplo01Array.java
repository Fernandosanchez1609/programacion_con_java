/**
* primer ejemplo de arrays 
*
*@author Fernando Sanchez
*/
public class Ejemplo01Array {
  public static void main(String[] args) {
    int[] n;      
    n = new int[4];

    n[0] = 26;
    n[1] = 30;
    n[2] = 0;
    n[3] = 100;

    System.out.println("Los valores del array son los siguientes: ");
    System.out.println(n[0]+", "+n[1]+", "+n[2]+", "+n[3]);

    int suma = n[1]+n[3];

    System.out.println(suma);
  }
}
