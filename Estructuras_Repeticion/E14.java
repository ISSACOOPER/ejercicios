package main.Estructuras_Repeticion;
/*2.56. Diseñe un programa que imprima la fecha en palabras a partir de la representación siguiente: S, DD, MM, AA. En
donde:
S = Día de la semana, 1 a 7 (1 = lunes; 2 = martes; etc.).
DD = Día del mes, 1 a 30 ó 31, según el mes. Fijar el mes de febrero con 28 días.
MM = Dos cifras para el mes.
AA = Dos últimas cifras del año. 
 */

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays con los nombres de los días y meses
        String[] diasSemana = {"", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Solicitar los valores de entrada
        System.out.print("Ingrese el día de la semana (1-7): ");
        int s = scanner.nextInt();
        
        System.out.print("Ingrese el día del mes (1-31): ");
        int dd = scanner.nextInt();
        
        System.out.print("Ingrese el número del mes (1-12): ");
        int mm = scanner.nextInt();
        
        System.out.print("Ingrese las dos últimas cifras del año (ej. 24 para 2024): ");
        int aa = scanner.nextInt();

        // Validar que los valores ingresados sean correctos
        if (s < 1 || s > 7) {
            System.out.println("❌ Error: El día de la semana debe estar entre 1 y 7.");
        } else if (mm < 1 || mm > 12) {
            System.out.println("❌ Error: El mes debe estar entre 1 y 12.");
        } else if (dd < 1 || dd > diasDelMes(mm)) {
            System.out.println("❌ Error: Día del mes no válido para el mes ingresado.");
        } else {
            // Imprimir la fecha en palabras
            System.out.println("\n📅 La fecha en palabras es: " + diasSemana[s] + ", " + dd + " de " + meses[mm] + " de 20" + aa);
        }

        scanner.close();
    }

    // Método para obtener la cantidad de días de cada mes
    private static int diasDelMes(int mes) {
        if (mes == 2) {
            return 28; // Febrero fijo en 28 días
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}
