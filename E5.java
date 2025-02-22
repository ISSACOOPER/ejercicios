package main.Estructuras_Repeticion;
/*2.7. Leer 15 números negativos y convertirlos a positivos e imprimir dichos números */
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definimos la cantidad de números a leer
        final int TOTAL_NUMEROS = 15;

        // Bucle para leer los 15 números negativos
        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.print("Ingrese un número negativo " + i + ": ");
            double numero = scanner.nextDouble(); // Leer el número ingresado por el usuario

            // Convertir a positivo si es negativo
            double numeroPositivo = Math.abs(numero);

            // Mostrar el número convertido
            System.out.println("Número positivo: " + numeroPositivo);
            System.out.println("-------------------------");
        }

        // Cerrar el Scanner para evitar fugas de recursos
        scanner.close();
    }
}
