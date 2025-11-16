/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_poo;

/**
 *
 * @author jerem
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido + 
                           " | Curso: " + curso + 
                           " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}
