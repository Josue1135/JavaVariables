import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el NOMBRE o DESCRIPCIÓN de la FACTURA: ");
        String nombreFactura = sc.nextLine();

        System.out.print("Ingrese el 1er PRECIO  del producto: ");
        double precioProductoA = sc.nextDouble();
        System.out.print("Ingrese el 2do PRECIO  del producto: ");
        double precioProductoB = sc.nextDouble();


        double impuesto = 0.19;
        double totalBruto = precioProductoA + precioProductoB;
        double calculoPagoImpuesto = totalBruto * impuesto;
        double calcularPagoTotal = totalBruto + calculoPagoImpuesto;
        System.out.println("La factura " +nombreFactura + "\nproducto de las compras tiene un total bruto de: " + totalBruto +
                ", \ncon un impuesto de: " + calculoPagoImpuesto + " \ny el monto a pagar después de impuestos es de: " + calcularPagoTotal);
        sc.close();
    }

}
