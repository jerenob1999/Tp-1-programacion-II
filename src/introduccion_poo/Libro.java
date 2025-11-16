/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_poo;

/**
 *
 * @author jerem
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("⚠ Año de publicación inválido.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Año: " + añoPublicacion);
    }
}
