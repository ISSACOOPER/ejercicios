package main.Estructuras_Seleccion;
/*1.15. Una empresa de préstamos decidió cambiar su esquema de cobros así:
• Si el préstamo es de más de 5000 euros, cobra en tres cuotas
• Si el préstamo es de menos de 1000 euros, cobra en una cuota
• Si el préstamo es entre 2000 y 3000 euros cobra en dos cuotas
• En los demás casos cobra en cinco cuotas
Adicionalmente, si es de menos de 4000 euros cobra el 12% de interés, en caso contrario cobra el 10% de interés.
El programa debe decir en cuántas cuotas debe pagar y de cuánto es cada cuota. Para ello, se calcula el valor
total de la deuda con interés y se divide en cuotas iguales.  */
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario ingresar el monto del préstamo
        System.out.print("Ingrese el monto del préstamo en euros: ");
        double prestamo = scanner.nextDouble(); // Captura el valor ingresado

        // Variable para almacenar el número de cuotas
        int cuotas;

        // Determinar el número de cuotas según el monto del préstamo
        if (prestamo > 5000) {
            cuotas = 3;
        } else if (prestamo < 1000) {
            cuotas = 1;
        } else if (prestamo >= 2000 && prestamo <= 3000) {
            cuotas = 2;
        } else {
            cuotas = 5;
        }

        // Determinar el interés a aplicar
        double interes;
        if (prestamo < 4000) {
            interes = 0.12; // 12% de interés
        } else {
            interes = 0.10; // 10% de interés
        }

        // Calcular la deuda total con el interés
        double deudaTotal = prestamo + (prestamo * interes);

        // Calcular el valor de cada cuota
        double valorCuota = deudaTotal / cuotas;

        // Mostrar los resultados
        System.out.println("\nResumen del préstamo:");
        System.out.println("Monto solicitado: " + prestamo + " euros");
        System.out.println("Interés aplicado: " + (interes * 100) + "%");
        System.out.println("Deuda total a pagar: " + deudaTotal + " euros");
        System.out.println("Número de cuotas: " + cuotas);
        System.out.println("Valor de cada cuota: " + valorCuota + " euros");

        // Cerramos el Scanner para liberar recursos
        scanner.close();
    }
}
