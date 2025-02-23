package main.Estructuras_Repeticion;
/*2.9. Suponga que se tiene un conjunto de calificaciones de un grupo de 40 alumnos.
Realizar un algoritmo y el programa para calcular la calificación media y la calificación más baja de todo el grupo. 
 */

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir la cantidad de alumnos
        final int TOTAL_ALUMNOS = 40;

        // Variables para calcular la suma de calificaciones y la calificación más baja
        double suma = 0;
        double calificacionMinima = Double.MAX_VALUE; // Inicializar con un valor muy alto

        // Bucle para leer las calificaciones de los 40 alumnos
        for (int i = 1; i <= TOTAL_ALUMNOS; i++) {
            System.out.print("Ingrese la calificación del alumno " + i + ": ");
            double calificacion = scanner.nextDouble(); // Leer cada calificación

            // Acumular la suma de las calificaciones
            suma += calificacion;

            // Verificar si la calificación ingresada es la más baja hasta el momento
            if (calificacion < calificacionMinima) {
                calificacionMinima = calificacion;
            }
        }

        // Calcular la calificación media
        double media = suma / TOTAL_ALUMNOS;

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Calificación media del grupo: " + media);
        System.out.println("Calificación más baja del grupo: " + calificacionMinima);

        // Cerrar el Scanner para evitar fugas de memoria
        scanner.close();
    }
}
