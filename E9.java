package main.Estructuras_Repeticion;
/*2.18. Determinar cuantos hombres y cuantas mujeres se encuentran en un grupo de n alumnos, suponiendo que los
datos son extraídos alumno por alumno */
import java.util.Scanner;

public class E9  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hombres = 0, mujeres = 0;

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el género del alumno " + i + " (M para Mujer, H para Hombre): ");
            String genero = scanner.nextLine().trim().toUpperCase();

            if (genero.equals("H")) {
                hombres++;
            } else if (genero.equals("M")) {
                mujeres++;
            } else {
                System.out.println("⚠️ Entrada inválida. Debe ingresar 'M' o 'H'.");
                i--; // Repetir la entrada para el mismo alumno
            }
        }

        System.out.println("\n👨 Total de hombres: " + hombres);
        System.out.println("👩 Total de mujeres: " + mujeres);
        
        scanner.close();
    }
}
