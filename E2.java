package main.Estructuras_Repeticion;
/*2.2. Programa que lee las edades de un grupo de 100 alumnos y encuentra el promedio. */
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definimos el número total de alumnos
        final int TOTAL_ALUMNOS = 100;

        // Variable para almacenar la suma de todas las edades
        int sumaEdades = 0;

        // Bucle para leer las edades de los 100 alumnos
        for (int i = 1; i <= TOTAL_ALUMNOS; i++) {
            System.out.print("Ingrese la edad del alumno " + i + ": ");
            int edad = scanner.nextInt(); // Leer la edad ingresada por el usuario
            sumaEdades += edad; // Sumar la edad al total
        }

        // Calcular el promedio de edades
        double promedio = (double) sumaEdades / TOTAL_ALUMNOS;

        // Mostrar el resultado del promedio de edades
        System.out.println("El promedio de edades del grupo es: " + promedio);

        // Cerrar el Scanner para evitar fugas de recursos
        scanner.close();
    }
}
