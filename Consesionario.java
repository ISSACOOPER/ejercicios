package main.Consesionario;

import java.util.ArrayList;

public class Consesionario {
    private ArrayList<Vendedor> vendedores; // Lista de vendedores
    private ArrayList<Cliente> clientes;    // Lista de clientes
    private ArrayList<Venta> ventas;        // Lista de ventas
    private Inventario inventario;          // Objeto Inventario para manejar vehículos

    // Constructor que inicializa las listas vacías y el inventario
    public Consesionario() {
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventario = new Inventario(); // Inicializa el inventario
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "\nVendedores=" + vendedores +
                ", \nClientes=" + clientes +
                ", \nVentas=" + ventas +
                ", \nInventario=" + inventario +
                "\n}";
    }

    // Métodos para gestionar vendedores
    public void addVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void removeVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    // Métodos para gestionar clientes
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void removeCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    // Métodos para gestionar ventas
    public void addVenta(Venta venta) {
        ventas.add(venta);
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void removeVenta(Venta venta) {
        ventas.remove(venta);
    }

    // Métodos para gestionar el inventario de vehículos
    public void addVehiculo(Vehiculo vehiculo) {
        inventario.addCar(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return inventario.getCars();
    }

    public void removeVehiculo(Vehiculo vehiculo) {
        inventario.removeCar(vehiculo);
    }

    public Inventario getInventario() {
        return inventario;
    }

    public static void main(String[] args) {
        // Crear un concesionario
        Consesionario concesionario = new Consesionario();

        // Crear algunos vendedores
        Vendedor vendedor1 = new Vendedor("12345", "Juan Pérez", "Calle 123", "3012345678", 2000, "Norte");
        Vendedor vendedor2 = new Vendedor("67890", "María Gómez", "Avenida 456", "3023456789", 2500, "Sur");

        // Agregar vendedores al concesionario
        concesionario.addVendedor(vendedor1);
        concesionario.addVendedor(vendedor2);

        // Crear algunos clientes
        Cliente cliente1 = new Cliente("11223", "Carlos Rodríguez", "Carrera 789", "3156789123", "Sofia@gmail.com", "Particular");
        Cliente cliente2 = new Cliente("33445", "Ana Martínez", "Diagonal 321", "3167891234", "karen@gmail.com", "Empresarial");

        // Agregar clientes al concesionario
        concesionario.addCliente(cliente1);
        concesionario.addCliente(cliente2);

        // Crear algunos vehículos
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2022, 25000);
        Vehiculo vehiculo2 = new Vehiculo("Honda", "Civic", 2023, 27000);

        // Agregar vehículos al inventario
        concesionario.addVehiculo(vehiculo1);
        concesionario.addVehiculo(vehiculo2);

        System.out.println(concesionario);
    }
}





