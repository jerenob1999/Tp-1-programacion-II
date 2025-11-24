/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.Universidad;

/**
 *
 * @author jerem
 */
public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        // 1. Crear profesores
        Profesor p1 = new Profesor("P1", "Ana Gómez", "Matemática");
        Profesor p2 = new Profesor("P2", "Luis Pérez", "Programación");
        Profesor p3 = new Profesor("P3", "María Díaz", "Física");

        // 2. Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Análisis Matemático");
        Curso c3 = new Curso("C103", "Programación I");
        Curso c4 = new Curso("C104", "Programación II");
        Curso c5 = new Curso("C105", "Física I");

        // Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores
        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P1");
        uni.asignarProfesorACurso("C103", "P2");
        uni.asignarProfesorACurso("C104", "P2");
        uni.asignarProfesorACurso("C105", "P3");

        // 4. Listar
        System.out.println("\n--- CURSOS ---");
        uni.listarCursos();

        System.out.println("\n--- PROFESORES ---");
        uni.listarProfesores();

        // 5. Cambiar profesor de un curso
        System.out.println("\n--- CAMBIAR PROFESOR (C104 → P3) ---");
        uni.asignarProfesorACurso("C104", "P3");

        uni.listarCursos();
        System.out.println();
        p2.listarCursos();
        p3.listarCursos();

        // 6. Eliminar curso
        System.out.println("\n--- ELIMINAR CURSO C103 ---");
        uni.eliminarCurso("C103");

        uni.listarCursos();
        p2.listarCursos();

        // 7. Eliminar profesor
        System.out.println("\n--- ELIMINAR PROFESOR P1 ---");
        uni.eliminarProfesor("P1");

        uni.listarCursos();
        uni.listarProfesores();

        // 8. Reporte final
        System.out.println("\n--- REPORTE: CANTIDAD DE CURSOS POR PROFESOR ---");
        uni.listarProfesores();
    }
}
