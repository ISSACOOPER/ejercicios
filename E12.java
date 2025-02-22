package main.Estructuras_Repeticion;
/*2.41. Leer 50 calificaciones de un grupo de alumnos. Calcule y escriba el porcentaje de reprobados. Tomando en
cuenta que la calificación mínima aprobatoria es de 70.  */

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlumnos = 50;
        int reprobados = 0;
        
        // Leer 50 calificaciones
        for (int i = 1; i <= totalAlumnos; i++) {
            System.out.print("Ingrese la calificación del alumno " + i + ": ");
            int calificacion = scanner.nextInt();

            // Validar si la calificación es menor a 70 (reprobado)
            if (calificacion < 70) {
                reprobados++;
            }
        }

        // Calcular el porcentaje de reprobados
        double porcentajeReprobados = ((double) reprobados / totalAlumnos) * 100;

        // Mostrar el resultado
        System.out.println("\n📌 Total de alumnos reprobados: " + reprobados);
        System.out.println("📌 Porcentaje de reprobados: " + porcentajeReprobados + "%");

        scanner.close();
    }
}

