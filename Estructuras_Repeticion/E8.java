package main.Estructuras_Repeticion;
/*2.10. Calcular e imprimir la tabla de multiplicar de un número cualquiera. Imprimir el multiplicando, el multiplicador y el
producto. */
import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número para generar su tabla de multiplicar
        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("\nTabla de multiplicar del " + numero + ":");
        System.out.println("--------------------------------");

        // Generar la tabla de multiplicar del 1 al 10
        for (int i = 1; i <= 10; i++) {
            int producto = numero * i;
            System.out.println(numero + " x " + i + " = " + producto);
        }

        scanner.close(); // Cerrar Scanner
    }
}

