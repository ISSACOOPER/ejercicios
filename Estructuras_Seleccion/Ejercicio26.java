package main.Estructuras_Seleccion;
/*1.26. Un alumno desea realizar varias conversiones del sistema ingles de medicines al sistema métrico decimal. Hacer
un programa que realice la conversión de metros pies y de pies a metros.  */
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("📏 Conversión entre metros y pies");
        System.out.println("1. Convertir metros a pies");
        System.out.println("2. Convertir pies a metros");
        System.out.print("Seleccione una opción (1 o 2): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la cantidad en metros: ");
            double metros = scanner.nextDouble();
            double pies = metros * 3.28084;
            System.out.println(metros + " metros equivalen a " + pies + " pies.");
        } else if (opcion == 2) {
            System.out.print("Ingrese la cantidad en pies: ");
            double pies = scanner.nextDouble();
            double metros = pies / 3.28084;
            System.out.println(pies + " pies equivalen a " + metros + " metros.");
        } else {
            System.out.println("❌ Opción no válida. Debe seleccionar 1 o 2.");
        }

        scanner.close();
    }
}
