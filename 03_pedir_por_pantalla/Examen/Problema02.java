/**
*
*@author Fernando Sanchez
*/
import java.util.Scanner;
public class Problema02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el nombre del articulo: ");
    String nombre = sc.nextLine();
    System.out.print("Introduce el precio en euros (sin IVA): ");
    double precio = sc.nextDouble();
    System.out.print("Introduce la cantidad que compra: ");
    int cantidad = sc.nextInt();
    double precioDescuento = precio*cantidad*0.15;
    double subtotal = precio-precioDescuento;
    double iva = subtotal*0.21;
    double precioFinal = subtotal+iva;

    System.out.println("Factura");
    System.out.println("======================================");
    System.out.printf("%-8s"+"%30s\n","Articulo",nombre);
    System.out.printf("%-6s"+"%32s\n","Precio",(precio+" €/unidad"));
    System.out.printf("%-8s"+"%30s\n","Cantidad",cantidad);
    System.out.printf("%-8s"+"%30s\n","Subtotal",(precio*cantidad+" €"));
    System.out.printf("%-15s"+"%23s\n","Descuento (15%)",("-"+precioDescuento+" €"));
    System.out.printf("%-22s"+"%14.2f"+" €\n","Subtotal con descuento",subtotal);
    System.out.printf("%-10s"+"%26.2f"+" €\n","IVA (21%)",iva);
    System.out.println("");
    System.out.println("======================================");
    System.out.printf("\033[48;5;7m %-5s"+"%31.2f"+" €\033[0m","TOTAL",precioFinal);

    sc.close();
  }
}
