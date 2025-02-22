package main.Estructuras_Repeticion;
/*2.3. Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Cálculo. */
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definimos el número total de calificaciones
        final int TOTAL_CALIFICACIONES = 7;

        // Variable para almacenar la suma de todas las calificaciones
        double sumaCalificaciones = 0;

        // Bucle para leer las 7 calificaciones del alumno
        for (int i = 1; i <= TOTAL_CALIFICACIONES; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double calificacion = scanner.nextDouble(); // Leer la calificación ingresada por el usuario
            sumaCalificaciones += calificacion; // Sumar la calificación al total
        }

        // Calcular el promedio de calificaciones
        double promedio = sumaCalificaciones / TOTAL_CALIFICACIONES;

        // Mostrar el resultado del promedio
        System.out.println("El promedio del alumno en Cálculo es: " + promedio);

        // Cerrar el Scanner para evitar fugas de recursos
        scanner.close();
    }
}
