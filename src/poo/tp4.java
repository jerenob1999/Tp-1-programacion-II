/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author jerem
 */
public class tp4 {

    public static void main(String[] args) {

        // Instanciar usando el primer constructor
        Empleado e1 = new Empleado(100, "Juan Pérez", "Analista", 300000);

        // Instanciar usando el segundo constructor
        Empleado e2 = new Empleado("Ana Gómez", "Desarrolladora");
        e2.setSalario(250000);

        Empleado e3 = new Empleado("Carlos López", "Diseñador");
        e3.setSalario(200000);

        // Aplicar métodos sobrecargados actualizarSalario
        e1.actualizarSalario(10);     // aumento del 10%
        e2.actualizarSalario(5000);   // aumento en cantidad fija
        e3.actualizarSalario(15);     // aumento del 15%

        // Mostrar información
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        // Mostrar total de empleados
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
