/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author jerem
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // vínculo bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void asignarPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
}
