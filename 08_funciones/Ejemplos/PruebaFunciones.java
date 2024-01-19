/**
* prueba de las funciones en paquetes
*
*@author Fernando Sanchez
*/
import matematicas.Varias;
import matematicas.Volumen;
public class PruebaFunciones {
  public static void main(String[] args) {
    int n;

    //probamos la funcion esPrimo alojada en la clase Varias dentro del paquete matematicas
    System.out.print("Introduzca un numero entero positivo: ");
    n=Integer.parseInt(System.console().readLine());

    if (Varias.esPrimo(n)) {
      System.out.println("El numero "+n+" es primo");
    } else {
      System.out.println("El numero "+n+" no es primo");
    }

    //prueba de digitos alojada en la clase varias dentro del paquete matematicas
    System.out.print("Introduzca un numero entero positivo: ");
    n=Integer.parseInt(System.console().readLine());

    int numDigitos= Varias.digitos(n);
    System.out.println(n+" tiene "+numDigitos+" digitos");


    //prueba del volumen en el paquete matematicas
    double r;
    double h;
    System.out.print("Introduzca la altura: ");
    h=Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el radio: ");
    r=Double.parseDouble(System.console().readLine());

    System.out.println("El volumen del cilindro es: "+ Volumen.volumenCilindro(r, h));


    //prueba de voltear numero
    System.out.print("Introduzca un numero para voltear: ");
    long x=Long.parseLong(System.console().readLine());

    System.out.println("El numero "+x+" volteado es: " +Varias.voltea(x));
  }
}
