/**
* primer ejercicio tema 1
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Problema1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion=0;
    String nombreProducto="";
    int unidades=0;
    double precioUnidad=0;
    int opcion2=0;
    double iva=0;
    String codProm="";
    String promDisponible = "no";

    System.out.println("Menu de la compra");
    System.out.println("Introduzca el tipo de producto: ");
    System.out.println("1. Alimentacion");
    System.out.println("2. Farmacia");
    System.out.println("3. Electronica");
    System.out.println("4. Moda");
    System.out.print("Opcion: ");
    opcion=sc.nextInt();

    if (opcion==1) {
      System.out.println("Introduzca el tipo de alimento: ");
      System.out.println("1. Huevos");
      System.out.println("2. Pan");
      System.out.println("3. Leche");
      System.out.println("4. Fruta");
      System.out.println("5. Carne");
      System.out.println("6. Agua");
      System.out.println("7. Verdura");
      System.out.println("8. otros");
      System.out.print("Opcion: ");
      opcion2=sc.nextInt();
    } 

    switch (opcion) {
      case 1:
        promDisponible="SINIVA";
        switch (opcion2) {
          case 1,2,3,4,7:
            iva=0.04;
            break;
          case 5,6,8:
            iva=0.10;
            break;
          default:
            System.out.println("Opcion no valida");
            break;
        }
        break;
        
      case 2:
        
        iva=0.04; 
        break;

      case 3:
        promDisponible="PROMO50";
        iva=0.21;   
        break;

      case 4:
        promDisponible="PROMO3X2";
        iva=0.21;
        break;

      default:
        System.out.println("Error opcion no valida");
        break;
    }

    System.out.print("Introduzca el nombre del producto: ");
    nombreProducto = sc.next();
    System.out.print("Introduzca la cantidad: ");
    unidades=sc.nextInt();
    System.out.print("Introduzca el precio por unidad del producto: ");
    precioUnidad=sc.nextDouble();
    System.out.print("Introduzca codigo promocional: ");
    codProm=sc.next();

    if (codProm==promDisponible) {
      switch (codProm) {
        case "SINIVA":
          System.out.println("Factura:");
          System.out.println("------------------------------");
          System.out.printf("%-8s"+"%20s","Articulo",nombreProducto);
          System.out.printf("%-8s"+"%20.2f"+" €/Unidad","Precio",precioUnidad);
          System.out.printf("%-8s"+"%20d","Cantidad",unidades);
          System.out.printf("%-8s"+"%20.2f"+"€","Total",(unidades*precioUnidad));
          System.out.printf("%-8s"+"20.2f"+"€","IVA al 0%",0.00);
          System.out.println("------------------------------");
          System.out.println("total con IVA "+(unidades*precioUnidad));
          break;
      
        case "PROMO50":
          System.out.println("Factura:");
          System.out.println("------------------------------");
          System.out.printf("%-8s"+"%20s","Articulo",nombreProducto);
          System.out.printf("%-8s"+"%20.2f"+" €/Unidad","Precio",precioUnidad);
          System.out.printf("%-8s"+"%20d","Cantidad",unidades);
          System.out.printf("%-8s"+"%20.2f"+"€","Total",(unidades*precioUnidad));
          System.out.printf("%-8s"+"20.2f"+"€","IVA al "+iva,(unidades*precioUnidad*iva));
          System.out.printf("%-8s"+"20.2f"+"€","Descuento",(unidades*precioUnidad/2));
          System.out.println("------------------------------");
          System.out.println("total con IVA "+((unidades*precioUnidad/2)+(unidades*precioUnidad*iva)));
          break;

        case "PROMO3X2":
          System.out.println("Factura:");
          System.out.println("------------------------------");
          System.out.printf("%-8s"+"%20s","Articulo",nombreProducto);
          System.out.printf("%-8s"+"%20.2f"+" €/Unidad","Precio",precioUnidad);
          System.out.printf("%-8s"+"%20d","Cantidad",unidades);
          System.out.printf("%-8s"+"%20.2f"+"€","Total",(unidades*precioUnidad));
          System.out.printf("%-8s"+"20.2f"+"€","IVA al "+iva,(unidades*precioUnidad*iva));
          System.out.printf("%-8s"+"20.2f"+"€","Descuento",((unidades-unidades/3)*precioUnidad));
          System.out.println("------------------------------");
          System.out.println("total con IVA "+((unidades-unidades/3)*precioUnidad)+iva);

        default:
          System.out.println("Error codigo promocional no valido");
          break;
      }
    } else {
      System.out.println("Factura:");
      System.out.println("------------------------------");
      System.out.printf("%-8s"+"%20s","Articulo",nombreProducto);
      System.out.printf("%-8s"+"%20.2f"+" €/Unidad","Precio",precioUnidad);
      System.out.printf("%-8s"+"%20d","Cantidad",unidades);
      System.out.printf("%-8s"+"%20.2f"+"€","Total",(unidades*precioUnidad));
      System.out.printf("%-8s"+"20.2f"+"€","IVA al "+iva,(unidades*precioUnidad*iva));
      System.out.println("------------------------------");
      System.out.println("total con IVA "+((unidades*precioUnidad)+(unidades*precioUnidad*iva)));
    }
    sc.close();
  }
}
