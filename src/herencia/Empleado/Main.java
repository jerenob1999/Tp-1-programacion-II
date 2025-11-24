/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.Empleado;

/**
 *
 * @author jerem
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 120000));
        empleados.add(new EmpleadoTemporal("Luis", 80, 1500));

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.nombre +
                    " | Sueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta)
                System.out.println(" Es empleado de planta");

            if (e instanceof EmpleadoTemporal)
                System.out.println(" Es empleado temporal");
        }
    }
}
