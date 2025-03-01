package main.Biblioteca;

import java.util.Scanner;

public class Menuu {
    /**
     * Muestra el menú de opciones para la gestión de la biblioteca.
     * Permite al usuario seleccionar una acción.
     */
    public static void mostrarMenu() {
        System.out.println("\n--- Menú de la Biblioteca ---");
        System.out.println("1. Agregar Libro");
        System.out.println("2. Eliminar Libro");
        System.out.println("3. Ver Todos los Libros");
        System.out.println("4. Buscar Libro");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Método principal que gestiona la interacción con el usuario.
     */
    public static void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(); // Se instancia la biblioteca
        int opcion;

        do {
            mostrarMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn));
                    System.out.println("Libro agregado con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese el ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    if (biblioteca.eliminarLibro(isbnEliminar)) {
                        System.out.println("Libro eliminado con éxito.");
                    } else {
                        System.out.println("No se encontró un libro con ese ISBN.");
                    }
                    break;
                case 3:
                    biblioteca.mostrarLibros();
                    break;
                case 4:
                    System.out.print("Ingrese el título o autor a buscar: ");
                    String criterio = scanner.nextLine();
                    biblioteca.buscarLibro(criterio);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
