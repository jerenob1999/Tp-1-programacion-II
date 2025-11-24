/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.Biblioteca;

/**
 *
 * @author jerem
 */
public class Main {
    public static void main(String[] args) {

        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombia");
        Autor a2 = new Autor("A2", "J.K. Rowling", "Reino Unido");
        Autor a3 = new Autor("A3", "Jorge Luis Borges", "Argentina");

        // 3. Agregar 5 libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "El coronel no tiene quien le escriba", 1961, a1);
        biblioteca.agregarLibro("ISBN003", "Harry Potter y la Piedra Filosofal", 1997, a2);
        biblioteca.agregarLibro("ISBN004", "Ficciones", 1944, a3);
        biblioteca.agregarLibro("ISBN005", "El Aleph", 1949, a3);

        // 4. Listar todos los libros
        System.out.println("\n--- LISTA DE LIBROS ---");
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN
        System.out.println("\n--- BUSCAR LIBRO (ISBN003) ---");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        // 6. Filtrar libros por año
        System.out.println("\n--- LIBROS DEL AÑO 1944 ---");
        biblioteca.filtrarLibrosPorAnio(1944);

        // 7. Eliminar un libro
        System.out.println("\n--- ELIMINAR LIBRO (ISBN002) ---");
        biblioteca.eliminarLibro("ISBN002");

        System.out.println("Libros restantes:");
        biblioteca.listarLibros();

        // 8. Cantidad total de libros
        System.out.println("\nCantidad total: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar autores de los libros disponibles
        System.out.println("\n--- AUTORES DISPONIBLES ---");
        biblioteca.mostrarAutoresDisponibles();
    }
}
