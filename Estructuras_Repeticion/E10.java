package main.Estructuras_Repeticion;
/*2.38. Un presidente de la asociación de vecinos de Nueva Casarapa desea determinar cuantas personas de cada una
de las secciones que componen su zona asisten el día de las votaciones. Las secciones son: norte, sur y centro.
También desea determinar cual es la sección con mayor número de votantes.  */

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int norte = 0, sur = 0, centro = 0;

        System.out.print("Ingrese la cantidad total de votantes: ");
        int totalVotantes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 1; i <= totalVotantes; i++) {
            System.out.print("Ingrese la sección del votante " + i + " (Norte, Sur, Centro): ");
            String seccion = scanner.nextLine().trim().toLowerCase();

            switch (seccion) {
                case "norte":
                    norte++;
                    break;
                case "sur":
                    sur++;
                    break;
                case "centro":
                    centro++;
                    break;
                default:
                    System.out.println("⚠️ Sección inválida. Debe ser 'Norte', 'Sur' o 'Centro'.");
                    i--; // Repetir la entrada para el mismo votante
            }
        }

        // Determinar la sección con más votantes
        String mayorSeccion;
        if (norte > sur && norte > centro) {
            mayorSeccion = "Norte";
        } else if (sur > norte && sur > centro) {
            mayorSeccion = "Sur";
        } else if (centro > norte && centro > sur) {
            mayorSeccion = "Centro";
        } else {
            mayorSeccion = "Empate entre secciones";
        }

        // Mostrar resultados
        System.out.println("\n📊 Resultados de votación:");
        System.out.println("📍 Norte: " + norte + " votantes");
        System.out.println("📍 Sur: " + sur + " votantes");
        System.out.println("📍 Centro: " + centro + " votantes");
        System.out.println("\n🏆 La sección con más votantes es: " + mayorSeccion);
        
        scanner.close();
    }
}
