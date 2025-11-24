/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

/**
 *
 * @author jerem
 */
public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // 1. Crear productos
        Producto p1 = new Producto("A1", "Leche", 800, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("B2", "TV LED", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("C3", "Remera", 4500, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("D4", "Silla", 12000, 12, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("E5", "Pan", 600, 50, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\n--- BUSCAR PRODUCTO C3 ---");
        Producto buscado = inventario.buscarProductoPorId("C3");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\n--- PRODUCTOS ALIMENTOS ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5. Eliminar un producto
        System.out.println("\nEliminando producto con ID B2...");
        inventario.eliminarProducto("B2");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\nActualizando stock del producto A1...");
        inventario.actualizarStock("A1", 100);
        inventario.buscarProductoPorId("A1").mostrarInfo();

        // 7. Total de stock
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9. Filtrar por precio
        System.out.println("\n--- PRODUCTOS ENTRE $1000 Y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles
        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
