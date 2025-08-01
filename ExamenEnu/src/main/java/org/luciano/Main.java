package org.luciano;

import org.luciano.Entidades.Estudiante;
import org.luciano.Implementaciones.EstudianteServiceImpl;
import org.luciano.Services.EstudianteService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EstudianteService servicio = new EstudianteServiceImpl();

        // Crear estudiantes
        Estudiante est1 = new Estudiante(1, "Luciano", 25, "Ingeniería en Sistemas");
        Estudiante est2 = new Estudiante(2, "Ana", 22, "Medicina");
        Estudiante est3 = new Estudiante(3, "Carlos", 24, "Derecho");

        // Registrar estudiantes
        servicio.registrarEstudiante(est1);
        servicio.registrarEstudiante(est2);
        servicio.registrarEstudiante(est3);

        // Mostrar todos
        System.out.println("\n--- Lista de estudiantes ---");
        servicio.mostrarTodos();

        // Buscar uno por ID
        System.out.println("\n--- Buscar estudiante con ID 2 ---");
        Estudiante buscado = servicio.buscarPorId(2);
        if (buscado != null) {
            System.out.println(buscado.mostrarInformacion());
        }

        // Actualizar estudiante
        Estudiante actualizado = new Estudiante(3, "Carlos", 24, "Psicología");
        servicio.actualizarEstudiante(actualizado);

        // Eliminar estudiante
        servicio.eliminarEstudiante(1);

        // Mostrar todos después de cambios
        System.out.println("\n--- Lista actualizada de estudiantes ---");
        servicio.mostrarTodos();

        /*
        * -------------------> RESPUESTAS A LAS DEMAS PREGUNTAS <-------------------
        * ¿Qué es la herencia en la Programación Orientada a Objetos?
        * Es un principio de la POO que permite crear clases hijas con atributos y metodos heredados de la clase padre
        *
        * ¿Cuál es la diferencia entre una clase abstracta y una interfaz?
        * La clase abstracta es un plano con partes ya construidas y la interfaz es la lista de instrucciones que obligas a seguir
        *
        *Explica qué es el encapsulamiento y por qué es importante.
        *Es uno de los 4 pilares de la POO, protege los datos, mejora el mantenimiento, control de accesos y reduce el acoplamiento.
        *
        *¿Qué es el polimorfismo y cómo se aplica en Java?
        *Se refiere a la capacidad que tienen los objetos de comportarse de diferentes maneras segun el contexto
        *
        * ¿Qué hace el siguiente fragmento de código?
        *Es un ejemplo de herencia y polimorfismo de una clase abstracta y su respectiva implementacion
        *
        *¿Cuál será la salida si en el main escribimos?
        * Guau
        *
        *
        *
        * */

    }
}