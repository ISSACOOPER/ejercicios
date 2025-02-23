package main.Consesionario; // Define el paquete en el que se encuentra la clase

import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas

// Clase Inventario para gestionar una lista de vehículos
public class Inventario {
    private ArrayList<Vehiculo> cars; // Lista que almacena objetos de tipo Vehiculo

    // Constructor de la clase Inventario
    public Inventario() {
        cars = new ArrayList<>(); // Inicializa la lista de vehículos como un ArrayList vacío
    }

    // Método para agregar un vehículo al inventario
    public void addCar(Vehiculo car) {
        cars.add(car); // Agrega el objeto 'car' a la lista 'cars'
    }

    // Método para eliminar un vehículo del inventario
    public void removeCar(Vehiculo car) {
        cars.remove(car); // Intenta eliminar el vehículo de la lista
    }
    // Método para obtener la lista de vehículos del inventario
    public ArrayList<Vehiculo> getCars() {
        return cars; // Retorna la lista completa de vehículos
    }
}
