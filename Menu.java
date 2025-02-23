package main.Consesionario;


import java.util.Scanner;

public class Menu {
    private static Consesionario concesionario = new Consesionario();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú del Concesionario ---");
            System.out.println("1. Agregar Vendedor");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Agregar Vehículo");
            System.out.println("4. Mostrar Vendedores");
            System.out.println("5. Mostrar Clientes");
            System.out.println("6. Mostrar Vehículos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    agregarVendedor();
                    break;
                case 2:
                    agregarCliente();
                    break;
                case 3:
                    agregarVehiculo();
                    break;
                case 4:
                    mostrarVendedores();
                    break;
                case 5:
                    mostrarClientes();
                    break;
                case 6:
                    mostrarVehiculos();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 7);
    }

    private static void agregarVendedor() {
        System.out.print("Ingrese cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese nombre completo: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.print("Ingrese zona de ventas: ");
        String zona = scanner.nextLine();
        
        Vendedor vendedor = new Vendedor(cedula, nombre, direccion, telefono, salario, zona);
        concesionario.addVendedor(vendedor);
        System.out.println("Vendedor agregado correctamente.");
    }

    private static void agregarCliente() {
        System.out.print("Ingrese cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese nombre completo: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese email: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese tipo de cliente (Particular/Empresarial): ");
        String tipoCliente = scanner.nextLine();
        
        Cliente cliente = new Cliente(cedula, nombre, direccion, telefono, email, tipoCliente);
        concesionario.addCliente(cliente);
        System.out.println("Cliente agregado correctamente.");
    }

    private static void agregarVehiculo() {
        System.out.print("Ingrese marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese año: ");
        int anio = scanner.nextInt();
        System.out.print("Ingrese precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        
        Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, precio);
        concesionario.addVehiculo(vehiculo);
        System.out.println("Vehículo agregado correctamente.");
    }

    private static void mostrarVendedores() {
        System.out.println("\nLista de Vendedores:");
        for (Vendedor vendedor : concesionario.getVendedores()) {
            System.out.println(vendedor);
        }
    }

    private static void mostrarClientes() {
        System.out.println("\nLista de Clientes:");
        for (Cliente cliente : concesionario.getClientes()) {
            System.out.println(cliente);
        }
    }

    private static void mostrarVehiculos() {
        System.out.println("\nLista de Vehículos:");
        for (Vehiculo vehiculo : concesionario.getVehiculos()) {
            System.out.println(vehiculo);
        }
    }
}
