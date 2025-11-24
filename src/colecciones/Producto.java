/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

/**
 *
 * @author jerem
 */
public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id +
                " | Nombre: " + nombre +
                " | Precio: $" + precio +
                " | Cantidad: " + cantidad +
                " | Categoría: " + categoria +
                " (" + categoria.getDescripcion() + ")");
    }

    // Getters
    public String getId() { return id; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }
    public CategoriaProducto getCategoria() { return categoria; }

    // Setters
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}
