package main;
/*1.17. En una empresa cada empleado debe teclear un código identificador de 3 cifras en la entrada. Escribir un
programa que muestre por pantalla la categoría del empleado teniendo en cuenta que:
• Si el código es divisible por 2, por 3 y por 5, la categoría del empleado es “Director general”.
• Si el código es divisible por 3 y por 5 pero no por 2, la categoría del empleado es “Directivo”.
• Si el código es divisible por 2, pero no por 3 ni por 5, la categoría del empleado es “Staff”.
• Si el código no es divisible por 2, ni por 3 ni por 5, la categoría del empleado es “Seguridad”.
Recuerde que: Un numero X es divisible por otro Y; si X mod Y = 0. */
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un código de 3 cifras
        System.out.print("Ingrese el código identificador del empleado (3 cifras): ");
        int codigo = scanner.nextInt();

        // Verificar si el código tiene exactamente 3 cifras
        if (codigo < 100 || codigo > 999) {
            System.out.println("Error: El código debe tener exactamente 3 cifras.");
        } else {
            // Determinar la categoría del empleado según las condiciones dadas
            if (codigo % 2 == 0 && codigo % 3 == 0 && codigo % 5 == 0) {
                System.out.println("Categoría del empleado: Director general");
            } else if (codigo % 3 == 0 && codigo % 5 == 0 && codigo % 2 != 0) {
                System.out.println("Categoría del empleado: Directivo");
            } else if (codigo % 2 == 0 && codigo % 3 != 0 && codigo % 5 != 0) {
                System.out.println("Categoría del empleado: Staff");
            } else if (codigo % 2 != 0 && codigo % 3 != 0 && codigo % 5 != 0) {
                System.out.println("Categoría del empleado: Seguridad");
            } else {
                System.out.println("El código no cumple con ninguna categoría específica.");
            }
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

