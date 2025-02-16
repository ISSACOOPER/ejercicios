package main;
/*1.16. Calcular el salario neto de un trabajador de una empresa cuyo trabajo se paga por horas. Introducir por teclado el
número de horas y el precio de la hora. El cálculo se realiza del siguiente modo:
• Las primeras 35 horas de cada semana se pagan a la tarifa normal (suponer 4 semanas al mes).
• Las horas extras se pagan un 50% más que las normales.
• Los impuestos a deducir a los trabajadores varían en función de su sueldo mensual (considerando las horas
extras trabajadas):
o Si el sueldo es menor de € 600, libre de impuestos.
o Si el sueldo está entre € 600 y € 1000, los impuestos son el 20%.
o Si el sueldo es mayor de € 1000, el 30%. 
 */
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de horas trabajadas en la semana
        System.out.print("Ingrese el número de horas trabajadas en una semana: ");
        int horasSemanales = scanner.nextInt();

        // Pedir el precio por hora
        System.out.print("Ingrese el precio por hora (€): ");
        double precioHora = scanner.nextDouble();

        // Definir variables
        int horasNormales = 35; // Límite de horas normales por semana
        double tarifaExtra = precioHora * 1.5; // Tarifa de horas extras (50% más)
        double salarioSemanal;

        // Calcular el salario semanal
        if (horasSemanales <= horasNormales) {
            salarioSemanal = horasSemanales * precioHora; // Solo horas normales
        } else {
            // Calcular salario con horas extras
            int horasExtras = horasSemanales - horasNormales;
            salarioSemanal = (horasNormales * precioHora) + (horasExtras * tarifaExtra);
        }

        // Calcular el salario mensual (suponiendo 4 semanas al mes)
        double salarioMensual = salarioSemanal * 4;

        // Calcular impuestos
        double impuesto;
        if (salarioMensual < 600) {
            impuesto = 0; // Sin impuestos
        } else if (salarioMensual >= 600 && salarioMensual <= 1000) {
            impuesto = salarioMensual * 0.20; // 20% de impuestos
        } else {
            impuesto = salarioMensual * 0.30; // 30% de impuestos
        }

        // Calcular el salario neto después de impuestos
        double salarioNeto = salarioMensual - impuesto;

        // Mostrar los resultados
        System.out.println("\nResumen del salario:");
        System.out.println("Salario mensual bruto: €" + salarioMensual);
        System.out.println("Impuesto aplicado: €" + impuesto);
        System.out.println("Salario neto después de impuestos: €" + salarioNeto);

        // Cerrar el Scanner
        scanner.close();
    }
}

