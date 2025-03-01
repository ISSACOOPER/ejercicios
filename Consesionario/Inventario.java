package main.Consesionario; // Define el paquete donde se encuentra la clase

import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas
import java.util.NoSuchElementException; // Importa la excepción para manejar errores al eliminar elementos

/**
 * Clase Inventario que gestiona una lista de vehículos.
 * Permite agregar, eliminar y consultar vehículos en un concesionario.
 *
 * @author Issa Cooper Moretti
 * @version 1.0
 * @since 2025-02-16
 */
public class Inventario {
    private ArrayList<Vehiculo> cars; // Lista de vehículos en el inventario

    /**
     * Constructor de la clase Inventario.
     * Inicializa la lista de vehículos como un ArrayList vacío.
     */
    public Inventario() {
        cars = new ArrayList<>(); // Inicializa la lista vacía
    }

    /**
     * Agrega un vehículo al inventario.
     *
     * @param car Vehículo a agregar.
     * @throws IllegalArgumentException si el vehículo es nulo.
     */
    public void addCar(Vehiculo car) {
        try {
            if (car == null) {
                throw new IllegalArgumentException("❌ Error: El vehículo no puede ser nulo.");
            }
            cars.add(car);
            System.out.println("✅ Vehículo agregado correctamente.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("ℹ️ Operación de agregado finalizada.");
        }
    }

    /**
     * Elimina un vehículo del inventario.
     *
     * @param car Vehículo a eliminar.
     * @throws NoSuchElementException si el vehículo no está en el inventario.
     */
    public void removeCar(Vehiculo car) {
        try {
            if (!cars.contains(car)) {
                throw new NoSuchElementException("❌ Error: El vehículo no está en el inventario.");
            }
            cars.remove(car);
            System.out.println("✅ Vehículo eliminado correctamente.");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("ℹ️ Operación de eliminación finalizada.");
        }
    }

    /**
     * Obtiene la lista de vehículos del inventario.
     *
     * @return Lista de vehículos en el inventario.
     */
    public ArrayList<Vehiculo> getCars() {
        return cars;
    }
}
