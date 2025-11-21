/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author jerem
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;

    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementar contador
    }

    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0;
        this.id = ++totalEmpleados;
    }

    // Métodos sobrecargados actualizarSalario

    // Aumentar por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Aumentar por cantidad fija
    public void actualizarSalario(int cantidad) {
        this.salario += cantidad;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // toString
    @Override
    public String toString() {
        return "Empleado {" +
                "ID = " + id +
                ", Nombre = '" + nombre + '\'' +
                ", Puesto = '" + puesto + '\'' +
                ", Salario = $" + salario +
                '}';
    }
}
