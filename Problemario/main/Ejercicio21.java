package main;
/*1.21. Determinar si un alumno aprueba a reprueba un curso, sabiendo que aprobara si su promedio de tres
calificaciones es mayor o igual a 70; reprueba en caso contrario. */
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir las calificaciones al usuario
        System.out.print("Ingrese la primera calificación: ");
        double cal1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        double cal2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        double cal3 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (cal1 + cal2 + cal3) / 3;

        // Determinar si aprueba o reprueba
        if (promedio >= 70) {
            System.out.println("🎉 ¡Felicidades! Aprobaste con un promedio de: " + promedio);
        } else {
            System.out.println("❌ Lo siento, reprobaste con un promedio de: " + promedio);
        }

        scanner.close();
    }
}
