package main.Estructuras_Seleccion;
/*1.27. Hacer un programa que realice las operaciones matemáticas básicas: suma, resta, multiplicación y división de dos
números enteros.  */
import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🧮 Calculadora Básica");
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.println("\nSeleccione la operación:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.print("Ingrese la opción (1-4): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("📌 Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("📌 Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("📌 Resultado: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("📌 Resultado: " + num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("❌ Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("❌ Opción no válida. Debe seleccionar entre 1 y 4.");
        }

        scanner.close();
    }
}
