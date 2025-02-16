package main;
/*1.24. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
• Si trabaja 40 horas o menos se le paga Bs. 16 por hora.
• Si trabaja más de 40 horas se le paga Bs. 16 por cada una de las primeras 40 horas y Bs. 20 por cada hora
extra.  */
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de horas trabajadas
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        // Definir las tarifas
        int tarifaNormal = 16;
        int tarifaExtra = 20;
        int limiteHorasNormales = 40;
        int salario;

        // Calcular el salario según las horas trabajadas
        if (horasTrabajadas <= limiteHorasNormales) {
            salario = horasTrabajadas * tarifaNormal;
        } else {
            int horasExtras = horasTrabajadas - limiteHorasNormales;
            salario = (limiteHorasNormales * tarifaNormal) + (horasExtras * tarifaExtra);
        }

        // Mostrar el salario calculado
        System.out.println("💰 El salario semanal del obrero es: Bs. " + salario);

        scanner.close();
    }
}

