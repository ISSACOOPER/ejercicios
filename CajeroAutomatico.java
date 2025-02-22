package main.Estructuras_Repeticion;

import java.util.Scanner;



public class CajeroAutomatico {
    private static double saldo = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("\nSeleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        consultarSaldo(scanner);
                        break;
                    case 2:
                        depositar(scanner);
                        break;
                    case 3:
                        retirar(scanner);
                        break;
                    case 4:
                        System.out.println("\n¡Gracias por usar el cajero automático! ✨");
                        System.out.println("Presione Enter para salir...");
                        scanner.nextLine(); // Espera a que el usuario presione Enter antes de salir
                        break;
                    default:
                        System.out.println("\n⚠️ Opción inválida. Intente de nuevo.");
                }
            } else {
                System.out.println("\n⚠️ Error: Ingrese un número válido.");
                scanner.next(); // Limpiar entrada inválida
                opcion = 0; // Reiniciar opción para que continúe el bucle
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n💳 *** CAJERO AUTOMÁTICO ***");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
    }

    private static void consultarSaldo(Scanner scanner) {
        System.out.println("\n💰 Su saldo actual es: $" + saldo);
        System.out.println("\nPresione Enter para continuar...");
        scanner.nextLine(); // Espera Enter antes de regresar al menú
    }

    private static void depositar(Scanner scanner) {
        System.out.print("\nIngrese la cantidad a depositar: ");
        if (scanner.hasNextDouble()) {
            double deposito = scanner.nextDouble();
            scanner.nextLine(); // Consumir salto de línea

            if (deposito <= 0) {
                System.out.println("⚠️ Error: No se pueden depositar valores negativos o cero.");
            } else {
                saldo += deposito;
                System.out.println("✅ Depósito exitoso. Su nuevo saldo es: $" + saldo);
            }
        } else {
            System.out.println("⚠️ Error: Ingrese un número válido.");
            scanner.next(); // Limpiar entrada inválida
        }

        System.out.println("\nPresione Enter para continuar...");
        scanner.nextLine(); // Espera Enter antes de regresar al menú
    }

    private static void retirar(Scanner scanner) {
        System.out.print("\nIngrese la cantidad a retirar: ");
        if (scanner.hasNextDouble()) {
            double retiro = scanner.nextDouble();
            scanner.nextLine(); // Consumir salto de línea

            if (retiro <= 0) {
                System.out.println("⚠️ Error: No puede retirar valores negativos o cero.");
            } else if (retiro > saldo) {
                System.out.println("❌ Fondos insuficientes. Su saldo actual es: $" + saldo);
            } else {
                saldo -= retiro;
                System.out.println("✅ Retiro exitoso. Su nuevo saldo es: $" + saldo);
            }
        } else {
            System.out.println("⚠️ Error: Ingrese un número válido.");
            scanner.next(); // Limpiar entrada inválida
        }

        System.out.println("\nPresione Enter para continuar...");
        scanner.nextLine(); // Espera Enter antes de regresar al menú
    }
}

