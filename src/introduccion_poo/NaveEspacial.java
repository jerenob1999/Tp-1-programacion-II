/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_poo;

/**
 *
 * @author jerem
 */
public class NaveEspacial {
    String nombre;
    double combustible;
    final double MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        System.out.println(nombre + " ha despegado.");
    }

    public void avanzar(double distancia) {
        double consumo = distancia * 2; // Ejemplo: 1km = 2 unidades de combustible

        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("⛔ Combustible insuficiente para avanzar.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            System.out.println("⛔ No se puede superar el límite de combustible.");
        } else {
            combustible += cantidad;
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
}
