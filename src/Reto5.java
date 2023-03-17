import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args){

        String nomProducto;
        int cantidadProduc;
        int cantidadProductoReg = 1;
        double valorComp = 0, subTotal = 0;
        double precioProducto; 
        double valorIva = 0;


        Scanner Lectura = new Scanner(System.in);
        System.out.println("Digite la cantidad de los productos: ");
        cantidadProduc = Lectura.nextInt();

        for(cantidadProductoReg = 1; cantidadProductoReg <= cantidadProduc; cantidadProductoReg++){
            System.out.println("Digite nombre del producto: ");
            nomProducto = Lectura.next();
            System.out.println("Digite el precio del producto: ");
            precioProducto = Lectura.nextDouble();
            subTotal = precioProducto + subTotal;
            System.out.println("Su producto es: " + nomProducto + "\nsu valor es:" + precioProducto);

        }
            valorIva = subTotal * 0.19;
            valorComp = subTotal + valorIva;
            System.out.println("El total de su compra es de: " + valorComp + " usted registro el total de: " + cantidadProduc + " productos");
            Lectura.close();
    }
}
