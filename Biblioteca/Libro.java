package main.Biblioteca;

public class Libro {
    /**
     * Clase que representa un libro en la biblioteca.
     * Contiene atributos esenciales como título, autor e ISBN.
     */
    private String titulo;
    private String autor;
    private String isbn;

    /**
     * Constructor de la clase Libro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param isbn El código ISBN del libro (identificador único).
     */
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    /**
     * Obtiene el título del libro.
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Obtiene el ISBN del libro.
     * @return El ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Representación en cadena del objeto Libro.
     * @return Una cadena con los detalles del libro.
     */
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn;
    }
}
