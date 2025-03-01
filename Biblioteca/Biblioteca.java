package main.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    /**
     * Clase que representa la biblioteca.
     * Permite gestionar una colección de libros.
     */
    private List<Libro> libros;

    /**
     * Constructor que inicializa la lista de libros.
     */
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    /**
     * Agrega un nuevo libro a la biblioteca.
     * @param libro El libro a agregar.
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Elimina un libro de la biblioteca por su ISBN.
     * @param isbn El ISBN del libro a eliminar.
     * @return true si el libro fue eliminado, false si no se encontró.
     */
    public boolean eliminarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libros.remove(libro);
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra todos los libros disponibles en la biblioteca.
     */
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            System.out.println("\nLista de libros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    /**
     * Busca libros en la biblioteca por título o autor.
     * @param criterio El título o autor a buscar.
     */
    public void buscarLibro(String criterio) {
        boolean encontrado = false;
        System.out.println("\nResultados de búsqueda:");
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(criterio) || libro.getAutor().equalsIgnoreCase(criterio)) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros con ese criterio.");
        }
    }
}
