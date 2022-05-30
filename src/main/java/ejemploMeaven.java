import java.util.Scanner;

public class ejemploMeaven {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del que estara la factura ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el apellido paterno del que esta la factura ");
        String apellidoPFactura = scanner.nextLine();

        System.out.println("Ingrese el apellido materno del que esta la factura ");
        String apellidoMFactura = scanner.nextLine();

        String nombreCFactura = nombreFactura +"\t" +apellidoPFactura+ "\t"+apellidoMFactura+"\t";

        System.out.println("Ingrese el monto del costo del primer producto");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del segundo producto");
        double precio2 = scanner.nextDouble();

        double precioTotal = precio1 + precio2 ;
        double impuesto = precioTotal * 0.19;
        double precioImpuesto = precioTotal + impuesto;

        String factura = "la factura " + nombreCFactura + "con un valor bruto total de " + precioTotal + ", con un impuesto de "+ impuesto + " dando un total de " +precioImpuesto;

        System.out.println(factura);


    }
}
