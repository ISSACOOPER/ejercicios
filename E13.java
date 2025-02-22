package main.Estructuras_Repeticion;
/*2.42. Leer por cada alumno de Cálculo su número de control y su calificación en cada una de las 5 unidades de la
materia. Al final que escriba el numero de control del alumno que obtuvo mayor promedio. Suponga que los
alumnos tienen diferentes promedios.  */

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int totalAlumnos = scanner.nextInt();

        int mejorAlumno = 0;
        double mejorPromedio = 0.0;

        // Iterar sobre cada alumno
        for (int i = 1; i <= totalAlumnos; i++) {
            System.out.print("\nIngrese el número de control del alumno " + i + ": ");
            int numControl = scanner.nextInt();

            double sumaCalificaciones = 0;

            // Leer las 5 calificaciones del alumno
            for (int j = 1; j <= 5; j++) {
                System.out.print("Ingrese la calificación de la unidad " + j + ": ");
                double calificacion = scanner.nextDouble();
                sumaCalificaciones += calificacion;
            }

            // Calcular el promedio
            double promedio = sumaCalificaciones / 5;

            System.out.println("📌 Promedio del alumno " + numControl + ": " + promedio);

            // Verificar si es el mejor promedio hasta ahora
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorAlumno = numControl;
            }
        }

        // Mostrar el alumno con el mejor promedio
        System.out.println("\n🏆 El alumno con el mejor promedio es el de número de control: " + mejorAlumno);
        System.out.println("📌 Promedio más alto: " + mejorPromedio);

        scanner.close();
    }
}


