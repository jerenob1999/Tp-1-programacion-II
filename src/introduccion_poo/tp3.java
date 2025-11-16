/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_poo;

/**
 *
 * @author jerem 
 */
public class tp3 {
        public static void main(String[] args) {

        Estudiante e = new Estudiante("Juan", "Pérez", "Programación II", 7.5);
        e.mostrarInfo();
        e.subirCalificacion(1.0);
        e.bajarCalificacion(0.5);
        e.mostrarInfo();

        System.out.println("----------------------------------------------------");


        Mascota m = new Mascota("Firulais", "Perro", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();

        System.out.println("----------------------------------------------------");


        Libro libro = new Libro("El principito", "Saint-Exupéry", 1943);
        libro.mostrarInfo();
        libro.setAñoPublicacion(-200);  // Inválido
        libro.setAñoPublicacion(1950);  // Válido
        libro.mostrarInfo();

        System.out.println("----------------------------------------------------");


        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        g1.envejecer();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();

        System.out.println("----------------------------------------------------");

 
        NaveEspacial nave = new NaveEspacial("Andrómeda", 50);
        nave.mostrarEstado();
        nave.avanzar(20);
        nave.recargarCombustible(40);
        nave.avanzar(20);
        nave.mostrarEstado();
    }
}
