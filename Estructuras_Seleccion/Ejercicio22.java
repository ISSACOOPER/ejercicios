package main.Estructuras_Seleccion;
/*1.22. En un almacén se hace un 20% de descuento a los clientes cuya compra supere los Bs. 1.000 ¿Cual será la
cantidad que pagará una persona por su compra? */
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el monto de la compra al usuario
        System.out.print("Ingrese el total de la compra en Bs: ");
        double totalCompra = scanner.nextDouble();

        // Aplicar el descuento si la compra supera los Bs. 1,000
        if (totalCompra > 1000) {
            double descuento = totalCompra * 0.20;
            double totalPagar = totalCompra - descuento;
            System.out.println("✅ ¡Felicidades! Has obtenido un descuento del 20%.");
            System.out.println("💰 Total a pagar con descuento: Bs. " + totalPagar);
        } else {
            System.out.println("💵 Total a pagar sin descuento: Bs. " + totalCompra);
        }

        scanner.close();
    }
}
