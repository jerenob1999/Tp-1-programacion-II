/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

import uml.Conductor;
import uml.Motor;

/**
 *
 * @author jerem
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;        // agregación
    private Conductor conductor; // bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;

        conductor.setVehiculo(this);
    }
}
