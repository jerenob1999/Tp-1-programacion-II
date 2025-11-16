/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_poo;

/**
 *
 * @author jerem
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
    }
}
