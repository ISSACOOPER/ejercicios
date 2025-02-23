package main.Estructuras_Seleccion;
/*1.18. La Dirección General de Tráfico necesita un programa que mida el índice alcohólico; dado el tipo de vehículo que
conduce un conductor, determine si da positivo en el control de alcoholemia o no. La tasa máxima de alcohol
según el tipo de vehículo se resume en la siguiente tabla: 
Vehículo Indicador Tasa máxima
Camión      C           0.3
Autobús     A           0.3
Turismo     T           0.5
Motocicleta M           0.3 */

import java.util.Scanner;

public class Ejercicio18 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tipo de vehículo
        System.out.print("Ingrese el tipo de vehículo (C: Camión, A: Autobús, T: Turismo, M: Motocicleta): ");
        char tipoVehiculo = scanner.next().toUpperCase().charAt(0); // Convertir a mayúscula para evitar errores

        // Pedir la tasa de alcohol en sangre del conductor
        System.out.print("Ingrese la tasa de alcohol en sangre (ejemplo: 0,4): ");
        double tasaAlcohol = scanner.nextDouble();

        // Definir la tasa máxima permitida según el tipo de vehículo
        double tasaMaxima;

        switch (tipoVehiculo) {
            case 'C': // Camión
            case 'A': // Autobús
            case 'M': // Motocicleta
                tasaMaxima = 0.3;
                break;
            case 'T': // Turismo
                tasaMaxima = 0.5;
                break;
            default:
                System.out.println("Error: Tipo de vehículo no válido.");
                return; // Termina la ejecución si el tipo de vehículo es incorrecto
        }

        // Evaluar si el conductor supera la tasa permitida
        if (tasaAlcohol > tasaMaxima) {
            System.out.println("Resultado: 🚨 POSITIVO en alcoholemia. Excede la tasa permitida.");
        } else {
            System.out.println("Resultado: ✅ NEGATIVO en alcoholemia. Dentro del límite permitido.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
