package main;
/*1.19. La compañía que gestiona la autopista ha decidido cambiar las tarifas de peaje.
Estas tarifas dependen del tipo de vehículo (camión o automóvil) que desee utilizar la autopista, del número de
pasajeros que lleve y de la hora del día: en las horas de alta congestión los automóviles con tres pasajeros o más
no pagan peaje, los camiones pagan 50 euros; en las horas menos congestionadas el peaje para los automóviles
es de 25 euros y para los camiones es de 30 euros independientemente del número de pasajeros.
Escriba un programa que leyendo el tipo de vehículo, tipo de hora (si la hora es de alta congestión o no) y el
número de pasajeros, calcule la tarifa que le debe cobrar a un vehículo. */
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tipo de vehículo
        System.out.print("Ingrese el tipo de vehículo (C: Camión, A: Automóvil): ");
        char tipoVehiculo = scanner.next().toUpperCase().charAt(0);

        // Solicitar si la hora es de alta congestión
        System.out.print("¿Es hora de alta congestión? (S: Sí, N: No): ");
        char horaCongestion = scanner.next().toUpperCase().charAt(0);

        // Solicitar número de pasajeros
        System.out.print("Ingrese el número de pasajeros: ");
        int numPasajeros = scanner.nextInt();

        int tarifa = 0;

        // Evaluar la tarifa según las condiciones
        if (horaCongestion == 'S') { // Alta congestión
            if (tipoVehiculo == 'A' && numPasajeros >= 3) {
                tarifa = 0; // Automóvil con 3 o más pasajeros no paga
            } else if (tipoVehiculo == 'C') {
                tarifa = 50; // Camión en hora de alta congestión
            }
        } else { // Baja congestión
            if (tipoVehiculo == 'A') {
                tarifa = 25; // Automóvil paga 25 euros
            } else if (tipoVehiculo == 'C') {
                tarifa = 30; // Camión paga 30 euros
            }
        }

        // Mostrar la tarifa calculada
        System.out.println("💰 Tarifa a pagar: " + tarifa + " euros.");

        scanner.close();
    }
}
