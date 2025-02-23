package main.Estructuras_Seleccion;
/*1.14. El dueño de una papelería desea un programa que le indique el precio de venta de un artículo dado. El precio se
calcula de acuerdo con la siguiente fórmula: PVP = precio_coste + ganancia. Donde la ganancia será:
• El 15% si el precio de coste es inferior Bs. 3.
• 50 céntimos si el precio de coste está entre Bs. 3 y Bs. 6.
• El 25% si el precio de coste supera los Bs. 6. */
// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese el precio de coste del artículo
        System.out.print("Ingresa el precio de coste del artículo en Bs: ");
        double precioCoste = scanner.nextDouble(); // Captura el valor ingresado

        // Variable para almacenar la ganancia
        double ganancia;

        // Aplicamos las reglas de ganancia según el precio de coste
        if (precioCoste < 3) {
            // Si el precio de coste es menor a Bs. 3, la ganancia es del 15%
            ganancia = precioCoste * 0.15;
        } else if (precioCoste >= 3 && precioCoste <= 6) {
            // Si el precio de coste está entre Bs. 3 y Bs. 6, la ganancia es de Bs. 0.50
            ganancia = 0.50;
        } else {
            // Si el precio de coste es mayor a Bs. 6, la ganancia es del 25%
            ganancia = precioCoste * 0.25;
        }

        // Calculamos el precio de venta al público (PVP)
        double pvp = precioCoste + ganancia;

        // Mostramos el precio de venta al usuario
        System.out.println("El precio de venta del artículo es: " + pvp + " Bs");

        // Cerramos el Scanner para liberar recursos
        scanner.close();
    }
}
    

